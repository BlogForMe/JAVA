package com.designpattern.chain;

/**
 * Created by jon on 17-8-30.
 */
public abstract class Approver {
    protected Approver successor;//定义后继对象
    protected String name; //审批着姓名

    public Approver(String name) {
        this.name = name;
    }

    //设置后继者
    public void setSuccessor(Approver successor) {
        this.successor = successor;
    }

    //抽象请求处理方法
    public abstract void processRequest(PurchaseRequest request);

}
