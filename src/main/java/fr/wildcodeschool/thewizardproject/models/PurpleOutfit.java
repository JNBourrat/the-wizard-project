package fr.wildcodeschool.thewizardproject.models;

import org.springframework.stereotype.Component;

@Component
public class PurpleOutfit implements Outfit {

	@Override
	public String toString() {
		return "The wizard's outfit is purple.";
	}
}
