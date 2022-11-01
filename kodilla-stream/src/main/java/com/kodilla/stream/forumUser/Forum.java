package com.kodilla.stream.forumUser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Forum {

    private static final Random RANDOM = new Random();
    private final List<ForumUser> forumUsers = new ArrayList<>();

    public List<ForumUser> getUserList() {
        randomiseUserList(200);
        return new ArrayList<>(forumUsers);
    }

    public List<ForumUser> randomiseUserList(int numberOfUsers) {
        for (int i = 0; i < numberOfUsers; i++) {
            forumUsers.add(new ForumUser(i,
                    "User" + i,
                    (RANDOM.nextBoolean()) ? 'M' : 'F',
                    LocalDate.of(RANDOM.nextInt(1970, 2020), 01, 01),
                    RANDOM.nextInt(200)));
        }
        return new ArrayList<>(forumUsers);
    }
}
