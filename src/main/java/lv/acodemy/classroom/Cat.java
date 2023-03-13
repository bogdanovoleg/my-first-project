package lv.acodemy.classroom;

import lombok.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Cat {
    private String name;
    private String Color;
    @Setter private int age;
    @Setter private double weight;
    private String breed;
    private String gender;
    private boolean hasFur;
    private final int MAX_ENERGY = 5;
    private int energy = 5;

    public void speak() {
        System.out.println("Meow");
    }

    public void feed() {
        if (energy == MAX_ENERGY) {
            System.out.println("I'm not hungry!");
        } else {
            System.out.println("Om-nom-nom");
            energy++;
            }
        }
        public void walk () {
            if (energy == 0) {
                System.out.println("Don't have energy!");
            } else {
                System.out.println("Walkie-walkie");
                energy--;
            }
        }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", Color='" + Color + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", breed='" + breed + '\'' +
                ", gender='" + gender + '\'' +
                ", hasFur=" + hasFur +
                ", MAX_ENERGY=" + MAX_ENERGY +
                ", energy=" + energy +
                '}';
    }
}
