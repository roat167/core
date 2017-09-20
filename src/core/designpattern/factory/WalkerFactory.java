package core.designpattern.factory;

public interface WalkerFactory {

	static Walker createWalker(WalkerType walkerType, int[] w) {
		switch (walkerType) {
		case NORMAL:
			return new NormalWalker(w[0], w[1], w[2], w[3], w[4]);
		case ARMOR:
			return new ArmorWalker(w[0], w[1], w[2], w[3], w[4]);
		case BURNING:
			return new BurningWalker(w[0], w[1], w[2], w[3], w[4]);
		}

		return null;
	}
}
