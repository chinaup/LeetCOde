package Array.Easy;
/*
����һ��������һЩ 0 �� 1�ķǿն�ά���� grid , һ�� ���� �����ĸ����� (ˮƽ��ֱ) �� 1 (��������) ���ɵ���ϡ�����Լ����ά������ĸ���Ե����ˮ��Χ�š�
�ҵ������Ķ�ά���������ĵ��������(���û�е��죬�򷵻����Ϊ0��)

ʾ�� 1:
[[0,0,1,0,0,0,0,1,0,0,0,0,0],
 [0,0,0,0,0,0,0,1,1,1,0,0,0],
 [0,1,1,0,1,0,0,0,0,0,0,0,0],
 [0,1,0,0,1,1,0,0,1,0,1,0,0],
 [0,1,0,0,1,1,0,0,1,1,1,0,0],
 [0,0,0,0,0,0,0,0,0,0,1,0,0],
 [0,0,0,0,0,0,0,1,1,1,0,0,0],
 [0,0,0,0,0,0,0,1,1,0,0,0,0]]
�������������������Ӧ���� 6��ע��𰸲�Ӧ����11����Ϊ����ֻ�ܰ���ˮƽ��ֱ���ĸ�����ġ�1����

ʾ�� 2:
[[0,0,0,0,0,0,0,0]]
����������������ľ���, ���� 0��

ע��: �����ľ���grid �ĳ��ȺͿ�ȶ������� 50��
 */
public class MaxAreaOfIsland_695 {

	public static int maxareaofisland(int[][] grid){
		int max = 0;
		int[] a = new int[grid.length];
		for (int i = 0; i < grid.length; i++) 
			a[i] = grid[i].length;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < a[i]; j++) {
				if(grid[i][j]==1)
					max = Math.max(max,dfs(grid,i,j));
			}
		}
		return max;
	}
	/*ʹ�õݹ鷽��*/
	public static int dfs(int[][] grid, int i, int j) {
		// TODO Auto-generated method stub
		if(i<0||i>=grid.length||j<0||j>=grid[i].length)
			return 0;
		if(grid[i][j]==1){
			grid[i][j]=0;
			return 1+dfs(grid,i,j-1)+dfs(grid,i,j+1)+dfs(grid,i-1,j)+dfs(grid,i+1,j);
		}
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] grid = {{0,0,1,0,0,0,0,1,0,0,0,0,0},
		                {0,0,0,0,0,0,0,1,1,1,0,0,0},
		                {0,1,1,0,1,0,0,0,0,0,0,0,0},
		                {0,1,0,0,1,1,0,0,1,0,1,0,0},
		                {0,1,0,0,1,1,0,0,1,1,1,1,0},
		                {0,0,0,0,0,0,0,0,0,0,1,0,0},
		                {0,0,0,0,0,0,0,1,1,1,0,0,0},
		                {0,0,0,0,0,0,0,1,1,0,0,0,0}};
		
		System.out.println(maxareaofisland(grid));
	}

}
