package ro.uvt.info.designpatternslab.model;
import java.util.ArrayList;

import lombok.Data;

import lombok.Data;
@Data
public class Section implements Element{
    private String something;

    public Section(String something) {
        this.something = something;
    }

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
}