package com.airtel.restaurantDelieverySystem.controller;

import com.airtel.restaurantDelieverySystem.entity.DeliveryPerson;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/deliveryPerson")
public class DeliveryPersonController {

    @RequestMapping(method = RequestMethod.GET)
    public String test(){

        return "Test-Pass";

    }

}
