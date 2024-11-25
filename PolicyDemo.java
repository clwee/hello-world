public class PolicyDemo {
    public static void main(String[] args) {
        PolicyHolder holder1 = new PolicyHolder("Alice", "Jones", 20, true, 65.0, 110.0);
        Policy policy1 = new Policy(3450, "State Farm", holder1);

        PolicyHolder holder2 = new PolicyHolder("Bob", "Lee", 54, false, 72.0, 200.0);
        Policy policy2 = new Policy(3455, "Aetna", holder2);

        PolicyHolder holder3 = new PolicyHolder("Chester", "Williams", 40, true, 71.0, 300.0);
        Policy policy3 = new Policy(2450, "Met Life", holder3);

        PolicyHolder holder4 = new PolicyHolder("Cindy", "Smith", 55, false, 62.0, 140.0);
        Policy policy4 = new Policy(3670, "Global", holder4);

        PolicyHolder holder5 = new PolicyHolder("Jenna", "Lewis", 30, true, 60.0, 105.0);
        Policy policy5 = new Policy(1490, "Reliable", holder5);

        PolicyHolder holder6 = new PolicyHolder("Craig", "Duncan", 23, true, 66.0, 215.0);
        Policy policy6 = new Policy(3477, "State Farm", holder6);

        Policy[] policies = {policy1, policy2, policy3, policy4, policy5, policy6};

        int smokerCount = 0;
        int nonSmokerCount = 0;

        for (Policy policy : policies) {
            System.out.println(policy);
            System.out.println();

            if (policy.getPolicyHolder().isSmoker()) {
                smokerCount++;
            } else {
                nonSmokerCount++;
            }
        }

        System.out.println("There were " + Policy.getPolicyCount() + " Policy objects created.");
        System.out.println("The number of policies with a smoker is: " + smokerCount);
        System.out.println("The number of policies with a non-smoker is: " + nonSmokerCount);
    }
}
