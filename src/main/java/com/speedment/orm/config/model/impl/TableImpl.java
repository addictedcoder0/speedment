/**
 *
 * Copyright (c) 2006-2015, Speedment, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); You may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.speedment.orm.config.model.impl;

import com.speedment.orm.config.model.*;
import com.speedment.orm.config.model.parameters.ColumnCompressionType;
import com.speedment.orm.config.model.parameters.FieldStorageType;
import com.speedment.orm.config.model.parameters.StorageEngineType;
import java.util.Optional;

/**
 *
 * @author pemi
 */
public class TableImpl extends AbstractConfigEntity<Table, Schema, ConfigEntity<?, Table, ?>> implements Table {

    private String tableName;
    private FieldStorageType fieldStorageType;
    private ColumnCompressionType columnCompressionType;
    private StorageEngineType storageEngineType;

    @Override
    protected void setDefaults() {
        setFieldStorageType(FieldStorageType.defaultFor(this));
        setColumnCompressionType(ColumnCompressionType.defaultFor(this));
        setStorageEngineType(StorageEngineType.defaultFor(this));
    }

    @Override
    public FieldStorageType getFieldStorageType() {
        return fieldStorageType;
    }

    @Override
    public Table setFieldStorageType(FieldStorageType fieldStorageType) {
        return with(fieldStorageType, f -> this.fieldStorageType = f);
    }

    @Override
    public ColumnCompressionType getColumnCompressionType() {
        return columnCompressionType;
    }

    @Override
    public Table setColumnCompressionType(ColumnCompressionType columnCompressionType) {
        return with(columnCompressionType, c -> this.columnCompressionType = c);
    }

    @Override
    public StorageEngineType getStorageEngineType() {
        return storageEngineType;
    }

    @Override
    public Table setStorageEngineType(StorageEngineType storageEngineType) {
        return with(storageEngineType, s -> this.storageEngineType = s);
    }

    @Override
    public Optional<String> getTableName() {
        if (tableName == null) {
            return Optional.ofNullable(getName());
        }
        return Optional.of(tableName);
    }

    @Override
    public Table setTableName(CharSequence tableName) {
        return with(tableName, t -> this.tableName = t.toString());
    }

}
