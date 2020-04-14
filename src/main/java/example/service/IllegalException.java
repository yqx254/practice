package example.service;

/**
 * @author fstar
 */
public class IllegalException extends  RuntimeException{
    private String exceptionMsg;
    public IllegalException(String msg){
        this.exceptionMsg = msg;
    }

    public void setExceptionMsg(String exceptionMsg) {
        this.exceptionMsg = exceptionMsg;
    }

    public String getExceptionMsg() {
        return exceptionMsg;
    }
}
