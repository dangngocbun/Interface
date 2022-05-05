package advance.dev;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import advance.dev.dao.IShape;
import advance.dev.dao.Shapemannager;
import advance.dev.models.Circle;
import advance.dev.models.Rectangle;


public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		IShape shapemanger = new Shapemannager();
		System.out.println("Nhap vao 5 hinh");
		System.out.println("nhap vao 2 hinh tron ");
		for (int i = 0; i < 2; i++) {
			System.out.println("nhap ban kinh");
			double bk = sc.nextDouble();
			sc.nextLine();
			shapemanger.add(new Circle("Circle", bk));
			
		}
		System.out.println("nhap vao 2 hinh chữ nhật ");
		for (int i = 0; i < 2; i++) {
			System.out.println("nhap cạnh a");
			double a = sc.nextDouble();
			sc.nextLine();
			System.out.println("nhap cạnh b");
			double b = sc.nextDouble();
			sc.nextLine();
			shapemanger.add(new Rectangle("Rectangle" , a ,b));
	}
		System.out.println("nhap vao 1 hinh tam giac ");
		System.out.println("nhap cạnh a");
		double a = sc.nextDouble();
		sc.nextLine();
		System.out.println("nhap cạnh b");
		double b = sc.nextDouble();
		sc.nextLine();
		System.out.println("nhap cạnh c");
		double c = sc.nextDouble();
		sc.nextLine();
		shapemanger.add(new Rectangle("Triangle" , a ,b));
		
		shapemanger.print();
		
}
}


