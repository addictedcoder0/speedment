package com.speedment.runtime.field.method;

import com.speedment.runtime.annotation.Api;

/**
 * A short-cut functional reference to the {@code getXXX(value)} method for a
 * particular field in an entity.
 * <p>
 * A {@code FloatGetter<ENTITY>} has the following signature:
 * {@code
 *     interface ENTITY {
 *         float getXXX();
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
public interface FloatGetter<ENTITY> extends Getter<ENTITY, Float> {
    
    /**
     * Returns the member represented by this getter in the specified instance.
     * 
     * @param instance the instance to get from
     * @return         the value
     */
    float applyAsFloat(ENTITY instance);
    
    @Override
    default Float apply(ENTITY instance) {
        return applyAsFloat(instance);
    }
}