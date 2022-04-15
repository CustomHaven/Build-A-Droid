// https://www.codecademy.com/courses/learn-java/projects/build-a-droid
// Q1
public class Droid {
    // instances Q2 Q3
    String name;
    int batteryLevel;
    int backupBattery;

    // Q4 Q5
    public Droid(String droidName) {
        name = droidName;
        batteryLevel = 100;
        backupBattery = 500;
    }

    // Q10 Q11
    public void performTask(String task) {
        System.out.println(name+" is performing task: "+task);
        batteryLevel -= 10;
    }

    // Q13
    public int energyReport() {
        System.out.println("Current battery level: "+batteryLevel);
        System.out.println(batteryLevel);
        return batteryLevel;
    }
    // Q13
    public void energyTransfer(int exchange) {
        if (backupBattery - exchange >= 0) {
            backupBattery -= exchange;
            batteryLevel += exchange;
            if (batteryLevel > 100) {
                batteryLevel = 100;
            }
        } else {
            System.out.println("The backup battery has less energy than your provided energy level of: "+exchange);
        }
        System.out.println("Backup battery level is: "+backupBattery+"\nCurrent battery level is: "+batteryLevel);
    }
    // my own custom method to spice it up further!
    public void saveBattery(int exchange) {
        if (batteryLevel - exchange >= 0) {
            batteryLevel -= exchange;
            backupBattery += exchange;
        } else {
            System.out.println("The battery level has less energy than your provided energy level of: "+exchange);
        }
        System.out.println("Backup battery level is: "+backupBattery+"\nCurrent battery level is: "+batteryLevel);
    }

    // Q8 toString method
    public String toString() {
        return "Hello, I’m the droid: "+name;
    }

    public static void main(String[] args) {
        // Q6
        Droid codey = new Droid("Codey");
        // Q7
        System.out.println(codey);

        // Q12 Q13
        codey.energyReport();
        codey.performTask("dancing");
        codey.energyReport();

        // Q13 I included saveBattery method myself for my functionality
        codey.saveBattery(60);
        codey.energyTransfer(5);
    }
}
