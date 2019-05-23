


public class NumberUtilities {

    public static String getRange(int stop) {
        return getRange(0, stop);
    }

    public static String getRange(int start, int stop) {
        return getRange(start, stop, 1);
    }


    public static String getRange(int start, int stop, int step) {
        String range = "";
        
        for(int i = start; i < stop; i+=step)
            range += Integer.toString(i);
            
        return range;    
    }

    public static String getEvenNumbers(int start, int stop) {
        String range = "";
        
        for(int i = start; i < stop; i++)
            if (i % 2 == 0)
                range += Integer.toString(i);
            
        return range;    
    }


    public static String getOddNumbers(int start, int stop) {
        String range = "";
        
        for(int i = start; i < stop; i++)
            if (i % 2 == 1)
                range += Integer.toString(i);
        return range;
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        String range = "";
        
        for(int i = start; i <= stop; i++)
            range += Integer.toString((int)Math.pow(i,exponent));
            
        return range;    

    }
}
