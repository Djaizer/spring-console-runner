package spring.console.runner.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import spring.console.runner.domain.Image;

@Repository
public interface ImageRepository extends CrudRepository<Image, Long> {
}
