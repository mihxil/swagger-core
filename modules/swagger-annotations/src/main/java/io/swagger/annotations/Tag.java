/**
 * Copyright 2015 SmartBear Software
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.swagger.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * A definition level Tag object see https://github.com/OAI/OpenAPI-Specification/blob/master/versions/2.0.md#tag-object
 *
 * @since 1.5.0
 */
@Target(ElementType.ANNOTATION_TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Tag {

    /**
     * The name of this tag.
     *
     * @return the name of this tag
     */
    String name();

    /**
     * Optional description of the tag.
     *
     * @return an optional description of what this tag means
     */
    String description() default "";

    /**
     * Optional reference to external documentation for this tag.
     *
     * @return an optional reference to external documentation for this tag
     */
    ExternalDocs externalDocs() default @ExternalDocs(url = "");

    /**
     * A list of extensions associated with this tag.
     *
     * @return a list of extensions associated with this tag
     */
    Extension[] extensions() default @Extension(properties = @ExtensionProperty(name = "", value = ""));
}
