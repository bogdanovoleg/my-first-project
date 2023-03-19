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


int candyCapacity = 12;
    public void takeOne() {
        if (candyCapacity == 0) {
            System.out.println("Dispenser is empty!");
        } else {
            candyCapacity--;
            System.out.println("You took one candy.");
        }
    }

    public void takeMany(int v) {
        if (candyCapacity == 0) {
            System.out.println("Dispenser is empty!");
        } else if (candyCapacity < v) {
            System.out.println("Not enough candies in dispenser!");
        } else if (v < 13) {
            candyCapacity -= v;
            System.out.println("You took " + v + " candies.");
        }
    }
    public void takeAll() {
        if (candyCapacity == 0) {
            System.out.println("Dispenser is empty!");
        } else {
            candyCapacity-=candyCapacity;
            System.out.println("You took all the candies.");
        }
    }
    public void putOne() {
        if (candyCapacity == 12) {
            System.out.println("Dispenser is full!");
        } else {
            candyCapacity++;
            System.out.println("You put one candy.");
        }
    }

    public void putMany(int v) {
        if (candyCapacity == 12) {
            System.out.println("Dispenser is full!");
        } else if (12-candyCapacity < v) {
            System.out.println("Not enough free space in dispenser!");
        } else if (v < 13) {
            candyCapacity += v;
            System.out.println("You put " + v + " candies.");
        }
    }
    public void putAll() {
        if (candyCapacity == 12) {
            System.out.println("Dispenser is full!");
        } else {
            candyCapacity=12;
            System.out.println("Dispenser is now full.");
        }
    }


}
