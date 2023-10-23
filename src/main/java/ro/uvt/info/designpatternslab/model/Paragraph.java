package ro.uvt.info.designpatternslab.model;

import lombok.Data;

@Data
public class Paragraph implements Element{
    private String text;

    public Paragraph(String text) {
        this.text = text;
    }

    public void print() {
        System.out.println("Text: " + text);
    }
}