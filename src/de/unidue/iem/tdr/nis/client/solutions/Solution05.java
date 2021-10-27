package de.unidue.iem.tdr.nis.client.solutions;

import de.unidue.iem.tdr.nis.client.Connection;
import de.unidue.iem.tdr.nis.client.TaskObject;
import de.unidue.iem.tdr.nis.client.AbstractSolution;

public class Solution05 extends AbstractSolution {

	/** Aufgabe 5 - Vigenère
	 * Parameter: String[0] Chiffretext, String[1] Key
	 * Lösung: String Klartext
	 */

	/* Konstruktor - NICHT verändern */
	public Solution05(Connection con, TaskObject task) {
		super(con, task);
	}

	@Override
	public String run() {
		String key=task.getStringArray()[1];
		String encryptedText=task.getStringArray()[0];
		String decryptedText="";
		String decryptionAid="";
		int lengthOfKey=key.length();
		for (int i = 0; i <encryptedText.length() ; i++) {
			decryptionAid=decryptionAid + key.charAt(i%lengthOfKey);
		}
		for (int i = 0; i <encryptedText.length() ; i++) {
			decryptedText=decryptedText + StringValueOf(modulo((IntegerValueOf(encryptedText.charAt(i))-IntegerValueOf(decryptionAid.charAt(i))),26));
		}
		return decryptedText;
	}

}
