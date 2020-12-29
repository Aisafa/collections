package ru.netology.repository;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Issue;

import java.util.*;

class IssueRepositoryTest {
    private IssueRepository repository = new IssueRepository();
    private Issue first = new Issue(1, "one", "description", true, Set.of("Aidar"), Set.of("Ruslan"), Set.of("Tools"), "back", "bug");
    private Issue second = new Issue(2, "two", "description", false, Set.of("Natalya"), Set.of("Alex"), Set.of("Gradle"), "front", "bug");
    private Issue third = new Issue(3, "three", "description", true, Set.of("Tatyana"), Set.of("Igor"), Set.of("Tools"), "Analytics", "bug");
    private Issue fourth = new Issue(4, "four", "description", true, Set.of("Aidar"), Set.of("Ruslan"), Set.of("Gradle"), "front", "bug");
    private Issue fifth = new Issue(5, "five", "description", false, Set.of("Aidar"), Set.of("Igor"), Set.of("Kotlin"), "back", "bug");
    private Issue sixth = new Issue(6, "six", "description", true, Set.of("Vova"), Set.of("Igor"), Set.of("Tools"), "front", "bug");
    private Issue seventh = new Issue(7, "seven", "description", false, Set.of("Alex"), Set.of("Igor"), Set.of("Gradle"), "Analytics", "bug");

    @Test
    void shouldAddIssue() {
        repository.add(third);
    }

}