package com.actchen.graduation.service.admin;

import com.actchen.graduation.mapper.ConclusionInfoMapper;
import com.actchen.graduation.model.Conclusion;
import com.actchen.graduation.model.User;
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
        List<Conclusion> conclusionInfos = conclusionInfoMapper.selectTestByLimit(100);

        for (Conclusion conclusionInfo : conclusionInfos) {

            String time = conclusionInfo.getTime();

            String conclusion = conclusionInfo.getConclusion();
            String advise = conclusionInfo.getAdvise();
            String date = sdf.format(new Date(Long.valueOf(time)));

            JSONObject con = new JSONObject();

            String userId = conclusionInfo.getUserId();

            /**
             * 根据userId去查用户信息
             */
            User user = conclusionInfoMapper.selectUserById(userId);
            if (user != null) {
                con.put("name", user.getName());
                con.put("phone", user.getPhone());
            }

            con.put("userId", userId);
            con.put("timeStamp", time);
            con.put("conclusion", conclusion);
            con.put("advise", JSONObject.parseObject(advise));
            con.put("time", date);

            result.add(con);

        }

        return result;

    }
}
