package io.kapp.core.designpattern.abstractfactory;

/**
 * North Castle
 */
public class NorthCastle implements Castle {
	private final String description = "This is North Castle";

	@Override
	public String getDescription() {
		return this.description;
	}
}
