package com.omo.ordermgmt.com.omo.ordermgmt.repository.customer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer", schema = "orders")
public class Customer {
    @Id
    private Long id;

    @Column(name = "firstname")
    private String firstName;
    @Column(name = "lastname")
    private String lastName;
    @Column(name = "email")
    private String email;

    public Customer() {

    }

    public Customer(long id, String firstName, String lastName, String email) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Customer [id=");
        builder.append(id);
        builder.append(", ");
        if (firstName != null) {
            builder.append("firstName=");
            builder.append(firstName);
            builder.append(", ");
        }
        if (lastName != null) {
            builder.append("lastName=");
            builder.append(lastName);
            builder.append(", ");
        }
        if (email != null) {
            builder.append("email=");
            builder.append(email);
        }
        builder.append("]");
        return builder.toString();
    }
}
