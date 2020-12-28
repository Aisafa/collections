package ru.netology.manager;

import ru.netology.domain.Issue;

import java.util.*;
import java.util.function.Predicate;

class ComparatorInt implements Comparator<Issue> {
    @Override
    public int compare(Issue o1, Issue o2) {
        return Integer.compare(o1.getId(), o2.getId());
    }
}

public class IssueManager {

    public void filterByAuthor(List<Issue> items, Set<String> author) {
        items.removeIf(Predicate.not(a -> a.getAuthor().containsAll(author)));
        Collections.sort(items, new ComparatorInt());
    }

    public void filterByLabel(List<Issue> items,Set<String> labels) {
        items.removeIf(Predicate.not(a -> a.getLabels().containsAll(labels)));
        Collections.sort(items, new ComparatorInt());
    }

    public void filterByAssignee(List<Issue> items, Set<String> assignee) {
        items.removeIf(Predicate.not(a -> a.getAssignee().containsAll(assignee)));
        Collections.sort(items, new ComparatorInt());
    }


    public void getByOpenIssue(List<Issue> items) {
        items.removeIf(Predicate.not(Issue::getOpen));
        Collections.sort(items, new ComparatorInt());
    }

    public void getByCloseIssue(List<Issue> items) {
        items.removeIf(Predicate.not(a -> !a.getOpen()));
        Collections.sort(items, new ComparatorInt());
    }

    public void openIssue( List<Issue> items, int id){
     Issue issue =  items.stream().filter(item -> item.getId()==id).findFirst().orElse(null);
     if (issue != null) {
         issue.setOpen(true);
         System.out.println(issue);
     }
     else System.out.println("Element with id: " + id + " not found");
    }

    public void closeIssue( List<Issue> items, int id){
        Issue issue =  items.stream().filter(item -> item.getId()==id).findFirst().orElse(null);
        if (issue != null) {
            issue.setOpen(false);
            System.out.println(issue);
        }
        else System.out.println("Element with id: " + id + " not found");
    }

    }

