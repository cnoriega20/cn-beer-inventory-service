package tn.beer.inventory.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.beer.inventory.domain.BeerInventory;

import java.util.List;
import java.util.UUID;

public interface BeerInventoryRepository extends JpaRepository<BeerInventory, UUID> {
    List<BeerInventory> findAllByBeerId(UUID beerId);
}
