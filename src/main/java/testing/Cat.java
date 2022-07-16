package testing;

public class Cat
{
    private String name;
    public Cat(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return this.name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Васька ");
        Cat catWrap = new CatWrapper (cat);
        System.out.println(catWrap.getName());
        System.out.println(cat.getName());
    }

}
