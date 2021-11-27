public class Problem159 {
    public static void main(String[] args) {
        long product = 1L;
        for(int i=100; i<1000; i++){
            if (i%3==1 && i%4==2){
                product=product*i
        }
}
        System.out.println(product);
    }
    
}
