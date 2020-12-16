package com.kgc.kmall.service;

import com.kgc.kmall.bean.PmsBaseAttrInfo;
import com.kgc.kmall.bean.PmsBaseAttrValue;

import java.util.List;

/**
 * @author shkstart
 * @create 2020-12-16 18:32
 */
public interface AttrService {
    //根据3级分类的catalogId查询他的属性
    List<PmsBaseAttrInfo> select(Long catalog3Id);
    //添加商品的属性
    Integer add(PmsBaseAttrInfo attrInfo);
    //修改回显根据属性表pmsbaseAttrInfo的id查询属性值
    List<PmsBaseAttrValue> getAttrValueList(Long attrId);
}
