/**
 * Created by Gauseeban on 21.07.2020.
 */
public class Oblig1Oppgave1 {
    public static void main(String[] args){

        double radius = 32.5;
        String areal = String.format("%.2f",Sirkel.areal(radius));
        String omkrets = String.format("%.2f",Sirkel.omkrets(radius));
        String diameter = String.format("%.2f",Sirkel.diameter(radius));

        System.out.println("Arealet av sirkelen med radius " + radius + " er " + areal);
        System.out.println("Omkretsen av sirkelen med radius " + radius + " er " + omkrets);
        System.out.println("Diameteren av sirkelen med radius " + radius + " er " + diameter);



    }
}
