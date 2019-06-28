package com.barberia.test;

import java.util.ArrayList;
import java.util.List;

import com.barberia.response.*;
import com.barberia.model.*;;

public class tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		
		MessagenID asd = model.getInstance().iniciarsesion("zero", "46144386");
		System.out.println(asd.getMessage());
		
		
	}

}
