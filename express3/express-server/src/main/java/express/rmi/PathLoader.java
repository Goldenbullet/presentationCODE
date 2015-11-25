package express.rmi;

public class PathLoader {

	String path="a/b";
	
	public PathLoader(){
		this.getClass().getClassLoader().getResource("/").getPath().toString();
	}
	
	public String getPath(){
		int index=path.lastIndexOf('/');
		return path.substring(0, index);
	}
	
	public static void main(String[] args){
		PathLoader p=new PathLoader();
		System.out.println(p.getPath());
	}
}
