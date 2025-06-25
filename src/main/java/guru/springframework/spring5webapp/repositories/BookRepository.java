package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created on 06/25/2025 by Jesse H.
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
