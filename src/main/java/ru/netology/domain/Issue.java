package ru.netology.domain;

public class Issue {
    private int id;
    private String title;
    private String description;
    private boolean open;
    private String author;
    private String assignee;
    private String label;
    private String component;
    private String type;



    public Issue(int id, String title, String description, boolean open,
                 String author, String assignee, String label,
                 String component, String type) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.open = open;
        this.author = author;
        this.assignee = assignee;
        this.label = label;
        this.component = component;
        this.type = type;

    }

    public Issue() {
    }

    @Override
    public String toString() {
        return "\n"+ "Issue № " + id + " { " +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", open=" + open +
                ", author='" + author + '\'' +
                ", assignee='" + assignee + '\'' +
                ", label='" + label + '\'' +
                ", component='" + component + '\'' +
                ", type='" + type + '\'' +
                '}' + "\n";
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor() {
        this.author = author;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
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

    public void setAuthor(String author) {
        this.author = author;
    }

}
