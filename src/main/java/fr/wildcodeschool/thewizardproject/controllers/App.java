package fr.wildcodeschool.thewizardproject.controllers;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.wildcodeschool.thewizardproject.models.WizardInterface;

public class App {
	public void start() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath*:applicationContext.xml");
		WizardInterface aWizard = context.getBean("dumbledore", WizardInterface.class);
		context.close();
		System.out.println("");
		System.out.println("******************************************************************************");
		System.out.println("\"" + aWizard.giveAdvice() + "\"");
		System.out.println("******************************************************************************");
		System.out.println("\"" + aWizard.changeDress() + "\"");
		System.out.println("******************************************************************************");
	}
}
