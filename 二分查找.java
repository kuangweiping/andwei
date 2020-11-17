import java.util.Arrays;
import java.util.Scanner;

/*
 * 2020年11月15日19点11分
 * 二分查找实验。 
 * do.while是二分查找的核心
 */
public class 二分查找 {
	public static void main(String[] args) {
		int sd[]= {1,2,3,4,5,6,7,8,9};
		Arrays.sort(sd);//排序数组
		System.out.println("请输入要查找的值");
		Scanner input=new Scanner(System.in);
		int ds=input.nextInt();//要查找的值
		int bb=sd.length-sd.length;//数组开始的位置0
		int ee=sd.length-1;//数值结束的位置数组的长度减一，减一是为了防止下标越界。
		int mds;//用于存放数组中间的位置
		boolean dg=false;
		do {
			mds=(bb+ee)/2;
			//如果中间的值等于要查找的值，则返回找到提示，且返回下标
			if(sd[mds]==ds) {
				System.out.println("恭喜你找到了，下标是:"+mds);
				dg=true;//标记是否找到
				break;//条件成立跳出循环
				
			}else if(sd[mds]>ds) {
				//否则 如果查找值ds比中间值sd[mds]小
				//则mds+1为新的对半查找起点，也就是要赋值给ee,再进行对半查找，
				ee=mds-1;
			}else if(sd[mds]<ds){
				//否则 如果查找的值比中间值大
				//则mds—1为新的对半查找终点，也就是要赋值给bb,再进行对半查找，
				bb=mds+1;
			}
			//只要开始的值bb小于等于结束值ee，就循环二分查找
		}while(bb<=ee);
		
		if(dg!=true) {
			System.out.println("抱歉，没有你要找的数");
		}
	}
}
