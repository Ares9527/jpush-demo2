package com.jpushdemo;

import com.jpushdemo.util.JPushUtil;

import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {
        //设置推送参数
        //这里可以自定义推送参数了
        Map<String, String> parm = new HashMap<String, String>();
        //设置提示信息,内容是文章标题
        parm.put("msg","你知道对我最重要的东西是什么吗？是这句话的第一个字");
        parm.put("title","某电商类APP");
        parm.put("alias","alias");
        JPushUtil.jpushAndroid(parm);
    }

}
