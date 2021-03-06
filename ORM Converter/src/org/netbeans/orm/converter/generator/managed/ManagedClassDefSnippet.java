/**
 * Copyright [2014] Gaurav Gupta
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
package org.netbeans.orm.converter.generator.managed;

import org.netbeans.orm.converter.compiler.ClassDefSnippet;

/**
 *
 * The StaticMetamodel annotation specifies that the class is a metamodel class
 * that represents the entity, mapped superclass, or embeddable class designated
 * by the value element.
 */
public class ManagedClassDefSnippet extends ClassDefSnippet {

    private boolean jaxbSupport;//to enable/disable jaxb source code generation
    private boolean xmlRootElement;

    /**
     * @return the jaxbSupport
     */
    public boolean isJaxbSupport() {
        return jaxbSupport;
    }

    /**
     * @param jaxbSupport the jaxbSupport to set
     */
    public void setJaxbSupport(boolean jaxbSupport) {
        this.jaxbSupport = jaxbSupport;
    }

    /**
     * @return the xmlRootElement
     */
    public boolean isXmlRootElement() {
        return xmlRootElement;
    }

    /**
     * @param xmlRootElement the xmlRootElement to set
     */
    public void setXmlRootElement(boolean xmlRootElement) {
        this.xmlRootElement = xmlRootElement;
    }

}
