package express.po;

import java.io.Serializable;

public class RepoPositionPO implements Serializable{
	private String block;
	private int row;
	private int shelf;
	private int position;
	private boolean isUsed;
	
	public RepoPositionPO(String b,int r,int s,int p,boolean isUsed){
		this.block=b;
		this.row=r;
		this.shelf=s;
		this.isUsed=isUsed;
	}
	public String getblock(){
		return block;
	}
	
	public int getrow(){
		return row;
	}
	
	public int getshelf(){
		return shelf;
	}

	public int getposition(){
		return position;
	}
	
	public boolean getIsUsed(){
		return isUsed;
	}
	
	public void setIsUsed(boolean b){
		this.isUsed=b;
	}
}