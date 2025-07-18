package Carhire01;
import java.util.ArrayList;//动态数组操作
import java.util.HashMap;//存储键值对
import java.util.Map;//导入map接口，用于定义映射结构
import java.util.List;//导入list结构，用于定义列表结构
public abstract class Info {
	//静态常量定义，集中管理车辆信息
	public static final String ERROR = "erro";//错误常量标识
	public static final String[] VEHICLE_Type= {"轿车","客车"};//车辆类型数组
	public static final String[] CAR_BRAND= {"宝马","别克"};//轿车品牌数组
	public static final String[] BUS_BRAND= {"金杯","金龙"};//客车品牌数组
	private static Map<String, List<String>> CarTypeMap;//存储汽车品牌与型号的映射关系
	public static final int[] BUS_CountNumber= {16,34};//客车座位数数组
	// 静态初始化块，在类加载时只执行一次
	static {
		CarTypeMap = new HashMap<String,List<String>>();//初始化映射结构
		List<String> list=new ArrayList<String>();
		//为宝马品牌添加型号列表
		list.add("x6");
		list.add("i5");
		CarTypeMap.put(CAR_BRAND[0],list);//CAR_BRAND[0]="宝马"
		List<String> list1=new ArrayList<String>();
		//为别克品牌添加型号
		list1.add("林荫大道");
		list1.add("GL8");
		CarTypeMap.put(CAR_BRAND[1],list1);//CAR_BRAND[1]="别克"
	}
	//1,根据以上去修改ves数组
	//根据轿车品牌id，返回当前品牌下所有型号
	public static List<String> getCarBrandALLType(int brandId){
		String brand=CAR_BRAND[brandId-1];
		List<String> list=CarTypeMap.get(brand);
		return list;
	}
	//根据id返回轿车品牌
	public static String getCarTypeById(int id) {
		return CAR_BRAND[id-1];
	}
	//根据Id返回客车品牌
	public static String getBusTypeById(int id) {
		return BUS_BRAND[id-1];
	}
	
	//根据车牌id和型号id，返回的是根据给定的品牌 ID 和型号 ID 所确定的具体汽车型号名称。
	//id都是从0开始的
	public static String getCarBrandType(int brandId,int typeId) {
		String brand =CAR_BRAND[brandId-1];
		List<String> list=CarTypeMap.get(brand);
		return list.get(typeId-1);	
	}
	//根据品牌Id和座位数Id，返回选择的具体客车类型
	public static int getBusseatCountId(int brandId,int typeId) {
		String brand =BUS_BRAND[brandId-1];
		int seatcount=BUS_CountNumber[typeId-1];
		return  seatcount;
	}

}
