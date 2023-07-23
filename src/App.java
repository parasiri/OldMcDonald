public class App {
    public static void main(String[] args) throws Exception {
        Cow mor = new Cow();
        mor.sound();
        mor.eat();
        mor.sleep();
        Duck ped = new Duck();
        ped.sound();
        ped.eat();
        ped.sleep();
        ped.fly();
        ped.glide();
        Pig hmoo = new Pig();
        hmoo.sound();
        hmoo.eat();
        hmoo.sleep();
        Owl nok = new Owl();
        nok.sound();
        nok.eat();
        nok.sleep();
        nok.fly();
        nok.glide();

        Duck donald = new Duck();
        donald.clean(new Cow());

        Duck daisy = new PekingDuck();
        daisy.clean(donald);
        
    }
}
