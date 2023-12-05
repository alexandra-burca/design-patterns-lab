package ro.uvt.info.designpatternslab.model;


import com.fasterxml.jackson.annotation.JsonCreator;

import java.util.ArrayList;
import java.util.List;

public class Book implements Visitee {
    private String title;
    private Long id;
    private List<Author> authors = new ArrayList<>();
    private List<TextElement> contents = new ArrayList<>();

    @JsonCreator
    public Book(String title) {
        this.title = title;
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public void addContent(TextElement content) {
        contents.add(content);
    }

    public String getTitle() {
        return title;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public List<TextElement> getContents() {
        return contents;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public void accept(Visitor v) {
        v.visitBook(this);
    }
}