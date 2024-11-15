/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chap5task1;

/**
 *
 * @author User
 */
public class MaximumValue {
    private int[] value;

    public MaximumValue(int[] value) {
        this.value = value;
    }

    public void displayMax() {
        int max = Math.max(value[0], Math.max(value[1], value[2]));
        System.out.println("The maximum value is: " + max);
    }
}
