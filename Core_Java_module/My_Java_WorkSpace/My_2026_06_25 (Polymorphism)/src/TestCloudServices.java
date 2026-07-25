class CloudService {
    String serviceName;
    double monthlyCost;
    String provider;

    CloudService() {
        this.serviceName = "Default Service";
        this.monthlyCost = 1000;
        this.provider = "AWS";
    }

    CloudService(String serviceName, double monthlyCost, String provider) {
        this.serviceName = serviceName;
        this.monthlyCost = monthlyCost;
        this.provider = provider;
    }

    //polymorphic behaiviour
    void deploy() {
        System.out.println("Deploying cloud service.");
    }

    void display() {
        System.out.println();
        System.out.println("Service Name : " + this.serviceName);
        System.out.println("Monthly Cost : " + this.monthlyCost);
        System.out.println("Provider : " + this.provider);
    }
}//cloud services class ends here

class ComputeInstance extends CloudService {
    int cpuCores;
    int ramSize;

    ComputeInstance() {
        super();
        this.cpuCores = 4;
        this.ramSize = 16;
    }

    ComputeInstance(String serviceName, double monthlyCost, String provider,
                    int cpuCores, int ramSize) {
        super(serviceName, monthlyCost, provider);
        this.cpuCores = cpuCores;
        this.ramSize = ramSize;
    }

    //polymorphic behaviour
    void deploy() {
        System.out.println("Launching virtual machine instance.");
    }

    void display() {
        super.display();
        System.out.println("CPU Cores : " + this.cpuCores);
        System.out.println("RAM Size : " + this.ramSize + " GB");
    }
}//compute instance class ends here

class DatabaseService extends CloudService {
    String databaseType;
    int storageSize;

    DatabaseService() {
        super();
        this.databaseType = "MySQL";
        this.storageSize = 100;
    }

    DatabaseService(String serviceName, double monthlyCost, String provider,
                    String databaseType, int storageSize) {
        super(serviceName, monthlyCost, provider);
        this.databaseType = databaseType;
        this.storageSize = storageSize;
    }
    
    //polymorphic behaviour
    void deploy() {
        System.out.println("Starting managed database service.");
    }

    void display() {
        super.display();
        System.out.println("Database Type : " + this.databaseType);
        System.out.println("Storage Size : " + this.storageSize + " GB");
    }
}//DataServices class ends here

public class TestCloudServices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CloudService cs;

        cs = new CloudService("Basic Cloud", 1500, "AWS");
        cs.display();
        cs.deploy();

        cs = new ComputeInstance("EC2 Instance", 5000, "AWS", 8, 32);
        cs.display();
        cs.deploy();

        cs = new DatabaseService("RDS Service", 8000, "AWS", "PostgreSQL", 500);
        cs.display();
        cs.deploy();
	}

}
