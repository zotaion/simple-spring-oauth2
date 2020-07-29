package eu.test.demo.service;

import eu.test.demo.model.Beer;

import java.util.List;

public interface BeerService {
    List<Beer> getBeers();
    Beer saveBeer(Beer beer);
}
