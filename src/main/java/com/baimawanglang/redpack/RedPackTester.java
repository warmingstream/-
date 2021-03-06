package com.baimawanglang.redpack;

/**
     一个支付公司，数据机房有本地多中心，也有异地中心。那么对于转账场景（A->B），
     数据如何存储，如何拆分，以及机房故障之后，会遇到什么问题？

     --要求：给出简要数据库设计
     给出多中心的数据同步策略和工具选型
     给出本地机房故障，异地机房故障的解决方案
 */

/**
 *    用户在支付宝钱包里面给好友发送群红包，试设计群红包涉及的各接口及其内部实现”
      要求：需要做类图,序列图,边界设计、并注意做好并发控制，接口实现需完整。用户领取红包金额随机，但需要保障每个用户至少领到1分钱。
      红包包好之后，通知用户来领取，如果过期时间之内没领完，需要被回收。注意需要手写代码，尽量不要用伪码。
      提示：可打开支付宝钱包尝试用一次看下页面交互，部分涉及外部调用的地方可进行mock或者伪码来完成。
 */

public class RedPackTester {

    public static void main(String[] args) {
        System.out.println(2222);
    }

}
