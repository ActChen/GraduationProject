package com.actchen.graduation.service.admin;

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
 * @date 2020/5/23 5:36 下午
 */
@Service
public class GetDiagnosticLogOutService {

    @Autowired
    private ConclusionInfoMapper conclusionInfoMapper;

    public List<JSONObject> getStatic() {

        List<JSONObject> result = new ArrayList<>();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        List<ConclusionInfo> conclusionInfos = conclusionInfoMapper.selectTestByLimit(100);
        System.out.println(conclusionInfos);

        for (ConclusionInfo conclusionInfo : conclusionInfos) {

            String time = conclusionInfo.getTime();

            String conclusion = conclusionInfo.getConclusion();
            String date = sdf.format(new Date(Long.valueOf(time)));

            JSONObject con = new JSONObject();

            String question = conclusionInfo.getQuestion();

            JSONArray questionArray = JSONArray.parseArray(question);

            String name = conclusionInfo.getName();

            String phone = conclusionInfo.getPhone();

            String userId = conclusionInfo.getUserId();

            System.out.println(questionArray);

            con.put("name", name);
            con.put("phone", phone);
            con.put("userId", userId);
            con.put("timeStamp", time);
            con.put("conclusion", conclusion);
            con.put("time", date);

            result.add(con);

        }

        return result;

    }
}
