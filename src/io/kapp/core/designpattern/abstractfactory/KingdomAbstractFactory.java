package io.kapp.core.designpattern.abstractfactory;

/**
 * Kingdom Factory Interface: abstract factory
 */
public interface KingdomAbstractFactory {
	
	Castle createCastle();

	King createKing();
}
