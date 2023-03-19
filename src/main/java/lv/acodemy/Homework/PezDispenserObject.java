package lv.acodemy.Homework;

public class PezDispenserObject {
    public static void main(String[] args) {


    PezDispenser bugsBunny = new PezDispenser("Looney Tunes","Bugs Bunny","Red");
        System.out.println(bugsBunny.candyCapacity);
        bugsBunny.takeAll();
        bugsBunny.takeAll();

        bugsBunny.takeOne();
        bugsBunny.takeMany(4);

        bugsBunny.putOne();
        bugsBunny.putMany(4);
        bugsBunny.takeOne();
        bugsBunny.takeMany(5);
        bugsBunny.takeMany(4);

        bugsBunny.putMany(6);
        bugsBunny.putMany(7);
        bugsBunny.putAll();
        bugsBunny.putMany(3);
        bugsBunny.putOne();
        bugsBunny.takeOne();
        bugsBunny.putMany(3);
        System.out.println(bugsBunny.candyCapacity);
}}

