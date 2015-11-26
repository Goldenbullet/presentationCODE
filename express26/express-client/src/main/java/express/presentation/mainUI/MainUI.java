package express.presentation.mainUI;

import java.awt.CardLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;

import express.presentation.adminUI.AdminStartUI;
import express.presentation.businessSaleUI.businessMenuUI;
import express.presentation.businessSaleUI.businessShipmentUI;
import express.presentation.deliverUI.deliverMenuUI;
import express.presentation.deliverUI.deliverOrderUI;
import express.presentation.deliverUI.deliverReceiveUI;
import express.presentation.managerUI.managerExamDocUI;
import express.presentation.managerUI.managerLogUI;
import express.presentation.managerUI.managerMemberUI;
import express.presentation.managerUI.managerMenuUI;
import express.presentation.managerUI.managerOrgUI;
import express.presentation.managerUI.managerStatisticUI;
import express.presentation.transRepoUI.AdjustUI;
import express.presentation.transRepoUI.InUI;
import express.presentation.transRepoUI.InventoryUI;
import express.presentation.transRepoUI.OutUI;
import express.presentation.transRepoUI.TranscenterRepoMenuUI;
import express.presentation.transRepoUI.ViewUI;
import express.presentation.transSaleUI.transSaleArrivalDocUI;
import express.presentation.transSaleUI.transSaleMenuUI;
import express.presentation.transSaleUI.transSaleShipmentDocUI;
import express.presentation.transSaleUI.transSaleTransferDocUI;
import express.presentation.userUI.SignInUI;

public class MainUI implements MainUIService {

	private CardLayout card;
	private JPanel pane;
	
	public MainUI(CardLayout card,JPanel pane){
		this.pane = pane;
		this.card = card;
	}
	
	public boolean jumpToSignInUI() {
		// TODO Auto-generated method stub
		SignInUI signin = new SignInUI(this);
		pane.add("signin",signin);
		card.show(pane, "signin");
		return true;
	}

	public boolean jumpToadminStartUI(){
		AdminStartUI adminStartPanel = new AdminStartUI(this);
		pane.add("adminStartPanel",adminStartPanel);
		card.show(pane, "adminStartPanel");
		return true;
	}
	
	public boolean jumpToadminAddUI (){
		return true;
	}
	
	public boolean jumpTomanagerMenuUI(){
		managerMenuUI manmenu = new managerMenuUI(this);
		pane.add("manmenu",manmenu);
		card.show(pane, "manmenu");
		return true;
	}
	
	public boolean jumpTomanagerLogUI(CardLayout card1,JPanel pane1) {
	
		managerLogUI manlog = new managerLogUI(this);		
		pane1.add("manlog",manlog);
		card1.show(pane1, "manlog");		
		
		return true;
	}
	
	public boolean jumpTomanagerMemberUI (CardLayout card1,JPanel pane1){
		managerMemberUI manstaff = new managerMemberUI(this);
		pane1.add("manstaff",manstaff);
		card1.show(pane1, "manstaff");
		return true;
	}
	
	public boolean jumpTomanagerOrgUI (CardLayout card1,JPanel pane1){
		managerOrgUI manorg = new managerOrgUI(this);
		pane1.add("manorg",manorg);
		card1.show(pane1, "manorg");
		return true;
	}
	
	public boolean jumpTomanagerExamDocUI (CardLayout card1,JPanel pane1){
		managerExamDocUI manexam = new managerExamDocUI(this);
		pane1.add("manexam",manexam);
		card1.show(pane1, "manexam");
		return true;
	}
	
	public boolean jumpTomanagerStatisticUI (CardLayout card1,JPanel pane1){
		managerStatisticUI manstatistic = new managerStatisticUI(this);
		pane1.add("manstatistic",manstatistic);
		card1.show(pane1, "manstatistic");
		return true;
	}
	
	
	public boolean jumpToFinanceMenuUI (){
		return true;
	}
	
	public boolean jumpToFinanceCreateProfitUI (){
		return true;
	}
	
	public boolean jumpToFinanceSysLogUI (){
		return true;
	}
	
	public boolean jumpToFinanceSumReceiveDocUI (){
		return true;
	}
	
	public boolean jumpToFinanceInitAccountUI (){
		return true;
	}
	
	public boolean jumpToFinancePaymentUI (){
		return true;
	}
	
	public boolean jumpToFinanceCreateOperateUI (){
		return true;
	}
	
	public boolean jumpToFinanceViewStatisticUI (){
		return true;
	}
	
	public boolean jumpToFinanceInitRepoUI (){
		return true;
	}
	
	public boolean jumpToFinanceInitBankUI (){
		return true;
	}
	
	public boolean jumpToFinanceInitOrgUI (){
		return true;
	}
	
	public boolean jumpToFinanceVehicleUI (){
		return true;
	}
	
	public boolean jumpToFinancePreviousInitUI (){
		return true;
	}
	
	public boolean jumpToFinanceInitUserUI (){
		return true;
	}
	
	public boolean jumpToshowUI (){
		return true;
	}
	
	public boolean jumpTosearchUI (){
		return true;
	}
	
