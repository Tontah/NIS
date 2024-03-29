package de.unidue.iem.tdr.nis.client.solutions;

import de.unidue.iem.tdr.nis.client.Connection;
import de.unidue.iem.tdr.nis.client.TaskObject;
import de.unidue.iem.tdr.nis.client.AbstractSolution;

public class Solution13 extends AbstractSolution {

	/** Aufgabe 13 - AES SubBytes(), ShiftRows(), MixColumns()
	 * Parameter: String[0] HEX String (128 Bit)
	 * L�sung: String HEX String (128 Bit)
	 */

	/* Konstruktor - NICHT ver�ndern */
	public Solution13(Connection con, TaskObject task) {
		super(con, task);
	}

	@Override
	public String run() {
		String subBytes=SubBytes(task.getStringArray()[0]);
		String shiftRows=ShiftRows(subBytes);
		return MixColumns(shiftRows);
	}

}
