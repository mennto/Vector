package com.company;
import com.company.vactor.Vector;
import java.util.Scanner;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Vector a=new Vector(in.nextDouble(),in.nextDouble(),in.nextDouble());
        Vector b=new Vector(in.nextDouble(),in.nextDouble(),in.nextDouble());
     //   Vector c=new Vector(in.nextDouble(),in.nextDouble(),in.nextDouble());
       System.out.println(a.longVector());
        a.p();
        System.out.println(a.scalarDob(b));
        a.p();
        System.out.println(a.getCos(b));
        a.p();
        Vector c=new Vector();
        c.getCoordinates();
        a.p();
        a.sum(b).getCoordinates();
        a.p();
        a.sub(b).getCoordinates();
        a.p();
        a.getCoordinates();
        a.p();
        System.out.println(Arrays.toString(a.createNVectors(3)));
        System.out.println(a.figureVolume(b,c));
      //  c=a+b;
    }
}
