package com.airtel.restaurantDelieverySystem.controller;

import com.airtel.restaurantDelieverySystem.entity.DeliveryPerson;
import com.airtel.restaurantDelieverySystem.service.DeliveryPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/deliveryPerson")
public class DeliveryPersonController {

    @Autowired
    private DeliveryPersonService deliveryPersonService;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(){

        return "Test-Pass";

    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<DeliveryPerson> getAllPersons(){

        return deliveryPersonService.getAllDeliveryPersons();

    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public DeliveryPerson getPersonByID(@PathVariable("id") Long id){
        return deliveryPersonService.getDeliveryPersonsByID(id);
    }

    @RequestMapping(value = "/instantiate", method = RequestMethod.GET)
    public DeliveryPerson instantiate(){
        return deliveryPersonService.instantiate();
    }


}
