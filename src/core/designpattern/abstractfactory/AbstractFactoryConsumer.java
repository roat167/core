package core.designpattern.abstractfactory;

/**
 * Consumer class provides entry point for client classes to create sub-classes
 *
 */
public class AbstractFactoryConsumer {
	private King king;
	private Castle castle;

	public King getKing() {
		return this.king;
	}

	public void setKing(King king) {
		this.king = king;
	}

	public Castle getCastle() {
		return this.castle;
	}

	public void setCastle(Castle castle) {
		this.castle = castle;
	}

	/**
	 * Creates Kingdom
	 * 
	 * @param kingdomFactory
	 */
	public void createKingdom(final KingdomAbstractFactory kingdomFactory) {
		this.setKing(kingdomFactory.createKing());
		this.setCastle(kingdomFactory.createCastle());
	}

	public King getKing(final KingdomAbstractFactory kingdomFactory) {
		return kingdomFactory.createKing();
	}

	public Castle getCastle(final KingdomAbstractFactory kingdomFactory) {
		return kingdomFactory.createCastle();
	}
}
