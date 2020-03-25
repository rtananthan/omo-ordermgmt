package com.omo.ordermgmt.com.omo.ordermgmt.repository.catalogueitem;

import com.omo.ordermgmt.com.omo.ordermgmt.repository.order.OrderItem;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "catalogitem" , schema = "orders")
@SequenceGenerator(name = "catalogitem_id_seq", sequenceName = "catalogitem_id_seq")
public class CatalogueItem {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "catalogitem_id_seq")
    private long id;

    @Column(name = "itemnumber", nullable = false)
    private String itemNumber;

    @Column(name = "itemname", nullable = false)
    private String itemName;

    @Column(name = "itemtype", nullable = false)
    private String itemType;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "catalogItem")
    private Set<OrderItem> orderItems = new HashSet<OrderItem>(0);

    public CatalogueItem() {

    }

    public CatalogueItem(long id, String itemNumber, String itemName, String itemType) {
        this.id = id;
        this.itemNumber = itemNumber;
        this.itemName = itemName;
        this.itemType = itemType;
    }

    public CatalogueItem(long id, String itemNumber, String itemName, String itemType,
                             Set<OrderItem> orderItems) {
        this.id = id;
        this.itemNumber = itemNumber;
        this.itemName = itemName;
        this.itemType = itemType;
        this.orderItems = orderItems;
    }

    /**
     * @return the id
     */

    public long getId() {
        return id;
    }

    /**
     * @param id
     *           the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return the itemNumber
     */

    public String getItemNumber() {
        return itemNumber;
    }

    /**
     * @param itemNumber
     *           the itemNumber to set
     */
    public void setItemNumber(String itemNumber) {
        this.itemNumber = itemNumber;
    }

    /**
     * @return the itemName
     */

    public String getItemName() {
        return itemName;
    }

    /**
     * @param itemName
     *           the itemName to set
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * @return the itemType
     */

    public String getItemType() {
        return itemType;
    }

    /**
     * @param itemType
     *           the itemType to set
     */
    public void setItemType(String itemType) {
        this.itemType = itemType;
    }


    public Set<OrderItem> getOrderItems() {
        return this.orderItems;
    }

    public void setOrderItems(Set<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

}
