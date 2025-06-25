package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created on 06/25/2025 by Jesse H.
 */

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
