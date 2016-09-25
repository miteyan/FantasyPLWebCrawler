import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/**
 * Created by miteyan on 16/09/2016.
 */
public class Scrape {

    private static final String links = "https://fantasy.premierleague.com/drf/element-summary/7";

    //saves player info screen
    public static String save(String URL) throws IOException {
         BufferedReader input = null;
        String line = "";
         try{
            java.net.URL url = new URL(URL);
            input = new BufferedReader(new InputStreamReader(url.openStream()));

            while ( (line = input.readLine()) !=null) {
                return line;
            }

        } finally {
            if (input != null) {
                input.close();
            }
        }
        return line;
    }
        //returns list of gameweek info
    public static ArrayList<String> trim(String page) {
        int index = (page.indexOf("Gameweek 38"));
        String trimmed = page.substring(index + 350);
        String trimmed2 = trimmed.substring(trimmed.indexOf("round"));

        String[] lines = trimmed2.split(Pattern.quote(","));
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0 ; i < lines.length ; i ++){
            if (!(lines[i].contains("element")||(lines[i].contains("loaned")||(lines[i].contains("round")||(lines[i].contains("id"))||(lines[i].contains("kick"))||(lines[i].contains("team_")||(lines[i].contains("home"))))))) {//loaned out /in not used
                arrayList.add(lines[i].replaceAll("\\D+", ""));
//        }
            }
        }
        return arrayList;
    }

    public static  ArrayList<List<String>> rounds(String link) throws IOException {
        int vars = 43;
        ArrayList<String> arrayList = trim(save(link));
        int length = arrayList.size();

        ArrayList<List<String >> arrayListArrayList= new ArrayList<>();

        for (int i =0; i < length-vars +1; i+=vars) {
            arrayListArrayList.add(arrayList.subList(i, i + vars));
        }

        return arrayListArrayList;
    }





    public static void generate(int numPlayers) throws IOException {
        String file = "./b.csv";
        FileWriter writer = new FileWriter(file);
        CSV.writeLine(writer, new ArrayList(Arrays.asList(Player.headings)));

        String link = "https://fantasy.premierleague.com/drf/element-summary/";
        System.out.println(link);
        ArrayList<List<String>>  allRounds;

        for (int i=1; i<numPlayers;i++){
            System.out.println(link + i);

            allRounds = rounds(link+i);
            for (int j=0; j<4;j++) {
                try{
                    writeLine(writer,allRounds.get(j));
                } catch (IndexOutOfBoundsException e){
                    e.printStackTrace();
                    System.out.println("IndexOut");
                } catch (IOException e) {
                    System.out.println("IO Exception");
                    e.printStackTrace();
                }
            }
        }

        writer.flush();
        writer.close();


    }
    public static void writeLine(FileWriter writer, List<String> values) throws IOException {
        boolean first = true;
        int i = 1;

//        StringBuilder sb = new StringBuilder();
        String string = "";
        for (String value: values) {
            if (!first) {
                string+=",";
            }

            string+=(value);
            System.out.println(i+ " Added: " + value);
            i++;
            first = false;
        }
        string+=("\n");
        System.out.println("Appending: " + string);
        writer.append(string);
    }
    public static void main(String[] args) throws IOException {
//        String file = "./a.csv";
//        FileWriter writer = new FileWriter(file);
//        CSV.writeLine(writer, new ArrayList(Arrays.asList(Player.headings)));
//
//        ArrayList<List<String>> listArrayList = rounds(links);
//
//        for (int i = 0 ; i < listArrayList.size(); i ++) {
//            CSV.writeLine(writer,listArrayList.get(i));
//        }
//
//        writer.flush();
//        writer.close();
    generate(583);


    }

    public static void print(ArrayList<String> a){
        for (int i =0 ;i<a.size();i++){
            System.out.println(i+1 + " " + a.get(i));
        }
    }

    public static void printA(ArrayList<List<String>> a){
        for (int i =0 ;i<a.size();i++){
            for (int j =0 ; j<a.get(i).size(); j++)
            System.out.println(j+1 + " " + a.get(i).get(j));
        }
    }


    public static void print(String[] a){
        for (int i =0 ;i<a.length; i++){
            System.out.println(a[i]);
        }
    }
}
