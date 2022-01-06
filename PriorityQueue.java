import java.util.ArrayList;

public class PriorityQueue<T> {
	
	public ArrayList<Element<T>> elements; 
	
	public PriorityQueue() {
		elements = new ArrayList<Element<T>>();
	}
	
	public void add(T value, int key) {
		elements.add(new Element<T>(value, key));
	}
	
	public T getMin() {
		Element<T> min=elements.get(0);
		int minIndex=0;
		for(int i=1;i<elements.size();i++) {
			if(elements.get(i).getKey()<min.getKey()) {
				min=elements.get(i);
				minIndex=i;
			}
		}
		elements.remove(minIndex);
		return min.getValue();
	}
	
	public T mystery(int k) {
		Element<T> x=null;
		int i;
		for(i=0;i<elements.size();i++) {
			int f=0;
			for(int j=0;j<elements.size();j++) {
				if(elements.get(j).getKey()<elements.get(i).getKey()) {
					f++;
				}
			}
			if(f==k) {
				x=elements.get(i);
				break;
			}
		}
		elements.remove(i);
		return x.getValue();
	}
	
}
