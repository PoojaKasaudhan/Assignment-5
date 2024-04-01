import java.util.HashMap;
import java.util.Scanner;

public class BookReviewAnalyzer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> reviewCounts = new HashMap<>();

        // Define rating ranges and sentiment thresholds
        int[] ratingRanges = {1, 5, 6, 10};
        int neutralThreshold = 5;

        // Get book reviews until user enters "done"
        while (true) {
            System.out.println("Enter book review (rating 1-10, or done): ");
            String review = scanner.nextLine();
            if (review.equalsIgnoreCase("done")) {
                break;
            }

            int rating;
            try {
                rating = Integer.parseInt(review);
            } catch (NumberFormatException e) {
                System.out.println("Invalid rating. Please enter a number between 1 and 10.");
                continue;
            }

            // Validate rating
            if (rating < 1 || rating > 10) {
                System.out.println("Invalid rating. Please enter a number between 1 and 10.");
                continue;
            }

            // Update review counts
            for (int i = 0; i < ratingRanges.length - 1; i++) {
                int lowerBound = ratingRanges[i];
                int upperBound = ratingRanges[i + 1];
                if (rating >= lowerBound && rating <= upperBound) {
                    String rangeKey = lowerBound + "-" + upperBound + " stars";
                    reviewCounts.put(rangeKey, reviewCounts.getOrDefault(rangeKey, 0) + 1);
                    break;
                }
            }

            String sentiment;
            if (rating > neutralThreshold) {
                sentiment = "Positive";
            } else if (rating < neutralThreshold) {
                sentiment = "Negative";
            } else {
                sentiment = "Neutral";
            }
            reviewCounts.put(sentiment, reviewCounts.getOrDefault(sentiment, 0) + 1);
        }

        // Print results
        System.out.println("\nBook Review Analysis:");
        for (String key : reviewCounts.keySet()) {
            System.out.println(key + ": " + reviewCounts.get(key));
        }

        scanner.close();
    }
}

