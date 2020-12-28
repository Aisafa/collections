package ru.netology.repository;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Issue;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IssueRepositoryTest {
    private IssueRepository repository = new IssueRepository();
    private Issue first = new Issue(1, "one", "description",true, "Aidar", "Ruslan", "Kotlin", "back",  "bug");
    private Issue second = new Issue(2, "two", "description",false, "Natalya", "Alex", "Reporting", "front", "bug");
    private Issue third = new Issue(3, "three", "description",true, "Tatyana", "Igor", "Tools", "Analytics",  "bug");
    private Issue fourth = new Issue(4, "four", "description",true, "Nikita", "Ruslan", "Gradle", "back", "bug");
    List<Issue> items = new ArrayList<>();

    @Test
    void shouldAddIssue() {
        repository.add(third);
        items.add(first);
        items.add(second);
        System.out.println(items);
    }

}