/**
 * Created by miteyan on //
 */
public class Player {
//  points in round
    
    public static final String[] headings = {
    "total_points", "value", "transfers_balance ", "selected", "transfers_in", "transfers_out",
    "minutes","goals_scored", "assists", "clean_sheets","goals_conceded",
    "own_goals","penalties_saved", "penalties_missed", "yellow_cards",
    "red_cards","saves", "bonus", "bps", "influence", "creativity", "threat", "ict_index", "ea_index",
    "open_play_crosses", "big_chances_created", "clearances_blocks_interceptions",
    "recoveries", "key_passes", "tackles", "winning_goals", "attempted_passes", "completed_passes",
    "penalties_conceded", "big_chances_missed", "errors_leading_to_goal", "errors_leading_to_goal_attempt", "tackled",
    "offside", "target_missed", "fouls", "dribbles", "opponent_team",};



    private int total_points;
    private int value;
    private int transfers_balance ;
    private int selected;
    private int transfers_in;
    private int transfers_out;
    private int minutes;
    private int goals_scored;
    private int assists;
    private int clean_sheets;
    private int goals_conceded;
    private int own_goals;
    private int penalties_saved;
    private int penalties_missed;
    private int yellow_cards;
    private int red_cards;
    private int saves;
    private int bonus;
    private int bps;
    private int influence;
    private int creativity;
    private int threat;
    private int ict_index;
    private int ea_index;
    private int open_play_crosses;
    private int big_chances_created;
    private int clearances_blocks_interceptions;
    private int recoveries;
    private int key_passes;
    private int tackles;
    private int winning_goals;
    private int attempted_passes;
    private int completed_passes;
    private int penalties_conceded;
    private int big_chances_missed;
    private int errors_leading_to_goal;
    private int errors_leading_to_goal_attempt;
    private int tackled;
    private int target_missed;
    private int fouls;
    private int dribbles;
    private int opponent_team;

    public Player(int total_points, int value, int transfers_balance, int selected, int transfers_in, int transfers_out, int minutes, int goals_scored, int assists, int clean_sheets, int goals_conceded, int own_goals, int penalties_saved, int penalties_missed, int yellow_cards, int red_cards, int saves, int bonus, int bps, int influence, int creativity, int threat, int ict_index, int ea_index, int open_play_crosses, int big_chances_created, int clearances_blocks_interceptions, int recoveries, int key_passes, int tackles, int winning_goals, int attempted_passes, int completed_passes, int penalties_conceded, int big_chances_missed, int errors_leading_to_goal, int errors_leading_to_goal_attempt, int tackled, int target_missed, int fouls, int dribbles, int opponent_team) {
        this.total_points = total_points;
        this.value = value;
        this.transfers_balance = transfers_balance;
        this.selected = selected;
        this.transfers_in = transfers_in;
        this.transfers_out = transfers_out;
        this.minutes = minutes;
        this.goals_scored = goals_scored;
        this.assists = assists;
        this.clean_sheets = clean_sheets;
        this.goals_conceded = goals_conceded;
        this.own_goals = own_goals;
        this.penalties_saved = penalties_saved;
        this.penalties_missed = penalties_missed;
        this.yellow_cards = yellow_cards;
        this.red_cards = red_cards;
        this.saves = saves;
        this.bonus = bonus;
        this.bps = bps;
        this.influence = influence;
        this.creativity = creativity;
        this.threat = threat;
        this.ict_index = ict_index;
        this.ea_index = ea_index;
        this.open_play_crosses = open_play_crosses;
        this.big_chances_created = big_chances_created;
        this.clearances_blocks_interceptions = clearances_blocks_interceptions;
        this.recoveries = recoveries;
        this.key_passes = key_passes;
        this.tackles = tackles;
        this.winning_goals = winning_goals;
        this.attempted_passes = attempted_passes;
        this.completed_passes = completed_passes;
        this.penalties_conceded = penalties_conceded;
        this.big_chances_missed = big_chances_missed;
        this.errors_leading_to_goal = errors_leading_to_goal;
        this.errors_leading_to_goal_attempt = errors_leading_to_goal_attempt;
        this.tackled = tackled;
        this.target_missed = target_missed;
        this.fouls = fouls;
        this.dribbles = dribbles;
        this.opponent_team = opponent_team;
    }

    public int getTotal_points() {
        return total_points;
    }

