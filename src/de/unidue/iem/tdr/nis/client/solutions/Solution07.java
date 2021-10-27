package de.unidue.iem.tdr.nis.client.solutions;

import de.unidue.iem.tdr.nis.client.Connection;
import de.unidue.iem.tdr.nis.client.TaskObject;
import de.unidue.iem.tdr.nis.client.AbstractSolution;

public class Solution07 extends AbstractSolution {

	/** Aufgabe 7 - DES R-Block
	 * Parameter: String[0] Binärstring (64 Bit), int[0] Runde
	 * Lösung: String R-Block (Binärstring 48 Bit)
	 */

	/* Konstruktor - NICHT verändern */
	public Solution07(Connection con, TaskObject task) {
		super(con, task);
	}

	@Override
	public String run() {
		int runde=task.getIntArray()[0];
		String klarText=task.getStringArray()[0];
		String LBlock=initialPermutationLBlock(klarText);
		String RBlock=initialPermutationRBlock(klarText);
		String placeholder="";
		for (int i = 0; i <runde ; i++) {
			placeholder=RBlock;
			RBlock= ExpansionForRBlock(RBlock);
			RBlock=SBlock(RBlock);
			RBlock=BitPermutation(RBlock);
			RBlock=XOR(LBlock,RBlock);
			LBlock=placeholder;
		}
		return RBlock;
	}

}
