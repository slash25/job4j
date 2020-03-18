package ru.job4j.pseudo;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */

public class SquareTestNew {
    @Test
    public void whenDrawSquare() {
        SquareNew square = new SquareNew();
        assertThat(
                square.draw(),
                is(
                        new StringBuilder(System.lineSeparator())
                                .append("++++++++")
                                .append("+      +")
                                .append("+      +")
                                .append("++++++++")
                                .append(System.lineSeparator())
                                .toString()
                )
        );
    }
}
