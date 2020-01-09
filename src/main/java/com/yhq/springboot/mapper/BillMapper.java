package com.yhq.springboot.mapper;

import com.yhq.springboot.entities.Bill;
import com.yhq.springboot.entities.BillProvider;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Auther:
 */
@Mapper
public interface BillMapper {

    List<BillProvider> getBills(Bill bill);

    BillProvider getBillByBid(Integer bid);

    int addBill(Bill bill);

    int updateBill(Bill bill);

    int deteleBillByBid(Integer bid);

}
