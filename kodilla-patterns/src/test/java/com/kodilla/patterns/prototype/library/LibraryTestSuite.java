package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Collections;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTestSuite {

    @Test
    void testGetBooks() {
        //Given
        Library library = new Library("Library1");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> library.getBooks().add(new Book("Book" + n, "Author" + n, LocalDate.of(1987, 1, 1))));


        //When
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("deep copied library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }

        Library shallowClonedLibrary = null;
        try {
            shallowClonedLibrary = library.shallowCopy();
            shallowClonedLibrary.setName("shallow copied library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }

        Book book = new Book("Book1", "Author1", LocalDate.of(1987, 1, 1));
        System.out.println(library.getBooks().contains(book));
        library.getBooks().remove(book);


        library.getBooks().stream().forEach(System.out::println);
        //Then
        assertEquals(9, library.getBooks().size());
        assertEquals(9, deepClonedLibrary.getBooks().size());
        assertEquals(10, shallowClonedLibrary.getBooks().size());
    }
}
