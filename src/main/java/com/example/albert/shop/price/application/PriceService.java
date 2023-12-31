package com.example.albert.shop.price.application;

import com.example.albert.shop.price.domain.Price;
import com.example.albert.shop.price.domain.provider.PriceProvider;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class PriceService {
    private final PriceProvider priceProvider;
    public PriceService(PriceProvider priceProvider) {
        this.priceProvider = priceProvider;
    }

    public Price getPriceByProductId(Integer productId) {

        return priceProvider.findByProductId(productId);

    }

    public List<Price> getPriceByParameters(Integer productId, Integer brandId, LocalDateTime applicationDate) {

        return priceProvider.findPricesByParameters(productId, brandId, applicationDate);
    }

    public List<Price> getPriceByOptionalParameters(Integer productId, Integer brandId, LocalDateTime applicationDate) {

        return priceProvider.findPricesByOptionalParameters(productId, brandId, applicationDate);
    }
    public Price createPrice(Price price){
        return priceProvider.createPrice(price);
    }

}