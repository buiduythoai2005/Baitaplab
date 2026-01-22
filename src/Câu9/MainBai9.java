/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Câu9;

/**
 *
 * @author 1000l
 */
public class MainBai9 {
    public static void main(String[] args) {
        CPU myCpu = new CPU("Intel i9", "5.0GHz");
        new Computer("Tuf Gaming", myCpu).displayInfo();
    }
}
