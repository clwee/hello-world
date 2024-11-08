import java.io.*;
import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Policy> policies = new ArrayList<>();
        int smokerCount = 0;
        int nonSmokerCount = 0;

        // Read policies from file
        try (BufferedReader br = new BufferedReader(new FileReader("PolicyInformation.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                int policyNumber = Integer.parseInt(line);
                String providerName = br.readLine();
                String firstName = br.readLine();
                String lastName = br.readLine();
                int age = Integer.parseInt(br.readLine());
                String smokingStatus = br.readLine();
                double height = Double.parseDouble(br.readLine());
                double weight = Double.parseDouble(br.readLine());

                // Create Policy object
                Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);
                policies.add(policy);

                // Count smokers and non-smokers
                if (smokingStatus.equalsIgnoreCase("smoker")) {
                    smokerCount++;
                } else {
                    nonSmokerCount++;
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        // Display each policy's information
        for (Policy policy : policies) {
            System.out.println(policy);
            System.out.println();
        }

        // Display number of smokers and non-smokers
        System.out.println("The number of policies with a smoker is: " + smokerCount);
        System.out.println("The number of policies with a non-smoker is: " + nonSmokerCount);
    }
}
