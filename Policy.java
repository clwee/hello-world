public class Policy {

    
    private int policyNumber;
    private String providerName;
    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus;
    private int height; 
    private int weight; 

    
    public Policy() {
        this.policyNumber = 0;
        this.providerName = "Unknown";
        this.firstName = "Unknown";
        this.lastName = "Unknown";
        this.age = 0;
        this.smokingStatus = "non-smoker";
        this.height = 0;
        this.weight = 0;
    }

    
    public Policy(int policyNumber, String providerName, String firstName, String lastName, 
                  int age, String smokingStatus, int height, int weight) {
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

    public int getHeight() {
        return height;
    }

    public int getWeight() {
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

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    
    public double calculateBMI() {
        return (this.weight * 703.0) / (this.height * this.height);
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

    
    public static void main(String[] args) {
        
        Policy defaultPolicy = new Policy();
        System.out.println("Default Policy BMI: " + defaultPolicy.calculateBMI());
        System.out.println("Default Policy Price: $" + defaultPolicy.calculatePolicyPrice());

        
        Policy customPolicy = new Policy(12345, "Health Insurance Inc.", "John", "Doe", 
                                         55, "smoker", 70, 220);
        System.out.println("Custom Policy BMI: " + customPolicy.calculateBMI());
        System.out.println("Custom Policy Price: $" + customPolicy.calculatePolicyPrice());
    }
}
