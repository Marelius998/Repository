package com.example.demo_code9prj.repository;

import com.example.demo_code9prj.models.Author;
import com.example.demo_code9prj.models.Book;
import com.example.demo_code9prj.models.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findAllByAuthor(Author author);
    List<Book> findAllByTitle(String title);
    List<Book> findAllByGenre(Genre genre);

    @Query(value = "select b.*" +
            "from book b inner join order_line o on b.id_book=o.book_id_book " +
            "group by id_book " +
            "order by sum(o.quantity) desc " +
            "limit 10; ",
            nativeQuery = true)
    List<Book> findBestSellers();

    @Query("select b " +
            "from Book b join Genre g on b.genre=g.id " +
            "where g.id = ?1")
    List<Book> findByGenre(int genreId);

}
