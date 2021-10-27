package de.unidue.iem.tdr.nis.client.solutions;

import de.unidue.iem.tdr.nis.client.Connection;
import de.unidue.iem.tdr.nis.client.TaskObject;
import de.unidue.iem.tdr.nis.client.AbstractSolution;

public class Solution11 extends AbstractSolution {

	/** Aufgabe 11 - AES Schl�ssel-Generierung
	 * Parameter: String[0] Key (HEX String 128 Bit)
	 * L�sung: String HEX String der 3 Rundenschl�ssel (128 Bit x3) durch _ getrennt
	 */

	/* Konstruktor - NICHT ver�ndern */
	public Solution11(Connection con, TaskObject task) {
		super(con, task);
	}

	@Override
	public String run() {
		String w= task.getStringArray()[0];
		String returnString=w+"_";
		for (int i = 0; i <2 ; i++) {
			w=AESGFunction(w,i);
			if(i==1){
				returnString=returnString+w;
			}else {
				returnString = returnString + w + "_";
			}
		}
		return returnString;
	}

}
