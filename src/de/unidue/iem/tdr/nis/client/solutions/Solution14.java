package de.unidue.iem.tdr.nis.client.solutions;

import de.unidue.iem.tdr.nis.client.Connection;
import de.unidue.iem.tdr.nis.client.TaskObject;
import de.unidue.iem.tdr.nis.client.AbstractSolution;

public class Solution14 extends AbstractSolution {

	/** Aufgabe 14 - AES Drei Runden
	 * Parameter: String[0] Datenblock (HEX String 128 Bit)
	 * 			  String[1] Key (HEX String 128 Bit)
	 * 			  String[2] Schlüsselraum als String (z.B. "128")
	 * Lösung: String Ausgabe alle drei Runden (HEX String) durch _ getrennt
	 */

	/* Konstruktor - NICHT verändern */
	public Solution14(Connection con, TaskObject task) {
		super(con, task);
	}

	@Override
	public String run() {
		String key= task.getStringArray()[1];
		String schlusselRaum=task.getStringArray()[2];
		String initialRound=BinaryToHex(XOR(HexToBinary(task.getStringArray()[0]),HexToBinary(key)));
		String returnString=initialRound+"_";
		for (int i = 0; i <2 ; i++) {
			key=AESGFunction(key,i);
			initialRound=BinaryToHex(XOR(HexToBinary(MixColumns(ShiftRows(SubBytes(initialRound)))),HexToBinary(key)));
			if(i==1){
				returnString=returnString+initialRound;
			}else {
				returnString = returnString + initialRound + "_";
			}
		}
		return returnString;
	}

}
