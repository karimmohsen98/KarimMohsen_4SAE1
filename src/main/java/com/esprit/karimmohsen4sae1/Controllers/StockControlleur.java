package com.esprit.karimmohsen4sae1.Controllers;

import com.esprit.karimmohsen4sae1.Entities.Stock;
import com.esprit.karimmohsen4sae1.Services.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Stock")
public class StockControlleur {

    @Autowired
    StockService stockService;

    @PostMapping
    public Stock addStock(Stock s){
        return stockService.addStock(s);
    }
    @GetMapping()
    public List<Stock> retrieveAllStocks(){
        return stockService.retrieveAllStocks();
    }
    @PostMapping("/update")
    public Stock updateStock(Stock u){
       return stockService.updateStock(u);
    }
    @GetMapping("{id}")
    public Stock retrieveStock(@PathVariable Long id)
    {
       return stockService.retrieveStock(id);
    }
}
