package utils;


import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class ReusableMethods extends Hooks{
    AndroidTouchAction action;
    public void waitFor(int sec){
        try{
            Thread.sleep(sec * 1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }


    public void tabOnThePoints(int StartX, int StartY){
        action = new AndroidTouchAction(androidDriver);
        action.tap(PointOption.point(StartX,StartY)).perform();
    }


    public void scroll(int fromX, int fromY, int toX, int toY){
        action = new AndroidTouchAction(androidDriver);
        action.longPress(PointOption.point(fromX,fromY))
                .moveTo(PointOption.point(toX,toY)).release()
                .perform();
    }
}

