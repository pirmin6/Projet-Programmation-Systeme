package com.gabz.projetcuisine.repository;

import com.gabz.projetcuisine.model.common.repas.Vin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VinRepository extends JpaRepository<Vin, Integer> {
}
