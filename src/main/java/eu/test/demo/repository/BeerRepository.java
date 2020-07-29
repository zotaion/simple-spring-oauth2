package eu.test.demo.repository;

import eu.test.demo.model.dto.BeerDto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BeerRepository extends CrudRepository<BeerDto, Long> {

    List<BeerDto> findAllByOrderByIdDesc();

    BeerDto findById(long id);
}
