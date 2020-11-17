/*
 * 2020年11月09日18点53分
 * 
 */
import java.util.Arrays;
public class 冒泡排序 {
	public static void main(String[] args) {
		int shuzu[]=new int[]{6,5,4,3,2,1,0};
		int ds;
		
		for(int d=0;d<shuzu.length-1;d++) {
			for (int x=0;x<shuzu.length-1-d;x++) {
				//若shuzu[x]小于shuzu[x+1]则降序，
				
				//若shuzu[x]大于shuzu[x+1]则降序，
				if(shuzu[x]>shuzu[x+1]) {
					ds=shuzu[x];
					shuzu[x]=shuzu[x+1];
					shuzu[x+1]=ds;
				}
			}
		}
		
	
		System.out.print("排序的结果是：");
		     //用arrays类里的方法toString实现把数组进行输出为字符串
			System.out.print(Arrays.toString(shuzu));
		
		
	}
}
