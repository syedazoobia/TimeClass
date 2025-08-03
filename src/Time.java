public class Time{
    int hour;
    int min;
    int sec;

    Time(int hour, int min, int sec){
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }
    public void set(int hour, int min, int sec){
        this.hour = hour;
        this.min = min; 
        this.sec = sec; 
    }
    public int gethour(){
        return hour;
    }
    public int getmin(){
        return min;
    }
    public int getsec(){
        return sec;
    }
    public void show(){
        System.out.println(hour +":"+ min + ":" + sec);
    }
    public void reset(){
        this.hour = 0;
        this.min = 0;
        this.sec = 0;
    }
}