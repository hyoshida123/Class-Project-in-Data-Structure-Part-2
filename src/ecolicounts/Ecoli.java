/**
 * CS 106 Theory & Practice II
 * CRN: 62502
 * Assignment: EcoliCount
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author Hideaki Yoshida
 */

package ecolicounts;

import org.apache.commons.lang3.*;

public class Ecoli {

	private int numA = 0;
	private int numC = 0;
	private int numG = 0;
	private int numT = 0;

	// Get the number of A.
	public int getNumA() {
		return numA;
	}

	// Set the number of A.
	public void setNumA(int numA) {
		this.numA = numA;
	}

	// Get the number of C.
	public int getNumC() {
		return numC;
	}

	// Set the number of C.
	public void setNumC(int numC) {
		this.numC = numC;
	}

	// Get the number of G.
	public int getNumG() {
		return numG;
	}

	// Set the number of G.
	public void setNumG(int numG) {
		this.numG = numG;
	}

	// Get the number of T.
	public int getNumT() {
		return numT;
	}

	// Set the number of T.
	public void setNumT(int numT) {
		this.numT = numT;
	}

	// Created a constructor.
	public Ecoli(String dnaData) {
		super();
		numA = StringUtils.countMatches(dnaData, "A");
		numC = StringUtils.countMatches(dnaData, "C");
		numG = StringUtils.countMatches(dnaData, "G");
		numT = StringUtils.countMatches(dnaData, "T");
		// Note for myself: Linear Search
		// for (int i = 0; i < dnaData.length(); i++) {
		// if (dnaData.substring(i, i + 1).equals("A")) {
		// numA++;
		// } else if (dnaData.substring(i, i + 1).equals("C")) {
		// numC++;
		// } else if (dnaData.substring(i, i + 1).equals("G")) {
		// numG++;
		// } else if (dnaData.substring(i, i + 1).equals("T")) {
		// numT++;
		// }
		// }
	}
}