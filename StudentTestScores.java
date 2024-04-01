import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentTestScores {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> scores = new ArrayList<>();

        // Get student test scores
        while (true) {
            System.out.println("Enter test score (or -1 to finish): ");
            int score = scanner.nextInt();
            if (score == -1) {
                break;
            }
            scores.add(score);
        }

        // Calculate average and median
        double average = calculateAverage(scores);
        int median = calculateMedian(scores);

        // Count students in each performance group
        int aboveAverage = 0;
        int atAverage = 0;
        int belowAverage = 0;
        for (int score : scores) {
            if (score > average) {
                aboveAverage++;
            } else if (score == average) {
                atAverage++;
            } else {
                belowAverage++;
            }
        }

        // Print results
        System.out.println("\nTest Score Analysis:");
        System.out.println("Number of students above average: " + aboveAverage);
        System.out.println("Number of students at average: " + atAverage);
        System.out.println("Number of students below average: " + belowAverage);

        System.out.println("\nMedian Scores:");
        System.out.println("Above Average: " + getMedianForGroup(scores, average, true));
        System.out.println("At Average: " + average);
        System.out.println("Below Average: " + getMedianForGroup(scores, average, false));

        scanner.close();
    }

    public static double calculateAverage(ArrayList<Integer> scores) {
        double sum = 0.0;
        for (int score : scores) {
            sum += score;
        }
        return sum / scores.size();
    }

    public static int calculateMedian(ArrayList<Integer> scores) {
        Collections.sort(scores);
        int middleIndex = scores.size() / 2;
        if (scores.size() % 2 == 0) {
            // Handle even number of elements: average of middle two elements
            return (scores.get(middleIndex - 1) + scores.get(middleIndex)) / 2;
        } else {
            // Handle odd number of elements: middle element
            return scores.get(middleIndex);
        }
    }

    public static int getMedianForGroup(ArrayList<Integer> scores, double threshold, boolean above) {
        ArrayList<Integer> filteredScores = new ArrayList<>();
        for (int score : scores) {
            if ((above && score > threshold) || (!above && score < threshold)) {
                filteredScores.add(score);
            }
        }
        return calculateMedian(filteredScores);
    }
}

