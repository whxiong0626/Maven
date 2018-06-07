package com.whx.test.bean;

import java.io.Serializable;
import java.util.Date;

public class Invitation implements Serializable {
    private  int id;
    private String title;
    private String summary;
    private String author;
    private Date createdate;

    public Invitation() {
    }

    public Invitation(int id, String title, String summary, String author, Date createdate) {
        this.id = id;
        this.title = title;
        this.summary = summary;
        this.author = author;
        this.createdate = createdate;
    }

    public Invitation(String title, String summary, String author) {
        this.title = title;
        this.summary = summary;
        this.author = author;
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

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    @Override
    public String toString() {
        return "Invitation{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", summary='" + summary + '\'' +
                ", author='" + author + '\'' +
                ", createdate=" + createdate +
                '}';
    }
}
