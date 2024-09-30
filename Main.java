// public class Main {
//     // Main method
//     public static void main(String[] args) {
//         System.out.println("First Hello of java");
//     }
// }

// Variable of Java
// public class Vaiables {
//   public static void main(String[] args){
//     int myage = 21;
//     double price = 25.26;
//     boolean isAdmin = false;
//     char alpha = 'A';
//     String myName = "Jawad";

//     System.out.println("Name:" + myName);
//     System.out.println("Age:" + myage);
//     System.out.println("Admin:" + isAdmin);
//     System.out.println("Price: " + price);
//     System.out.println("Grade: " + alpha);
//   }   
// }

//  Operators
// public class Operators {
//     public static void main(String[] args) {
//       int firstNumber = 10;
//       int secondNumber = 15;

//       System.out.println("Sum:" + (firstNumber + secondNumber));
//       System.out.println("Diff:" + (firstNumber - secondNumber));
//       System.out.println("product:" + (firstNumber * secondNumber));
//       System.out.println("quotient:" + (firstNumber / secondNumber));
//     }

// }

// & if else statement

// public class Main {
// public static void main(String[] args) {
//     int age = 19;

//     if (age>= 18) {
//         System.out.println("You are adult");
//     } else {
//         System.out.println("You are not teenager");
//     }

// }

// }

// & classes and object 

//  class Car {
//     // properties
//     String brand;
//     int year;

//     // method of car
//     void myCar(){
//         System.out.println(brand + "new model will launch in" + year);
//     }
    
// }
// public class Main {

//     public static void main(String[] args) {
//         Car newCar = new Car();
//         newCar.brand = "Tesla";
//         newCar.year = 2030;

//         newCar.myCar();
//     }
// }

// & class 2

// class Introduction {
//     String name;
//     int age;

//     // method/function
//     void introduce(String message){
//         System.out.println(message + "my name is " + name + "and i'm " + age + "year old");
//     }
// }
 
//     public class Main {
//         public static void main(String[] args) {
//             Introduction myIntro = new Introduction();
//             myIntro.name = "Jawad";
//             myIntro.age = 21;

//             myIntro.introduce("Hey there ");

//         }
//     }

// & class 3 

class BankAccount {
    // attribute
    double balance;

    // method/function
    void deposit(double amount){
        balance += amount;
        System.out.println("Deposited amount is " + amount + ". New balance is: " + balance);
    }

    double getBalance(){
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(100);
        account.deposit(32);
        account.deposit(85.56);
        System.out.println("Current balance: " + account.getBalance());


    }
}

// public class Main {

//     public static void main(String[] args) {

//         displayHelloWorld();
//         checkAge(19);
//         addTwoNumbers(5, 10);
//         loop();
//         function("jawad", "khan");
//     }

//     public static void displayHelloWorld() {
//         System.out.println("Hello, World!");
//     }

//     public static void checkAge(int age) {
//         if (age >= 18) {
//             System.out.println("You are an adult.");
//         } else {
//             System.out.println("You are not an adult.");
//         }
//     }

//     public static void addTwoNumbers(int num1, int num2) {
//         int sum = num1 + num2;
//         System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
//     }
//     public static void loop() {
//         for (int i = 0; i < 5; i++) {
//             System.out.println("Number:" + i);
//         }
//     }
//     public static void function(String firstName , String lastName) {
//         System.out.println(firstName + lastName);
//     }



// }
