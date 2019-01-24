import java.util.Random;

public class BBSim {

    public static void main(String[] args) {
        int possNumber = 1;
        int posessionLimit = 200;
        int homeScore = 0;
        int awayScore = 0;
        Random rand = new Random();

        Team home = new Team("OKC", 55.0, 10.0, 35.0);
        Team away = new Team("GSW", 60.0, 15.0, 25.0);

        double homeTurnover = home.getTurnovers();

        while (possNumber <= posessionLimit) {
            for (possNumber = 1; possNumber <= 100; possNumber++) {
                double possResult = rand.nextDouble() * 100;
                    if (possResult >= 0 && possResult < (home.getTurnovers())) {
                    }
                    if (possResult > home.getTurnovers() && possResult < (home.getTurnovers() + home.getThreePt())) {
                        homeScore = homeScore + 3;
                    }
                    if (possResult >= (home.getTurnovers() + home.getThreePt()) && possResult <= (home.getTurnovers() + home.getThreePt() + home.getTwoPt())) {
                        homeScore = homeScore + 2;
                    }
                }
            for (possNumber = 101; possNumber <= 200; possNumber++) {
                double possResult = rand.nextDouble() * 100;
                if (possResult >= 0 && possResult < away.getTurnovers()) {
                }
                if (possResult >= away.getTurnovers() && possResult < (away.getTurnovers() + away.getThreePt())) {
                    awayScore = awayScore + 3;
                }
                if (possResult >= (away.getTurnovers() + away.getThreePt()) && possResult <= (away.getTurnovers() + away.getThreePt() + away.getTwoPt())) {
                    awayScore = awayScore + 2;
                }
            }
        }
        System.out.println("Final Score: " + home.getName() + " " + homeScore + ", " + away.getName() + " " + awayScore);
    }
}



