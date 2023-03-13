package lv.acodemy.classroom;

public class ObjectExample {
    public static void main(String[] args) {

        Cat barsik = new Cat("Barsik","Gray and White",5,6.35,"British Long Hair","Male",true,5);
        barsik.setAge(5);
        barsik.setWeight(6.35);
        System.out.println(barsik);




        System.out.printf("My cats name is %s. My cat is %d years old. Gender is %s, and he's breed is %s. Color is %s and weight is %,.2f kg.\n",
        barsik.getName(),barsik.getAge(),barsik.getGender(),barsik.getBreed(),barsik.getColor(),barsik.getWeight());

        barsik.speak();
        barsik.feed();
        System.out.println(barsik.getEnergy());
        barsik.walk();
        barsik.walk();
        barsik.walk();
        barsik.walk();
        barsik.walk();
        barsik.walk();
        System.out.println(barsik.getEnergy());

    }
}
