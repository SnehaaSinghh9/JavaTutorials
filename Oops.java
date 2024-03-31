//Object Oriented Programming

class Calculator{

    int a=10, b=5;                                   //variables (what object knows)

    public int add(int n1, int n2){                 //methods (what object does)
        System.out.println("add");
        int res = n1+n2;
        return res;
    }
}

//Understanding Methods in detail

class Computer{
    public void playMusic(){    //access-specifier :- public
        System.out.println("Playing music");
    }

    public void playGames(){
        System.out.println("Playing Game");
    }

    public String getMeAnImage(int cost){
        if (cost>=10)
        {
            System.out.println(cost);
            return "Image";
        }
        else
            return "Nothing";
    }
}

public class Oops {
    public static void main(String a[]){
        System.out.println("Snehaaaji");

        // className referenceVariableName = new className() ---- object initialization
        Calculator calc = new Calculator();
        int result = calc.add(4,5);
        System.out.println(result);


        //Computer Class
        Computer comp = new Computer();
        comp.playGames();
        comp.playMusic();
        String res1 = comp.getMeAnImage(5);
        System.out.println(res1);
        
    }
}
