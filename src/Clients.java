public class Clients implements Person, Parents{

    private int age;
    private String nameParent;

    @Override
    public void setAge(int age) {
        this.age = age*2;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setName(String name) {
        this.nameParent = name;
    }

    @Override
    public String getName() {
        return nameParent;
    }
}
