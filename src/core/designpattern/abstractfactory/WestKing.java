package io.kapp.core.designpattern.abstractfactory;

/**
 * West King
 */
public class WestKing implements King {
	private final String description = "This is West King!";

	@Override
	public String getDescription() {
		return this.description;
	}
}
