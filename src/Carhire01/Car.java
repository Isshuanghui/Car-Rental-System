package Carhire01;

public class Car extends MotoVehicle{  //继承自抽象类MotoVehicle
	//私有属性，存储车型（宝马x6，别克GL8）
	private String type;
	//构造方法，对对象进行初始化
	public Car(String carBrand, String carNumber, int dayRent,String type) {
		super(carBrand, carNumber, dayRent);//通过super初始化继承的父类属性（调用父类构造函数初始化品牌，车牌号，日租金）
		this.type=type;
	}
	//提供对type属性的安全读取
	public String getType() {
		return type;
	}
	//允许修改车型信息
	public void setType(String type) {
		this.type = type;
	}
	//租金计算方法
	@Override
	public float calRent(int days){
		float rent = 0;
		if(days>=1 && days<7)
			rent=(float) (getDayRent()*days);
		if(days>7)
			rent=(float) (getDayRent()*days*0.9);
		if(days>30)
			rent=(float) (getDayRent()*days*0.8);
		if(days>150)
			rent=(float) (getDayRent()*days*0.7);
		return rent;
	}
}
