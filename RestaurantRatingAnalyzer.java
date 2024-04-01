import java.util.*;

public class RestaurantRatingAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user to enter ratings
        System.out.print("Enter restaurant ratings separated by spaces: ");
        String input = scanner.nextLine();
        
        // Split the input string into an array of ratings
        String[] ratingsStr = input.split(" ");
        int[] ratings = new int[ratingsStr.length];
        for (int i = 0; i < ratingsStr.length; i++) {
            ratings[i] = Integer.parseInt(ratingsStr[i]);
        }
        
        // Analyze ratings
        Map<String, Integer> ratingCounts = new HashMap<>();
        Map<String, Integer> ratingSums = new HashMap<>();
        
        for (int rating : ratings) {
            String range = getRange(rating);
            ratingCounts.put(range, ratingCounts.getOrDefault(range, 0) + 1);
            ratingSums.put(range, ratingSums.getOrDefault(range, 0) + rating);
        }
        
        // Print results
        System.out.println("Rating Range\tNumber of Restaurants\tAverage Rating");
        for (String range : ratingCounts.keySet()) {
            int count = ratingCounts.get(range);
            int sum = ratingSums.get(range);
            double average = (double) sum / count;
            System.out.printf("%s\t\t%d\t\t\t\t%.2f\n", range, count, average);
        }
        
        scanner.close();
    }
    
    private static String getRange(int rating) {
        if (rating >= 1 && rating <= 5) {
            return "1-5";
        } else if (rating >= 6 && rating <= 10) {
            return "6-10";
        } else {
            return "Invalid";
        }
    }
}

