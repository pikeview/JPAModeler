/**
 * Copyright [2016] Gaurav Gupta
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.netbeans.db.modeler.spec;

import java.util.List;
import java.util.Set;
import org.netbeans.jpa.modeler.spec.Entity;
import org.netbeans.jpa.modeler.spec.Index;
import org.netbeans.jpa.modeler.spec.UniqueConstraint;
import org.netbeans.jpa.modeler.spec.extend.RelationAttribute;

public class DBRelationTable extends DBTable {

    private final RelationAttribute attribute;

    public DBRelationTable(String name, Entity entity, RelationAttribute attribute) {
        super(name, entity);
        this.attribute = attribute;
        attribute.getJoinTable().setGeneratedName(name);
    }

    /**
     * @return the attribute
     */
    public RelationAttribute getAttribute() {
        return attribute;
    }

    @Override
    public Set<UniqueConstraint> getUniqueConstraints() {
        return attribute.getJoinTable().getUniqueConstraint();
    }
    
    
    @Override
    public List<Index> getIndexes() {
        return attribute.getJoinTable().getIndex();
    }
}
