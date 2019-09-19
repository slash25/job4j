package job4j.array;
import org.junit.Test;
import ru.job4j.array.MinDiapason;
import ru.job4j.array.SortSelected;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int result[] = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSortNew() {
        int[] input = new int[] {3, 4, 10, 20, 15,25,4,1};
        int result[] = SortSelected.sort(input);
        int[] expect = new int[] {1,3,4,4,10,15,20,25};
        assertThat(result, is(expect));
    }
}
