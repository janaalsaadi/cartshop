package testingCase;

import java.util.ArrayList;



public class cart_shop {
ArrayList<books> jana;
	
	public cart_shop() {
		// TODO Auto-generated constructor stub
		jana = new ArrayList<books>();
	}
	public int getCountOffBook() {
		// TODO Auto-generated method stub
return jana.size();
	}

	public void addBook(books book) {
		// TODO Auto-generated method stub
		jana.add(book);
	}

	public int getPrice() {
		// TODO Auto-generated method stub
		int j = 0 ;
		for(int i = 0 ; i < jana.size() ;i++)
				j = j + jana.get(i).getPrices();
		return j;
	}

}
