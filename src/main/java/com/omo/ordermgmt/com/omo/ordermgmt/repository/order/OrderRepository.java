package com.omo.ordermgmt.com.omo.ordermgmt.repository.order;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {

    /**
     * Select all orders for the page ordered by the timeOrderPlaced value in
     * ascending order.
     *
     * @param status
     * @param pageable
     * @return
     */
    @Query(value = "select o from Order o where o.status = ?1 order by o.timeOrderPlaced")
    Page<Order> findByStatus(String status, Pageable pageable);

    /**
     * Update the status of all order IDs passed.
     *
     * @param code
     * @param orderIds
     * @return
     */
    @Modifying
    @Query("update Order o set o.status = ?1, o.lastUpdate = ?2 where o.id in (?3)")
    int updateStatus(String code, Date lastUpdate, List<Long> orderIds);
}
