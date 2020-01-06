package com.yyl.http;

import org.springframework.web.client.RestTemplate;

/**
 * Created by admin on 2019/12/23.
 */
public class HttpRequest {

    RestTemplate restTemplate = new RestTemplate();

    public <T> T httpReuset(String url, Object obj, Class<T> responseType) {
        return restTemplate.postForObject(url, obj, responseType);
    }

    public static <T> T request(String url, Object obj, Class<T> responseType) {
        HttpRequest request = new HttpRequest();
        return request.httpReuset(url, obj, responseType);
    }

    private static String http = "http://";
    public static String getUrl(String ip,String port,String url) {
        StringBuffer sb = new StringBuffer();
        sb.append(http).append(ip).append(port).append(url);
        return sb.toString();
    }

    private static String provider = "spring-cloud-server-provider";
    public static String getUrl(String url) {
        StringBuffer sb = new StringBuffer();
        sb.append(http).append(provider).append("/");
        return sb.toString();
    }

}
