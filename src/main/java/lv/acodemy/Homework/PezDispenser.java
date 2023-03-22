package lv.acodemy.Homework;

import lombok.Getter;

@Getter
public class PezDispenser {
    private String seriesName;
    private String charactersName;
    private String color;


    public PezDispenser(String seriesName, String charactersName, String color) {
        this.seriesName = seriesName;
        this.charactersName = charactersName;
        this.color = color;
    }

    @Override
    public String toString() {
        return "PezDispenser{" +
                "seriesName='" + seriesName + '\'' +
                ", charactersName='" + charactersName + '\'' +
                ", color='" + color + '\'' +
                '}';
    }


    int candyCount = 12;
    int candyCapacity = 12;

    public void takeOne() {
        if (candyCount == 0) {
            System.out.println("Dispenser is empty!");
        } else {
            candyCount--;
            System.out.println("You took one candy.");
        }
    }

    public void takeMany(int v) {
        if (candyCount == 0) {
            System.out.println("Dispenser is empty!");
        } else if (candyCount < v) {
            System.out.println("Not enough candies in dispenser!");
        } else if (v <= candyCapacity) {
            candyCount -= v;
            System.out.println("You took " + v + " candies.");
        }
    }

    public void takeAll() {
        if (candyCount == 0) {
            System.out.println("Dispenser is empty!");
        } else {
            candyCount -= candyCount;
            System.out.println("You took all the candies.");
        }
    }

    public void putOne() {
        if (candyCount == candyCapacity) {
            System.out.println("Dispenser is full!");
        } else {
            candyCount++;
            System.out.println("You put one candy.");
        }
    }

    public void putMany(int v) {
        if (candyCount == candyCapacity) {
            System.out.println("Dispenser is full!");
        } else if (candyCapacity - candyCount < v) {
            System.out.println("Not enough free space in dispenser!");
        } else if (v <= candyCapacity) {
            candyCount += v;
            System.out.println("You put " + v + " candies.");
        }
    }

    public void putAll() {
        if (candyCount == candyCapacity) {
            System.out.println("Dispenser is full!");
        } else {
            int b = candyCapacity - candyCount;
            candyCount = candyCount + b;
            System.out.println("You put " + b + " candies. Dispenser is now full.");
        }
    }
}
