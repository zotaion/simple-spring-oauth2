package eu.test.demo.controller;

import eu.test.demo.model.Beer;
import eu.test.demo.service.BeerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/beer")
@RestController
public class BeerController {

    private BeerService beerService;

    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    @PostMapping
    public Beer postBeer(@RequestBody Beer beer) {
       return this.beerService.saveBeer(beer);
    }

    @GetMapping
    public List<Beer> getBeers() {
        return this.beerService.getBeers();
    }
}
