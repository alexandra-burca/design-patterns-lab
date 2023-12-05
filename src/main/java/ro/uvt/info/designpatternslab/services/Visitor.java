package ro.uvt.info.designpatternslab.services;

import ro.uvt.info.designpatternslab.model.*;

public interface Visitor{
    void visitBook(Book book);
    void visitSection(Section section);
    void visitTableOfContents(TableOfContents tableOfContents);
    void visitParagraph(Paragraph paragraph);
    void visitImageProxy(ImageProxy imageProxy);
    void visitImage(Image image);
    void visitTable(Table table);
}