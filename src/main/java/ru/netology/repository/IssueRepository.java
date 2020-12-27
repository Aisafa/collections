package ru.netology.repository;

import ru.netology.domain.Issue;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class IssueRepository {
    private List<Issue> items = new ArrayList<>();

    public void add(Issue item) {
        items.add(item);
    }

}
