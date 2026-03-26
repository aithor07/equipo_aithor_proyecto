package model;

public class CounterModel {
    private int clickCount;

    public CounterModel() {
        this.clickCount = 0;
    }

    public int getClickCount() {
        return clickCount;
    }
    public void resetClickCount(){
        setClickCount(0);
    }

    public void setClickCount(int clickCount) {
        this.clickCount = clickCount;
    }

    public void incrementClickCount() {
        setClickCount(getClickCount() + 1);
    }
}
