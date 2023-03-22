package Recursion.Part_1;

public class Message {
    public static void main(String[] args) {
        message();
    }
    static void message(){
        System.out.println("Hello World");
        message1();// Here message function is calling other function name message1();
    }
    static void message1(){
        System.out.println("Hello World");
        message2();//Here message1() is calling other function name message2();
    }
    static void message2(){
        System.out.println("Hello World");
        message3();//Here message2() is calling other function name message3();
    }
    static void message3(){
        System.out.println("Hello World");
        message4();//Here message3() is calling other function name message4();
    }
    static void message4(){
        System.out.println("Hello World");
    }
    //As we can see here in this case one function is calling other function and other function is calling some other
        //function, this is whole scenario is going with the case of recursion.

    //As we can see also that ( body and definition ) of the function is same;

    //Let's understand how memory management is working in this example:
        //1.At the very first main is called then it goes to the stack memory and till the function will not get finished executing it will remain in stack;
        //2.When main called then it will be run the other function to make program finished, So it goes to the message() and tell him to execute till then (I/main) I'm resting in the stack memory then message said ok I,m executing;
        //3.Now message is executing,but he checks first that is there any other function is there which might needs to call then I will call him first then I will execute when if is there any other function which remains to execute then it will call message1() and wait till then message1() not finished executing at this message() will rest in the stack memory till message not get finished executing.
        //4.same story will be going on till message3() call message4() and message3() will rest in the stack memory.   NOTE:Here till main to message() , message1() , message2() , message3() is now rest in the stack memory because function is calling other function again and again but at the message4() has no function to call then it will execute what they have to execute it will execute (but point to remember it still in the stack memory now),Then it will execute and say I have noting to call I did execute so, I am returning to my origin where I was called returned to the function3(), Now it no longer stays in the stack memory because now it finished executing & It will get removed from the stack memory others are also waiting when they will finish executing;
        //5.same story will be going on till message() and message4(),message3(),message2() and message1() is not out of the stack because they finish executing.
        //6.Now message() will execute and out of the stack and now main will execute and says to RUN, Hey! run I execute the program now I'm getting out of the stack now you can over the program.
        //Point:- When a function finishes executing, it is removed fromm the stack and the flow of program is returned to where the function was called.

        //NOTE:- When at the last function has nothing to call & it will execute and returned from where it will be called and program over.Everything gets printed but wait till the last function not executed.
}
