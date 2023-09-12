package com.capital.cardoffersapplication.repositories;

import com.capital.cardoffersapplication.domain.OfferRequirements;
import org.springframework.data.repository.CrudRepository;

public interface CardOfferRepo extends CrudRepository<OfferRequirements, Long > {

}
