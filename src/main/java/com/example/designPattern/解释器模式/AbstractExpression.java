package com.example.designPattern.解释器模式;

interface AbstractExpression {

    public void interpet(String info);
}

class TermianlExpression implements AbstractExpression {

    @Override
    public void interpet(String info) {
        //对中介表达式的处理
    }
}

class NonterminalExpression implements AbstractExpression {
    private AbstractExpression exp1;
    private AbstractExpression exp2;

    @Override
    public void interpet(String info) {
        //对非终结符表达式的处理
    }


}

class Context {
    private AbstractExpression exp;

    public Context() {
        //数据初始化;
    }

    public void operation(String info) {
        //调用相关表达式类的解释方法
    }
}