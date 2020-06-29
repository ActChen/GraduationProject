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
 * @date 2020/6/8 10:51 上午
 */
@Service
public class SearchService {

    @Autowired
    private ConclusionInfoMapper conclusionInfoMapper;

    public List<JSONObject> search(String key){

        String k = "%" + key + "%";

        List<JSONObject> result = new ArrayList<>();

        User user = conclusionInfoMapper.selectUserIdByKey(key);

        if(user == null) {
            return result;
        }

        List<Conclusion> conclusions = conclusionInfoMapper.selectTestByUserId(user.getUserId());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");



        for(Conclusion conclusion : conclusions){
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("name", user.getName());
            jsonObject.put("phone", user.getPhone());
            jsonObject.put("timeStamp", conclusion.getTime());
            jsonObject.put("userId", user.getUserId());
            jsonObject.put("conclusion", conclusion.getConclusion());

            String date = sdf.format(new Date(Long.valueOf(conclusion.getTime())));
            jsonObject.put("time", date);

            result.add(jsonObject);

        }

        return result;
    }

}
