/* 
 * Copyright 2016, Emanuel Rabina (http://www.ultraq.net.nz/)
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package nz.net.ultraq.thymeleaf.models.extensions

import org.thymeleaf.model.IProcessableElementTag

/**
 * Meta-programming extensions to the {@link IProcessableElementTag} class.
 * 
 * @author Emanuel Rabina
 */
class IProcessableElementTagExtensions {

	/**
	 * Apply extensions to the {@code IProcessableElementTag} class.
	 */
	static void apply() {

		IProcessableElementTag.metaClass {

			/**
			 * Compares this open tag with another.
			 * 
			 * @param other
			 * @return {@code true} if this tag has the same name and attributes as
			 *         the other element.
			 */
			equals << { Object other ->
				return other instanceof IProcessableElementTag &&
					delegate.elementDefinition == other.elementDefinition &&
					delegate.attributeMap == other.attributeMap
			}
		}
	}
}
