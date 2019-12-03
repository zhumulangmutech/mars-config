package com.fashion.mars.spring.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Getter
@AllArgsConstructor
public enum ApiResultEnum {

    SUCCESS_UPDATE("1","请求成功，并且需要更新"),
    SUCCESS("0","请求成功，没有要更新的数据")

    ;
   private String resultCode;

   private String resultMsg;


   private static final Map<String,ApiResultEnum> map=new HashMap<>();

   static {
       Arrays.stream(ApiResultEnum.values()).forEach((temp)->{
           map.put(temp.getResultCode(),temp);
       });
   }

   public static ApiResultEnum codeOf(String resultCode){
       return map.get(resultCode);
   }

}