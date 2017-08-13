package io.kapp.core.designpattern.abstractfactory;

/**
 * WestKingdomFactory concrete factory
 */
public class WestKingdomFactory implements KingdomAbstractFactory {

	@Override
	public Castle createCastle() {
		return new WestCastle();
	}

	@Override
	public King createKing() {
		return new WestKing();
	}
}
