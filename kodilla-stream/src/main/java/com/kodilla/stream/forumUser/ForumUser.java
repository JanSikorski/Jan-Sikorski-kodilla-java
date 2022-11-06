package com.kodilla.stream.forumUser;

import java.time.LocalDate;

public final class ForumUser {
    private final int userId;
    private final String userName;
    private final char userGender;
    private final LocalDate userBirthDate;
    private final int userNumberOfPosts;

    public ForumUser(int userId, String userName, char userGender, LocalDate userBirthDate, int userNumberOfPosts) {
        this.userId = userId;
        this.userName = userName;
        this.userGender = userGender;
        this.userBirthDate = userBirthDate;
        this.userNumberOfPosts = userNumberOfPosts;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public char getUserGender() {
        return userGender;
    }

    public LocalDate getUserBirthDate() {
        return userBirthDate;
    }

    public int getUserNumberOfPosts() {
        return userNumberOfPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userGender=" + userGender +
                ", userBirthDate=" + userBirthDate +
                ", userNumberOfPosts=" + userNumberOfPosts +
                '}';
    }
}
