package com.designpattern.chain;

/**
 * Created by jon on 17-8-30.
 */
public class Client {
    public static void main(String[] args) {
        Approver wjzhang, gyang, jguo, meeting;
        wjzhang = new Director(" 张无忌");
        gyang = new VicePresident("杨过");
        jguo = new President("郭靖");
        meeting = new Congress("董事会");

        //创建责任链
        wjzhang.setSuccessor(gyang);
        gyang.setSuccessor(jguo);
        jguo.setSuccessor(meeting);

        //创建采购单
        PurchaseRequest pr1 =new PurchaseRequest(60000,10001,"购买倚天剑");
        wjzhang.processRequest(pr1);
    }
}
