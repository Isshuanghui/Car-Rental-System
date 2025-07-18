package Carhire01;

//定义抽象类
public abstract class MotoVehicle {
	private String CarBrand;//品牌
	private String CarNumber;//车牌号
	private int DayRent;//日租金
	//计算租金的抽象方法，不能有对象，仅供调用使用
	public  abstract float calRent(int days);
	//构造方法，初始化对象
	public MotoVehicle(String carBrand, String carNumber, int dayRent) {
		super();
		this.CarBrand = carBrand;
		this.CarNumber = carNumber;
		this.DayRent = dayRent;
	}
	public String getCarBrand() {
		return CarBrand;
	}
	public void setCarBrand(String carBrand) {
		CarBrand = carBrand;
	}
	public String getCarNumber() {
		return CarNumber;
	}
	public void setCarNumber(String carNumber) {
		CarNumber = carNumber;
	}
	public int getDayRent() {
		return DayRent;
	}
	public void setDayRent(int dayRent) {
		DayRent = dayRent;
	}
	
}
