package express.po;

import java.io.Serializable;
import java.util.ArrayList;

public class RepoInfoPO implements Serializable{
	private String city;
	private int airShelfSize;
	private int trainShelfSize;
	private int truckShelfSize;
	private int flexibleShelfSize;
	private int airSize;
	private int trainSize;
	private int truckSize;
	private int airSum;
	private int trainSum;
	private int truckSum;
	private int height=3;
	private int width=4;
	private ArrayList<RepoPositionPO> repoPosition;
	private int repoSum;
	
	public RepoInfoPO(String city,int airShelfSize,int trainShelfSize,
			int truckShelfSize,int flexibleShelfSize){
		this.city=city;
		this.airShelfSize=airShelfSize;
		this.trainShelfSize=trainShelfSize;
		this.truckShelfSize=truckShelfSize;
		this.flexibleShelfSize=flexibleShelfSize;
		this.airSize=airShelfSize*12;
		this.trainSize=trainShelfSize*12;
		this.truckSize=truckShelfSize*12;
		this.airSum=0;
		this.trainSum=0;
		this.truckSum=0;
		this.repoPosition=new ArrayList<RepoPositionPO>();
		this.repoSum=0;
	}
	public RepoInfoPO(){
		city=null;
		airShelfSize=0;
		trainShelfSize=0;
		truckShelfSize=0;
		flexibleShelfSize=0;
		airSize=0;
		trainSize=0;
		truckSize=0;
		airSum=0;
		trainSum=0;
		truckSum=0;
		repoPosition=new ArrayList<RepoPositionPO>();
		repoSum=0;
	}
	public String getCity(){
		return city;
	}
	public int getAirShelfSize(){
		return airShelfSize;
	}
	public int getTrainShelfSize(){
		return trainShelfSize;
	}
	public int getTruckShelfSize(){
		return truckShelfSize;
	}
	public int getFlexibleShelfSize(){
		return flexibleShelfSize;
	}
	public int getAirSize(){
		return airSize;
	}
	public int getTrainSize(){
		return trainSize;
	}
	public int getTruckSize(){
		return truckSize;
	}
	public int getAirContent(){
		return airSum;
	}
	public int getTrainSum(){
		return trainSum;
	}
	public int getTruckSum(){
		return truckSum;
	}
	public int getHeight(){
		return height;
	}
	public int getWidth(){
		return width;
	}
	public ArrayList<RepoPositionPO> getRepoPosition(){
		return repoPosition;
	}
	public int getRepoSum(){
		return repoSum;
	}
	public void changeRepoSum(int n){
		repoSum+=n;
	}
	public void setAirShelfSize(int size){
		airShelfSize=size;
		airSize=size*12;
	}
	public void setTrainShelfSize(int size){
		trainShelfSize=size;
		trainSize=size*12;
	}
	public void setTruckShelfSize(int size){
		truckShelfSize=size;
		truckSize=size*12;
	}
	public void setFlexibleShelfSize(int size){
		flexibleShelfSize=size;
	}
	
	public void changeAirSum(int n){
		airSum+=n;
	}
	public void changeTrainSum(int n){
		trainSum+=n;
	}
	public void changeTruckSum(int n){
		truckSum+=n;
	}
	public void addRepoPosition(RepoPositionPO position){
		repoPosition.add(position);
	}
	public void deleteRepoPosition(int index){
		repoPosition.remove(index);
	}
	public void deleteRepoPosition(RepoPositionPO position){
		repoPosition.remove(position);
	}
}
