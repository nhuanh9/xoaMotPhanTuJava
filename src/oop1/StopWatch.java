package oop1;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class StopWatch {
    private Calendar startTime;
    private Calendar endTime;

    public void start() {
        startTime = Calendar.getInstance();
    }

    public void stop() {
        endTime = Calendar.getInstance();
    }

    public Calendar getStartTime() {
        return startTime;
    }

    public Calendar getEndTime() {
        return endTime;
    }

    public void setStartTime(Calendar startTime) {
        this.startTime = startTime;
    }

    private long cal() {
        return this.endTime.getTimeInMillis() - this.startTime.getTimeInMillis();
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        for (int i=0; i<100000;i++) {

        }
        stopWatch.stop();
        System.out.println(stopWatch.cal());
    }
}
