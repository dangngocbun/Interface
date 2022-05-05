package advance.dev.dao;
import java.util.ArrayList;
import java.util.List;

import advance.dev.models.Shape;
public class Shapemannager<shape> implements IShape {
		private List<Shape> list =new ArrayList<Shape>();
		
		public void add(Shape shape) {
			list.add(shape);
		}
		public void print() {
			for(Shape shape : list) {
				System.out.println(shape);
			}
		}
		public Shape get(int index) {
			return list.get(index);
		}

}