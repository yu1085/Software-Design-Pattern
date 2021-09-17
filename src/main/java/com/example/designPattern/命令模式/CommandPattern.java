package com.example.designPattern.命令模式;

public class CommandPattern {
    public static void main(String[] args) {
        ConcreteCommand concreteCommand = new ConcreteCommand();
        Invoker invoker = new Invoker(concreteCommand);
        System.out.println("客户访问调用者的call（）方法");
        invoker.call();

    }
}

class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void call() {
        System.out.println("调用者执行命令command....");
        command.execute();
    }

}

interface Command {
    public abstract void execute();
}

class ConcreteCommand implements Command {
    private Receiver receiver;

    public ConcreteCommand() {
        this.receiver = new Receiver();
    }

    @Override
    public void execute() {
        receiver.action();
    }
}

class Receiver {
    public void action() {
        System.out.println("接受者的action()方法被调用...");
    }
}