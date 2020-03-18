package ru.job4j.pseudo;
import java.util.StringJoiner;
public class RombNew implements ShapeNew {
    @Override
    public String draw() {
            StringJoiner pic = new StringJoiner(System.lineSeparator());
            pic.add("    +    ");
            pic.add("  +   +  ");
            pic.add("+       +");
            pic.add("  +    + ");
            pic.add("    +    ");
            return pic.toString();
        }
    }

