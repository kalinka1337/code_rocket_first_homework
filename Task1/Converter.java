package Task1;

import java.util.*;

public class Converter
{

    public static void main(String[] args) {

        double inches;
        double cfx = 0.0254;
        double meters;
//        double result = inches * 0.0254;

        Scanner input = new Scanner (System.in);
        System.out.println("Enter inches: ");
        inches = input.nextDouble();
        meters = inches * cfx;
        System.out.println(inches+"inches is "+meters+"meters");


    }

}
