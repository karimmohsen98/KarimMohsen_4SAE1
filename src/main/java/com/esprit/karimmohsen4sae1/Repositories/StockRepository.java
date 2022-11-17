package com.esprit.karimmohsen4sae1.Repositories;

import com.esprit.karimmohsen4sae1.Entities.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<Stock,Long> {
}
