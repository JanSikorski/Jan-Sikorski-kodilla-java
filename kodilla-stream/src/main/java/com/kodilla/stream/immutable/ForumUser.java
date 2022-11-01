package com.kodilla.stream.immutable;

public final class ForumUser {

    private final String userName;
    private final String realkName;

    public ForumUser(final String userName, final String realkName) {
        this.userName = userName;
        this.realkName = realkName;
    }

    public String getUserName() {
        return userName;
    }

    public String getRealkName() {
        return realkName;
    }
}
