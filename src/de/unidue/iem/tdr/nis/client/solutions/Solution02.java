package de.unidue.iem.tdr.nis.client.solutions;

import de.unidue.iem.tdr.nis.client.Connection;
import de.unidue.iem.tdr.nis.client.TaskObject;
import de.unidue.iem.tdr.nis.client.AbstractSolution;

public class Solution02 extends AbstractSolution {

	/** Aufgabe 2 - XOR
	 * Parameter: String[0] HEX String A, String[1] HEX String B
	 * Lösung: String A MOD B als Binärstring
	 */

	/* Konstruktor - NICHT verändern */
	public Solution02(Connection con, TaskObject task) {
		super(con, task);
	}

	@Override
	public String run() {
		String value1=DecimalToBinary(HexToDecimal(task.getStringArray()[0]));
		String value2=DecimalToBinary(HexToDecimal(task.getStringArray()[1]));
		return XOR(value1,value2);
	}

}
