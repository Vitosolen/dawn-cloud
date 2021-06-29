package com.hwx.dawncloud.commontest;

import com.alibaba.fastjson.JSONObject;
import org.junit.jupiter.api.Test;

/**
 * @Description TODO
 * @Date 2021/6/4 12:51
 * @Created by vito
 */
public class CommonTest {

    @Test
    public void testFastJson(){
        Object a= null;
        String s = JSONObject.toJSONString(a);
        System.out.println(s);
    }
}
