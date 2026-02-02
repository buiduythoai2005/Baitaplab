/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

/**
 *
 * @author 1000l
 */
class Report {
    protected String title;
    public Report(String t) { this.title = t; }
    public void generate() { System.out.println("Tao bao cao: " + title); }
}
