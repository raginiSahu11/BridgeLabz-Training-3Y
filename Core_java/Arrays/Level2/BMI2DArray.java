import java.util.Scanner;

public class BMI2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double[][] personData = new double[n][3]; // weight, height, BMI
        String[] weightStatus = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter weight (kg) and height (m) for person " + (i + 1) + ": ");
            double w = sc.nextDouble();
            double h = sc.nextDouble();

            if (w <= 0 || h <= 0) {
                System.out.println("Invalid values! Try again.");
                i--;
                continue;
            }

            personData[i][0] = w;
            personData[i][1] = h;
            personData[i][2] = w / (h * h);

            if (personData[i][2] < 18.5) weightStatus[i] = "Underweight";
            else if (personData[i][2] < 24.9) weightStatus[i] = "Normal";
            else if (personData[i][2] < 29.9) weightStatus[i] = "Overweight";
            else weightStatus[i] = "Obese";
        }

        System.out.println("\n--- BMI Report ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1) + ": Height=" + personData[i][1] +
                    "m, Weight=" + personData[i][0] + "kg, BMI=" + personData[i][2] +
                    ", Status=" + weightStatus[i]);
        }
        sc.close();
    }
}
