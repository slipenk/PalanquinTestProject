package org.slipenk;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        DateSorter dateSorter = new DateSorter();

        System.out.println(dateSorter.sortDates(new ArrayList<>(List.of(
                LocalDate.of(2004, 7, 1),
                LocalDate.of(2005, 1, 2),
                LocalDate.of(2007, 1, 1),
                LocalDate.of(2032, 5, 3)))));
    }
}