package com.inti;

import java.util.List;
/*
la classe utile contient kles fonctions utiles

*/
public class utile {

	public double calculMoy(List<Double> liste) throws Exception {
		double moyenne = 0;
//		
//	    for(int i = 0; i < liste.size(); i++)
//	    	moyenne += liste.get(i);
		if (liste.size() != 0) {
			for (Double salaire : liste) {
				moyenne += salaire;
			}

			moyenne = moyenne / liste.size();

			return moyenne;
		} else if (liste.size() == 0) {
			throw new Exception();
		}

		else {
			throw new Exception();
		}

	}
}