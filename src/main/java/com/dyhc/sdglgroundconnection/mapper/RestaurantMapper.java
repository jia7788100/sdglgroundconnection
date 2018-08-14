package com.dyhc.sdglgroundconnection.mapper;

import com.dyhc.sdglgroundconnection.pojo.Restaurant;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 餐馆
 **/
@Mapper
@Component
public interface RestaurantMapper extends CommonMapper<Restaurant>{
}
