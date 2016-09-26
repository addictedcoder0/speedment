package com.speedment.runtime.field;

import com.speedment.runtime.annotation.Api;
import com.speedment.runtime.field.trait.HasFinder;

/**
 * A field that represents a primitive {@code int} value that references another
 * column using a foreign key.
 * 
 * @param <ENTITY>    entity type
 * @param <D>         database type
 * @param <FK_ENTITY> foreign entity type
 * 
 * @author Emil Forslund
 * @since  3.0.0
 * 
 * @see ReferenceField
 * @see ReferenceForeignKeyField
 */
@Api(version = "3.0")
public interface IntForeignKeyField<ENTITY, D, FK_ENTITY> extends IntField<ENTITY, D>, HasFinder<ENTITY, FK_ENTITY, Integer> {
    
    
}