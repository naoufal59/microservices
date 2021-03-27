package com.services.rest.limitsservice.beans;

public class LimitConfiguration {
	private int maximum;
	private int manimum;

	public int getMaximum() {
		return maximum;
	}

	public int getManimum() {
		return manimum;
	}

	public LimitConfiguration(int maximum, int manimum) {
		super();
		this.maximum = maximum;
		this.manimum = manimum;
	}

	protected LimitConfiguration() {
		super();
	}

}
