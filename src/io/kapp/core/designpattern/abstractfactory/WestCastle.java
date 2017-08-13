package io.kapp.core.designpattern.abstractfactory;

/**
 * West Castle class
 */
public class WestCastle implements Castle {
	private final String description = "West Castle";

	@Override
	public String getDescription() {
		return this.description;
	}
}
