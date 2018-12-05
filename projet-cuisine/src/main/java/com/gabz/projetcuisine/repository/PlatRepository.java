package com.gabz.projetcuisine.repository;

import com.gabz.projetcuisine.model.common.repas.Plat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlatRepository extends JpaRepository<Plat, Integer> {
}
