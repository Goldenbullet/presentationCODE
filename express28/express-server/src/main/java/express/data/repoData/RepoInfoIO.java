package express.data.repoData;

import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import express.data.IOHelper.IOHelper;
import express.dataService.repoDataService.RepoDataService;
import express.po.RepoInfoPO;
import express.po.RepoPositionPO;

public class RepoInfoIO extends UnicastRemoteObject implements RepoDataService{

	String filename="SerializableData/RepoInfo.ser";
	ArrayList<RepoInfoPO> repoList;
	
	public  RepoInfoIO() throws RemoteException {
		super();
		IOHelper io=new IOHelper();
		repoList=new ArrayList<RepoInfoPO>();
		try {
			repoList=(ArrayList<RepoInfoPO>)io.readFromDisk(filename);
		} catch (ClassNotFoundException e) {
			
		} catch (IOException e) {
			
		}
	}

	@Override
	public boolean addRepo(RepoInfoPO repo) throws RemoteException {
		repoList.add(repo);
		return true;
	}

	@Override
	public boolean deleteRepo(int index) throws RemoteException {
		if(index>=0&&index<repoList.size()){
			repoList.remove(index);
			return true;
		}
		else
			return false;
	}

	@Override
	public RepoInfoPO getRepo(String city) throws RemoteException {
		if(repoList.size()>0){
			for(RepoInfoPO repo:repoList)
				if(repo.getCity().equals(city))
					return repo;
		}
		return null;
	}

	@Override
	public boolean deleteBlock(String city, RepoPositionPO position)
			throws RemoteException {
		if(repoList.size()>0){
			for(RepoInfoPO repo:repoList)
				if(repo.getCity().equals(city)){
					repo.deleteRepoPosition(position);
					return true;
				}
		}
		return false;
	}

	@Override
	public boolean deleteBlock(String city, int index) throws RemoteException {
		if(repoList.size()>0){
			for(RepoInfoPO repo:repoList)
				if(repo.getCity().equals(city)){
					repo.deleteRepoPosition(index);
					return true;
				}
		}
		return false;
	}

	@Override
	public boolean addBlock(String city,RepoPositionPO position) throws RemoteException {
		if(repoList.size()>0){
			for(RepoInfoPO repo:repoList)
				if(repo.getCity().equals(city)){
					repo.addRepoPosition(position);
					return true;
				}
		}
		return false;
	}

	@Override
	public ArrayList<RepoInfoPO> getAllRepo() throws RemoteException {
		if(repoList.size()>0)
			return repoList;
		else
			return null;
	}

	@Override
	public boolean writeAllRepo() throws RemoteException {
		IOHelper io=new IOHelper();
		try {
			io.writeToDisk(filename, repoList);
			return true;
		} catch (IOException e) {
			
			return false;
		}
	}

}
