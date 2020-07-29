package eu.test.demo.convertor;

import eu.test.demo.model.Beer;
import eu.test.demo.model.dto.BeerDto;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
@ConfigurationPropertiesBinding
public class DtoToBeerConverter implements Converter<BeerDto, Beer> {
    @Override
    public Beer convert(BeerDto source) {
        return new Beer(source.getId(),source.getName(),source.getImage());
    }
}
