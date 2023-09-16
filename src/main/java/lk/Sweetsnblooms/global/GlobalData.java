package lk.Sweetsnblooms.global;

import java.util.ArrayList;
import java.util.List;

import lk.Sweetsnblooms.model.Product;

public class GlobalData {
	
	public static  List<Product> cart;
	static {
		cart=new ArrayList<Product>();
	}

}
