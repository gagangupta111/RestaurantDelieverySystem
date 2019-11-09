package com.airtel.restaurantDelieverySystem.dao;

import com.airtel.restaurantDelieverySystem.entity.DeliveryPerson;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@Qualifier("memory")
public class DeliveryPersonDAOImplMemory implements DeliveryPersonDAO {

    private List<DeliveryPerson> deliveryPersonList = new ArrayList<DeliveryPerson>();


    @Override
    public List<DeliveryPerson> getAllDeliveryPersons() {
        return deliveryPersonList;
    }

    @Override
    public boolean addDeliveryPersons(DeliveryPerson deliveryPerson) {
        return deliveryPersonList.add(deliveryPerson);
    }

    @Override
    public DeliveryPerson getDeliveryPersonsByID(Long id) {
        for (DeliveryPerson deliveryPerson : deliveryPersonList){
            if (deliveryPerson.getPersonID().longValue() == id){
                return deliveryPerson;
            }
        }
        return null;
    }

    @Override
    public DeliveryPerson instantiate() {
        DeliveryPerson deliveryPerson = new DeliveryPerson();
        deliveryPersonList.add(deliveryPerson);
        return deliveryPerson;
    }
}
