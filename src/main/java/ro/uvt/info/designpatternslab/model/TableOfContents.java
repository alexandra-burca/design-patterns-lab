package ro.uvt.info.designpatternslab.model;

import lombok.Data;

import java.util.ArrayList;
import ro.uvt.info.designpatternslab.services.Visitor;

public class TableOfContents implements Element{
    private String something;

    @Override
    public void print() {
        System.out.println("Something: " + something);
    }

    @Override
    public void add(Element element) {

    }

    @Override
    public void remove(Element element) {

    }

    @Override
    public Element get(int id) {
        return null;
    }

    @Override
    public void accept(Visitor v) {
        v.visitTableOfContents(this);
    }
}