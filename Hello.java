//Contents:
// Basic Syntax and Operators
// Conditional Statements
// Loops


class Hello
{
    public static void main(String[] args){
        System.out.println("Hello Sneha!");

        System.out.println(3+5);
        System.out.println(4+9);

        int num1=19;
        int num2=9;
        int sum_res= num1+num2;
        int sub_res = num1-num2;

        System.out.println(sum_res);
        System.out.println(sub_res);

        // Assignment Operators (post and pre increment difference)

        int n1=5;
        int res = n1++;  //fetch the value and then increment
        System.out.println(res);

        int n2=5;
        int res1 = ++n2;  //increment and then fetch the value 
        System.out.println(res1);

        int x = 5;
        int y = 6;
        int z = 7;

        //Comparing 2 Numbers  (if-else)
        if (x>y)
            System.out.println("The largest number is: "+x);
        else
            System.out.println("The largest number is: "+y);

        //Comparing 2 Numbers  (ternary)
            int res2 = x>y ? x : y ;
            System.out.println(res2);

        //Comparing 3 Numbers   (if-else-if)
        if(x>y && x>z)
        {
            System.out.println("The largest number is: ");
            System.out.println(x);
        }
        else if(y>x && y>z)
        {
            System.out.println("The largest number is: ");
            System.out.println(y);
        }
        else
        {
            System.out.println("The largest number is: ");
            System.out.println(z);
        }


        // Switch Statement
        int day=7;
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter a valid number:");
                break;
        }


        //Loops

        //1. While Loop
        int num=0;             //initialization
        while(num<10){         //condition
            System.out.print(num);
            num++;             //incrementation
        }

        //2.Do while Loop
        int n3=0;              //initialization
        do{
            System.out.println("Hello");
            n3++;              //incrementation
        }while(n3<=0);         //condition

        //3.For Loop = initialization + condition + incrementation4
        for (int i=0; i<=5; i++){
            System.out.println(i);
        }

        for (int i=1; i<=5; i++){
            System.out.println("Day"+i);
            for (int j=9; j<=17; j++){
                System.out.println(j+" - "+(j+1));
            }
        }


    }   

}
