package models;
import lombok.ToString;


@ToString
public class Milestone {
    private String name;
    private String references;
    private String description;
    private boolean isCompleted;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReferences() {
        return references;
    }

    public void setReferences(String references) {
        references = references;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }
}
