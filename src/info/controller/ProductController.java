package info.controller;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;

import info.view.ProductView;
import info.vo.ProductDAO;
import info.vo.ProductVO;

public class ProductController extends JFrame {
	public static final int STOP = 0;
	ArrayList<ProductVO> productList;
	
	public ProductController() {
		setTitle("승주의 자판기");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		ProductView view = new ProductView();
		fulldrink();
		view.setProductList(productList);
		JPanel panC = view.displayProducts();
		add(panC, "Center");
		
		//setLocation(100, 50);
		//setSize(600, 600);
		setBounds(100, 50, 600, 600);
		setVisible(true);
	}
	
	public void fulldrink() {
		//자판기에 제품 채우기
		ProductDAO dao = new ProductDAO();
		String[] names = {"제티", "율무차", "솔의 눈", "실론티", "데자와", "몬스터", "피크닉", "바나나우유", "콜라"}; 
		int[] prices = {500, 500, 1000, 1000, 1500, 2000, 500, 1000, 1000};
		ProductVO vo = null;
		productList = dao.select();
		
			for (int i=0; i<names.length; i++) {
				vo = new ProductVO();
				vo.setName(names[i]);
				vo.setPrice(prices[i]);
				vo.setProductNum(i);
				vo.setStockNum(10);
				vo.setImageName("drink_" + (i+1));
				productList.add(vo);
			}
			
	}

	public static void main(String[] args) {
		new ProductController();
		
		new ProductController();
		
	}

}