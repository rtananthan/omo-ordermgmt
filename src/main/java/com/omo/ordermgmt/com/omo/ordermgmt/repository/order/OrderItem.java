package com.omo.ordermgmt.com.omo.ordermgmt.repository.order;

import com.omo.ordermgmt.com.omo.ordermgmt.repository.catalogueitem.CatalogueItem;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


@Entity
@Table(name = "orderItem")
@SequenceGenerator(name = "orderitem_id_seq", sequenceName = "orderitem_id_seq")
public class OrderItem implements Serializable {

   private static final long serialVersionUID = -3950813201243788920L;

   @Id
   @Column(name = "id")
   @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "orderitem_id_seq")
   private long id;

   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name = "order_id", nullable = false)
   private Order order;

   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name = "catalogItem_id", nullable = false)
   private CatalogueItem catalogItem;

   @Column(name = "status", nullable = false)
   private String status;

   @Column(name = "price", precision = 20, scale = 5)
   private BigDecimal price;

   @Temporal(TemporalType.TIMESTAMP)
   @Column(name = "lastUpdate", nullable = false, length = 29)
   private Date lastUpdate;

   @Column(name = "quantity", nullable = false)
   private int quantity;

   public OrderItem() {

   }

   public OrderItem(long id, Order order, CatalogueItem catalogItem,
                    String status, Date lastUpdate, int quantity) {
      this.id = id;
      this.order = order;
      this.catalogItem = catalogItem;
      this.status = status;
      this.lastUpdate = lastUpdate;
      this.quantity = quantity;
   }

   public OrderItem(long id, Order order, CatalogueItem catalogItem,
                    String status, Date lastUpdate, int quantity, BigDecimal price) {
      this.id = id;
      this.order = order;
      this.catalogItem = catalogItem;
      this.status = status;
      this.lastUpdate = lastUpdate;
      this.quantity = quantity;
      this.price = price;
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
    * @return the order
    */

   public Order getOrder() {
      return order;
   }


   public void setOrder(Order order) {
      this.order = order;
   }



   public CatalogueItem getCatalogItem() {
      return catalogItem;
   }

   /**
    * @param catalogItem
    *           the catalogItem to set
    */
   public void setCatalogItem(CatalogueItem catalogItem) {
      this.catalogItem = catalogItem;
   }

   /**
    * @return the status
    */

   public String getStatus() {
      return status;
   }

   /**
    * @param status
    *           the status to set
    */
   public void setStatus(String status) {
      this.status = status;
   }

   /**
    * @return the price
    */

   public BigDecimal getPrice() {
      return price;
   }

   /**
    * @param price
    *           the price to set
    */
   public void setPrice(BigDecimal price) {
      this.price = price;
   }

   /**
    * @return the lastUpdate
    */
   public Date getLastUpdate() {
      return lastUpdate;
   }

   /**
    * @param lastUpdate
    *           the lastUpdate to set
    */
   public void setLastUpdate(Date lastUpdate) {
      this.lastUpdate = lastUpdate;
   }

   /**
    * @return the quantity
    */
   public int getQuantity() {
      return quantity;
   }

   /**
    * @param quantity
    *           the quantity to set
    */
   public void setQuantity(int quantity) {
      this.quantity = quantity;
   }

}
