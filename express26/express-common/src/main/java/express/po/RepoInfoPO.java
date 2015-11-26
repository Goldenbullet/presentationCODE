package express.po;

import java.io.Serializable;
import java.util.ArrayList;

public class RepoInfoPO implements Serializable{
	private String city;
	private ArrayList<RepoPositionPO> repoPosition;
	private int repoSum;
	private int outSum;
	private int inSum;
	
	public RepoInfoPO(String city,ArrayList<RepoPositionPO> repoPosition,
			int repoSum,int outSum,int inSum){
		this.city=city;
		this.repoPosition=repoPosition;
		this.repoSum=repoSum;
		this.outSum=outSum;
		this.inSum=inSum;
	}
	public String getCity(){
		return city;
	}
	public ArrayList<RepoPositionPO> getRepoPosition(){
		return repoPosition;
	}
	public int getRepoSum(){
		return repoSum;
	}
	public void setRepoSum(int n){
		repoSum+=n;
	}
	public int getOutSum(){
		return outSum;
	}
	public void setOutSum(int n){
		outSum+=n;
	}
	public int getInSum(){
		return inSum;
	}
	public void setInSum(int n){
		inSum+=n;
	}
}
