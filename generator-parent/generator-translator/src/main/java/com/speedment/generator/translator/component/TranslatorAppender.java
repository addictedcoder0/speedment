package com.speedment.generator.translator.component;

import com.speedment.common.codegen.model.Class;
import com.speedment.common.codegen.model.Enum;
import com.speedment.common.codegen.model.Interface;
import com.speedment.runtime.config.trait.HasMainInterface;
import com.speedment.runtime.config.trait.HasName;

import java.util.function.Function;

/**
 * @author Emil Forslund
 * @since  3.1.4
 */
public interface TranslatorAppender<DOC extends HasName & HasMainInterface> {

    /**
     * Creates a new dynamic code translator and adds it to this component. The
     * created translator will not listen to any decorators.
     *
     * @param creator  the CodeGen model creator
     * @return         this component
     * @since  3.1.4
     */
    CodeGenerationComponent newClass(Function<DOC, Class> creator);

    /**
     * Creates a new dynamic code translator and adds it to this component. The
     * created translator will not listen to any decorators.
     *
     * @param creator  the CodeGen model creator
     * @return         this component
     * @since  3.1.4
     */
    CodeGenerationComponent newEnum(Function<DOC, Enum> creator);

    /**
     * Creates a new dynamic code translator and adds it to this component. The
     * created translator will not listen to any decorators.
     *
     * @param creator  the CodeGen model creator
     * @return         this component
     * @since  3.1.4
     */
    CodeGenerationComponent newInterface(Function<DOC, Interface> creator);

}
