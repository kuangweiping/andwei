/*
 * 2020年11月10日时间
 * 经典_选择排序
 */
public class 经典_选择排序 {
	public static void main(String[] args) {
		int m[]={8,65,97,92,39,38};
		int a;//a是临时存放的变量不能赋初始值，
		for(int s=0;s<m.length-1;s++) {
			a=s;//每新进一次外循环时，a的值都被s重置。
			for(int b=s+1;b<m.length;b++) {
				if(m[a]>m[b]) {
					a=b;
				}
			}
			//实现的调换模块，
			if(a!=s) {
				int sdd=m[a];
				m[a]=m[s];
				m[s]=sdd;
			}
		}
		
		System.out.print("排序后{ ");
		for(int w:m) {
			System.out.print(w +"  ");
		}
		System.out.print("}");
	}
}
