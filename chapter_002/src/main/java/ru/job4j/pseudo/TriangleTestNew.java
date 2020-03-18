package ru.job4j.pseudo;

import org.junit.Test;

import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTestNew {

    @Test
    public void whenDrawTriangle() {
        TriangleNew triangle = new TriangleNew();
        assertThat(
                triangle.draw(),
                is(
                        new StringJoiner(System.lineSeparator())
                                .add("   +   ")
                                .add("  +++  ")
                                .add(" +++++ ")
                                .add("+++++++")
                        .toString()
                )
        );
    }
}
