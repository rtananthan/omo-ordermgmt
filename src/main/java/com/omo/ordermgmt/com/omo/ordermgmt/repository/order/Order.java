package com.omo.ordermgmt.com.omo.ordermgmt.repository.order;

import com.omo.ordermgmt.com.omo.ordermgmt.repository.customer.Customer;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "order" , schema = "orders")
@SequenceGenerator(name = "order_id_seq", sequenceName = "order_id_seq")
public class Order {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_id_seq")
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @Column(name = "ordernumber", nullable = false)
    private String orderNumber;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "timeorderplaced", nullable = false, length = 29)
    private Date timeOrderPlaced;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "lastupdate", nullable = false, length = 29)
    private Date lastUpdate;

    @Column(name = "status", nullable = false)
    private String status;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "catalogItem")
    private Set<OrderItem> orderItems = new HashSet<OrderItem>(0);

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

    public Set<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(Set<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }
}
