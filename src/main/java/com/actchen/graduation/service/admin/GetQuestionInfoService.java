package com.actchen.graduation.service.admin;

import com.actchen.graduation.mapper.ConclusionInfoMapper;
import com.actchen.graduation.model.ConclusionInfo;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wentong chen
 * @version 1.0
 * @date 2020/5/24 1:16 下午
 */
@Service
public class GetQuestionInfoService {

    @Autowired
    private ConclusionInfoMapper conclusionInfoMapper;

    public JSONArray getQuestion(String userId, String time) {

        ConclusionInfo conclusionInfo = conclusionInfoMapper.selectQuestionByTimeAndUserId(time, userId);

        String questionStr = conclusionInfo.getQuestion();
        System.out.println(questionStr);
        JSONArray questionArr = JSONArray.parseArray(questionStr);

        JSONArray res = new JSONArray();
        /**
         * 返回列表，包含问题、选项、答案、获得成绩
         */

        for (int i = 0; i < questionArr.size(); i++) {

            JSONObject qs = new JSONObject();

            JSONObject question = questionArr.getJSONObject(i);
            JSONObject content = question.getJSONObject("content");

            //问题
            qs.put("des", content.getString("des"));

            JSONArray options = content.getJSONArray("options");

            String str = "";

            for (int j = 0; j < options.size(); j++) {

                JSONObject option = options.getJSONObject(j);
                str = str + option.getString("id") + "、" + option.getString("name") + "<br/>";
                if (option.getBoolean("isSelected")) {
                    //答案
                    qs.put("answer", option.getString("name"));
                    //成绩
                    qs.put("gread", option.getInteger("gread"));
                }

                res.add(qs);

            }

            qs.put("option", str);

        }
        System.out.println(res);
        return res;

    }
}
