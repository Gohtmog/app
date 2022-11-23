package com.inti;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class utileTest {
	utile u ;
	List<Double> listeSalaire ;
	
	@BeforeClass
	public static void debut() {
		System.out.println("debut de tout les test :" + LocalDate.now());
	}
	
	@Before
	public void setUp() {
		u = new utile();
		listeSalaire = new ArrayList<>();
	}
	
	@Test
	public void calculMoyAvecListeSalaire() throws Exception{

		listeSalaire.add(1000.0);
		listeSalaire.add(2000.0);
		listeSalaire.add(3000.0);

		double moyenne = u.calculMoy(listeSalaire);
		assertEquals(moyenne, 2000.0, 1);
		assertEquals("test d'une liste", moyenne, 2000.0, 1);
	}

	@Test(expected = Exception.class)
	public void calculMoyAvecListeSalairevide() throws Exception{


		double moyenne = u.calculMoy(listeSalaire);
		fail("liste vide");
	}

	@Test(expected = Exception.class)
	public void calculMoyAvecListeSalaireNull() throws Exception{


		double moyenne = u.calculMoy(null);
		fail("liste vide");
	}

	@After
	public void afterEachTest() {
		
		System.out.println("fin du test");
	}
}
