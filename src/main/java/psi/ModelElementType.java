package psi;

// Copyright 2000-2020 JetBrains s.r.o. and other contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.

//package org.intellij.sdk.language.psi;

import com.intellij.psi.tree.IElementType;
import ModelEditor.ModelLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class ModelElementType extends IElementType {

    public ModelElementType(@NotNull @NonNls String debugName) {
        super(debugName, ModelLanguage.INSTANCE);
    }

}
