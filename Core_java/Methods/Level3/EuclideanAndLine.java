public class EuclideanAndLine {
    public static double distance(double x1,double y1,double x2,double y2){
        return Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
    }
    public static double[] slopeIntercept(double x1,double y1,double x2,double y2){
        double m = (x2==x1) ? Double.POSITIVE_INFINITY : (y2-y1)/(x2-x1);
        double b = (m==Double.POSITIVE_INFINITY) ? Double.NaN : y1 - m*x1;
        return new double[]{m,b};
    }
    public static void main(String[] args){
        double x1=1,y1=2,x2=4,y2=6;
        System.out.println("Distance: "+distance(x1,y1,x2,y2));
        double[] mb = slopeIntercept(x1,y1,x2,y2);
        System.out.println("slope m="+mb[0]+" intercept b="+mb[1]);
    }
}
