import java.util.Arrays;
import java.util.Scanner;

/*
 * 2020��11��15��19��11��
 * ���ֲ���ʵ�顣 
 * do.while�Ƕ��ֲ��ҵĺ���
 */
public class ���ֲ��� {
	public static void main(String[] args) {
		int sd[]= {1,2,3,4,5,6,7,8,9};
		Arrays.sort(sd);//��������
		System.out.println("������Ҫ���ҵ�ֵ");
		Scanner input=new Scanner(System.in);
		int ds=input.nextInt();//Ҫ���ҵ�ֵ
		int bb=sd.length-sd.length;//���鿪ʼ��λ��0
		int ee=sd.length-1;//��ֵ������λ������ĳ��ȼ�һ����һ��Ϊ�˷�ֹ�±�Խ�硣
		int mds;//���ڴ�������м��λ��
		boolean dg=false;
		do {
			mds=(bb+ee)/2;
			//����м��ֵ����Ҫ���ҵ�ֵ���򷵻��ҵ���ʾ���ҷ����±�
			if(sd[mds]==ds) {
				System.out.println("��ϲ���ҵ��ˣ��±���:"+mds);
				dg=true;//����Ƿ��ҵ�
				break;//������������ѭ��
				
			}else if(sd[mds]>ds) {
				//���� �������ֵds���м�ֵsd[mds]С
				//��mds+1Ϊ�µĶ԰������㣬Ҳ����Ҫ��ֵ��ee,�ٽ��ж԰���ң�
				ee=mds-1;
			}else if(sd[mds]<ds){
				//���� ������ҵ�ֵ���м�ֵ��
				//��mds��1Ϊ�µĶ԰�����յ㣬Ҳ����Ҫ��ֵ��bb,�ٽ��ж԰���ң�
				bb=mds+1;
			}
			//ֻҪ��ʼ��ֵbbС�ڵ��ڽ���ֵee����ѭ�����ֲ���
		}while(bb<=ee);
		
		if(dg!=true) {
			System.out.println("��Ǹ��û����Ҫ�ҵ���");
		}
	}
}
