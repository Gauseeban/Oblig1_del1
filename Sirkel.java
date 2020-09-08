/**
 * Created by Gauseeban on 21.07.2020.
 */
public class Sirkel {
    // Statisk metode som returnerer diameteren til en sirkel
    public static double diameter(double radius){
        double diameter = radius * 2;
        return diameter;
    }

    // Statisk metode som beregner og returnerer sirkelens omkrets (omkrets = 2*pi*r)
    public static double omkrets(double radius){
        double omkrets = 2 * Math.PI * radius;
        return omkrets;
    }

    // Statisk metode som beregner og returnerer sirkelens areal (areal = pi * r^2)
    public static double areal(double radius){
        double areal = Math.PI * Math.pow(radius, 2);
        return areal;
    }

}
