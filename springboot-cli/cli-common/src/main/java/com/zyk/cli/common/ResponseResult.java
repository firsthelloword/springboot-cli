package com.zyk.cli.common;

import lombok.Data;

/**
 * @author zhangyongkai
 * @date 2023/6/20 23:17
 */
@Data
public class ResponseResult<T> {
   /**
    * 状态码
    */
   private Integer code;
   /**
    * 提示信息，如果有错误时，前端可以获取该字段进行提示
    */
   private String desc;
   /**
    * 查询到的结果数据，
    */
   private T data;

   public ResponseResult(){}

   public ResponseResult(Integer code,String desc,T Data){
      this.code = code;
      this.desc = desc;
      this.data = Data;
   }

   public ResponseResult(ResponseCode responseCode){
      this.code = responseCode.getCode();
      this.desc = responseCode.getDesc();
   }


   public static ResponseResult success(){
      return new ResponseResult(0,"成功",null);
   }

   public static ResponseResult success(Object data){
      return new ResponseResult(0,"成功",data);
   }

   public static ResponseResult error(String msg){
      return new ResponseResult(-1,msg,null);
   }

   public static ResponseResult error(ResponseCode responseCode){
      return new ResponseResult(responseCode.getCode(),responseCode.getDesc(),null);
   }

   public static ResponseResult error(Integer code,String desc){
      return new ResponseResult(code,desc,null);
   }



   public boolean isSuccess(){
      return this.code == 0;
   }

}
