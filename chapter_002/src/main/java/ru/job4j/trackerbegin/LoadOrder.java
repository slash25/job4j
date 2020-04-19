package ru.job4j.trackerbegin;

public class LoadOrder {
    private static String static_field = echo("static field");

    private static final String STATIC_FINAL_FIELD = echo("static final field");

    {
        echo("not-static block");
    }

    static {
        echo("static block");
    }

    private String surname = echo("field");

    private final String name = echo("final field");

    public LoadOrder(String msg) {
        echo("constructor " + msg);
    }

    public static String echo(String text) {
        System.out.println(text);
        return text;
    }

    private static final class Holder {
        private static final LoadOrder INSTANCE = new LoadOrder("static inner field");

    }

    public static void main(String[] args) {
        TrackerSingle tracker = TrackerSingle.INSTANCE;
        TrackerSingleC trackerc = TrackerSingleC.getInstance();
        TrackerSingleEL trackerEL = TrackerSingleEL.getInstance();
        TrackerSingleLL trackerLL = TrackerSingleLL.getInstance();
    }


}
