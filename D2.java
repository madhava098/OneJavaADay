//Print 1 to 10 Without using Loops//
public class D2{
    public static void Number(int no){
        while(no<=10){
            System.out.println(" "+no);
            no++;
            Number(no);
        }
    }
    public static void main(String[] args){
        Number(1);
    }
}