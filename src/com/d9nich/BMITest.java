package com.d9nich;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BMITest {

    @Test
    void getBMI() {
        isIdenticalBMI(60, 1.69);
        isIdenticalBMI(50, 1.49);
        isIdenticalBMI(80, 1.60);
    }

    @Test
    void getStatus() {
        BMI bmi = new BMI("user", 30, 1.49);
        assertEquals("Underweight", bmi.getStatus());
        bmi = new BMI("user", 70, 1.69);
        assertEquals("Normal", bmi.getStatus());
        bmi = new BMI("user", 60, 1.49);
        assertEquals("Overweight", bmi.getStatus());
        bmi = new BMI("user", 100, 1.49);
        assertEquals("Obese", bmi.getStatus());
    }

    private static double calculateBMI(double weight, double height) {
        double bmi = weight / Math.pow(height, 2);
        return Math.round(bmi * 100) / 100.0;
    }

    private static void isIdenticalBMI(double weight, double height) {
        BMI bmi = new BMI("man", weight, height);
        assertEquals(bmi.getBMI(), calculateBMI(weight, height));
    }
}