	public boolean jumpToinUI (CardLayout cardrepo,JPanel pane1) {
			// TODO Auto-generated method stub
			InUI inPanel = new InUI(this);		
			pane1.add("inPanel",inPanel);
			cardrepo.show(pane1, "inPanel");
		
		return true;
	}
	
	public boolean jumpTooutUI (CardLayout cardrepo,JPanel pane1){
		OutUI outPanel = new OutUI(this);		
		pane1.add("outPanel",outPanel);
		cardrepo.show(pane1, "outPanel");
		return true;
	}
	
	public boolean jumpTotranscenterRepoMenuUI (){
		TranscenterRepoMenuUI transcenterRepoMenuUI = new TranscenterRepoMenuUI(this);
		pane.add("repomenu",transcenterRepoMenuUI);
		card.show(pane, "repomenu");
		return true;
	}
	
	public boolean jumpToadjustUI (CardLayout cardrepo,JPanel pane1){
		AdjustUI adjustPanel = new AdjustUI(this);		
		pane1.add("adjustPanel",adjustPanel);
		cardrepo.show(pane1, "adjustPanel");
		return true;
	}
	
	public boolean jumpToviewUI (CardLayout cardrepo,JPanel pane1){
		ViewUI viewPanel = new ViewUI(this);		
		pane1.add("viewPanel",viewPanel);
		cardrepo.show(pane1, "viewPanel");
		return true;
	}
	
	public boolean jumpToviewShowUI (){
		return true;
	}
	
	public boolean jumpToinventoryUI (CardLayout cardrepo,JPanel pane1){
		InventoryUI inventoryPanel = new InventoryUI(this);		
		pane1.add("inventoryPanel",inventoryPanel);
		cardrepo.show(pane1, "inventoryPanel");
		return true;
	}
	
	public boolean jumpTobusinessMenuUI (){
		businessMenuUI businessMenuPanel = new businessMenuUI(this);
		pane.add("businessMenuPanel",businessMenuPanel);
		card.show(pane, "businessMenuPanel");
		return true;
	}
	
	public boolean jumpTobusinessArrivalUI (){
		return true;
	}
	
	public boolean jumpTobusinessDriverUI (){
		return true;
	}
	
	public boolean jumpTobusinessDeliverUI (){
		return true;
	}
	
	public boolean jumpTobusinessVehicleUI (){
		return true;
	}
	
	public boolean jumpTobusinessReceiveUI (){
		return true;
	}
	
	public boolean jumpTobusinessShipmentUI (CardLayout cardbusiness,JPanel pane1){
		businessShipmentUI businessShipmentPanel = new businessShipmentUI(this);		
		pane1.add("businessShipmentPanel",businessShipmentPanel);
		cardbusiness.show(pane1, "businessShipmentPanel");
		return true;
	}
	
	public boolean jumpTodeliverOrderUI (CardLayout cardaction,JPanel pane1){
		deliverOrderUI deliverOrderPanel = new deliverOrderUI(this);		
		pane1.add("deliverOrderPanel",deliverOrderPanel);
		cardaction.show(pane1, "deliverOrderPanel");
		return true;
	}
	
	public boolean jumpTodeliverReceiveUI (CardLayout cardaction,JPanel pane1){
		deliverReceiveUI deliverReceivePanel = new deliverReceiveUI(this);		
		pane1.add("deliverReceivePanel",deliverReceivePanel);
		cardaction.show(pane1, "deliverReceivePanel");
		return true;
	}
	
	public boolean jumpTodeliverMenuUI (){
		deliverMenuUI deliverMenuPanel = new deliverMenuUI(this);
		pane.add("deliverMenuPanel",deliverMenuPanel);
		card.show(pane, "deliverMenuPanel");
		return true;
	}
	
	public boolean jumpTotransSaleMenuUI (){
		transSaleMenuUI transSaleMenuPanel = new transSaleMenuUI(this);
		pane.add("transSaleMenuPanel",transSaleMenuPanel);
		card.show(pane, "transSaleMenuPanel");
		return true;
	}
	
	public boolean jumpTotransSaleTransterDocUI (CardLayout cardtranssale,JPanel pane1){
		transSaleTransferDocUI transSaleTransterDocPanel = new transSaleTransferDocUI(this);		
		pane1.add("transSaleTransterDocPanel",transSaleTransterDocPanel);
		cardtranssale.show(pane1, "transSaleTransterDocPanel");
		
		return true;
	}
	
	public boolean jumpTotransSaleShipmentDocUI (CardLayout cardtranssale,JPanel pane1){
		transSaleShipmentDocUI transSaleShipmentDocPanel = new transSaleShipmentDocUI(this);		
		pane1.add("transSaleShipmentDocPanel",transSaleShipmentDocPanel);
		cardtranssale.show(pane1, "transSaleShipmentDocPanel");
		
		return true;
	}
	
	public boolean jumpTotransSaleArrivalDocUI (CardLayout cardtranssale,JPanel pane1){
		transSaleArrivalDocUI transSaleArrivalDocPanel = new transSaleArrivalDocUI(this);		
		pane1.add("transSaleArrivalDocPanel",transSaleArrivalDocPanel);
		cardtranssale.show(pane1, "transSaleArrivalDocPanel");
		
		return true;
	}

}
