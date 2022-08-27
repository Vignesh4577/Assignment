package com.hotelapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hotelapp.models.Delivery;
import com.hotelapp.repository.DeliveryRepository;

@Service
@Transactional
public class DeliveryServiceImpl implements DeliveryService {

	@Autowired
	DeliveryRepository deliveryRepository;
	
	@Override
	public void addDelivery(Delivery delivery) {
		deliveryRepository.save(delivery);

	}
	@Override
	public void deleteDelivery(int deliveryId) {
		deliveryRepository.deleteById(deliveryId);
		
	}
	@Override
	@Transactional
	public Delivery getDeliveryById(int deliveryId) {
		// TODO Auto-generated method stub
		return deliveryRepository.findById(deliveryId).get();
	}
	@Override
	@Transactional
	public Delivery getDeliveryByPartner(String partnername) {
		// TODO Auto-generated method stub
		return deliveryRepository.findByPartnerName(partnername);
	}

	

	

	

}
