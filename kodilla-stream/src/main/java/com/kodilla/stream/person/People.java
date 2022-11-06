package com.kodilla.stream.person;

import java.util.ArrayList;
import java.util.List;

public final class People {

    public static List<String> getList() {
        final List<String> theList = new ArrayList<>();

        theList.add("John Smith");
        theList.add("Dorithy Newman");
        theList.add("john Wolkowitz");
        theList.add("Lucy Riley");
        theList.add("Owen Rogers");
        theList.add("matilda Davies");
        theList.add("Declan booth");
        theList.add("Corinne Foster");
        theList.add("Khloe Fry");
        theList.add("Martin Valenzuela");

        return new ArrayList<>(theList);
    }
}
