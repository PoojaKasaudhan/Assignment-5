import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class ProjectStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> completionTimes = new ArrayList<>();
        int earlyCount = 0;
        int onTimeCount = 0;
        int lateCount = 0;
        
        System.out.println("Enter the completion times of student projects:");
        System.out.println("(Enter a negative number to finish input)");
        
        // Input loop for project completion times
        while (true) {
            System.out.print("Enter completion time (in days): ");
            int time = scanner.nextInt();
            if (time < 0) {
                break;
            }
            completionTimes.add(time);
            
            // Check if the project is early, on time, or late
            if (time < 0) {
                earlyCount++;
            } else if (time == 0) {
                onTimeCount++;
            } else {
                lateCount++;
            }
        }
        
        // Calculate the average completion time
        double sum = 0;
        for (int t : completionTimes) {
            sum += t;
        }
        double averageTime = sum / completionTimes.size();
        
        // Output the statistics
        System.out.println("Number of projects completed early: " + earlyCount);
        System.out.println("Number of projects completed on time: " + onTimeCount);
        System.out.println("Number of projects completed late: " + lateCount);
        System.out.printf("Average completion time: %.2f days\n", averageTime);
        
        scanner.close();
    }
}

