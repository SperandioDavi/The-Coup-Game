package com.name.the_coup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.name.the_coup.model.Player;
import com.name.the_coup.model.influence.Ambassador;
import com.name.the_coup.model.influence.Influence;

@SpringBootApplication
public class TheCoupApplication {

	public static void main(String[] args) {
		SpringApplication.run(TheCoupApplication.class, args);

		Player p1 = new Player("Davi");
		Influence[] i1 = new Influence[] {new Ambassador(p1), new Ambassador(p1)};
		p1.setInfluences(i1);

		// Ambassador a1 = (Ambasssador) p1.getInfluences()[0];
		// System.out.println(a1.isRevealed());
		System.out.println("a");
	}
}
