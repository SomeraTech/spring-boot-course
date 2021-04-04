package tr.com.somera.springbootcourse.model;

import com.fasterxml.jackson.annotation.JsonAlias;

import java.util.Date;

public class Repository {
    @JsonAlias("full_name")
    private String fullName;

    private String description;

    @JsonAlias("created_at")
    private Date createdAt;

    public Repository() {}

    public Repository(String fullName, String description, Date createdAt) {
        this.fullName = fullName;
        this.description = description;
        this.createdAt = createdAt;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
