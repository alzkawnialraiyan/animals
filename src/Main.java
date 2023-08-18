//super class animals subclasses dog, cat, bird.
public class Main {
    public static void main(String[] args) {
        dog d = new dog();
        d.eat();
        d.sound();

        cat c = new cat();
        c.eat();
        c.sound();

        birds b = new birds();
        b.eat();
        b.sound();
    }
}
class animals {
    public String eat(){
        return eat();
    }
    public String sound(){
        return sound();
    }
}
class dog extends animals{
    @Override
    public String eat() {
        String dogfood = "Dogs eat dog food";
        System.out.println("Dogs eat dog food");
        return dogfood;
    }

    @Override
    public String sound() {
        String dogsound = "dogs bark";
        System.out.println("dogs bark");
        return dogsound;
    }
}
class cat extends animals{
    @Override
    public String eat() {
        String catfood = "cats eat cat food";
        System.out.println("cats eat cat food");
        return catfood;
    }

    @Override
    public String sound() {
        String catsound = "cats meow";
        System.out.println("cats meow");
        return catsound;
    }
}
class birds extends animals{
    @Override
    public String eat() {
        String birdfood = "Birds eat seeds";
        System.out.println("Birds eat seeds");
        return birdfood;
    }

    @Override
    public String sound() {
        String birdsound = "Birds tweet";
        System.out.println("Birds tweet");
        return birdsound;
    }
}