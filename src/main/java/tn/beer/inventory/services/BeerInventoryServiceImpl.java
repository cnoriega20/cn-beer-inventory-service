package tn.beer.inventory.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.beer.inventory.domain.BeerInventory;
import tn.beer.inventory.mappers.BeerInventoryMapper;
import tn.beer.inventory.model.BeerInventoryDto;
import tn.beer.inventory.repositories.BeerInventoryRepository;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class BeerInventoryServiceImpl implements BeerInventoryService {

    private final BeerInventoryRepository beerInventoryRepository;
    private final BeerInventoryMapper beerInventoryMapper;

    @Override
    public List<BeerInventoryDto> getListOfBeerById(UUID beerId) {
        List<BeerInventory> beerInventoryList = beerInventoryRepository.findAllByBeerId(beerId);
       return beerInventoryMapper.mapToBeerInventoryDtoList(beerInventoryList);
    }
}
