package ModelEditor;
// Copyright 2000-2021 JetBrains s.r.o. and other contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import psi.ModelTypes;
import org.jetbrains.annotations.NotNull;
import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class ModelSyntaxHighlighter extends SyntaxHighlighterBase {

    public static final TextAttributesKey EQUALS =
            createTextAttributesKey("Model_SEPARATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey COMMENT =
            createTextAttributesKey("Model_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey CHANNEL =
            createTextAttributesKey("Model_CHANNEL", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey CHANNEL_NAME =
            createTextAttributesKey("Model_CHANNEL_NAME",DefaultLanguageHighlighterColors.INSTANCE_METHOD);

    public static final TextAttributesKey REF =
            createTextAttributesKey("Model_LEF", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey IN=
            createTextAttributesKey("Model_IN", DefaultLanguageHighlighterColors.NUMBER);
    public static final TextAttributesKey OUT =
            createTextAttributesKey("Model_OUT", DefaultLanguageHighlighterColors.STRING);

    public static final TextAttributesKey LBRACE =
            createTextAttributesKey("Model_CHARACTER", DefaultLanguageHighlighterColors.BRACES);
    public static final TextAttributesKey RBRACE =
            createTextAttributesKey("Model_CHARACTER", DefaultLanguageHighlighterColors.BRACES);
    public static final TextAttributesKey BAD_CHARACTER =
            createTextAttributesKey("Model_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER);

    public static final TextAttributesKey LBRACKET =
            createTextAttributesKey("Model_LBRACKET", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey RBRACKET =
            createTextAttributesKey("Model_RBRACKET", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey SYMBOL =
            createTextAttributesKey("Model_SYMBOL", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey COMMA =
            createTextAttributesKey("Model_COMMA", DefaultLanguageHighlighterColors.OPERATION_SIGN);


    private static final TextAttributesKey[] BAD_CHAR_KEYS = new TextAttributesKey[]{BAD_CHARACTER};
    private static final TextAttributesKey[] EQUALS_KEYS = new TextAttributesKey[]{EQUALS};
    private static final TextAttributesKey[] CHANNEL_NAME_KEY = new TextAttributesKey[]{CHANNEL_NAME};
    private static final TextAttributesKey[] CHANNEL_KEYS = new TextAttributesKey[]{CHANNEL};
    private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{COMMENT};
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];
    private static final TextAttributesKey[] LBRACE_KEY = new TextAttributesKey[]{LBRACE};
    private static final TextAttributesKey[] RBRACE_KEY = new TextAttributesKey[]{RBRACE};
    private static final TextAttributesKey[] REF_KEY = new TextAttributesKey[]{REF};
    private static final TextAttributesKey[] IN_KEY = new TextAttributesKey[]{IN};
    private static final TextAttributesKey[] OUT_KEY = new TextAttributesKey[]{OUT};
    private static final TextAttributesKey[] LBRACKET_KEY = new TextAttributesKey[]{LBRACKET};
    private static final TextAttributesKey[] RBRACKET_KEY = new TextAttributesKey[]{RBRACKET};
    private static final TextAttributesKey[] SYMBOL_KEY = new TextAttributesKey[]{SYMBOL};
    private static final TextAttributesKey[] COMMA_KEY = new TextAttributesKey[]{COMMA};

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new ModelLexerAdapter();
    }

    @Override
    public TextAttributesKey @NotNull [] getTokenHighlights(IElementType tokenType) {
        if(tokenType.equals(ModelTypes.EQUALS)){
            return EQUALS_KEYS;
        }
        if (tokenType.equals(ModelTypes.CHANNEL)) {
            return CHANNEL_KEYS;
        }
        if (tokenType.equals(ModelTypes.CHANNEL_NAME)) {
            return CHANNEL_NAME_KEY;
        }
        if(tokenType.equals(ModelTypes.LBRACKET)){
            return LBRACKET_KEY;
        }
        if(tokenType.equals(ModelTypes.RBRACKET)){
            return RBRACKET_KEY;
        }
        if(tokenType.equals(ModelTypes.SYMBOL)){
            return SYMBOL_KEY;
        }
        if(tokenType.equals(ModelTypes.COMMA)){
            return COMMA_KEY;
        }
        if(tokenType.equals(ModelTypes.LBRACE)){
            return LBRACE_KEY;
        }
        if (tokenType.equals(ModelTypes.REF)) {
            return REF_KEY;
        }
        if (tokenType.equals(ModelTypes.IN)) {
            return IN_KEY;
        }
        if (tokenType.equals(ModelTypes.OUT)) {
            return OUT_KEY;
        }
        if(tokenType.equals(ModelTypes.RBRACE)){
            return RBRACE_KEY;
        }
        if (tokenType.equals(ModelTypes.COMMENT)) {
            return COMMENT_KEYS;
        }
        if (tokenType.equals(TokenType.BAD_CHARACTER)) {
            return BAD_CHAR_KEYS;
        }
        return EMPTY_KEYS;
    }

}
