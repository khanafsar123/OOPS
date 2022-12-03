package SetHashS;

public class Dog {
    //  private are more secure - remember encapsulation
    // if privately declared we need getter / setter method


    private String name;
    private String color;
    private String breed;

    public Dog (String name, String color, String breed) {
       setName(name);

    }
    public void setName(String name) {
        this.name=name;
    }
    public void getName() {
        System.out.println(name);
    }


}
