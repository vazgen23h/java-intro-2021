class MathClassTest{
    public static void main(String[] args){
        MathClass obj=new MathClass();
        System.out.println(MathClass.sum(1,6));
        System.out.println(MathClass.min(1,6));
        System.out.println(MathClass.max(6,1));
        System.out.println(MathClass.absolute(5));
    }
}


public class MathClass {


   static int sum(int a, int b){
       return a+b;
   }
   static int min(int a,int b){
       if(a>b){
           return b;
       }else{
           return a;
       }
   }
   static int max(int a,int b){
       if(a>b){
           return a;
       }else{
           return b;
       }
   }
   static int absolute(int a){
       if(a>=0) {
           return a;
       }else{
           return -a;
       }
   }
}