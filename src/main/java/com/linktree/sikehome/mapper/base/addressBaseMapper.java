package com.linktree.sikehome.mapper.base;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import com.linktree.sikehome.entity.address;
/**
*  @author author
*/
@Mapper
public interface addressBaseMapper {

    int insertaddress(address object);

    int updateaddress(address object);

    List<address> queryaddress(address object);

    address queryaddressLimit1(address object);

}