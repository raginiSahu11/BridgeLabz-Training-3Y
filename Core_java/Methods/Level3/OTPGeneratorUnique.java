import java.util.*;
public class OTPGeneratorUnique {
    public static String generateOTP(){
        int otp = (int)(Math.random()*900000) + 100000; //100000..999999
        return String.valueOf(otp);
    }
    public static boolean allUnique(String[] arr){
        Set<String> s=new HashSet<>();
        for(String x:arr) if(!s.add(x)) return false;
        return true;
    }
    public static void main(String[] args){
        String[] otps = new String[10];
        for(int i=0;i<10;i++) otps[i]=generateOTP();
        System.out.println("Generated OTPs: "+Arrays.toString(otps));
        System.out.println("All unique? "+allUnique(otps));
    }
}
