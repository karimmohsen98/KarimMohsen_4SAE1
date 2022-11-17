package com.esprit.karimmohsen4sae1.Services;

import com.esprit.karimmohsen4sae1.Entities.Stock;
import com.esprit.karimmohsen4sae1.Repositories.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IStockSerivceIMP implements StockService{

    @Autowired
    StockRepository stockRepository;
    @Override
    public List<Stock> retrieveAllStocks() {
        return stockRepository.findAll();
    }

    @Override
    public Stock addStock(Stock s) {
        return stockRepository.save(s);
    }

    @Override
    public Stock updateStock(Stock u) {
        return stockRepository.save(u);
    }

    @Override
    public Stock retrieveStock(Long id) {
        return stockRepository.findById(id).orElse(null);
    }
}
