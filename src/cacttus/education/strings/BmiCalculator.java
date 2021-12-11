package cacttus.education.strings;

import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj peshen tuaj: ");
        double pesha = reader.nextDouble();
        System.out.println("shkruaj gjatesine tuaj: ");
        double gjatesia = reader.nextDouble();
        double bmi = pesha / (gjatesia * gjatesia);

        if (bmi > 0 && bmi < 18.5) {
            System.out.println("Ju jeni nenpeshe!");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Ju jeni ne peshe normale!");
        } else if (bmi >= 25 && bmi <= 30) {
            System.out.println("Ju jeni mbipeshe!");
        } else {
            System.out.println("Ju jeni obez!");
        }
    }
}
