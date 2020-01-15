package com.company;

public class Main {

    public static void main(String[] args) {
        printMyName();
        System.out.println("\n Exercise");
        int x1 = sum(18, 13);
        System.out.println("Rezultatul adunarii este:" + x1);
        int x2 = dif(30, 26 );
        System.out.println("Rezultatul diferentei este:" +  x2);
        int x3 = inm(7, 7);
        System.out.println("Rezultatul inmultirii este:" + x3);
        double x4 = imp(13, 2);
        System.out.println("Rezultatul impartirii este:" + x4);
        double x5 = mda(10, 8, 6);
        System.out.println("Media numerelor este:" + x5);
        double x6 = rstimp (10, 8);
        System.out.println("Restul impartirii este:" + x6);
        double x7 = tmpc (100);
        System.out.println("Temperatura in grade celsius este:" + x7);
        double x8 = dst (100);
        System.out.println("Distanta in metri este:" + x8);
        printMyJava();
        printMyRobot();

    }


    public static void printMyName(){
        System.out.println("Buna, \n eu sunt  \n    Mihai");
    }
    public static int sum(int a, int b){
        int sum = a + b;
        return sum;
    }
    public static int dif(int a1, int b1) {
        int dif = a1 - b1;
        return dif;
    }
    public static int inm(int a2, int b2) {
        int inm = a2 * b2;
        return inm;
    }
    public static double imp(double a3, double b3) {
        double imp = a3 / b3;
        return imp;
    }
    public static double mda(double a4, double b4, double c4) {
        double mda = (a4 + b4 + c4) / 3;
        return mda;
    }
    public static double rstimp(double a5, double b5) {
        double rstimp = a5 % b5;
        return rstimp;
    }
    public static double tmpc(double a6) {
        double tmpc = (a6 - 32) * 5 / 9;
        return tmpc;
    }
    public static double dst(double a7) {
        double dst = a7 * 0.025;
        return dst;
    }
    public static double vtz(double a8, double b8, double c8, double d8) {
        double vtzms =a8 / d8;
        double vtzkmo =(a8 / 1000) / b8;
        double vtzmph =(a8 / 1609) / b8 ;
        return vtzms;
    }
    public static void printMyJava(){
        System.out.println("       J    A    V      V   A      ");
        System.out.println("       J   A A    V    V   A A     ");
        System.out.println("   J   J  AAAAA    V  V   AAAAA    ");
        System.out.println("    JJJ  A     A    V    A     A   ");
    }
    public static void printMyRobot(){
        System.out.println("       +'''''''''''+     ");
        System.out.println("      [|  o     o  |]    ");
        System.out.println("       |     ^     |     ");
        System.out.println("       |           |     ");
        System.out.println("       |    '-'    |     ");
        System.out.println("       +-----------+     ");
    }







}
