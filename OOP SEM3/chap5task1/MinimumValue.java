/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chap5task1;

/**
 *
 * @author User
 */
public class MinimumValue {
    private int[] value;

    public MinimumValue(int[] value) {
        this.value = value;
    }

    public void displayMin() {
        int min = Math.min(value[0], Math.min(value[1], value[2]));
        System.out.println("The minimum value is: " + min);
    }
}
