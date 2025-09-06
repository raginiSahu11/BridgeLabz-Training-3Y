import java.util.Arrays;
public class MatrixOperationsAdvanced {
    public static double[][] randomMatrix(int r,int c){
        double[][] m=new double[r][c];
        for(int i=0;i<r;i++) for(int j=0;j<c;j++) m[i][j]=Math.round(Math.random()*9);
        return m;
    }
    public static double[][] transpose(double[][] a){
        int r=a.length,c=a[0].length; double[][] t=new double[c][r];
        for(int i=0;i<r;i++) for(int j=0;j<c;j++) t[j][i]=a[i][j];
        return t;
    }
    public static double det2(double[][] m){ return m[0][0]*m[1][1] - m[0][1]*m[1][0]; }
    public static double det3(double[][] m){
        return m[0][0]*(m[1][1]*m[2][2]-m[1][2]*m[2][1])
             - m[0][1]*(m[1][0]*m[2][2]-m[1][2]*m[2][0])
             + m[0][2]*(m[1][0]*m[2][1]-m[1][1]*m[2][0]);
    }
    public static double[][] inverse2(double[][] m){
        double d = det2(m); if(Math.abs(d)<1e-9) return null;
        double[][] inv = {{m[1][1]/d, -m[0][1]/d},{-m[1][0]/d, m[0][0]/d}};
        return inv;
    }
    // inverse 3x3 via adjugate / determinant
    public static double[][] inverse3(double[][] m){
        double d = det3(m); if(Math.abs(d)<1e-9) return null;
        double[][] adj = new double[3][3];
        adj[0][0]=  (m[1][1]*m[2][2]-m[1][2]*m[2][1]);
        adj[0][1]= -(m[0][1]*m[2][2]-m[0][2]*m[2][1]);
        adj[0][2]=  (m[0][1]*m[1][2]-m[0][2]*m[1][1]);
        adj[1][0]= -(m[1][0]*m[2][2]-m[1][2]*m[2][0]);
        adj[1][1]=  (m[0][0]*m[2][2]-m[0][2]*m[2][0]);
        adj[1][2]= -(m[0][0]*m[1][2]-m[0][2]*m[1][0]);
        adj[2][0]=  (m[1][0]*m[2][1]-m[1][1]*m[2][0]);
        adj[2][1]= -(m[0][0]*m[2][1]-m[0][1]*m[2][0]);
        adj[2][2]=  (m[0][0]*m[1][1]-m[0][1]*m[1][0]);
        // transpose adj to get adjugate then divide by det
        double[][] inv = new double[3][3];
        for(int i=0;i<3;i++) for(int j=0;j<3;j++) inv[i][j] = adj[j][i]/d;
        return inv;
    }
    public static void print(double[][] m){
        for(double[] r:m){ for(double v:r) System.out.printf("%8.3f",v); System.out.println(); }
    }
    public static void main(String[] args){
        double[][] m2 = {{4,7},{2,6}};
        System.out.println("2x2 matrix:"); print(m2);
        System.out.println("det2="+det2(m2));
        System.out.println("inverse2:"); print(inverse2(m2));

        double[][] m3 = {{1,2,3},{0,1,4},{5,6,0}};
        System.out.println("3x3 matrix:"); print(m3);
        System.out.println("det3="+det3(m3));
        System.out.println("inverse3:"); 
        double[][] inv3 = inverse3(m3);
        if(inv3==null) System.out.println("Singular");
        else print(inv3);
        System.out.println("transpose3:"); print(transpose(m3));
    }
}
