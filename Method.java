//Method OverLoading

class Calci{

    int num;  //instance variable

    public int add(int n1, int n2){ //local variable
        return n1+n2;
    }
    public int add(int n1, int n2, int n3){
        return n1+n2+n3;
    }
    public double add(double n1, int n2){
        return n1+n2;
    }
}
public class Method {
    public static void main(String a[]){
        System.out.println("Hello ji");

        Calci cal = new Calci();

        int res1 = cal.add(5, 7);
        System.out.println(res1);

        int res2 = cal.add(50, 7, 3);
        System.out.println(res2);

        double res3 = cal.add(5153, 7);
        System.out.println(res3);
    }
}
