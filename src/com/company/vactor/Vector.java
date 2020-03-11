package com.company.vactor;
import java.util.Scanner;

public class Vector<operator> {
    private double x;
    private double y;
    private double z;
    Scanner in=new Scanner(System.in);

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public double longVector() {//длинна вектора
        return Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
    }

    public double scalarDob(Vector other) {//скалярное произвидение векторов
        double x = this.x * other.x;
        double y = this.y * other.y;
        double z = this.z * other.z;
        return x + y + z;
    }

    public Vector vectorDob(Vector other) {//произвидение векторов
        double p1 = this.y * other.z - this.z * other.y;
        double p2 = this.z * other.x - this.x * other.z;
        double p3 = this.x * other.y - this.y * other.x;
        return new Vector(p1, p2, p3);
    }

    public double square(Vector other){//площадь
        Vector a=new Vector();
        a=this.vectorDob(other);
        return a.longVector();
    }

    public double getCos(Vector other) { //косинус
        double chis = this.scalarDob(other);
        double zn = Math.abs(this.longVector()) * Math.abs(other.longVector());
        return chis/zn;
    }


    public Vector sum(Vector other) {//сумма векторов
        double x = this.x + other.x;
        double y = this.y + other.y;
        double z = this.z + other.z;
        return new Vector(x, y, z);
    }

    public Vector sub(Vector other) {//разница векторов
        double x = this.x - other.x;
        double y = this.y - other.y;
        double z = this.z - other.z;
        return new Vector(x, y, z);
    }

    public void getCoordinates() {//координаты векторов
        System.out.println("x = " + this.x);
        System.out.println("y = " + this.y);
        System.out.println("z = " + this.z);
    }

    public void p() {//отступ
        System.out.println("\n");
    }

    public double figureVolume(Vector b,Vector c){
        Vector s=this.vectorDob(b);
        return Math.abs(s.scalarDob(c));
    }


    public Vector[] createNVectors(int N) {//создать N веторов
        Vector[] arr = new Vector[N];
        for (int i = 0; i < N; i++) {
            arr[i] = new Vector();
        }
        return arr;
    }

  //  @Override
  public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
