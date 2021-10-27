package de.unidue.iem.tdr.nis.client.solutions;

import de.unidue.iem.tdr.nis.client.Connection;
import de.unidue.iem.tdr.nis.client.TaskObject;
import de.unidue.iem.tdr.nis.client.AbstractSolution;

public class Solution08 extends AbstractSolution {

	/** Aufgabe 8 - DES Feistel
	 * Parameter: String[0] Binärstring (64 Bit), String[1] Rundenschlüssel (Binärstring 48 Bit)
	 * Lösung: String L-Block XOR R-Block (Binärstring)
	 */

	/* Konstruktor - NICHT verändern */
	public Solution08(Connection con, TaskObject task) {
		super(con, task);
	}

	@Override
	public String run() {
		String key=task.getStringArray()[1];
		String klarText=task.getStringArray()[0];
		String LBlock=klarText.substring(0,32);
		String RBlock=klarText.substring(32);
		RBlock= ExpansionForRBlock(RBlock);
		RBlock=XOR(RBlock,key);
		RBlock=SBlock(RBlock);
		RBlock=BitPermutation(RBlock);
		return XOR(LBlock,RBlock);
	}
}
