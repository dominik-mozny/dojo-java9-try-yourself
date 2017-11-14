package ch.adesso.dojo.bern;

import ch.adesso.dojo.german.InGermanPart;
import ch.adesso.dojo.parlament.WithParlament;
import ch.adesso.dojo.population.Population;

/**
 * @author dominik.mozny
 */
public class Bern implements Population, InGermanPart, WithParlament {
    public int getPopulation() {
        return 130015;
    }
}
