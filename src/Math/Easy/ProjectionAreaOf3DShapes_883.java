package Math.Easy;

public class ProjectionAreaOf3DShapes_883 {

    public static void main(String[] args){

        int[][] grid = {{1,0},{0,2}};
        System.out.println(projectionArea(grid));
    }
    public static int projectionArea(int[][] grid) {

        int s1 = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]!=0)
                    s1++;
            }
        }

        int s2 = 0;
        for(int i=0;i<grid.length;i++){
            int max = Integer.MIN_VALUE;
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]>max)
                    max=grid[i][j];
            }
            s2=s2+max;
        }

        int s3 = 0;
        for(int j=0;j<grid[0].length;j++){
            int max=Integer.MIN_VALUE;
            for(int i=0;i<grid.length;i++){
                if(grid[i][j]>max)
                    max=grid[i][j];
            }
            s3=s3+max;
        }

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        return s1+s2+s3;
    }
}
