package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *
 */
public class arrQuestTest {
    @Test
    public void test1() {
        int[] arr1 = new int[]{1, 2, 5, 9, 11};
        int[] arr2 = new int[]{2, 5};
        int[] expect = new int[]{2, 5};

        int[] result = arrQuest.Array(arr1, arr2);
        assertThat(result, is(expect));
    }
}
