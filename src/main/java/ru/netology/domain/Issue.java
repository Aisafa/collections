package ru.netology.domain;

import java.util.Set;

public class Issue {
    private int id;
    private String title;
    private String description;
    private boolean open;
    private Set<String> author;
    private Set<String> assignee;
    private Set<String> labels;
    private String component;
    private String type;

    public Issue(int id, String title, String description, boolean open, Set<String> author, Set<String> assignee, Set<String> labels, String component, String type) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.open = open;
        this.author = author;
        this.assignee = assignee;
        this.labels = labels;
        this.component = component;
        this.type = type;
    }

    public Issue() {
    }

    @Override
    public String toString() {
        return "\n" + " Issue { " +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", open=" + open +
                ", author=" + author +
                ", assignee=" + assignee +
                ", labels=" + labels +
                ", component='" + component + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean getOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
          }

    public Set<String> getAuthor() {
        return author;
    }

    public void setAuthor(Set<String> author) {
        this.author = author;
    }

    public Set<String> getAssignee() {
        return assignee;
    }

    public void setAssignee(Set<String> assignee) {
        this.assignee = assignee;
    }

    public Set<String> getLabels() {
        return labels;
    }

    public void setLabels(Set<String> labels) {
        this.labels = labels;
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isOpen() {
        return open;
    }
}
