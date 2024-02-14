

    // Droid.java
    public class Droid {
        //Declaring instance fields called batteryLevel and name.
        private int batteryLevel;
        private String name;

        // Constructor method for the Droid class.
        public Droid(String droidName) {
            // Parameter value droidName assigned to the appropriate instance field.
            this.name = droidName;
            // Value of batteryLevel set to 100 for every new instance of Droid.
            this.batteryLevel = 100;
        }

        // toString() method within Droid.
        public String toString() {
            return "Hello, I'm the droid: " + this.name;
        }

        // New method: performTask().
        public void performTask(String task) {

            System.out.println(this.name + " is performing task: " + task);
            // batteryLevel decreased by 10.
            this.batteryLevel -= 10;
        }

        // method energyReport() created to print the instance's battery level.
        public void energyReport() {
            System.out.println("Battery level of " + this.name + " is: " + this.batteryLevel);
        }

        // energyTransfer() created to exchange batteryLevel between instances.
        public void energyTransfer(Droid otherDroid) {
            int transferAmount = 10; // amount of battery to transfer
            if (this.batteryLevel >= transferAmount) {
                this.batteryLevel -= transferAmount;
                otherDroid.batteryLevel += transferAmount;
                System.out.println("Transferred " + transferAmount + " battery from " + this.name + " to " + otherDroid.name);
            } else {
                System.out.println("Not enough battery to transfer from " + this.name);
            }
        }


        // main() method
        public static void main(String[] args) {
            // new instance of Droid named "Codey".
            Droid codey = new Droid("Codey");

            System.out.println(codey);

            // Droid instance performs some tasks.
            codey.performTask("dancing");
            codey.performTask("singing");

            // prints out battery level of codey droid instance
            codey.energyReport();


            // another instance
            Droid r2d2 = new Droid("R2D2");
            codey.energyTransfer(r2d2);
            codey.energyReport();
            r2d2.energyReport();
        }
    }


