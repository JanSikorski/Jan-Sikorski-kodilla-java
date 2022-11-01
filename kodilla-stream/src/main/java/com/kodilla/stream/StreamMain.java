package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumUser.Forum;
import com.kodilla.stream.forumUser.ForumUser;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.person.People;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {

    public static void main(String[] args) {

        BookDirectory bookDirectory= new BookDirectory();
        String theResultStringOfBooks = bookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n", "<<", ">>"));

        System.out.println(theResultStringOfBooks);

        Forum forum = new Forum();
        Map<Integer, ForumUser> forumUsers = forum.getUserList().stream()
                .filter(user -> user.getUserGender() == 'M')
                .filter(user -> LocalDate.now().getYear() - user.getUserBirthDate().getYear() > 20)
                .filter(user -> user.getUserNumberOfPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserId, user -> user));

        System.out.println(forumUsers.size() + " users found");
        forumUsers.entrySet().stream()
                .map(entry -> entry.getKey() + "\t:\t" + entry.getValue())
                .forEach(System.out::println);
    }
}