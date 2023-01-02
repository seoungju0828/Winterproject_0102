package info.view;

import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import info.vo.ProductVO;

public class ProductView {
	ArrayList<ProductVO> productList;
	ArrayList<JLabel> lbls = new ArrayList<JLabel>();
	
	public JPanel displayProducts() {
		JPanel panC = new JPanel(new GridLayout(3, 3));
		
		for (ProductVO vo : productList) {
			ImageIcon icon = new ImageIcon("image/" + vo.getImageName() + ".jpg");
			JLabel lbl = new JLabel(icon);
			lbls.add(new JLabel());
			
			panC.add(lbl);
			
		}
		
		return panC;
	}
	
	public void inputPurchase() {
	
	}

	public void setProductList(ArrayList<ProductVO> productList) {
		this.productList = productList;
	}
}