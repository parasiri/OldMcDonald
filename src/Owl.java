public class Owl extends Animal implements flyable,hobby{
    void sound() {
        System.out.println("hoot!");
    }
    public void fly() {
        System.out.println("นกบิน");
    }
    public void glide() {
        System.out.println("นกร่อน");
    }

    public void eat() {
        System.out.println("นกหม่ำ");
    }
    
    public void sleep() {
        System.out.println("นกนอน");
    }
    
}
