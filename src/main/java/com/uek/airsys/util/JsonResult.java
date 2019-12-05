package com.uek.airsys.util;

import com.alibaba.fastjson.JSON;
import lombok.Data;

/**
 * json结果类型的封装类
 */
@Data
public class JsonResult {
    private String status;
    private String data;

    /**
     * 把用户获取的数据转化为json格式
     * @param o
     */
    public void setData(Object o){
        this.data= JSON.toJSONString(o);
    }
}
