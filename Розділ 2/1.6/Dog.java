public class Dog
{
    public String name;
    public String say;
    public Dog(String name,String say)
    {
        this.name=name;
        this.say=say;
    }
    public void show()
    {
        System.out.println(this.name+" says "+this.say);
    }
}
