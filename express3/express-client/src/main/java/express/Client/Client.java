//package express.Client;
//
//
//import java.awt.CardLayout;
//import java.awt.Color;
//import java.awt.Frame;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.MouseEvent;
//import java.awt.event.MouseListener;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JPanel;
//
//import express.presentation.mainUI.MainUI;
//import express.presentation.mainUI.MainUIService;
//import express.presentation.managerUI.managerLogUI;
//import express.presentation.managerUI.managerMenuUI;
//import express.presentation.userUI.SignInUI;
//
//public class Client extends JFrame{
//	private SignInUI signin;
//	private CardLayout card;
//	private JPanel container;
//	private MainUIService main;
//	
//	public Client(){
//
//		this.setLayout(null);
//		container = new JPanel();
//		container.setBounds(0,0,400,400);
////		this.setContentPane(container);
//		card= new CardLayout();		
//		container.setLayout(card);
//		
//		main = new MainUI(card,container);
//		signin = new SignInUI(main);
//		this.add(container);
//		container.add("signin", signin);
//		card.show(container, "signin");
//	
//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		this.setSize(400, 400);
//		this.setVisible(true);
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		new Client();
//		
//	}
//
//}

		
		/*
		AdminBLService adminservice = new AdminBLService_stub("卢海龙","1001001",UserRole.DeliverMan,"123456");
		AdminBLService_Driver admindriver = new AdminBLService_Driver();
		admindriver.drive(adminservice);
		
		ExamDocumentBLService examdocumentservice = new ExamdocumentBL_stub(new DocumentListVO());
		ExamDocumentBLService_Driver examdriver = new ExamDocumentBLService_Driver();
		examdriver.drive(examdocumentservice);
		
		
		
		ArrayList<LogVO> log = new ArrayList<LogVO>();
		SyslogBLService sysloservice = new SyslogBLService_stub(log);
		SyslogBLService_Driver syslodriver = new SyslogBLService_Driver();
		syslodriver.drive(sysloservice);
		//
		AdjustRepoBLService adjustRepoBLService=new AdjustRepoBLService_stub();
		AdjustRepoBLService_Driver adjustRepo=new AdjustRepoBLService_Driver();
		adjustRepo.drive(adjustRepoBLService);
		
		BankAccountBLService bankAccountBLService=new BankAccountBLService_stub(null);
		BankAccountBLService_Driver bankAccount=new BankAccountBLService_Driver();
		bankAccount.drive(bankAccountBLService);
		
		InventoryRepoBLService inventoryRepoBLService=new InventoryRepoBLService_stub(null);
		InventoryRepoBLService_Driver inventory=new InventoryRepoBLService_Driver();
		inventory.drive(inventoryRepoBLService);
		
		PaymentBLService paymentBLService=new PaymentBLService_stub(null);
		PaymentBLService_Driver payment=new PaymentBLService_Driver();
		payment.drive(paymentBLService);
		
		ScanRepoBLService scanRepoBLService=new ScanRepoBLService_stub(null);
		ScanRepoBLService_Driver scanRepo=new ScanRepoBLService_Driver();
		scanRepo.drive(scanRepoBLService);
		
		StatisticFinancialBLService statisticFinancialBLservice=new StatisticFinancialBLservice_stub(null, null, null, null);
		StatisticFinancialBLService_Driver statisticFinancial=new StatisticFinancialBLService_Driver();
		statisticFinancial.drive(statisticFinancialBLservice);
		
		StatisticManagerBLService statisticManagerBLService=new StatisticManagerBLService_stub(null,null,null,null);
		StatisticManagerBLService_Driver statisticManager=new StatisticManagerBLService_Driver();
		statisticManager.drive(statisticManagerBLService);
		
		InnerAccountBLService innerAccountBLService=new InnerAccountBLService_stub();
		InnerAccountBLService_Driver innerAccountBL=new InnerAccountBLService_Driver();
		innerAccountBL.drive(innerAccountBLService);
	
	    
		//Lu Hailong
		BusinessSaleArrivalDocumentblService  arrivalDocservice=new BusinessSaleArrivalDocumentblService_stub("","","","",null);
		BusinessSaleArrivalDocumentblService_Driver arrivalDocdriver=new BusinessSaleArrivalDocumentblService_Driver();
		arrivalDocdriver.drive(arrivalDocservice);
		
		BusinessSaleDeliverDocumentblService deliverDocservice=new BusinessSaleDeliverDocumentblService_stub(null, null, null);
		BusinessSaleDeliverDocumentblService_Driver deliverDocdriver=new BusinessSaleDeliverDocumentblService_Driver();
	    deliverDocdriver.drive(deliverDocservice);
	    
	    BusinessSaleReceiveDocumentblService receiveDocservice=new BusinessSaleReceiveDocumentblService_stub(null, 0, null, null);
	    BusinessSaleReceiveDocumentblService_Driver receiveDocdriver=new BusinessSaleReceiveDocumentblService_Driver();
	    receiveDocdriver.drive(receiveDocservice);
	    
	    BusinessSaleShipmentDocumentblService shipmentDocservice=new BusinessSaleShipmentDocumentblService_stub(null, null, null, null, null, null, null, null, 0);
	    BusinessSaleShipmentDocumentblService_Driver shipmentDocdriver =new BusinessSaleShipmentDocumentblService_Driver();
	    shipmentDocdriver.drive(shipmentDocservice);
	    
	    DriverBusinessSaleblService driverservice=new DriverBusinessSaleblService_stub(null, null, null);
	    DriverBusinessSaleblService_Driver driverdriver=new DriverBusinessSaleblService_Driver();
	    driverdriver.drive(driverservice);
	    
	    VehicleBusinessSaleblService vehicleservice =new VehicleBusinessSaleblService_stub(null, null);
	    VehicleBusinessSaleblService_Driver  vehicledriver=new VehicleBusinessSaleblService_Driver();
        vehicledriver.drive(vehicleservice); 	    
	    
	    
	    
	}

}*/
