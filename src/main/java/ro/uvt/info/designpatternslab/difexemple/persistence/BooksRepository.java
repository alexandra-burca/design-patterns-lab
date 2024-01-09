package ro.uvt.info.designpatternslab.difexemple.persistence;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.uvt.info.designpatternslab.model.Book;

@Repository
public interface BooksRepository extends JpaRepository<Book, Long> {
}