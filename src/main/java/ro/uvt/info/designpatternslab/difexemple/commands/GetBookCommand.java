package ro.uvt.info.designpatternslab.difexemple.commands;

import ro.uvt.info.designpatternslab.model.Book;

import java.util.ArrayList;
import java.util.HashMap;

public class GetBookCommand implements Command{
    private final HashMap<Long, Book> bookHashMap;

    public GetBookCommand(HashMap<Long, Book> bookHashMap) {
        this.bookHashMap = bookHashMap;
    }

    @Override
    public ArrayList<Book> execute() {
        return new ArrayList<>(this.bookHashMap.values());
    }
}