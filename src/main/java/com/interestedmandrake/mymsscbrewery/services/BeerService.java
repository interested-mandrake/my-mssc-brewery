package com.interestedmandrake.mymsscbrewery.services;

import com.interestedmandrake.mymsscbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);
}
