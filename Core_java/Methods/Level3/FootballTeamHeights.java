import java.util.Random;
public class FootballTeamHeights {
    public static int[] generateHeights(int n){
        Random r = new Random();
        int[] h = new int[n];
        for(int i=0;i<n;i++) h[i]=150 + r.nextInt(101); //150..250
        return h;
    }
    public static int sum(int[] a){ int s=0; for(int v:a) s+=v; return s; }
    public static double mean(int[] a){ return (double)sum(a)/a.length; }
    public static int min(int[] a){ int m=a[0]; for(int v:a) if(v<m) m=v; return m;}
    public static int max(int[] a){ int M=a[0]; for(int v:a) if(v>M) M=v; return M;}
    public static void main(String[] args){
        int[] heights = generateHeights(11);
        System.out.print("Heights: ");
        for(int v:heights) System.out.print(v+" ");
        System.out.println("\nShortest: "+min(heights));
        System.out.println("Tallest:  "+max(heights));
        System.out.printf("Mean: %.2f\n", mean(heights));
    }
}
