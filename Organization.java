class Organization {
    private String organizationCode;
    private String organizationName;
    private String organizationAddress;

    // Constructor to create an Organization object
    public Organization(String organizationCode, String organizationName, String organizationAddress) {
        this.organizationCode = organizationCode;
        this.organizationName = organizationName;
        this.organizationAddress = organizationAddress;
    }

    // Copy constructor to create a clone of an existing object
    public Organization(Organization org) {
        this.organizationCode = org.organizationCode;
        this.organizationName = org.organizationName;
        this.organizationAddress = org.organizationAddress;
    }

    // Method to print object details
    public void printDetails() {
        System.out.println("Organization Code: " + organizationCode);
        System.out.println("Organization Name: " + organizationName);
        System.out.println("Organization Address: " + organizationAddress);
    }

    public static void main(String[] args) {
        // Create an Organization object
        Organization originalOrg = new Organization("ABC123", "My Company", "123 Main St");

        // Clone the object using the copy constructor
        Organization clonedOrg = new Organization(originalOrg);

        // Print details of both objects
        System.out.println("Original Organization:");
        originalOrg.printDetails();

        System.out.println("\nCloned Organization:");
        clonedOrg.printDetails();
    }
}

