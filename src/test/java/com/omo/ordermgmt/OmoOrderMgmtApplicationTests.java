package com.omo.ordermgmt;

import com.omo.ordermgmt.com.omo.ordermgmt.repository.catalogueitem.CatalogItemRepository;
import com.omo.ordermgmt.com.omo.ordermgmt.repository.customer.CustomerRepository;
import com.omo.ordermgmt.com.omo.ordermgmt.repository.order.OrderItemRepository;
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

	@Autowired
    CatalogItemRepository catalogItemRepository;

	@Autowired
    OrderItemRepository orderItemRepository;

	@Test
	void contextLoads() {
	    findAllCatalogueItem();
	    System.out.println("------Pass 1-----------");
	    findAllCustomer();
        System.out.println("------Pass 2-----------");
	    findAllOrder();
        System.out.println("------Pass 3-----------");
	    findAllOrderItem();
        System.out.println("------Pass 4-----------");
	}

	@Test
	public void findAllCustomer(){
		System.err.println(customerRepository.findAll()+"\n");

	}

    @Test
    public void findAllOrder(){
        System.err.println(orderRepository.findAll()+"\n");

    }

    @Test
    public void findAllCatalogueItem(){
        System.err.println(catalogItemRepository.findAll()+"\n");
    }


    @Test
    public void findAllOrderItem(){
        System.err.println(orderItemRepository.findAll()+"\n");
    }




}
