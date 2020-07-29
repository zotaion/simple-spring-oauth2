package eu.test.demo.convertor;

import eu.test.demo.model.Beer;
import eu.test.demo.model.dto.BeerDto;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
@ConfigurationPropertiesBinding
public class BeerToDtoConverter implements Converter<Beer, BeerDto> {
    @Override
    public BeerDto convert(Beer source) {
        BeerDto beerDto = new BeerDto();
        beerDto.setName(source.getName());
        beerDto.setImage(source.getImage());
        return beerDto;
    }
}
