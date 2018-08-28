class Animal {
   void animal_Speak(){
       System.out.println("Growl !!");
   }
}
class Dog extends Animal{  
   void dog_Speak(){
     System.out.println("Bark !!");
  }
}
class Cat extends Animal{
    void cat_Speak(){
      System.out.println("Meow !!");
}
}
class Question2{
public static void main(String args[])
   {
       Dog a=new Dog();
       Cat b=new Cat();

       a.animal_Speak();
       a.dog_Speak();
       b.animal_speak();
       b.cat_Speak();
   }
}