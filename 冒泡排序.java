/*
 * 2020��11��09��18��53��
 * 
 */
import java.util.Arrays;
public class ð������ {
	public static void main(String[] args) {
		int shuzu[]=new int[]{6,5,4,3,2,1,0};
		int ds;
		
		for(int d=0;d<shuzu.length-1;d++) {
			for (int x=0;x<shuzu.length-1-d;x++) {
				//��shuzu[x]С��shuzu[x+1]����
				
				//��shuzu[x]����shuzu[x+1]����
				if(shuzu[x]>shuzu[x+1]) {
					ds=shuzu[x];
					shuzu[x]=shuzu[x+1];
					shuzu[x+1]=ds;
				}
			}
		}
		
	
		System.out.print("����Ľ���ǣ�");
		     //��arrays����ķ���toStringʵ�ְ�����������Ϊ�ַ���
			System.out.print(Arrays.toString(shuzu));
		
		
	}
}
