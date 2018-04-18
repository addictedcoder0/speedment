package com.speedment.runtime.field.expression;

import com.speedment.common.function.ToByteFunction;
import com.speedment.runtime.compute.ToByteNullable;

/**
 * Specific {@link FieldMapper} implementation that also implements
 * {@link ToByteNullable}.
 *
 * @author Emil Forslund
 * @since  3.1.0
 */
public interface FieldToByte<ENTITY, T>
extends FieldMapper<ENTITY, T, Byte, ToByteFunction<T>>,
        ToByteNullable<ENTITY> {}