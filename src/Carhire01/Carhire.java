package Carhire01;
import java.util.List;
import java.util.Scanner;//导入 java.util 包中的 Scanner 类，用于从控制台读取用户输入。
public class Carhire {
	//主方法，程序入口
	public static void main(String args[]) {
		MotoVehicle v = null;
		System.out.println("-----------欢迎-----------");
		//输出车辆类型
		for(int i=0;i<Info.VEHICLE_Type.length;i++)
			System.out.print(i+1+" "+Info.VEHICLE_Type[i]+" ");
		System.out.println("\n请选择你要租聘的汽车类型:");
		Scanner sc = new Scanner(System.in);
		//扫描对应需要的汽车类型
		int option = sc.nextInt();
		//根据汽车类型给出所有品牌
		System.out.println(Factory.getByOption(option));
		int brandId=sc.nextInt();
		//根据品牌给出所有类型
		System.out.println(Factory.getByOption(option,brandId));
		int typeId=sc.nextInt();
		//根据类型给出具体车辆,才能计算总租金
		v=Factory.getVehicle(option,brandId,typeId);
		//输入要租的天数
		System.out.print("请输入你要租赁的天数:");
		int days=sc.nextInt();
		//给出车库给分配的具体车辆
		String CarNumber=v.getCarNumber();
		System.out.println("你匹配的车辆为:"+CarNumber);
		System.out.println("总租金："+v.calRent(days)+"元");
		
	}	
		
}