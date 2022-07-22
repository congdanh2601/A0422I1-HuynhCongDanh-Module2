package ss4_class_and_object;

public class StopWatch {
    private static long startTime;
    private static long endTime;

    StopWatch() {
        startTime = System.currentTimeMillis();
    }

    static void start() {
        startTime = System.currentTimeMillis();
    }

    static void stop() {
        endTime = System.currentTimeMillis();
    }

    static long getElapsedTime() {
        return endTime - startTime;
    }


    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        double[] arr = new double[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random() * 100;
        }
        stopWatch.start();
        sortArray(arr);
        stopWatch.stop();
        System.out.printf("It takes %d milliseconds to sort an array with 100.000 elements.", getElapsedTime());
    }

    static void sortArray(double[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            double min = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    double temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
