package com.jeysin;

import java.io.PrintStream;

/**
 * @Author: Jeysin
 * @Date: 2019/2/1 19:48
 * @Desc:
 */

public class Student implements Person{

    private PrintStream printStream;

    @Override
    public void sayHello() {
        printStream.println("Hello, I am a student");
    }

    public PrintStream getPrintStream() {
        return printStream;
    }

    public void setPrintStream(PrintStream printStream) {
        this.printStream = printStream;
    }
}
