package express.po;

import java.io.Serializable;

public class DocumentPO implements Serializable{
	public boolean state;//false��δ����״̬,true��������״̬
	
	public boolean getState(){
		return state;
	}
	
	public boolean setState(boolean state){
		this.state = state;
		return false;
	}
}
