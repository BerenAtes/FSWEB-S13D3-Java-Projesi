public class Person {
    String firstname;
    String lastName;
    int age;
    int password;
    String email;
    String nickName;


    public Person(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastName = lastname;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age, int password, String email, String nickName) {
        this(firstName, lastName, age);
        this.password = password;
        this.email = email;
        this.nickName = nickName;
    }

    public String getFirstName() {
    return this.firstname;
    }
    public String getLastName(){
        return this.lastName;
    }
    public int getAge(){
        return this.age;
    }

    public boolean isTeen(){
        return 13 <= this.age && this.age <= 19;
    }
    }


