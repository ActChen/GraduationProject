package com.actchen.graduation.mapper;

import com.actchen.graduation.model.ConclusionInfo;
import com.alibaba.fastjson.JSONObject;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author wentong chen
 * @version 1.0
 * @date 2020/4/30 2:34 下午
 */
@Mapper
public interface ConclusionInfoMapper {

     public void insertConclusionInfo(ConclusionInfo conclusionInfo);

     public List<ConclusionInfo> selectTestByUserId(String id);

     public List<ConclusionInfo> selectTestByLimit(Integer height);

     public ConclusionInfo selectQuestionByTimeAndUserId(String time, String userId);


}
