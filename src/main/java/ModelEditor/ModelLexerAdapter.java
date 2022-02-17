package ModelEditor;
// Copyright 2000-2021 JetBrains s.r.o. and other contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.

import org.intellij.sdk.language.ModelLexer;
import com.intellij.lexer.FlexAdapter;


public class ModelLexerAdapter extends FlexAdapter {

    public ModelLexerAdapter() {
        super(new ModelLexer(null));
    }

}
