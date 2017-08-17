package io.kapp.core.designpattern.abstractfactory;

/**
 * North King
 */
public class NorthKing implements King {
	private final String description = "This is North King!";

	@Override
	public String getDescription() {
		return this.description;
	}
}
