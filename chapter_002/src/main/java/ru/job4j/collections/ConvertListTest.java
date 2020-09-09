package ru.job4j.collections;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ConvertListTest {
    @Test
    public void whenTwoList() {
        List<int[]> in = new ArrayList<>();
        in.add(new int[] {1});
        in.add(new int[] {2, 3});
        List<Integer> expect = Arrays.asList(1, 2, 3);
        assertThat(ConvertList.convert(in), is(expect));
    }
    @Test
    public void whenStringList() {
        List<String[]> in = new ArrayList<>();
        in.add(new String[] {"Petr", "Arsentiev"});
        in.add(new String[] {"Text"});
        List<String> expect = Arrays.asList("Petr", "Arsentiev", "Text");
        assertThat(ConvertList.convertStrings(in), is(expect));
    }

}
