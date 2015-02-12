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
package com.speedment.orm.config.model;

import com.speedment.orm.annotations.Api;
import com.speedment.orm.config.model.parameters.ColumnCompressionTypeable;
import com.speedment.orm.config.model.parameters.FieldStorageTypeable;
import java.util.Optional;

/**
 *
 * @author pemi
 */
@Api(version = 0)
public interface Column extends
        OrdinalConfigEntity<Column, Table, ConfigEntity<?, Column, ?>>,
        FieldStorageTypeable<Column>,
        ColumnCompressionTypeable<Column> {

    @Override
    default Class<Column> getInterfaceMainClass() {
        return Column.class;
    }

    @Override
    default Optional<Class<? extends Table>> getParentInterfaceMainClass() {
        return Optional.of(Table.class);
    }

    @External
    Optional<String> getAlias();

    @External
    Column setAlias(CharSequence alias);

}
