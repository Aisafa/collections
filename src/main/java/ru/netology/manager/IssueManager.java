package ru.netology.manager;

import ru.netology.domain.Issue;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class ComparatorInt implements Comparator<Issue> {
    @Override
    public int compare(Issue o1, Issue o2) {
        return Integer.compare(o1.getId(), o2.getId());
    }
}

public class IssueManager {
    List<Issue> items = new ArrayList<>();

    public void add(Issue item) {
        items.add(item);
    }

    public void filterByAuthor(Set<String> author) {
        //items.stream().filter(a ->a.getAuthor().contains(author)); Это оставил для себя чтоб не забыть
        //items.stream().map(a ->a.getAuthor()).filter(b->b.containsAll(author)).forEach(a-> System.out.println(a));
        //items.removeIf(Predicate.not(a -> a.getAuthor().containsAll(author)));
        List<Issue> issues = new ArrayList<>();
        for (Issue items : items) {
            if (items.getAuthor().containsAll(author)) {
                issues.add(items);
            }
        }
        Collections.sort(issues, new ComparatorInt());
        System.out.println(issues);
    }

    public void filterByLabel(Set<String> labels) {
        List<Issue> issues = new ArrayList<>();
        for (Issue items : items) {
            if (items.getLabels().containsAll(labels)) {
                issues.add(items);
            }
        }
        Collections.sort(issues, new ComparatorInt());
        System.out.println(issues);
    }

    public void filterByAssignee(Set<String> assignee) {
        List<Issue> issues = new ArrayList<>();
        for (Issue items : items) {
            if (items.getAssignee().containsAll(assignee)) {
                issues.add(items);
            }
        }
        Collections.sort(issues, new ComparatorInt());
        System.out.println(issues);
    }


    public void getByOpenIssue() {
        items.removeIf(Predicate.not(Issue::getOpen));
        Collections.sort(items, new ComparatorInt());
        System.out.println(items);
    }

    public void getByCloseIssue() {
        items.removeIf(Predicate.not(a -> !a.getOpen()));
        Collections.sort(items, new ComparatorInt());
        System.out.println(items);
    }

    public void openIssue(int id) {
        Issue issue = items.stream().filter(item -> item.getId() == id).findFirst().orElse(null);
        if (issue != null) {
            issue.setOpen(true);
            System.out.println(issue);
        } else {
            System.out.println("Element with id: " + id + " not found");
        }
    }

    public void closeIssue(int id) {
        Issue issue = items.stream().filter(item -> item.getId() == id).findFirst().orElse(null);
        if (issue != null) {
            issue.setOpen(false);
            System.out.println(issue);
        } else {
            System.out.println("Element with id: " + id + " not found");
        }
    }

}