    public void setTotal_points(int total_points) {
        this.total_points = total_points;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getTransfers_balance() {
        return transfers_balance;
    }

    public void setTransfers_balance(int transfers_balance) {
        this.transfers_balance = transfers_balance;
    }

    public int getSelected() {
        return selected;
    }

    public void setSelected(int selected) {
        this.selected = selected;
    }

    public int getTransfers_in() {
        return transfers_in;
    }

    public void setTransfers_in(int transfers_in) {
        this.transfers_in = transfers_in;
    }

    public int getTransfers_out() {
        return transfers_out;
    }

    public void setTransfers_out(int transfers_out) {
        this.transfers_out = transfers_out;
    }


    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getGoals_scored() {
        return goals_scored;
    }

    public void setGoals_scored(int goals_scored) {
        this.goals_scored = goals_scored;
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public int getClean_sheets() {
        return clean_sheets;
    }

    public void setClean_sheets(int clean_sheets) {
        this.clean_sheets = clean_sheets;
    }

    public int getGoals_conceded() {
        return goals_conceded;
    }

    public void setGoals_conceded(int goals_conceded) {
        this.goals_conceded = goals_conceded;
    }

    public int getOwn_goals() {
        return own_goals;
    }

    public void setOwn_goals(int own_goals) {
        this.own_goals = own_goals;
    }

    public int getPenalties_saved() {
        return penalties_saved;
    }

    public void setPenalties_saved(int penalties_saved) {
        this.penalties_saved = penalties_saved;
    }

    public int getPenalties_missed() {
        return penalties_missed;
    }

    public void setPenalties_missed(int penalties_missed) {
        this.penalties_missed = penalties_missed;
    }

    public int getYellow_cards() {
        return yellow_cards;
    }

    public void setYellow_cards(int yellow_cards) {
        this.yellow_cards = yellow_cards;
    }

    public int getRed_cards() {
        return red_cards;
    }

    public void setRed_cards(int red_cards) {
        this.red_cards = red_cards;
    }

    public int getSaves() {
        return saves;
    }

    public void setSaves(int saves) {
        this.saves = saves;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getBps() {
        return bps;
    }

    public void setBps(int bps) {
        this.bps = bps;
    }

    public int getInfluence() {
        return influence;
    }

    public void setInfluence(int influence) {
        this.influence = influence;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    public int getThreat() {
        return threat;
    }

    public void setThreat(int threat) {
        this.threat = threat;
    }

    public int getIct_index() {
        return ict_index;
    }

    public void setIct_index(int ict_index) {
        this.ict_index = ict_index;
    }

    public int getEa_index() {
        return ea_index;
    }

    public void setEa_index(int ea_index) {
        this.ea_index = ea_index;
    }

    public int getOpen_play_crosses() {
        return open_play_crosses;
    }

    public void setOpen_play_crosses(int open_play_crosses) {
        this.open_play_crosses = open_play_crosses;
    }

    public int getBig_chances_created() {
        return big_chances_created;
    }

    public void setBig_chances_created(int big_chances_created) {
        this.big_chances_created = big_chances_created;
    }

    public int getClearances_blocks_interceptions() {
        return clearances_blocks_interceptions;
    }

    public void setClearances_blocks_interceptions(int clearances_blocks_interceptions) {
        this.clearances_blocks_interceptions = clearances_blocks_interceptions;
    }

    public int getRecoveries() {
        return recoveries;
    }

    public void setRecoveries(int recoveries) {
        this.recoveries = recoveries;
    }

    public int getKey_passes() {
        return key_passes;
    }

    public void setKey_passes(int key_passes) {
        this.key_passes = key_passes;
    }

    public int getTackles() {
        return tackles;
    }

    public void setTackles(int tackles) {
        this.tackles = tackles;
    }

    public int getWinning_goals() {
        return winning_goals;
    }

    public void setWinning_goals(int winning_goals) {
        this.winning_goals = winning_goals;
    }

    public int getAttempted_passes() {
        return attempted_passes;
    }

    public void setAttempted_passes(int attempted_passes) {
        this.attempted_passes = attempted_passes;
    }

    public int getCompleted_passes() {
        return completed_passes;
    }

    public void setCompleted_passes(int completed_passes) {
        this.completed_passes = completed_passes;
    }

    public int getPenalties_conceded() {
        return penalties_conceded;
    }

    public void setPenalties_conceded(int penalties_conceded) {
        this.penalties_conceded = penalties_conceded;
    }

    public int getBig_chances_missed() {
        return big_chances_missed;
    }

    public void setBig_chances_missed(int big_chances_missed) {
        this.big_chances_missed = big_chances_missed;
    }

    public int getErrors_leading_to_goal() {
        return errors_leading_to_goal;
    }

    public void setErrors_leading_to_goal(int errors_leading_to_goal) {
        this.errors_leading_to_goal = errors_leading_to_goal;
    }

    public int getErrors_leading_to_goal_attempt() {
        return errors_leading_to_goal_attempt;
    }

    public void setErrors_leading_to_goal_attempt(int errors_leading_to_goal_attempt) {
        this.errors_leading_to_goal_attempt = errors_leading_to_goal_attempt;
    }

    public int getTackled() {
        return tackled;
    }

    public void setTackled(int tackled) {
        this.tackled = tackled;
    }

    public int getTarget_missed() {
        return target_missed;
    }

    public void setTarget_missed(int target_missed) {
        this.target_missed = target_missed;
    }

    public int getFouls() {
        return fouls;
    }

    public void setFouls(int fouls) {
        this.fouls = fouls;
    }

    public int getDribbles() {
        return dribbles;
    }

    public void setDribbles(int dribbles) {
        this.dribbles = dribbles;
    }

    public int getOpponent_team() {
        return opponent_team;
    }

    public void setOpponent_team(int opponent_team) {
        this.opponent_team = opponent_team;
    }
}
