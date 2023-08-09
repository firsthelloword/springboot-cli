package com.zyk.cli;

/**
 * @author zhangyongkai
 * @date 2023/7/4 11:08
 */
public enum ResponseCode {

    SUCCESS(0, "成功"),
    BAD_REQUEST(4001, "传入参数异常"),
    NULL_POINTER(5001, "系统出现未知异常，请稍后重试"),
    BUSINESS_RESUBMISSION(4002, "数据重复提交，请稍后重试"),
    FILE_NOT_FOUND(4004, "资源不存在");
    private Integer code;
    private String desc;

    ResponseCode(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }


}
