/*
 * 2020��11��10��ʱ��
 * ����_ѡ������
 */
public class ����_ѡ������ {
	public static void main(String[] args) {
		int m[]={8,65,97,92,39,38};
		int a;//a����ʱ��ŵı������ܸ���ʼֵ��
		for(int s=0;s<m.length-1;s++) {
			a=s;//ÿ�½�һ����ѭ��ʱ��a��ֵ����s���á�
			for(int b=s+1;b<m.length;b++) {
				if(m[a]>m[b]) {
					a=b;
				}
			}
			//ʵ�ֵĵ���ģ�飬
			if(a!=s) {
				int sdd=m[a];
				m[a]=m[s];
				m[s]=sdd;
			}
		}
		
		System.out.print("�����{ ");
		for(int w:m) {
			System.out.print(w +"  ");
		}
		System.out.print("}");
	}
}
