package group3.BuilderBlueprint;

import java.util.List;

public class Regex {
    private StringBuilder pattern;

    // Constructor for list of components
    // eesmärk on et ehitada string erinevatest osadest kokku
    public Regex(List<String> component) {
        pattern = new StringBuilder(); // <-- lisada
        for (String s : component) { // <-- lisada
            pattern.append(s);   // <-- lisada
        }
    }

    // Method to get the regex pattern as a string
    public String getPattern() {
        return pattern.toString();
    }

    // Override toString method for easy printing
    @Override
    public String toString() {
        return pattern.toString();
    } // lisada kogu meetod

}
