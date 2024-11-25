public class Policy {
    private static int policyCount = 0; 

    private int policyNumber;
    private String providerName;
    private PolicyHolder policyHolder;

    public Policy(int policyNumber, String providerName, PolicyHolder policyHolder) {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.policyHolder = policyHolder;
        policyCount++;
    }

    public int getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(int policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public PolicyHolder getPolicyHolder() {
        return policyHolder;
    }

    public void setPolicyHolder(PolicyHolder policyHolder) {
        this.policyHolder = policyHolder;
    }

    public static int getPolicyCount() {
        return policyCount;
    }

    @Override
    public String toString() {
        return String.format("Policy Number: %d\nProvider Name: %s\n%sPolicy Price: $%.2f\n",
                policyNumber, providerName, policyHolder.toString(), calculatePolicyPrice());
    }

    public double calculatePolicyPrice() {
        double basePrice = 600;
        if (policyHolder.isSmoker()) {
            basePrice += 100;
        }
        if (policyHolder.getAge() > 50) {
            basePrice += 75;
        }
        return basePrice;
    }
}
