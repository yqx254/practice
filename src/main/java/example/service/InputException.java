package example.service;

/**
 * @author Administrator
 */
public class InputException extends  RuntimeException{
    private String exceptionMsg;
    public InputException(String exceptionMsg){
        this.exceptionMsg = exceptionMsg;
    }

    public void setExceptionMsg(String exceptionMsg) {
        this.exceptionMsg = exceptionMsg;
    }

    public String getExceptionMsg() {
        return exceptionMsg;
    }
}
