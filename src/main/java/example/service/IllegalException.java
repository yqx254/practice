package example.service;

/**
 * @author Administrator
 */
public class IllegalException  extends RuntimeException{
    private String exceptionMsg;

    public IllegalException(String exceptionMsg){
        this.exceptionMsg = exceptionMsg;
    }

    public void setExceptionMsg(String exceptionMsg) {
        this.exceptionMsg = exceptionMsg;
    }

    public String getExceptionMsg() {
        return exceptionMsg;
    }
}
