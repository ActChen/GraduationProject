package com.actchen.graduation.service;

import com.actchen.graduation.util.ConclusionText;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wentong chen
 * @version 1.0
 * @date 2020/4/30 11:01 上午
 */
@Service
public class GetConclusionService {

    /**
     * 得出结论
     *
     * @param greatCount
     * @return
     */
    public String getConclusion(List<Integer> greatCount, Integer tableNum) {
        int all = 0;
        for (int i = 0; i < greatCount.size(); i++) {
            all += greatCount.get(i);
        }
        switch (tableNum) {
            case 1:
                if (all <= 4) {
                    return ConclusionText.getConclusion(2);
                } else if (all >= 5 && all <= 9) {
                    return ConclusionText.getConclusion(1);
                } else {
                    return ConclusionText.getConclusion(0);
                }
            case 2:
                return getTableTwoConclusion(greatCount);
            case 3:
                if (all <= 5) {
                    return ConclusionText.getConclusion(6);
                } else if (all >= 6 && all <= 10) {
                    return ConclusionText.getConclusion(7);
                } else {
                    return ConclusionText.getConclusion(8);
                }
            case 4:
                if (all == 1) {
                    return ConclusionText.getConclusion(12);
                } else if (all == 2) {
                    return ConclusionText.getConclusion(13);
                } else {
                    return ConclusionText.getConclusion(14);
                }
            case 5:
                if (all <= 6) {
                    return ConclusionText.getConclusion(9);
                } else if (all >= 7 && all <= 11) {
                    return ConclusionText.getConclusion(10);
                } else {
                    return ConclusionText.getConclusion(11);
                }
            default:
                return "";
        }
    }

    private String getTableTwoConclusion(List<Integer> greatCount) {
        /**
         * 1～6中有选择是的，则为急迫性尿失禁
         * 7～15中有选择是的，则为压力性尿诗经
         * 1～6中选择是和7～15中选择是，则为混合性尿失禁
         */
        boolean tag1_6 = false;
        boolean tag7_15 = false;

        for (int i = 0; i < greatCount.size(); i++) {
            if (i < 6 && greatCount.get(i) != 0) {
                tag1_6 = true;
            }
            if (i > 5 && greatCount.get(i) != 0) {
                tag7_15 = true;
            }
        }

        if (tag1_6 && !tag7_15) {
            return ConclusionText.getConclusion(3);
        } else if (!tag1_6 && tag7_15) {
            return ConclusionText.getConclusion(4);
        } else if (tag1_6 && tag7_15) {
            return ConclusionText.getConclusion(5);
        } else {
            return "正常，无尿失禁问题";
        }
    }

}
