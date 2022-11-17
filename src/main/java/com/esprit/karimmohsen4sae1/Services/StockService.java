package com.esprit.karimmohsen4sae1.Services;

import com.esprit.karimmohsen4sae1.Entities.Stock;

import java.util.List;

public interface StockService {

    public List<Stock> retrieveAllStocks();
    public Stock addStock(Stock s);
    public Stock updateStock(Stock u);
    public Stock retrieveStock(Long id);
}
