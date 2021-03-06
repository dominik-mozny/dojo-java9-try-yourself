package ch.adesso.dojo.city.info;

import ch.adesso.dojo.bern.Bern;
import ch.adesso.dojo.french.InFrenchPart;
import ch.adesso.dojo.genf.Genf;
import ch.adesso.dojo.german.InGermanPart;
import ch.adesso.dojo.population.Population;
import ch.adesso.dojo.zurich.Zurich;
import sun.misc.BASE64Encoder;

/**
 * @author dominik.mozny
 */
public class CityInfo {
    public static void main(String[] args) {
        System.out.println("---------- INFORMATION ABOUT SOME SWITZERLAND CITIES --------------");
        printCitiesInGermanPart();
        printCitiesInFrenchPart();
        printCitiesPopulation();
        weirdCode();
    }

    public static void printCitiesInGermanPart() {
        System.out.println("Cities in german part: ");
        InGermanPart bern = new Bern();
        InGermanPart zurich = new Zurich();
        System.out.println(bern.getClass().getSimpleName());
        System.out.println(zurich.getClass().getSimpleName());
        System.out.println("-----------------");
    }

    public static void printCitiesInFrenchPart() {
        System.out.println("Cities in french part: ");
        InFrenchPart genf = new Genf();
        System.out.println(genf.getClass().getSimpleName());
        System.out.println("-----------------");
    }

    public static void printCitiesPopulation() {
        System.out.println("Cities population");
        Population bern = new Bern();
        Population zurich = new Zurich();
        Population genf = new Genf();
        System.out.println("Bern: " + bern.getPopulation());
        System.out.println("Zurich: " + zurich.getPopulation());
        System.out.println("Genf: " + genf.getPopulation());
        System.out.println("-----------------");
    }

    private static void weirdCode() {
        System.out.println("Code not compatible with Java 9:");
        BASE64Encoder encoder = new BASE64Encoder();
        byte[] characters = {'h', 'e', 'l', 'l', 'o'};
        String encodedCharacters = encoder.encode(characters);
        System.out.println(encodedCharacters);
    }
}
