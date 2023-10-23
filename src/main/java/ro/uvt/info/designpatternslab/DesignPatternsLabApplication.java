package ro.uvt.info.designpatternslab;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import ro.uvt.info.designpatternslab.model.Author;
import ro.uvt.info.designpatternslab.model.Book;
import ro.uvt.info.designpatternslab.model.Chapter;
import ro.uvt.info.designpatternslab.model.SubChapter;

@SpringBootApplication
public class DesignPatternsLabApplication {

    public static void main(String[] args) {
        //SpringApplication.run(SpLabApplication.class, args);
        Book amurg = new Book("Amurg");
        Author author = new Author("Osamu Daazai");
        amurg.addAuthor(author);
        int indexChapterOne = amurg.createChapter("Capitolul 1");
        Chapter chp1 = amurg.getChapter(indexChapterOne);
        int indexSubChapterOneOne = chp1.createSubChapter("Subcapitolul 1.1");
        SubChapter scOneOne = chp1.getSubChapter(indexSubChapterOneOne);

        scOneOne.createNewParagraph("Paragraph 1");
        scOneOne.createNewParagraph("Paragraph 2");
        scOneOne.createNewParagraph("Paragraph 3");
        scOneOne.createNewImage("Image 1");
        scOneOne.createNewParagraph("Paragraph 4");
        scOneOne.createNewTable("Table 1");
        scOneOne.createNewParagraph("Paragraph 5");
        scOneOne.print();
    }

}