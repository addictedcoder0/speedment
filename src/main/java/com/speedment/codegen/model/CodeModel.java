package com.speedment.codegen.model;

/**
 *
 * @author Duncan
 */
public abstract class CodeModel {
	/**
	 * The number of model types there are. If new types are added to this enum,
	 * new models and new views will have be be created. All implementations of
	 * <code>CodeViewBuilder</code> will have to be updated to support the new 
	 * enum case.
	 */
	public static enum Type {
		BLOCK, CLASS, CONSTRUCTOR, EXPRESSION, 
		FIELD, METHOD, PACKAGE, STATEMENT, TYPE,
		INTERFACE
	}

	/**
	 * Returns the type of this model.
	 * @return the type.
	 */
	public abstract Type getType();
}
