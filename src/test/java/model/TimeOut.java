package model;
public class TimeOut {
    public void timeOut(int timeOutNumber){
        try {
            Thread.sleep(timeOutNumber);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
