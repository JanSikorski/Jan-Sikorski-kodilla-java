package com.kodilla.patterns.prototype.library;


import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTestSuite {

    @Test
    void testGetBooks() {
        //Given
        Library library = new Library("Original library");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> library.getBooks().add(new Book("Book" + n, "Author" + n, LocalDate.of(1999, 01, 01))));

        Library shallowCopiedLibrary = null;
        try {
            shallowCopiedLibrary = library.shallowCopy();
            shallowCopiedLibrary.setName("Shallow Copied Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }

        Library deepCopiedLibrary = null;
        try {
            deepCopiedLibrary = library.deepCopy();
            deepCopiedLibrary.setName("Deep Copied Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }

        //When
        library.getBooks().add(new Book("Additional book", "Additional Author", LocalDate.of(2022, 12, 29)));

        //Then
        assertEquals(11, library.getBooks().size());
        assertEquals(11, shallowCopiedLibrary.getBooks().size());
        assertEquals(10, deepCopiedLibrary.getBooks().size());
    }
}
