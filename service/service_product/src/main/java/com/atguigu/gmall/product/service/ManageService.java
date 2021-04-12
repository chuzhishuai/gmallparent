package com.atguigu.gmall.product.service;

import com.atguigu.gmall.model.product.*;

import java.util.List;

public interface ManageService {

    /**
     * 查询所有的一级分类信息
     * @return
     */
    List<BaseCategory1> getBaseCategory1();

    /**
     * 根据一级分类Id 查询二级分类数据
     * @param category1Id
     * @return
     */
    List<BaseCategory2> getBaseCategory2(Long category1Id);

    /**
     * 根据二级分类Id 查询三级分类数据
     * @param category2Id
     * @return
     */
    List<BaseCategory3> getBaseCategory3(Long category2Id);

    /**
     * 根据分类Id 获取平台属性数据
     * @param category1Id
     * @param category2Id
     * @param category3Id
     * @return
     */
    List<BaseAttrInfo> getAttrInfoList(Long category1Id, Long category2Id, Long category3Id);

    /**
     * 保存平台属性
     * @param baseAttrInfo
     */
    void saveAttrInfo(BaseAttrInfo baseAttrInfo);

    /**
     * 根据平台属性id  得到平台属性
     * @param attrId
     * @return
     */
    BaseAttrInfo getBaseAttrInfo(Long attrId);

    /**
     * 根据平台属性id 获取平台属性值集合
     * @param attrId
     * @return
     */
    List<BaseAttrValue> getAttrValueList(Long attrId);
}

