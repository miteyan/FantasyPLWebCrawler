import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by miteyan on 17/09/2016.
 */
public class CSV {

    public static void main(String[] args) throws IOException {
        String file = "./a.csv";
        FileWriter writer = new FileWriter(file);
        ArrayList<String> a = new ArrayList<String>();
        a.add("a");a.add("b");a.add("c");
        //headings
        writeLine(writer, a);
        writer.flush();
        writer.close();
    }

    public static void writeLine(FileWriter writer, List<String> values) throws IOException {
        boolean first = true;
        int i = 1;

        StringBuilder sb = new StringBuilder();
        for (String value: values) {
            if (!first) {
                sb.append(",");
            }

            sb.append(value);
            System.out.println(i+ " Added: " + value);
            i++;
            first = false;
        }
        sb.append("\n");
        System.out.println("Appending: " + sb.toString());
        writer.append(sb.toString());
    }


}

