class Animal {
   void Speak(){
       System.out.println("Growl !!");
   }
}
class Dog extends Animal{  
   void Speak(){
     System.out.println("Bark !!");
  }
}
class Cat extends Animal{
    void Speak(){
      System.out.println("Meow !!");
}
}
class Question2{
public static void main(String args[])
   {
       Dog a=new Dog();
       Cat c=new Cat();

       a.Speak();
       c.Speak();
       
       
   }
}
