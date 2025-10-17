package group3.BuilderBlueprint;

import java.util.ArrayList;
import java.util.List;

public class ConcreteRegexBuilder implements RegexBuilder {
    private List<String> component = new ArrayList<>(); // <-- lisada new ArrayList<>();

    @Override  // lisada
    public void buildLiteral(String literal) {
        component.add(literal);
    }

    @Override // lisada
    public void buildAnyCharacter() {
        component.add(".");
    }

    @Override // lisada
    public void buildDigit() {
        component.add("\\d");
    }

    @Override // lisada
    public void buildWhitespace() {
        component.add("\\s");
    }

    @Override // lisada
    public void buildWordCharacter() {
        component.add("\\w");
    }

    @Override
    public Regex getResult() {
        return new Regex(component); // <-- lisada see rida
    }
}