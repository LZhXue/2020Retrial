import java.util.Scanner;

public class A_1147 {
	/*
	 * 题目描述 
	 * 给定两个整型数组，数组a有n个元素，数组b有m个元素，1<=m<=n<100,请检验数组b是否是数组a的子数组。
	 * 若从数组a的某个元素a[i]开始，有b[0]=a[i],b[1]=a[i+1] ,......，b[m]=a[i+m]，则称数组b是数组a的子数组。
	 * 
	 * 输入 
	 * 输入第一行为两个整数n和m；第二行为数组a的n个整数；第三行为数组b的m个整数，各数据之间用空格隔开。
	 * 
	 * 输出 
	 * 输出占一行。若b是a的子数组，则输出子数组所在位置i，注意下标从0开始；否则输出“No Answer”。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		scan.nextLine();
		int a[] = new int[n];
		int b[] = new int[m];
		for(int i = 0;i<n;i++) {
			a[i] = scan.nextInt();
		}
		scan.nextLine();
		for(int i = 0;i<m;i++) {
			b[i] = scan.nextInt();
		}
		boolean flag = false;
		for(int i = 0;i<n;i++) {
			if(a[i]==b[0]) {
				for(int j = 0;j<m;j++) {
					if(a[i+j]!=b[j]) {
						break;
					}
					if(a[i+j]==b[j]&&j==m-1) {
						flag = true;
					}
				}
			}
			if(flag) {
				System.out.println(i);
				break;
			}
		}
		if(!flag) {
			System.out.println("No Answer");
		}
	}

}
