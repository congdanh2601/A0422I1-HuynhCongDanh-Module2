package ss4_class_and_object;

public class StopWatch {
    private long startTime;
    private long endTime;

    StopWatch() {
        startTime = System.currentTimeMillis();
    }

    void start() {
        startTime = System.currentTimeMillis();
    }

    void stop() {
        endTime = System.currentTimeMillis();
    }

    long getElapsedTime() {
        return endTime - startTime;
    }


    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();



    }
}
