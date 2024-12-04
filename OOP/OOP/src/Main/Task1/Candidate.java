package Main.Task1;

import java.util.Scanner;

public class Candidate {

    String candidateID;
    String Name;
    double mathScore;
    double physicalScore;
    double chemistryScore;

    //No args constructor
    public Candidate() {

    }

    // Args constructor
    public Candidate(String candidateID, String Name, int mathScore, int physicalScore, int chemistryScore) {
        this.candidateID = candidateID;
        this.Name = Name;
        this.mathScore = mathScore;
        this.physicalScore = physicalScore;
        this.chemistryScore = chemistryScore;
    }

    //Input Info
    public void InputCandidate(Scanner scanner) {
        System.out.println("Enter candidate ID: ");
        candidateID = scanner.next();
        System.out.println("Enter name: ");
        Name = scanner.next();
        System.out.println("Enter math score: ");
        mathScore = scanner.nextInt();
        System.out.println("Enter physical score: ");
        physicalScore = scanner.nextInt();
        System.out.println("Enter chemistry score: ");
        chemistryScore = scanner.nextInt();
    }
    //Output Info
    public void OutputCandidate() {
        System.out.println("Candidate ID: " + candidateID);
        System.out.println("Name: " + Name);
        System.out.println("Math Score: " + mathScore);
        System.out.println("Physical Score: " + physicalScore);
        System.out.println("Chemistry Score: " + chemistryScore);
    }

    //Calculate sum score
    public double sumScore() {
        return mathScore + physicalScore + chemistryScore;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of candidates: ");
        int number = scanner.nextInt();
        Candidate[] candidate = new Candidate[number];

        for (int i = 0; i < number; i++) {
            candidate[i] = new Candidate();
            candidate[i].InputCandidate(scanner);
        }

        for (int i = 0; i < number; i++) {
            candidate[i].OutputCandidate();
        }

        Candidate highestScore = candidate[0];
        for (int i = 1; i < number; i++) {
            if (candidate[i].sumScore() > highestScore.sumScore()) {
                highestScore = candidate[i];
            }
        }

        System.out.println("Highest score is: ");
        highestScore.OutputCandidate();
    }
}
