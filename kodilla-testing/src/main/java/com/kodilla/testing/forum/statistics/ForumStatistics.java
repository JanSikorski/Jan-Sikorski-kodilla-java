package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.ForumUser;

import java.util.LinkedList;
import java.util.List;

public class ForumStatistics implements Statistics{

    @Override
    public List<String> userNames() {
        List<String> userNames = new LinkedList<>();

        return userNames;
    }

    @Override
    public int postCount() {
        return 0;
    }

    @Override
    public int commentsCount() {
        return 0;
    }

    public int calculateAdvStatistics(Statistics statistics) {
        return 0;
    }

    public void showStatistics() {

    }
}
