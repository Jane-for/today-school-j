package com.qingxun.pub;

public class Result {


    private String reason = "请求成功";
    private int resultcode;
    private Object result;


    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public int getResultcode() {
        return resultcode;
    }

    public void setResultcode(int resultcode) {
        this.resultcode = resultcode;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Result{" +
                "reason='" + reason + '\'' +
                ", resultcode=" + resultcode +
                ", result=" + result +
                '}';
    }
}
