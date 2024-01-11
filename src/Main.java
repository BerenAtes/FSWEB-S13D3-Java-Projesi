public class Main {
    public static void main(String[] args) {

        System.out.println("Person Tests*********************");
        Person person1 = new Person("John", "Doe", 20);
        Person person2 = new Person("Beren", "Ateş", 13, 123456, "beren@gmail.com","brn_ats");

        System.out.println(person2);
        System.out.println("person2.isTeen() => "+ person2.isTeen());

        System.out.println("person1 Firstname: " + person1.getFirstName());
        System.out.println("person1 LastName: " + person1.getLastName());
        System.out.println("person1 Age: " + person1.getAge());
        System.out.println("person1.isTeen() => "+ person1.isTeen());


        System.out.println("Wall Tests*********************");
        Wall wall = new Wall(5,4);
        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5);

        System.out.println("width= " + wall.getWidth());

        System.out.println("height= " + wall.getHeight());

        System.out.println("area= " + wall.getArea());
    }
}