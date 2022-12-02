package com.kodilla.good.patterns.challenges;

import java.util.Objects;

public class User {

    private final String name;
    private final String email;
    private final long phoneNumber;

    public User(final String name, final String email, final long phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getEmai() {
        return email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (phoneNumber != user.phoneNumber) return false;
        if (!Objects.equals(name, user.name)) return false;
        return Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (int) (phoneNumber ^ (phoneNumber >>> 32));
        return result;
    }
}