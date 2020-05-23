package com.actchen.graduation.service;

import com.actchen.graduation.mapper.ConclusionInfoMapper;
import com.actchen.graduation.model.ConclusionInfo;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author wentong chen
 * @version 1.0
 * @date 2020/5/5 9:57 下午
 */
@Service
public class SelectTestHistoryService {

    @Autowired
    private ConclusionInfoMapper conclusionInfoMapper;

    public List<JSONObject> selectHistoryByUserId(String userId) {
        /**
         * 查看历史评测记录  返回为诊断结果和诊断时间
         */
        List<JSONObject> result = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        List<ConclusionInfo> conclusionInfos = conclusionInfoMapper.selectTestByUserId(userId);
        for (ConclusionInfo conclusionInfo : conclusionInfos){

            String time = conclusionInfo.getTime();

            String conclusion = conclusionInfo.getConclusion();
            String date = sdf.format(new Date(Long.valueOf(time)));

            JSONObject con = new JSONObject();
            con.put("conclusion", conclusion);
            con.put("time", date);

            result.add(con);

        }
        return result;
    }

}
