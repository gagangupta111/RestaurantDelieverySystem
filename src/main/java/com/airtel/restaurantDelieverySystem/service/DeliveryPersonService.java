package com.airtel.restaurantDelieverySystem.service;

import com.airtel.restaurantDelieverySystem.dao.DeliveryPersonDAO;
import com.airtel.restaurantDelieverySystem.entity.DeliveryPerson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DeliveryPersonService {

    @Autowired
    @Qualifier("memory")
    private DeliveryPersonDAO deliveryPersonDAO;

    public List<DeliveryPerson> getAllDeliveryPersons() {
        return deliveryPersonDAO.getAllDeliveryPersons();
    }

    public boolean addDeliveryPersons(DeliveryPerson deliveryPerson) {
        return deliveryPersonDAO.addDeliveryPersons(deliveryPerson);
    }

    public DeliveryPerson getDeliveryPersonsByID(Long id) {
        return deliveryPersonDAO.getDeliveryPersonsByID(id);
    }

    public DeliveryPerson instantiate(){
        return deliveryPersonDAO.instantiate();
    }

}
