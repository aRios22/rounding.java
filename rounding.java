public class RoundingAlgorithm{

     public static void main(String []args){
        //example
        long val = 22250;
        double valDouble = (double)val;
        //10 to round tens
        //100 to round hundres
        //It keeps going
        val /= 100;
        val = Math.round(val);
        val *= 100;
        System.out.print((long)val);
        
     }
}
