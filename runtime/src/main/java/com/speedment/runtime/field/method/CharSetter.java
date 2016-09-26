package com.speedment.runtime.field.method;

import com.speedment.runtime.annotation.Api;

/**
 * A short-cut functional reference to the {@code setXXX(value)} method for a
 * particular field in an entity. The referenced method should return a
 * reference to itself.
 * <p>
 * A {@code CharacterSetter<ENTITY>} has the following signature:
 * {@code
 *     interface ENTITY {
 *         ENTITY setXXX(char value);
 *     }
 * }
 * 
 * @param <ENTITY> the entity
 * 
 * @author Emil Forslund
 * @since  3.0.0
 */
@Api(version = "3.0")
@FunctionalInterface
public interface CharSetter<ENTITY> extends Setter<ENTITY, Character> {
    
    /**
     * Sets the member represented by this setter in the specified instance to
     * the specified value, returning a reference to the same instance as
     * result.
     * 
     * @param instance the instance to set it in
     * @param value    the new value
     * @return         a reference to that instance
     */
    ENTITY setAsChar(ENTITY instance, char value);
    
    @Override
    default ENTITY apply(ENTITY instance, Character value) {
        return setAsChar(instance, value);
    }
}