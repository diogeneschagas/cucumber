package br.com.test.java;

public class ExceptionTests extends Exception {
    private String msg;

    public ExceptionTests(String msg){
        super(msg);
        this.msg = msg;
    }

    public String getMessage(){
        return msg;
    }
}
