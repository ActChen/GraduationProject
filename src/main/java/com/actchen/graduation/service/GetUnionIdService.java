package com.actchen.graduation.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Service;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author wentong chen
 * @version 1.0
 * @date 2020/4/26 12:08 上午
 */
@Service
public class GetUnionIdService {

    private static final String appId = "wx4306e37acec238f7";

    private static final String appSecret = "3ead96cd1c1fa453c06a235592db6e47";

    private static final String grant_type = "authorization_code";

    public JSONObject getUnionId(String code) {

        String urlStr = "https://api.weixin.qq.com/sns/jscode2session";

        urlStr = urlStr + "?appid=" + appId + "&" + "secret=" + appSecret + "&js_code=" + code + "&grant_type=" + grant_type;

        /**
         * 获取UnionId
         */
        HttpURLConnection conn = null;
        InputStream is = null;
        BufferedReader br = null;
        StringBuilder result = new StringBuilder();

        try {
            URL url = new URL(urlStr);
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            //设置连接超时时间
            conn.setConnectTimeout(15000);
            conn.setReadTimeout(60000);
            conn.setRequestProperty("Accept", "application/json");

            conn.connect();

            if (200 == conn.getResponseCode()) {
                is = conn.getInputStream();
                br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
                String line;
                while ((line = br.readLine()) != null) {
                    result.append(line);
                }
            } else {
                System.out.println(conn.getResponseCode());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (is != null) {
                    is.close();
                }
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
            conn.disconnect();
        }
        return JSON.parseObject(result.toString());
    }

}
