// Health and Fitness Status Calculator
public class main {

    public static void main(String[] args) {

        // Person profile details
        String name = "lavanya";
        double heightinmeters = 1.70;
        double weightinkgs = 54.6;
        int age = 21;
        int dailyactivityhours = 2;
        int waterintakeinlitres = 3;
        int sleephours = 6;

        //Calculate BMI
        double bmi = (double) weightinkgs / (heightinmeters * heightinmeters);

        //Display details
        System.out.println("\nHEALTH AND FITNESS REPORT\n");

        System.out.println("Name: " + name);
        System.out.println("BMI: " + bmi);

        if (bmi < 18.5) {
            System.out.println("BMI Category: " + "Underweight");
        } else if (bmi < 25) {
            System.out.println("BMI Category: " + "Normal");
        } else if (bmi < 30) {
            System.out.println("BMI Category: " + "Overweight");
        } else {
            System.out.println("BMI Category: " + "Obese");
        }

        //Display Activity Status
        String activityStatus = (dailyactivityhours >= 1) ? "Good" : "Poor";
        System.out.println("\nActivity Status: " + activityStatus);

        //Display Water Intake Status
        String waterintakeStatus = (waterintakeinlitres >= 2) ? "Good" : "Poor";
        System.out.println("Water Intake Status: " + waterintakeStatus);

        //Display Sleep Status
        String sleepStatus = (sleephours >= 7 && sleephours <= 9) ? "Healthy" : "Unhealthy";
        System.out.println("Sleep Status: " + sleepStatus);

        //Display Overall Fitness Status
        int count = 1;
        int healthycount = 0;
        while (count <= 4) {
            if (count == 1) {
                if (bmi >= 18.5 && bmi <= 25) {
                    healthycount++;
                }
            }
            count++;
            if (count == 2) {
                if (dailyactivityhours >= 1) {
                    healthycount++;
                }
            }
            count++;
            if (count == 3) {
                if (waterintakeinlitres >= 2) {
                    healthycount++;
                }
            }
            count++;
            if (count == 4) {
                if (sleephours >= 7 && sleephours <= 9) {
                    healthycount++;
                }
            }
        }
        String overallfitness = (healthycount >= 4) ? "HEALTHY" : "Needs Improvement";
        System.out.println("\nOverall Fitness Status: " + overallfitness);
        System.out.println("Message: Continue maintaining the same routine.");
    }

}

