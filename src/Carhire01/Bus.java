package Carhire01;

public class Bus extends MotoVehicle{
	private int seatCount;
	public Bus(String carBrand, String carNumber, int dayRent, int setCount) {
		super(carBrand,carNumber,dayRent);
		this.seatCount=setCount;
	}
	
	public int getSeatCount() {
		return seatCount;
	}

	public void setSeatCount(int setCount) {
		this.seatCount = setCount;
	}

	@Override
	public float calRent(int days) {
		
		float rent=0;
		if(seatCount<=16)
		{
			if(days<3 && days>=1)
				rent=(float)(getDayRent()*days);
			if(days>=3)
				rent=(float) (getDayRent()*days*0.9);
			if(days>=7)
				rent=(float) (getDayRent()*days*0.8);
			if(days>=30)
				rent=(float) (getDayRent()*days*0.7);
			if(days>=150)
				rent=(float) (getDayRent()*days*0.6);
		}
		if(seatCount>16)
		{
			if(days<3 && days>=1)
				rent=(float)(getDayRent()*days);
			if(days>=3)
				rent=(float) (getDayRent()*days*0.9);
			if(days>=7)
				rent=(float) (getDayRent()*days*0.8);
			if(days>=30)
				rent=(float) (getDayRent()*days*0.7);
			if(days>=150)
				rent=(float) (getDayRent()*days*0.6);
		}
		return rent;
	}
}
