/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugas7;

/**
 *
 * @author amandadhkm
 */
public class LinearEquation{
    // Private attributes
    private double a, b, c, d, e, f;

    // Constructor
    public LinearEquation() {}

    // Getter methods
    public double getA() { return a; }
    public double getB() { return b; }
    public double getC() { return c; }
    public double getD() { return d; }
    public double getE() { return e; }
    public double getF() { return f; }

    // Setter methods
    public void setA(double a) { this.a = a; }
    public void setB(double b) { this.b = b; }
    public void setC(double c) { this.c = c; }
    public void setD(double d) { this.d = d; }
    public void setE(double e) { this.e = e; }
    public void setF(double f) { this.f = f; }

    //Memeriksa apakah persamaan dapat dipecahkan
    public boolean isSolvable() {
        return (a * d - b * c) != 0;
    }

    // Methods untuk get X and Y
    public double getX(){
    return (e * d - b * f) / (a * d - b * c);
    }

    // Method untuk mendapatkan nilai Y
    public double getY() {
    return (a * f - e * c) / (a * d - b * c);
    }
}
