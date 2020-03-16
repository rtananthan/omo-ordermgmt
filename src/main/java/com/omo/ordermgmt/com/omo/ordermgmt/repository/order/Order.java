package com.omo.ordermgmt.com.omo.ordermgmt.repository.order;

import com.omo.ordermgmt.com.omo.ordermgmt.repository.customer.Customer;

import javax.persistence.*;
import java.util.Date;


@Table(name = "order", schema = "orders")
@Entity
public class Order {

    @Id
    private long id;

    @ManyToOne
    @JoinColumn(name ="customer_id")
    private Customer customer;

    @Column(name ="ordernumber")
    private String orderNumber;

    @Column(name ="timeorderplaced")
    private Date timeOrderPlaced;

    @Column(name ="lastupdate")
    private Date lastUpdate;

    @Column(name ="status")
    private String status;

    public Order() {

    }

    public Order(long id, Customer customer, String orderNumber,
                 Date timeOrderPlaced, Date lastUpdate, String status) {
        super();
        this.setId(id);
        this.setCustomer(customer);
        this.setOrderNumber(orderNumber);
        this.setTimeOrderPlaced(timeOrderPlaced);
        this.setLastUpdate(lastUpdate);
        this.setStatus(status);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Date getTimeOrderPlaced() {
        return timeOrderPlaced;
    }

    public void setTimeOrderPlaced(Date timeOrderPlaced) {
        this.timeOrderPlaced = timeOrderPlaced;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
