package express.dataService.repoDataService;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import express.po.RepoInfoPO;
import express.po.RepoPositionPO;

public interface RepoDataService extends Remote{
	
	public boolean deleteBlock(String city,RepoPositionPO position) throws RemoteException;
	
	public boolean deleteBlock(String city,int index) throws RemoteException;
	
	public boolean addBlock(String city,RepoPositionPO position) throws RemoteException;
	
	public boolean addRepo(RepoInfoPO repo) throws RemoteException;
	
	public boolean deleteRepo(int index) throws RemoteException;
	
	public RepoInfoPO getRepo(String city) throws RemoteException;
	
	public ArrayList<RepoInfoPO> getAllRepo() throws RemoteException;
	
	public boolean writeAllRepo() throws RemoteException;
}
