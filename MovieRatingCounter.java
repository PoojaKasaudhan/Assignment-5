import java.util.HashMap;
import java.util.Scanner;

public class MovieRatingCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, RatingStats> ratingsByCategory = new HashMap<>();

        // Get movie ratings until user enters "done"
        while (true) {
            System.out.println("Enter movie rating (e.g., PG-13, R, or done): ");
            String rating = scanner.nextLine();
            if (rating.equalsIgnoreCase("done")) {
                break;
            }

            // Get user input for movie rating (optional)
            System.out.println("Enter movie rating (1-5): ");
            int movieRating = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            // Update rating statistics for the category
            RatingStats stats = ratingsByCategory.get(rating);
            if (stats == null) {
                stats = new RatingStats();
                ratingsByCategory.put(rating, stats);
            }
            stats.count++;
            stats.totalRating += movieRating;
        }

        // Print results
        System.out.println("\nMovie Rating Statistics:");
        for (String category : ratingsByCategory.keySet()) {
            RatingStats stats = ratingsByCategory.get(category);
            double averageRating = stats.count > 0 ? (double) stats.totalRating / stats.count : 0.0;
            System.out.printf("%s: Count = %d, Average Rating = %.2f\n", category, stats.count, averageRating);
        }

        scanner.close();
    }
}

class RatingStats {
    int count = 0;
    int totalRating = 0;
}

