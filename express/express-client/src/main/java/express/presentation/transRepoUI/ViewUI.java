package express.presentation.transRepoUI;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import express.presentation.mainUI.MainUIService;

public class ViewUI extends JPanel{
	private JButton button_view;
	private JButton button_return;
    private MainUIService m;
	
	public ViewUI(MainUIService main){
     	setLayout(null);
	    this.m=main;
	    
	    this.setBounds(0, 0, 850, 700);
		this.setBackground(Color.WHITE);
		
		
		
		JListener listener=new JListener();
		
		
	    button_view=new JButton("在你点击库存查看之后");
        button_view.setBounds(100, 100, 150, 50);
        button_view.addMouseListener(listener);
        
    	button_return=new JButton("返回");
	    button_return.setBounds(100, 200, 150, 50);
	    button_return.addMouseListener(listener);
        
		this.add( button_view);
		 this.add( button_return);
	}
	class JListener implements MouseListener{

		public void mouseClicked(MouseEvent e) {
			 if (e.getSource()==button_view){
				 System.out.println("你点击了“点击库存查看之后”");
				 
			 }
			 
			 else if (e.getSource()==button_return){
				 System.out.println("应该回到了repo界面");
			 }
		}

		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}

}
