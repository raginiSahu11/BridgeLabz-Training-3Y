import java.util.Random;
public class MatrixOperationsBasic {
    public static int[][] randomMatrix(int r,int c){
        Random R=new Random();
        int[][] m=new int[r][c];
        for(int i=0;i<r;i++) for(int j=0;j<c;j++) m[i][j]=R.nextInt(10);
        return m;
    }
    public static int[][] add(int[][] a,int[][] b){
        int r=a.length,c=a[0].length; int[][] res=new int[r][c];
        for(int i=0;i<r;i++) for(int j=0;j<c;j++) res[i][j]=a[i][j]+b[i][j];
        return res;
    }
    public static int[][] subtract(int[][] a,int[][] b){
        int r=a.length,c=a[0].length; int[][] res=new int[r][c];
        for(int i=0;i<r;i++) for(int j=0;j<c;j++) res[i][j]=a[i][j]-b[i][j];
        return res;
    }
    public static int[][] multiply(int[][] a,int[][] b){
        int r=a.length, c=b[0].length, mid=a[0].length; int[][] res=new int[r][c];
        for(int i=0;i<r;i++) for(int j=0;j<c;j++) for(int k=0;k<mid;k++) res[i][j]+=a[i][k]*b[k][j];
        return res;
    }
    public static void print(int[][] m){
        for(int[] row:m){ for(int v:row) System.out.print(v+" "); System.out.println(); }
    }
    public static void main(String[] args){
        int[][] A = randomMatrix(2,3);
        int[][] B = randomMatrix(2,3);
        System.out.println("A:"); print(A);
        System.out.println("B:"); print(B);
        System.out.println("A+B:"); print(add(A,B));
        System.out.println("A-B:"); print(subtract(A,B));
        int[][] C = randomMatrix(3,2);
        System.out.println("A (2x3) * C (3x2):"); print(multiply(A,C));
    }
}
