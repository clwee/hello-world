import java.util.Scanner;

public class Policy {
    
    private int policyNumber;
    private String providerName;
    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus;
    private double height; 
    private double weight; 

    
    public Policy() {
        this.policyNumber = 0;
        this.providerName = "Unknown";
        this.firstName = "Unknown";
        this.lastName = "Unknown";
        this.age = 0;
        this.smokingStatus = "non-smoker";
        this.height = 0.0;
        this.weight = 0.0;
    }

    
    public Policy(int policyNumber, String providerName, String firstName, String lastName,
                  int age, String smokingStatus, double height, double weight) {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.smokingStatus = smokingStatus;
        this.height = height;
        this.weight = weight;
    }

    
    public int getPolicyNumber() {
        return policyNumber;
    }

    public String getProviderName() {
        return providerName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getSmokingStatus() {
        return smokingStatus;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    
    public void setPolicyNumber(int policyNumber) {
        this.policyNumber = policyNumber;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSmokingStatus(String smokingStatus) {
        this.smokingStatus = smokingStatus;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    
    public double calculateBMI() {
        return (this.weight * 703) / (this.height * this.height);
    }

    
    public double calculatePolicyPrice() {
        double baseFee = 600.0;
        double totalPrice = baseFee;

        
        if (this.age > 50) {
            totalPrice += 75.0;
        }

        
        if (this.smokingStatus.equalsIgnoreCase("smoker")) {
            totalPrice += 100.0;
        }

        
        double bmi = calculateBMI();
        if (bmi > 35) {
            totalPrice += (bmi - 35) * 20.0;
        }

        return totalPrice;
    }

    
    public void displayPolicyDetails() {
        System.out.printf("Policy Number: %d%n", policyNumber);
        System.out.printf("Provider Name: %s%n", providerName);
        System.out.printf("Policyholder’s First Name: %s%n", firstName);
        System.out.printf("Policyholder’s Last Name: %s%n", lastName);
        System.out.printf("Policyholder’s Age: %d%n", age);
        System.out.printf("Policyholder’s Smoking Status: %s%n", smokingStatus);
        System.out.printf("Policyholder’s Height: %.1f inches%n", height);
        System.out.printf("Policyholder’s Weight: %.1f pounds%n", weight);
        System.out.printf("Policyholder’s BMI: %.2f%n", calculateBMI());
        System.out.printf("Policy Price: $%.2f%n", calculatePolicyPrice());
    }

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Please enter the Policy Number: ");
        int policyNumber = scanner.nextInt();
        scanner.nextLine();  

        System.out.print("Please enter the Provider Name: ");
        String providerName = scanner.nextLine();

        System.out.print("Please enter the Policyholder’s First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Please enter the Policyholder’s Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Please enter the Policyholder’s Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();  

        System.out.print("Please enter the Policyholder’s Smoking Status (smoker/non-smoker): ");
        String smokingStatus = scanner.nextLine();

        System.out.print("Please enter the Policyholder’s Height (in inches): ");
        double height = scanner.nextDouble();

        System.out.print("Please enter the Policyholder’s Weight (in pounds): ");
        double weight = scanner.nextDouble();

        
        Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);

        
        policy.displayPolicyDetails();

        
        scanner.close();
    }
}
