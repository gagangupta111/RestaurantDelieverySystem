package com.airtel.restaurantDelieverySystem.dao;

import com.airtel.restaurantDelieverySystem.entity.DeliveryPerson;
import java.util.List;

public interface DeliveryPersonDAO {

    public List<DeliveryPerson> getAllDeliveryPersons();
    public boolean addDeliveryPersons(DeliveryPerson deliveryPerson);
    public DeliveryPerson getDeliveryPersonsByID(Long id);
    public DeliveryPerson instantiate();

}
