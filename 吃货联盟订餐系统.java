/*
 *2020��11��15��22��06�� 
 */
import java.util.Scanner;
public class �Ի����˶���ϵͳ {
	public static void main(String[] args) {
		boolean vddsgsdz=true;
		Scanner input=new Scanner(System.in);
		//�����������ѡ����飩��1.��Ҫ���ͣ�2.�鿴�͵���3.ǩ�ն�����4.ɾ��������5.��Ҫ���ޣ�6.�˳�ϵͳ
		int fgf=5;
		boolean dffd1=true;
		boolean dffd2=true;
		boolean dffd3=true;
		//�����������
		int caibian[]= {1,2,3,4,5};
		//��������
		String caimin[]= {"��������","������˿","���Ŷ���","��������","���Ӽ���"};
		//�˼�����
		int caijai[]= {45,62,54,42,120};
		//���ͷ�
		int peisomg=6;
		//�ʹ���ϵ������
		int �ʹ�����[]= {1,2,3,4,5};
		//��ϵ������
		String ��ϵ��[]=new String[] {"����","�����","��Ԫ��",""};
		//��Ʒ��Ϣ
		int ����=-1;
		//�Ͳ�ʱ��
		int ����[]= {11,12,13,14,15,16};
		//�Ͳ͵�ַ
		String ��ַ[]= {"�츮����48��","����������","�����",""};
		//�ܽ��
		int �ܽ��[]= {51,68,60,48,126};
		//����״̬
		String ״̬[]= {"δ���","δ���","δ���",""};
		//ÿ����Ʒ���ָ����
		int caipint[] ={5,10,6,8,9};
			do {
				System.out.println("\n�Ի����˶���ϵͳ");
				System.out.println("*************************");
				System.out.println("1.��Ҫ����");
				System.out.println("2.�鿴�͵�");
				System.out.println("3.ǩ�ն���");
				System.out.println("4.ɾ������");
				System.out.println("5.��Ҫ����");
				System.out.println("6.�˳�ϵͳ");
				System.out.println("*************************");
				System.out.print("�����룺");
				int waicen=input.nextInt();
				//���ѡ�������1������� ��Ҫ���
				if(waicen==1) {
					//���ѭ��
					while(waicen<2) {
						System.out.println("*****��Ҫ���*****");
						System.out.print("���\t");
						System.out.print("����\t\t");
						System.out.print("����\t\t");
						System.out.print("�õ�����\t\n");
						for(int d=0;d<5;d++) {
							System.out.print(�ʹ�����[d]+".\t");
							System.out.print(caimin[d]+"\t\t");
							System.out.print(caijai[d]+"\t\t");
							System.out.println(caipint[d]+"\t\n");
						}
						System.out.println("****************");
						System.out.print("��ѡ���Ʒ��ţ�");//�û�����Ĳ�Ʒ���
						int suoxunan=input.nextInt();
						����=suoxunan-1;
						System.out.print("��ѡ��"+caibian[suoxunan-1]+"�� "+ caimin[suoxunan-1]+" "+caijai[suoxunan-1]+"Ԫ "+"�������:");
						int shul=input.nextInt();
						System.out.print("��������ϵ�ˣ�");
						String lianxiren=input.next();
						��ϵ��[3]=lianxiren;
						System.out.print("��������ϵ�绰��");
						long number=input.nextLong();
						System.out.print("�������ַ");
						String dizi=input.next();
						System.out.print("��ѡ���Ͳ�ʱ�䣨10����20��֮���Ͳͣ�");
						int sj=input.nextInt();
						int dsf=1;
						do {
							if(sj<10) {
								System.out.println("������10����20��֮�����");
								System.out.println("������������룺");
								int bb=input.nextInt();
								sj=bb;
							}else if(sj>20){
								System.out.println("������10����20��֮�����");
								System.out.println("������������룺");
								int bb=input.nextInt();
								sj=bb;
							}else {
								dsf++;
								dsf++;
								dsf++;
							}
						}while(dsf<2);
						System.out.println("����ȷ��");
						System.out.println("�����Ĳ���:"+caibian[suoxunan-1]+"��"+caimin[suoxunan-1]+shul+"��");
						System.out.println("�ͷ�:"+caijai[suoxunan-1]*shul+"Ԫ"+",���ͷѣ�"+peisomg+"Ԫ���ϼƣ�"+(caijai[suoxunan-1]*shul+peisomg)+"Ԫ");
						System.out.println("��ϵ�ˣ�"+lianxiren+"\n\t��ϵ�绰��"+number+"\n\t���͵�ַ��"+dizi);
						System.out.println("����ʱ�䣺"+sj+"��\n��ȷ������ʱ���Ƿ���ȷ��\n�Ƿ����µ�ͣ��ǣ�0��");
						int sifoufanhui=input.nextInt();
						if(sifoufanhui==0) {
							waicen++;
						}
					}
				}//�鿴�ʹ�
			    else if(waicen==2) {
			    	while(waicen<3) {
			    		System.out.println("*****�鿴�͵�*****");
						System.out.print("���\t");
						System.out.print("������\t\t");
						System.out.print("��Ʒ��Ϣ\t\t");
						System.out.print("�Ͳ�����\t\t");
						System.out.print("�Ͳ͵�ַ\t\t\t");
						System.out.print("�ܽ��\t\t");
						System.out.print("����״̬\t\n");
						if(dffd1==true) {
							System.out.print(�ʹ�����[0]+"\t");
							System.out.print(��ϵ��[0]+"\t\t");
							System.out.print(caimin[4]+"\t\t");
							System.out.print(����[0]+"\t\t");
							System.out.print(��ַ[0]+"\t\t");
							System.out.print(�ܽ��[4]+"\t\t");
							System.out.print(״̬[0]+"\t\n");
						}
						if(dffd2==true) {
							System.out.print(�ʹ�����[1]+"\t");
							System.out.print(��ϵ��[1]+"\t\t");
							System.out.print(caimin[3]+"\t\t");
							System.out.print(����[1]+"\t\t");
							System.out.print(��ַ[1]+"\t\t\t");
							System.out.print(�ܽ��[3]+"\t\t");
							System.out.print(״̬[1]+"\t\n");
						}
						if(����>-1) {
							if(dffd3==true) {
								System.out.print(�ʹ�����[2]+"\t");
								System.out.print(��ϵ��[3]+"\t\t");
								System.out.print(caimin[����]+"\t\t");
								System.out.print(����[0]+"\t\t");
								System.out.print(��ַ[0]+"\t\t");
								System.out.print(�ܽ��[4]+"\t\t");
								System.out.print(״̬[3]+"\t\n");
							}
						}
						System.out.print("�Ƿ񷵻أ��ǣ�0��:");
						int sifoufanhui=input.nextInt();
						if(sifoufanhui==0) {
							waicen++;
						}
			    	}
				}//ǩ�ն���
			    else if(waicen==3) {
					while(waicen<4) {
						System.out.println("*****ǩ�ն���*****");
						System.out.print("���\t");
						System.out.print("������\t\t");
						System.out.print("��Ʒ��Ϣ\t\t");
						System.out.print("�Ͳ�����\t\t");
						System.out.print("�Ͳ͵�ַ\t\t\t");
						System.out.print("�ܽ��\t\t");
						System.out.print("����״̬\t\n");
						if(dffd1==true) {
							System.out.print(�ʹ�����[0]+"\t");
							System.out.print(��ϵ��[0]+"\t\t");
							System.out.print(caimin[4]+"\t\t");
							System.out.print(����[0]+"\t\t");
							System.out.print(��ַ[0]+"\t\t");
							System.out.print(�ܽ��[4]+"\t\t");
							System.out.print(״̬[0]+"\t\n");
						}
						if(dffd2==true) {
							System.out.print(�ʹ�����[1]+"\t");
							System.out.print(��ϵ��[1]+"\t\t");
							System.out.print(caimin[3]+"\t\t");
							System.out.print(����[1]+"\t\t");
							System.out.print(��ַ[1]+"\t\t\t");
							System.out.print(�ܽ��[3]+"\t\t");
							System.out.print(״̬[1]+"\t\n");
						}
						if(����>-1) {
							if(dffd3==true) {
								System.out.print(�ʹ�����[2]+"\t");
								System.out.print(��ϵ��[3]+"\t\t");
								System.out.print(caimin[����]+"\t\t");
								System.out.print(����[0]+"\t\t");
								System.out.print(��ַ[0]+"\t\t");
								System.out.print(�ܽ��[4]+"\t\t");
								System.out.print(״̬[3]+"\t\n");
							}
						}
						System.out.print("��Ҫǩ�յĶ���:");
						int qianshou =input.nextInt();
						switch(qianshou) {
						case 1:
							״̬[0]="�����";
							break;
						case 2:
							״̬[1]="�����";
							break;
						case 3:
							״̬[3]="�����";
							break;
						}
						System.out.print("�Ƿ񷵻أ��ǣ�0��");
						int sifoufanhui=input.nextInt();
						if(sifoufanhui==0) {
							waicen++;
						}
					}
				}else if(waicen==4) {
	                while(waicen<5) {
	                	System.out.println("*****ɾ������*****");
						System.out.print("���\t");
						System.out.print("������\t\t");
						System.out.print("��Ʒ��Ϣ\t\t");
						System.out.print("�Ͳ�����\t\t");
						System.out.print("�Ͳ͵�ַ\t\t");
						System.out.print("�ܽ��\t\t");
						System.out.print("����״̬\t\n");
						if(dffd1==true) {
							System.out.print(�ʹ�����[0]+"\t");
							System.out.print(��ϵ��[0]+"\t\t");
							System.out.print(caimin[4]+"\t\t");
							System.out.print(����[0]+"\t\t");
							System.out.print(��ַ[0]+"\t\t");
							System.out.print(�ܽ��[4]+"\t\t");
							System.out.print(״̬[0]+"\t\n");
						}
						if(dffd2==true) {
							System.out.print(�ʹ�����[1]+"\t");
							System.out.print(��ϵ��[1]+"\t\t");
							System.out.print(caimin[3]+"\t\t");
							System.out.print(����[1]+"\t\t");
							System.out.print(��ַ[1]+"\t\t");
							System.out.print(�ܽ��[3]+"\t\t");
							System.out.print(״̬[1]+"\t\n");
						}
						if(����>-1) {
							if(dffd3==true) {
								System.out.print(�ʹ�����[2]+"\t");
								System.out.print(��ϵ��[3]+"\t\t");
								System.out.print(caimin[����]+"\t\t");
								System.out.print(����[0]+"\t\t");
								System.out.print(��ַ[0]+"\t\t");
								System.out.print(�ܽ��[4]+"\t\t");
								System.out.print(״̬[3]+"\t\n");
							}
						}
	                	System.out.println("��ѡ��Ҫɾ���Ķ���");
	                	int sfsfsgsg=input.nextInt();
	                	switch(sfsfsgsg) {
						case 1:
							dffd1=false;
							break;
						case 2:
							dffd2=false;
							break;
						case 3:
							dffd3=false;
							break;
						}
	                	System.out.print("�Ƿ񷵻أ��ǣ�0��");
						int sifoufanhui=input.nextInt();
						if(sifoufanhui==0) {
							waicen++;
						}
					}
				}else if(waicen==5) {
	                while(waicen<6) {
						int sifoufanhui=input.nextInt();
						if(sifoufanhui==0) {
							waicen++;
						}
					}
				}else if(waicen==6) {
	               fgf++;
				}
				System.out.println("���˳�ϵͳ");
			}while(fgf<6);
	}
} 