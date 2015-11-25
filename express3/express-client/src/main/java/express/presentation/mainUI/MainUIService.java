package express.presentation.mainUI;

import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public interface MainUIService {
	
	public boolean jumpToSignInUI();

	public boolean jumpToadminStartUI();
	
	public boolean jumpToadminAddUI ();
	
	public boolean jumpTomanagerMenuUI();
	
	public boolean jumpTomanagerMemberUI (CardLayout card1,JPanel pane1);
	
	public boolean jumpTomanagerOrgUI (CardLayout card1,JPanel pane1);
		
	public boolean jumpTomanagerLogUI (CardLayout card1,JPanel pane1);
	
    public boolean jumpTomanagerExamDocUI (CardLayout card1,JPanel pane1);
	
	public boolean jumpTomanagerStatisticUI (CardLayout card1,JPanel pane1);
	
	public boolean jumpToFinanceMenuUI ();
	
	public boolean jumpToFinanceCreateProfitUI ();
	
	public boolean jumpToFinanceSysLogUI ();
	
	public boolean jumpToFinanceSumReceiveDocUI ();
	
	public boolean jumpToFinanceInitAccountUI ();
	
	public boolean jumpToFinancePaymentUI ();
	
	public boolean jumpToFinanceCreateOperateUI ();
	
	public boolean jumpToFinanceViewStatisticUI ();
	
	public boolean jumpToFinanceInitRepoUI ();
	
	public boolean jumpToFinanceInitBankUI ();
	
	public boolean jumpToFinanceInitOrgUI ();
	
	public boolean jumpToFinanceVehicleUI ();
	
	public boolean jumpToFinancePreviousInitUI ();
	
	public boolean jumpToFinanceInitUserUI ();
	
	public boolean jumpToshowUI ();
	
	public boolean jumpTosearchUI ();
	
	public boolean jumpToinUI (CardLayout cardrepo,JPanel pane1);
	
	public boolean jumpTooutUI (CardLayout cardrepo,JPanel pane1);
	
	public boolean jumpTotranscenterRepoMenuUI ();
	
	public boolean jumpToadjustUI (CardLayout cardrepo,JPanel pane1);
	
	public boolean jumpToviewUI (CardLayout cardrepo,JPanel pane1);
	
	public boolean jumpToviewShowUI ();
	
	public boolean jumpToinventoryUI (CardLayout cardrepo,JPanel pane1);
	
	public boolean jumpTobusinessMenuUI ();
	
	public boolean jumpTobusinessArrivalUI ();
	
	public boolean jumpTobusinessDriverUI ();
	
	public boolean jumpTobusinessDeliverUI ();
	
	public boolean jumpTobusinessVehicleUI ();
	
	public boolean jumpTobusinessReceiveUI ();
	
	public boolean jumpTobusinessShipmentUI ();
	
	public boolean jumpTodeliverOrderUI (CardLayout cardaction,JPanel pane1);
	
	public boolean jumpTodeliverReceiveUI (CardLayout cardaction,JPanel pane1);
	
	public boolean jumpTodeliverMenuUI ();
	
	public boolean jumpTotransSaleMenuUI ();
	
	public boolean jumpTotransSaleTransterDocUI (CardLayout cardtranssale,JPanel pane1);
	
	public boolean jumpTotransSaleShipmentDocUI (CardLayout cardtranssale,JPanel pane1);
	
	public boolean jumpTotransSaleArrivalDocUI (CardLayout cardtranssale,JPanel pane1);
}
