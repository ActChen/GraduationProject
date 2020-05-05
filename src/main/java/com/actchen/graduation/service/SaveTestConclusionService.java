package com.actchen.graduation.service;

import com.actchen.graduation.mapper.ConclusionInfoMapper;
import com.actchen.graduation.model.ConclusionInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wentong chen
 * @version 1.0
 * @date 2020/4/30 1:53 下午
 */
@Service
public class SaveTestConclusionService {
    /**
     * 评测记录存入mysql数据库
     */

    @Autowired
    private ConclusionInfoMapper conclusionInfoMapper;

    public void saveConclusion(ConclusionInfo conclusionInfo){
        conclusionInfoMapper.insertConclusionInfo(conclusionInfo);
    }
}
