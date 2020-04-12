package com.cube.Utils;

public class SleepUtils {
    public void sleepRegularTime(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void sleepSetTime(Integer integer){
        try {
            Thread.sleep(integer);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
