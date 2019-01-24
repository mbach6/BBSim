public class Team {

    private String name;

    // Offensive team stat rates: Turnover, 3PT, 2PT, Foul, Offensive
    // Rebounding, and Free Throw Percentage
    private double turnovers;
    private double threePt;
    private double twoPt;
    private double offFoulRate;
    private double offRebRate;
    private double ftPerc;

    // Defensive team stat rates: Forced turnovers, 3PT, 2PT, Foul, and
    // Defensive Rebounding
    private double defTORate;
    private double defThreePtRate;
    private double defTwoPtRate;
    private double defFoulRate;
    private double defRebRate;

    public Team(String name, double turnovers, double threePt,
        double twoPt)
        // double foulRate, double offRebRate, double defTORate,
        // double defThreePtRate, double defTwoPtRate, double defFoulRate,
        // double defRebRate)
    {
        this.name = name;
        this.turnovers = turnovers;
        this.threePt = threePt;
        this.twoPt = twoPt;
        // this.offFoulRate = offFoulRate;
        // this.offRebRate = offRebRate;
        // this.ftPerc = ftPerc;
        // this.defTORate = defTORate;
        // this.defThreePtRate = defThreePtRate;
        // this.defTwoPtRate = defTwoPtRate;
        // this.defFoulRate = defFoulRate;
    }

    public double getTurnovers() {
        return turnovers;
    }

    public double getThreePt() {
        return threePt;
    }

    public double getTwoPt() {
        return twoPt;
    }

    public double getOffFoulRate() {
        return offFoulRate;
    }

    public double getOffRebRate() {
        return offRebRate;
    }

    public double getFtPerc() {
        return ftPerc;
    }

    public double getDefTORate() {
        return defTORate;
    }

    public double getDefThreePtRate() {
        return defThreePtRate;
    }

    public double getDefTwoPtRate() {
        return defTwoPtRate;
    }

    public double getDefFoulRate() {
        return defFoulRate;
    }

    public double getDefRebRate() {
        return defRebRate;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return getName();
    }
}