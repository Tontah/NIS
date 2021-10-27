package de.unidue.iem.tdr.nis.client;

import de.unidue.iem.tdr.nis.client.solutions.Helper;

public abstract class AbstractSolution extends Helper {
	protected Connection con;
	protected TaskObject task;
	
	public AbstractSolution(Connection con, TaskObject task) {
		super();
		this.con = con;
		this.task = task;
	}
	
	/** In jeder L�sung zu implementierende Methode,
	 * die bei der L�sungs�berpr�fung aufgerufen wird.
	 * @return String Die L�sung der Aufgabe */
	public abstract String run();
	
	/**
	 * In manchen Aufgaben zu �berschreibende Methode um den Verschl�sselungskey
	 * der Aufgabe zu definieren.
	 * @return String[] Ein Array, welches den Verschl�sselungskey der Aufgabe enth�lt
	 */
	public String[] getKey() {
		return null;
	}
	
	/** Vereinfachte Methode um zus�tzliche L�sungsparamter f�r eine Aufgabe zu verschicken
	 * @param params Die zu verschickenden Paramter
	 */
	protected final void sendMoreParams(String[] params) {
		this.con.sendMoreParams(this.task, params);
	}
	
	/**
	 * Setter Methode f�r das TaskObject zur Laufzeit
	 * @param task Das neue TaskObject f�r die aktuelle L�sung
	 */
	protected final void setTask(TaskObject task) {
		this.task = task;
	}
}
