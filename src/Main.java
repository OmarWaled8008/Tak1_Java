// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // here we have two instances of the Imaginarynumbers class
        // we created it using the constructor
        // we called  enternums method on each instance to take the input number from the user
        // we called  printimaginarynumbers method to display each complex number
        Imaginarynumbers I1=new Imaginarynumbers();
        I1.enternums();
        I1.printimaginarynumbers();
        Imaginarynumbers I2=new Imaginarynumbers();
        I2.enternums();
        I2.printimaginarynumbers();
        // //////////////////////////////////////
        // here we have two instances of the Imaginarynumbers class
        // we called the add method on the sumOfImaginarynums instance
        // and stored back the return value in  sumOfImaginaryNums
        Imaginarynumbers sumOfImaginarynums=new Imaginarynumbers();
        sumOfImaginarynums = sumOfImaginarynums.add(I1,I2);
        // we called printimaginarynumbers on sumOfImaginarynums to display the addition of the complex numbers
        sumOfImaginarynums.printimaginarynumbers();
        // we called the add method on the subOfImaginarynums instance
        // and stored back the return value in  subOfImaginarynums
        Imaginarynumbers subOfImaginarynums=new Imaginarynumbers();
        subOfImaginarynums = subOfImaginarynums.subtract(I1,I2);
        // we called printimaginarynumbers on subOfImaginarynums to display the subtraction  of the complex numbers
        subOfImaginarynums.printimaginarynumbers();
    }
}

// we create class that have two int numbers (real number , imaginary number)
class Imaginarynumbers {
    int realnum;
    int imaginarynum;

    // here we default constructor with no arguments
    // just to declare the instances without any initial values
    Imaginarynumbers() {}

    // this method for take the values of the complex numbers form the user
    // and assigns the entered values to the variables of the class
    void enternums() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter numbers:");
        int real = myObj.nextInt();
        int imaginary = myObj.nextInt();
        this.realnum = real;
        this.imaginarynum = imaginary;
    }

    // we have the add method to add two instances complex numbers
    Imaginarynumbers add(Imaginarynumbers num1, Imaginarynumbers num2) {
        Imaginarynumbers temp = new Imaginarynumbers();
        temp.realnum = num1.realnum + num2.realnum;
        temp.imaginarynum = num1.imaginarynum + num2.imaginarynum;
        System.out.println("/////add/////");
        return temp;
    }

    // we have the add method to subtract two instances complex numbers
    Imaginarynumbers subtract(Imaginarynumbers num1, Imaginarynumbers num2) {
        Imaginarynumbers temp = new Imaginarynumbers();
        temp.realnum = num1.realnum - num2.realnum;
        temp.imaginarynum = num1.imaginarynum - num2.imaginarynum;
        System.out.println("/////subtract/////");
        return temp;
    }

    //method  prints the imaginary number
    void printimaginarynumbers() {
        System.out.println("imaginary_numbers : " + realnum + "+" + imaginarynum + "i");
    }
}
