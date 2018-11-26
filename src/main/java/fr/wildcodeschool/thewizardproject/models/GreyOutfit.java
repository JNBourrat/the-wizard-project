package fr.wildcodeschool.thewizardproject.models;

import org.springframework.stereotype.Component;

@Component
public class GreyOutfit implements Outfit {

	@Override
	public String toString() {
		return "The wizard's outfit is grey or white. Dunno.";
	}

}
