public class Duck extends Animal implements flyable,hobby{
    public void sound() {
        System.out.println("quack!");
    }
    public void fly() {
        System.out.println("เป็ดบิน");
    }
    public void glide() {
        System.out.println("เป็ดร่อน");
    }

    public void eat() {
        System.out.println("เป็ดหม่ำ");
    }

    
    
    public void sleep() {
        System.out.println("เป็ดนอน");
    }
    
    //Add method clean() to Duck
    public void clean (Animal animal){
        System.out.println(this.toString() + " is cleaning " + animal.toString());
    }
}
