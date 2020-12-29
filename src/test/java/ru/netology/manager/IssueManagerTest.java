package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Issue;

import java.util.*;
import java.util.List;

class IssueManagerTest {
    private IssueManager manager = new IssueManager();
    private Issue first = new Issue(1, "one", "description", true, Set.of("Aidar"), Set.of("Ruslan"), Set.of("Tools"), "back", "bug");
    private Issue second = new Issue(2, "two", "description", false, Set.of("Natalya"), Set.of("Alex"), Set.of("Gradle"), "front", "bug");
    private Issue third = new Issue(3, "three", "description", true, Set.of("Tatyana"), Set.of("Igor"), Set.of("Tools"), "Analytics", "bug");
    private Issue fourth = new Issue(4, "four", "description", true, Set.of("Aidar"), Set.of("Ruslan"), Set.of("Gradle"), "front", "bug");
    private Issue fifth = new Issue(5, "five", "description", false, Set.of("Aidar"), Set.of("Igor"), Set.of("Kotlin"), "back", "bug");
    private Issue sixth = new Issue(6, "six", "description", true, Set.of("Vova"), Set.of("Igor"), Set.of("Tools"), "front", "bug");
    private Issue seventh = new Issue(7, "seven", "description", false, Set.of("Alex"), Set.of("Igor"), Set.of("Gradle"), "Analytics", "bug");
    private List<Issue> itemss = new ArrayList<>(List.of(fifth, seventh, third, second, first, fourth, sixth));

    @Test
    void shouldFilterByAuthor() {
        manager.add(fifth);
        manager.add(first);
        manager.add(fourth);
        manager.add(second);
        manager.add(third);
        manager.add(seventh);
        manager.add(sixth);
        manager.filterByAuthor(Set.of("Aidar"));
    }

    @Test
    void shouldFilterByLabel() {
        manager.add(fifth);
        manager.add(first);
        manager.add(fourth);
        manager.add(second);
        manager.add(third);
        manager.add(seventh);
        manager.add(sixth);
        manager.filterByLabel(Set.of("Tools"));
    }

    @Test
    void shouldFilterByAssignee() {
        manager.add(fifth);
        manager.add(first);
        manager.add(fourth);
        manager.add(second);
        manager.add(third);
        manager.add(seventh);
        manager.add(sixth);
        manager.filterByAssignee(Set.of("Igor"));
    }

    @Test
    void shouldGetOpenIssue() {
        manager.add(fifth);
        manager.add(first);
        manager.add(fourth);
        manager.add(second);
        manager.add(third);
        manager.add(seventh);
        manager.add(sixth);
        manager.getByOpenIssue();
    }

    @Test
    void shouldGetCloseIssue() {
        manager.add(fifth);
        manager.add(first);
        manager.add(fourth);
        manager.add(second);
        manager.add(third);
        manager.add(seventh);
        manager.add(sixth);
        manager.getByCloseIssue();
    }

    @Test
    void shouldOpenIssue() {
        manager.add(second);
        manager.openIssue(2);
    }

    @Test
    void shouldOpenIssueNotId() {
        manager.add(seventh);
        manager.openIssue(8);
    }

    @Test
    void shouldCloseIssue() {
        manager.add(fourth);
        manager.closeIssue(4);
    }

    @Test
    void shouldCloseIssueNotID() {
        manager.add(second);
        manager.closeIssue(9);
    }
}

