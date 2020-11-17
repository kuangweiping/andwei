/*
 *2020年11月15日22点06分 
 */
import java.util.Scanner;
public class 吃货联盟订餐系统 {
	public static void main(String[] args) {
		boolean vddsgsdz=true;
		Scanner input=new Scanner(System.in);
		//定义六个外层选项（数组），1.我要订餐，2.查看餐单，3.签收订单，4.删除订单，5.我要点赞，6.退出系统
		int fgf=5;
		boolean dffd1=true;
		boolean dffd2=true;
		boolean dffd3=true;
		//菜名编号数组
		int caibian[]= {1,2,3,4,5};
		//菜名数组
		String caimin[]= {"宫保鸡丁","鱼香肉丝","麻婆豆腐","蚂蚁上树","辣子鸡丁"};
		//菜价数组
		int caijai[]= {45,62,54,42,120};
		//配送费
		int peisomg=6;
		//餐袋联系人数组
		int 餐袋数组[]= {1,2,3,4,5};
		//联系人数组
		String 联系人[]=new String[] {"李鸿钧","冯书广","游元沉",""};
		//餐品信息
		int 菜名=-1;
		//送餐时间
		int 日期[]= {11,12,13,14,15,16};
		//送餐地址
		String 地址[]= {"天府三街48号","大邑县政府","武侯区",""};
		//总金额
		int 总金额[]= {51,68,60,48,126};
		//订单状态
		String 状态[]= {"未完成","未完成","未完成",""};
		//每个菜品获菜指数。
		int caipint[] ={5,10,6,8,9};
			do {
				System.out.println("\n吃货联盟订餐系统");
				System.out.println("*************************");
				System.out.println("1.我要订餐");
				System.out.println("2.查看餐单");
				System.out.println("3.签收订单");
				System.out.println("4.删除订单");
				System.out.println("5.我要点赞");
				System.out.println("6.退出系统");
				System.out.println("*************************");
				System.out.print("请输入：");
				int waicen=input.nextInt();
				//点餐选择如果是1，则进入 我要点餐
				if(waicen==1) {
					//点餐循环
					while(waicen<2) {
						System.out.println("*****我要点餐*****");
						System.out.print("序号\t");
						System.out.print("菜名\t\t");
						System.out.print("单价\t\t");
						System.out.print("得到赞数\t\n");
						for(int d=0;d<5;d++) {
							System.out.print(餐袋数组[d]+".\t");
							System.out.print(caimin[d]+"\t\t");
							System.out.print(caijai[d]+"\t\t");
							System.out.println(caipint[d]+"\t\n");
						}
						System.out.println("****************");
						System.out.print("请选择菜品编号：");//用户输入的菜品编号
						int suoxunan=input.nextInt();
						菜名=suoxunan-1;
						System.out.print("请选择"+caibian[suoxunan-1]+"号 "+ caimin[suoxunan-1]+" "+caijai[suoxunan-1]+"元 "+"所点份数:");
						int shul=input.nextInt();
						System.out.print("请输入联系人：");
						String lianxiren=input.next();
						联系人[3]=lianxiren;
						System.out.print("请输入联系电话：");
						long number=input.nextLong();
						System.out.print("请输入地址");
						String dizi=input.next();
						System.out.print("请选择送餐时间（10点至20点之间送餐）");
						int sj=input.nextInt();
						int dsf=1;
						do {
							if(sj<10) {
								System.out.println("请输入10点至20点之间的数");
								System.out.println("请输入从新输入：");
								int bb=input.nextInt();
								sj=bb;
							}else if(sj>20){
								System.out.println("请输入10点至20点之间的数");
								System.out.println("请输入从新输入：");
								int bb=input.nextInt();
								sj=bb;
							}else {
								dsf++;
								dsf++;
								dsf++;
							}
						}while(dsf<2);
						System.out.println("订餐确认");
						System.out.println("您订的餐是:"+caibian[suoxunan-1]+"号"+caimin[suoxunan-1]+shul+"份");
						System.out.println("餐费:"+caijai[suoxunan-1]*shul+"元"+",配送费："+peisomg+"元，合计："+(caijai[suoxunan-1]*shul+peisomg)+"元");
						System.out.println("联系人："+lianxiren+"\n\t联系电话："+number+"\n\t配送地址："+dizi);
						System.out.println("配送时间："+sj+"点\n请确认配送时间是否正确，\n是否重新点餐：是（0）");
						int sifoufanhui=input.nextInt();
						if(sifoufanhui==0) {
							waicen++;
						}
					}
				}//查看餐袋
			    else if(waicen==2) {
			    	while(waicen<3) {
			    		System.out.println("*****查看餐单*****");
						System.out.print("序号\t");
						System.out.print("订餐人\t\t");
						System.out.print("餐品信息\t\t");
						System.out.print("送餐日期\t\t");
						System.out.print("送餐地址\t\t\t");
						System.out.print("总金额\t\t");
						System.out.print("订单状态\t\n");
						if(dffd1==true) {
							System.out.print(餐袋数组[0]+"\t");
							System.out.print(联系人[0]+"\t\t");
							System.out.print(caimin[4]+"\t\t");
							System.out.print(日期[0]+"\t\t");
							System.out.print(地址[0]+"\t\t");
							System.out.print(总金额[4]+"\t\t");
							System.out.print(状态[0]+"\t\n");
						}
						if(dffd2==true) {
							System.out.print(餐袋数组[1]+"\t");
							System.out.print(联系人[1]+"\t\t");
							System.out.print(caimin[3]+"\t\t");
							System.out.print(日期[1]+"\t\t");
							System.out.print(地址[1]+"\t\t\t");
							System.out.print(总金额[3]+"\t\t");
							System.out.print(状态[1]+"\t\n");
						}
						if(菜名>-1) {
							if(dffd3==true) {
								System.out.print(餐袋数组[2]+"\t");
								System.out.print(联系人[3]+"\t\t");
								System.out.print(caimin[菜名]+"\t\t");
								System.out.print(日期[0]+"\t\t");
								System.out.print(地址[0]+"\t\t");
								System.out.print(总金额[4]+"\t\t");
								System.out.print(状态[3]+"\t\n");
							}
						}
						System.out.print("是否返回，是（0）:");
						int sifoufanhui=input.nextInt();
						if(sifoufanhui==0) {
							waicen++;
						}
			    	}
				}//签收订单
			    else if(waicen==3) {
					while(waicen<4) {
						System.out.println("*****签收订单*****");
						System.out.print("序号\t");
						System.out.print("订餐人\t\t");
						System.out.print("餐品信息\t\t");
						System.out.print("送餐日期\t\t");
						System.out.print("送餐地址\t\t\t");
						System.out.print("总金额\t\t");
						System.out.print("订单状态\t\n");
						if(dffd1==true) {
							System.out.print(餐袋数组[0]+"\t");
							System.out.print(联系人[0]+"\t\t");
							System.out.print(caimin[4]+"\t\t");
							System.out.print(日期[0]+"\t\t");
							System.out.print(地址[0]+"\t\t");
							System.out.print(总金额[4]+"\t\t");
							System.out.print(状态[0]+"\t\n");
						}
						if(dffd2==true) {
							System.out.print(餐袋数组[1]+"\t");
							System.out.print(联系人[1]+"\t\t");
							System.out.print(caimin[3]+"\t\t");
							System.out.print(日期[1]+"\t\t");
							System.out.print(地址[1]+"\t\t\t");
							System.out.print(总金额[3]+"\t\t");
							System.out.print(状态[1]+"\t\n");
						}
						if(菜名>-1) {
							if(dffd3==true) {
								System.out.print(餐袋数组[2]+"\t");
								System.out.print(联系人[3]+"\t\t");
								System.out.print(caimin[菜名]+"\t\t");
								System.out.print(日期[0]+"\t\t");
								System.out.print(地址[0]+"\t\t");
								System.out.print(总金额[4]+"\t\t");
								System.out.print(状态[3]+"\t\n");
							}
						}
						System.out.print("请要签收的订单:");
						int qianshou =input.nextInt();
						switch(qianshou) {
						case 1:
							状态[0]="已完成";
							break;
						case 2:
							状态[1]="已完成";
							break;
						case 3:
							状态[3]="已完成";
							break;
						}
						System.out.print("是否返回，是（0）");
						int sifoufanhui=input.nextInt();
						if(sifoufanhui==0) {
							waicen++;
						}
					}
				}else if(waicen==4) {
	                while(waicen<5) {
	                	System.out.println("*****删除订单*****");
						System.out.print("序号\t");
						System.out.print("订餐人\t\t");
						System.out.print("餐品信息\t\t");
						System.out.print("送餐日期\t\t");
						System.out.print("送餐地址\t\t");
						System.out.print("总金额\t\t");
						System.out.print("订单状态\t\n");
						if(dffd1==true) {
							System.out.print(餐袋数组[0]+"\t");
							System.out.print(联系人[0]+"\t\t");
							System.out.print(caimin[4]+"\t\t");
							System.out.print(日期[0]+"\t\t");
							System.out.print(地址[0]+"\t\t");
							System.out.print(总金额[4]+"\t\t");
							System.out.print(状态[0]+"\t\n");
						}
						if(dffd2==true) {
							System.out.print(餐袋数组[1]+"\t");
							System.out.print(联系人[1]+"\t\t");
							System.out.print(caimin[3]+"\t\t");
							System.out.print(日期[1]+"\t\t");
							System.out.print(地址[1]+"\t\t");
							System.out.print(总金额[3]+"\t\t");
							System.out.print(状态[1]+"\t\n");
						}
						if(菜名>-1) {
							if(dffd3==true) {
								System.out.print(餐袋数组[2]+"\t");
								System.out.print(联系人[3]+"\t\t");
								System.out.print(caimin[菜名]+"\t\t");
								System.out.print(日期[0]+"\t\t");
								System.out.print(地址[0]+"\t\t");
								System.out.print(总金额[4]+"\t\t");
								System.out.print(状态[3]+"\t\n");
							}
						}
	                	System.out.println("请选择要删除的订单");
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
	                	System.out.print("是否返回，是（0）");
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
				System.out.println("已退出系统");
			}while(fgf<6);
	}
} 