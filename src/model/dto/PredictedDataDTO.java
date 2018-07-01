package model.dto;

import java.util.HashMap;

public class PredictedDataDTO {
	private String refTime;
	private HashMap<String, Integer> miseAfter1 = new HashMap<>();
	private HashMap<String, Integer> miseAfter2 = new HashMap<>();
	private HashMap<String, Integer> miseAfter3 = new HashMap<>();
	
	private HashMap<String, Integer> chomiseAfter1 = new HashMap<>();
	private HashMap<String, Integer> chomiseAfter2 = new HashMap<>();
	private HashMap<String, Integer> chomiseAfter3 = new HashMap<>();
	
	public PredictedDataDTO() {}

	public PredictedDataDTO(String refTime) {
		this.refTime = refTime;
	}

	public String getRefTime() {
		return refTime;
	}

	public void setRefTime(String refTime) {
		this.refTime = refTime;
	}

	public HashMap<String, Integer> getMiseAfter1() {
		return miseAfter1;
	}

	public void setMiseAfter1(HashMap<String, Integer> miseAfter1) {
		this.miseAfter1 = miseAfter1;
	}

	public HashMap<String, Integer> getMiseAfter2() {
		return miseAfter2;
	}

	public void setMiseAfter2(HashMap<String, Integer> miseAfter2) {
		this.miseAfter2 = miseAfter2;
	}

	public HashMap<String, Integer> getMiseAfter3() {
		return miseAfter3;
	}

	public void setMiseAfter3(HashMap<String, Integer> miseAfter3) {
		this.miseAfter3 = miseAfter3;
	}

	public HashMap<String, Integer> getChomiseAfter1() {
		return chomiseAfter1;
	}

	public void setChomiseAfter1(HashMap<String, Integer> chomiseAfter1) {
		this.chomiseAfter1 = chomiseAfter1;
	}

	public HashMap<String, Integer> getChomiseAfter2() {
		return chomiseAfter2;
	}

	public void setChomiseAfter2(HashMap<String, Integer> chomiseAfter2) {
		this.chomiseAfter2 = chomiseAfter2;
	}

	public HashMap<String, Integer> getChomiseAfter3() {
		return chomiseAfter3;
	}

	public void setChomiseAfter3(HashMap<String, Integer> chomiseAfter3) {
		this.chomiseAfter3 = chomiseAfter3;
	}
}
