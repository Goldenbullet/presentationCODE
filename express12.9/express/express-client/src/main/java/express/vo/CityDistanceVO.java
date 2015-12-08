package express.vo;

public class CityDistanceVO {
	private String city1;
	private String city2;
	private double distance;
	private String distanceID;
	
	public CityDistanceVO(String city1,String city2,double distance,String distanceID){
		this.city1 = city1;
		this.city2 = city2;
		this.distance = distance;
		this.distanceID=distanceID;
	}
	
	public String getCity1(){
		return city1;
	}
	
	public boolean setCity1(String city1){
		this.city1 = city1;
		return false;
	}
	
	public String getCity2(){
		return city2;
	}
	
	public boolean setCity2(String city2){
		this.city2 = city2;
		return false;
	}
	
	public double getDistance(){
		return distance;
	}
	
	public boolean setDistance(double distance){
		this.distance = distance;
		return false;
	}
	public String getID(){
		return distanceID;
	}
	public void setID(String id){
		distanceID=id;
	}
}
