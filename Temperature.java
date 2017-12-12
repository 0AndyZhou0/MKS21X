public class Temperature{
    public static void main(String[] args){
	System.out.println(CtoF(100));
	System.out.println(FtoC(212));
	
    }
    public static double CtoF(double t){
	return t * 9 / 5 + 32;
    }
    public static double FtoC(double t){
	return (t - 32) * 5 / 9;
    }
}
