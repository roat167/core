package io.kapp.core.designpattern.abstractfactory;

/**
 * NorthKingdomFactory concrete factory
 */
public class NorthKingdomFactory implements KingdomAbstractFactory {

	@Override
	public Castle createCastle() {
		return new NorthCastle();
	}

	@Override
	public King createKing() {
		return new NorthKing();
	}
}
