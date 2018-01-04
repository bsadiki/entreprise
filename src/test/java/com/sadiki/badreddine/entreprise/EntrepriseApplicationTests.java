package com.sadiki.badreddine.entreprise;

import com.sadiki.badreddine.entreprise.dao.EntrepriseRepository;
import com.sadiki.badreddine.entreprise.entities.Entreprise;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EntrepriseApplicationTests {
	@Autowired
	EntrepriseRepository entrepriseRepository;
	@Test
	public void contextLoads() {
		Entreprise entreprise = new Entreprise("entr","rais");
		Entreprise entreprise1 = new Entreprise("entr1","rais1");
		Entreprise entreprise2 = new Entreprise("entr2","rais32");
		Entreprise entreprise3 = new Entreprise("entr3","rais3");
		entrepriseRepository.save(entreprise);
		entrepriseRepository.save(entreprise2);
		entrepriseRepository.save(entreprise3);
		entrepriseRepository.save(entreprise1);
	}

}
