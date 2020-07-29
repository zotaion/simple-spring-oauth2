package eu.test.demo.service;

import eu.test.demo.model.Beer;
import eu.test.demo.model.dto.BeerDto;
import eu.test.demo.repository.BeerRepository;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BeerServiceImp implements BeerService {
    private BeerRepository beerRepository;
    private ConversionService conversionService;

    public BeerServiceImp(BeerRepository beerRepository, ConversionService conversionService) {
        this.beerRepository = beerRepository;
        this.conversionService = conversionService;
    }

    @Override
    public List<Beer> getBeers() {

        return this.beerRepository.findAllByOrderByIdDesc().stream().map(it -> this.conversionService.convert(it, Beer.class))
                .collect(Collectors.toList());
    }

    @Override
    public Beer saveBeer(Beer beer) {
        BeerDto savedBeer = this.beerRepository.save(this.conversionService.convert(beer, BeerDto.class));
        return this.conversionService.convert(savedBeer, Beer.class);
    }
}
