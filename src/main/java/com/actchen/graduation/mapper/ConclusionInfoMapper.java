package com.actchen.graduation.mapper;

import com.actchen.graduation.model.Answer;
import com.actchen.graduation.model.Conclusion;
import com.actchen.graduation.model.Questionnaire;
import com.actchen.graduation.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author wentong chen
 * @version 1.0
 * @date 2020/4/30 2:34 下午
 */
@Mapper
public interface ConclusionInfoMapper {

     public void insertConclusionInfo(Conclusion conclusionInfo);

     public List<Conclusion> selectTestByUserId(String id);

     public List<Conclusion> selectTestByLimit(Integer height);

     public Answer selectQuestionByTimeAndUserId(String userId, String time);

     public void insertQuestion(Questionnaire data);

     public List<Questionnaire> getQuestion();

     public void saveUser(User user);

     public void saveAnswer(Answer answer);

     public List<User> selectUser(String userId);

     public User selectUserById(String userId);

     public User selectUserIdByKey(String key);

}
