package tn.beer.inventory.mappers;

import org.mapstruct.Mapper;
import tn.beer.inventory.domain.BeerInventory;
import tn.beer.inventory.model.BeerInventoryDto;

import java.util.List;

@Mapper(uses = DateMapper.class)
public interface BeerInventoryMapper {

    BeerInventory beerInventoryDtoToBeerInventory(BeerInventoryDto beerInventoryDto);

    BeerInventoryDto beerInventoryToBeerInventoryDto(BeerInventory beerInventory);

    List<BeerInventoryDto> mapToBeerInventoryDtoList(List<BeerInventory> beerInventoryList);
}
