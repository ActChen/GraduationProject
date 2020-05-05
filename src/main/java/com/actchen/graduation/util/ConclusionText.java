package com.actchen.graduation.util;

/**
 * @author wentong chen
 * @version 1.0
 * @date 2020/4/30 11:14 上午
 */
public class ConclusionText {

    private static final String TABLE1_C1 = "您属于尿失禁高危人群！请您尽快咨询专业医师，为您制定专业的建议";

    private static final String TABLE1_C2 = "您属于尿失禁中危人群！您可通过早期中西医治疗，早期干预，预防疾病的发生！";

    private static final String TABLE1_C3 = "您属于尿失禁低危人群！您可通过生活习惯调摄，早期盆底肌训练预防疾病发生！";

    private static final String TABLE2_C1 = "急迫性尿失禁";

    private static final String TABLE2_C2 = "压力性尿失禁";

    private static final String TABLE2_C3 = "混合性尿失禁";

    private static final String TABLE3_C1 = "轻度：您可能有轻度的压力性尿失禁，推荐您每天进行一定时间的盆底肌功能训练以增强盆底肌肉功能；生活上您要注意：1、规律饮水，勿憋尿，保持会阴部干燥卫生，预防尿道感染。2、睡前2h 不饮用水，以减少夜尿次数。3、减少饮用含咖啡因、酒精等饮料。4、避免提举重物以防止骨盆肌肉继续松弛。";

    private static final String TABLE3_C2 = "中度：您可能有中度的压力性尿失禁，为了您的健康，建议您去正规医院进行首诊明确诊断。目前行之有效的治疗方法主要是电针、中药汤剂、西药等方法。您需要进行规范的盆底肌康复训练。注意事项：1、规律饮水，勿憋尿，保持会阴部干燥卫生，预防尿道感染。2、睡前2h 不饮用水，以减少夜尿次数。3、减少饮用含咖啡因、酒精等饮料。";

    private static final String TABLE3_C3 = "重度：您可能有重度的压力性尿失禁，为了您的健康，建议您尽早去正规医院进行相关检查并进行治疗。目前行之有效的治疗方法主要是电针、中医汤剂、西药等治疗方法。当疾病严重时，可选择手术治疗。您需要行盆底肌康复训练。注意事项：1、规律饮水，勿憋尿，保持会阴部干燥卫生，预防尿道感染；2、睡前2h 不饮用水，以减少夜尿次数。3、减少饮用含咖啡因、酒精等饮料。";

    private static final String TABLE4_C1 = "轻度压力性尿失禁";

    private static final String TABLE4_C2 = "中度压力性尿失禁";

    private static final String TABLE4_C3 = "重度压力性尿诗经";

    private static final String TABLE5_C1 = "轻度：您可能有轻度的混合性尿失禁，为了您的健康，建议您去正规医院进行首诊。目前行之有效的治疗方法主要是电针、中医汤剂、西药等治疗方法。您需要进行规范的盆底肌康复训练。生活上：1、规律饮水，勿憋尿，保持会阴部干燥卫生，预防尿道感染；2、转移注意力，延长排尿间隔，做到2-3小时排尿1次；3、睡前2h 不饮用水，以减少夜尿次数。3、减少饮用含咖啡因、酒精等饮料；4、转移注意力，延长排尿间隔，做到2-3小时排尿1次。";

    private static final String TABLE5_C2 = "中度：您可能有中度的混合性尿失禁，为了您的健康，建议您去正规医院进行首诊明确诊断。目前行之有效的治疗方法主要是电针、中医汤剂、西药等治疗方法。您需要进行规范的盆底肌康复训练。生活上：1、规律饮水，勿憋尿，保持会阴部干燥卫生，预防尿道感染；2、转移注意力，延长排尿间隔，做到2-3小时排尿1次；3、睡前2h 不饮用水，以减少夜尿次数。3、减少饮用含咖啡因、酒精等饮料；4、转移注意力，延长排尿间隔，做到2-3小时排尿1次。";

    private static final String TABLE5_C3 = "重度：您可能有重度的混合性尿失禁，为了您的健康，建议您去正规医院进行首诊明确诊断。目前行之有效的治疗方法主要是电针、中医汤剂、西药等治疗方法。您需要进行规范的盆底肌康复训练。生活上：1、规律饮水，勿憋尿，保持会阴部干燥卫生，预防尿道感染；2、转移注意力，延长排尿间隔，做到2-3小时排尿1次；3、睡前2h 不饮用水，以减少夜尿次数。3、减少饮用含咖啡因、酒精等饮料；4、转移注意力，延长排尿间隔，做到2-3小时排尿1次。";

    public static String getConclusion(int tag) {
        switch (tag){
            case 0: return TABLE1_C1;
            case 1: return TABLE1_C2;
            case 2: return TABLE1_C3;

            case 3: return TABLE2_C1;
            case 4: return TABLE2_C2;
            case 5: return TABLE2_C3;

            case 6: return TABLE3_C1;
            case 7: return TABLE3_C2;
            case 8: return TABLE3_C3;

            case 9: return TABLE5_C1;
            case 10: return TABLE5_C2;
            case 11: return TABLE5_C3;

            case 12: return TABLE4_C1;
            case 13: return TABLE4_C2;
            case 14: return TABLE4_C3;


            default:return "";
        }
    }

}
