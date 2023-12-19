package ro.uvt.info.designpatternslab.difexemple.commands;


import ro.uvt.info.designpatternslab.model.Book;

import java.util.HashMap;

public class UpdateBookCommand implements Command{
    private final String title;
    private final Long bookId;
    private final HashMap<Long, Book> bookHashMap;

    public UpdateBookCommand(String title, Long bookId, HashMap<Long, Book> bookHashMap) {
        this.title = title;
        this.bookId = bookId;
        this.bookHashMap = bookHashMap;
    }

    @Override
    public Book execute() {
        if (this.bookHashMap.containsKey(this.bookId)) {
            this.bookHashMap.get(this.bookId).setTitle(this.title);
            return this.bookHashMap.get(this.bookId);
        } else {
            System.out.print("Book " + this.bookId + " does not exist!");
            return null;
        }
    }
}