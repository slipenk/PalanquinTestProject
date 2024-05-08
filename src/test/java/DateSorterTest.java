import org.example.DateSorter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

class DateSorterTest {

    private final DateSorter sorter = new DateSorter();

    @Test
    void testSortInitialDates() {
        List<LocalDate> unsortedDates = Arrays.asList(
                LocalDate.of(2004, 7, 1),
                LocalDate.of(2005, 1, 2),
                LocalDate.of(2007, 1, 1),
                LocalDate.of(2032, 5, 3)
        );

        Collection<LocalDate> sortedDates = sorter.sortDates(unsortedDates);

        List<LocalDate> expectedSortedDates = Arrays.asList(
                LocalDate.of(2005, 1, 2),
                LocalDate.of(2007, 1, 1),
                LocalDate.of(2032, 5, 3),
                LocalDate.of(2004, 7, 1)
        );

        Assertions.assertEquals(expectedSortedDates, sortedDates);
    }

    @Test
    void testSortManyRandomDates() {
        List<LocalDate> unsortedDates = Arrays.asList(
                LocalDate.of(2001, 1, 1),
                LocalDate.of(2002, 2, 2),
                LocalDate.of(2003, 3, 1),
                LocalDate.of(2004, 4, 1),
                LocalDate.of(2005, 5, 2),
                LocalDate.of(2007, 6, 1),
                LocalDate.of(2007, 7, 1),
                LocalDate.of(2008, 8, 2),
                LocalDate.of(2009, 9, 1),
                LocalDate.of(2009, 10, 1),
                LocalDate.of(2010, 11, 2),
                LocalDate.of(2011, 12, 1),
                LocalDate.of(2012, 8, 3)
        );

        Collection<LocalDate> sortedDates = sorter.sortDates(unsortedDates);

        List<LocalDate> expectedSortedDates = Arrays.asList(
                LocalDate.of(2001, 1, 1),
                LocalDate.of(2002, 2, 2),
                LocalDate.of(2003, 3, 1),
                LocalDate.of(2004, 4, 1),
                LocalDate.of(2009, 9, 1),
                LocalDate.of(2009, 10, 1),
                LocalDate.of(2010, 11, 2),
                LocalDate.of(2011, 12, 1),
                LocalDate.of(2012, 8, 3),
                LocalDate.of(2008, 8, 2),
                LocalDate.of(2007, 7, 1),
                LocalDate.of(2007, 6, 1),
                LocalDate.of(2005, 5, 2)
        );

        Assertions.assertEquals(expectedSortedDates, sortedDates);
    }
}
