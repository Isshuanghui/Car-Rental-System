package Carhire01;

import java.util.List;

//工厂类，包含车辆，分发工作
public class Factory {
	//声明一个静态的 MotoVehicle 类型的数组 ves
	static MotoVehicle[] ves = new MotoVehicle[8];
	static
	{
		Car c1 = new Car(Info.CAR_BRAND[0], "京NY28588", 800, "x6");
		Car c2 = new Car(Info.CAR_BRAND[0], "京CNY3284", 600, "i5");
		Car c3 = new Car(Info.CAR_BRAND[1], "京NT37465", 300, "林荫大道");
		Car c4 = new Car(Info.CAR_BRAND[1], "京NT96968", 600, "GL8");
		Bus b1 = new Bus(Info.BUS_BRAND[0], "京6566754", 800, Info.BUS_CountNumber[0]);
		Bus b2 = new Bus(Info.BUS_BRAND[0], "京8696997", 800, Info.BUS_CountNumber[1]);
		Bus b3 = new Bus(Info.BUS_BRAND[1], "京9696996", 1600, Info.BUS_CountNumber[0]);
		Bus b4 = new Bus(Info.BUS_BRAND[1], "京8696998", 1500, Info.BUS_CountNumber[1]);
		ves[0] = c1;
		ves[1] = c2;
		ves[2] = c3;
		ves[3] = c4;
		ves[4] = b1;
		ves[5] = b2;
		ves[6] = b3;
		ves[7] = b4;
	}
	//用户选择租赁类型option后，返回对应类型下一步，即Switch case方法
	public static String getByOption(int option) {
		//创建字符串缓冲区，用来存储品牌类型和字符串
		StringBuffer s = new StringBuffer();
		switch (option) {

		case 1:
			for(int i=0;i<Info.CAR_BRAND.length;i++)
				s.append(i+1+" "+Info.CAR_BRAND[i]+" ");
			s.append("\n请选择你要租赁的汽车品牌编号:");
			break;
		case 2:
			for(int i=0;i<Info.BUS_BRAND.length;i++)
				s.append(i+1+" "+Info.BUS_BRAND[i]+" ");
			s.append("\n请选择你要租聘的客车品牌编号:");
			break;
		}
		//将 StringBuffer 对象 s 转换为字符串并返回。
		return s.toString();
	}
	//根据option和品牌返回类型或者座位数
	public static String getByOption(int option ,int brandId) {
		StringBuffer s = new StringBuffer();
		switch(option) {
		case 1:
			//获取指定品牌（brandId）的所有轿车型号
			List<String> clist=Info.getCarBrandALLType(brandId);
			for(int i=0;i<clist.size();i++)
				s.append(i+1+" "+clist.get(i)+" ");
			s.append("\n请选择你要租赁的汽车型号编号:");
			break;
		case 2:
			for(int i=0;i<Info.BUS_CountNumber.length;i++)
				s.append(i+1+". "+Info.BUS_CountNumber[i]+" ");
			s.append("\n请选择你要租聘的客车座位数编号:");
			break;
		}
		return s.toString();		
		}
	//匹配车辆
	public static MotoVehicle getVehicle(int option,int brandId,int typeId) {
		MotoVehicle v=null;
		if(option==1)
			//根据品牌，型号匹配车辆
			for(int i=0;i<ves.length;i++)
			{
				if(ves[i].getClass() == Car.class) {
				String brand=Info.getCarTypeById(brandId);//还原用户的品牌选择brand
				if(ves[i].getCarBrand().equals(brand)) {
					String type=Info.getCarBrandType(brandId,typeId);//还原用户选择品牌下的类型Type
					Car carobj = (Car)ves[i];//用户型号的选择type与当前车辆匹配type，强制转换到Car类型对象
					if(type.equals(carobj.getType())) {
						v=carobj;//匹配到用户选择的车
						break;
						}		
					}
				}
			}
		if(option==2)
			//根据品牌，座位数匹配车辆
			for(int i=0;i<ves.length;i++) {
				if(ves[i].getClass() == Bus.class){
					String brand=Info.getBusTypeById(brandId);//还原用户的选择品牌brand
				if(ves[i].getCarBrand().equals(brand)) {
					//还原用户选择的座位数
					int seatcount=Info.getBusseatCountId(brandId,typeId);
					Bus busobj=(Bus)ves[i];
					if(seatcount==busobj.getSeatCount()) {
						v=busobj;
						break;
					   }
				   }
					
				}
			}
			return v;	
			
		}
	}

