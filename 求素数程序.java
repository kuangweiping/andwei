/*
 * 2020年11月2日22点22分
 * 求1到100之间的所有素数
 * 需求：输出质数（素数）每四个换一行。如果v除4余不是零，则输出不会换行，否则如果v除4余是零，则输出换行（即当v=4时，v除4将会余零。）。
 */
public class 求素数程序 
{
	public static void main(String[] args) 
	{
		int j=2;
		int i=2;
		int dd=100;
		int v=1;
		for(i=2;i<=dd;++i) 
		{
			for(j=2;j<i;++j) 
			{
				if(0==i%j) 
				{
					break;
				} 
			}
			if(j==2) {
				continue;
			}
			if(j==i) 
			{
				//如果v除4余不是零，则输出不会换行，
			  if(v%4!=0) 
			  {
					System.out.print(i+" ");
					v++;//且v++
					//否则如果v除4余是零，则输出换行（即当v=4时，v除4将会余零。）。
			  }else if(v%4==0) 
			  {
					System.out.println(i+" ");
					v++;
			  }
			}
		}
	}
}
/*
输出结果：
3 5 7 11 
13 17 19 23 
29 31 37 41 
43 47 53 59 
61 67 71 73 
79 83 89 97 
 */ 
