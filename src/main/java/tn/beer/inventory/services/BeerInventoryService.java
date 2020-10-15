package tn.beer.inventory.services;

import tn.beer.inventory.model.BeerInventoryDto;

import java.util.List;
import java.util.UUID;

public interface BeerInventoryService {

    List<BeerInventoryDto> getListOfBeerById(UUID beerId);
}
