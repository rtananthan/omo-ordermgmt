package com.omo.ordermgmt;

import com.omo.ordermgmt.com.omo.ordermgmt.repository.customer.CustomerRepository;
import com.omo.ordermgmt.com.omo.ordermgmt.repository.order.OrderRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OmoOrderMgmtApplicationTests {

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
    OrderRepository orderRepository;

	@Test
	void contextLoads() {

	}

	@Test
	public void findAllCustomer(){
		System.err.println(customerRepository.findAll());

	}

    @Test
    public void findAllOrder(){
        System.err.println(orderRepository.findAll());

    }

}
