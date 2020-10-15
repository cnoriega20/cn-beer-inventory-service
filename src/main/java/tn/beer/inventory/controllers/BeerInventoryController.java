package tn.beer.inventory.controllers;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import tn.beer.inventory.model.BeerInventoryDto;
import tn.beer.inventory.services.BeerInventoryService;

import java.util.List;
import java.util.UUID;

@RestController
@Slf4j
@RequiredArgsConstructor
public class BeerInventoryController {

    public final BeerInventoryService beerInventoryService;

    @GetMapping("api/v1/beer/{beerId}/inventory")
    List<BeerInventoryDto> listBeersById(@PathVariable UUID beerId){
        log.debug("Finding Inventory for beerId:" + beerId);
        return beerInventoryService.getListOfBeerById(beerId);
    }


}
