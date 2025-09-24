import java.util.List;

public class Regex {
    private StringBuilder pattern;

    // Constructor for list of components
    public Regex(List<String> components) {
        pattern = new StringBuilder();
        for (String component : components) {
            pattern.append(component);
        }
    }

    // No-argument constructor for test purposes
    public Regex() {
        pattern = new StringBuilder();
    }

    public String getPattern() {
        return pattern.toString();
    }

    @Override
    public String toString() {
        return pattern.toString();
    }
}
