package com.actchen.graduation.controller;

import com.actchen.graduation.model.Questionnaire;
import com.actchen.graduation.service.InsertToolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author wentong chen
 * @version 1.0
 * @date 2020/5/27 2:55 下午
 */
@RestController
@RequestMapping("/insert")
public class InserToolController {

    @Autowired
    private InsertToolService insertToolService;

    @RequestMapping(value = "/questionnaire", method = RequestMethod.POST)
    @ResponseBody
    public void insertData(){
        String data = "[{\"content\":{\"des\":\"从早上起床到晚上睡着的时间内，小便的次数是多少？\",\"options\":[{\"id\":1,\"name\":\"小于等于7\",\"isSelected\":false,\"gread\":0},{\"id\":2,\"name\":\"8～14\",\"isSelected\":false,\"gread\":1},{\"id\":3,\"name\":\"大于等于15\",\"isSelected\":false,\"gread\":2}]}},{\"content\":{\"des\":\"从晚上睡着后到早上起床的时间内，因为小便起床的次数是多少？\",\"options\":[{\"id\":1,\"name\":\"0\",\"isSelected\":false,\"gread\":0},{\"id\":2,\"name\":\"1\",\"isSelected\":false,\"gread\":1},{\"id\":3,\"name\":\"2\",\"isSelected\":false,\"gread\":2},{\"id\":4,\"name\":\"大于3次\",\"isSelected\":false,\"gread\":3}]}},{\"content\":{\"des\":\"是否有突然想要小便，同时难以忍受的现象发生？\",\"options\":[{\"id\":1,\"name\":\"无\",\"isSelected\":false,\"gread\":0},{\"id\":2,\"name\":\"每周小于1次\",\"isSelected\":false,\"gread\":1},{\"id\":3,\"name\":\"每周大于等于1次\",\"isSelected\":false,\"gread\":2},{\"id\":4,\"name\":\"每日等于1次\",\"isSelected\":false,\"gread\":3},{\"id\":5,\"name\":\"每日2～4次\",\"isSelected\":false,\"gread\":4},{\"id\":6,\"name\":\"每日大于等于5次\",\"isSelected\":false,\"gread\":5}]}},{\"content\":{\"des\":\"是否有突然想要小便，同时无法忍受并出现尿失禁的现象？\",\"options\":[{\"id\":1,\"name\":\"无\",\"isSelected\":false,\"gread\":0},{\"id\":2,\"name\":\"每周小于1次\",\"isSelected\":false,\"gread\":1},{\"id\":3,\"name\":\"每周大于等于1次\",\"isSelected\":false,\"gread\":2},{\"id\":4,\"name\":\"每日等于1次\",\"isSelected\":false,\"gread\":3},{\"id\":5,\"name\":\"每日2～4次\",\"isSelected\":false,\"gread\":4},{\"id\":6,\"name\":\"每日大于等于5次\",\"isSelected\":false,\"gread\":5}]}},{\"content\":{\"des\":\"根据您压力性尿失禁的表现，选择对应的严重程度:\",\"options\":[{\"id\":1,\"name\":\"一般活动及夜间无尿失禁，腹压增加时偶发尿失禁, 无需佩戴尿垫。\",\"isSelected\":false,\"gread\":1},{\"id\":2,\"name\":\"腹压增加及起立活动时，有频繁的尿失禁，需要佩戴尿垫生活。\",\"isSelected\":false,\"gread\":2},{\"id\":3,\"name\":\"起立活动或卧位体位变化时即有尿失禁，严重地影响患者的生活及社交活动。\",\"isSelected\":false,\"gread\":3}]}}]";
        Integer num  = 5;
        Questionnaire param = new Questionnaire();
        param.setQuestion(data);
        param.setNum(num);
        insertToolService.insert(param);

    }
}
