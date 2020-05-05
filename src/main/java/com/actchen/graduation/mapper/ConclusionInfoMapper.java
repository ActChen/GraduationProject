package com.actchen.graduation.mapper;

import com.actchen.graduation.model.ConclusionInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author wentong chen
 * @version 1.0
 * @date 2020/4/30 2:34 下午
 */
@Mapper
public interface ConclusionInfoMapper {

     public void insertConclusionInfo(ConclusionInfo conclusionInfo);


}
