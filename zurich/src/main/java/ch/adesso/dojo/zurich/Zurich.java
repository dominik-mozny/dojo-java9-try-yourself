package ch.adesso.dojo.zurich;

import ch.adesso.dojo.biggest.Biggest;
import ch.adesso.dojo.german.InGermanPart;
import ch.adesso.dojo.population.Population;

/**
 * @author dominik.mozny
 */
public class Zurich implements Population, InGermanPart, Biggest {
    public int getPopulation() {
        return 391359;
    }
}
