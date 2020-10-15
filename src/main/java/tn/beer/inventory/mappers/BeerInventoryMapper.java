package tn.beer.inventory.mappers;

import org.mapstruct.Mapper;
import tn.beer.inventory.domain.BeerInventory;
import tn.beer.inventory.model.BeerInventoryDto;

@Mapper(uses = DateMapper.class)
public interface BeerInventoryMapper {

    BeerInventory beerInventoryDtoToBeerInventory(BeerInventoryDto beerInventoryDto);

    BeerInventoryDto beerInventoryToBeerInventoryDto(BeerInventory beerInventory);
}
