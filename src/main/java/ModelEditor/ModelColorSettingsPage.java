package ModelEditor;
// Copyright 2000-2021 JetBrains s.r.o. and other contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.Map;

public class ModelColorSettingsPage implements ColorSettingsPage {

    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
            new AttributesDescriptor("CHANNEL", ModelSyntaxHighlighter.CHANNEL),
            new AttributesDescriptor("CHANNEL NAME", ModelSyntaxHighlighter.CHANNEL_NAME),
            new AttributesDescriptor("LEFT BRACE", ModelSyntaxHighlighter.LBRACE),
            new AttributesDescriptor("REF", ModelSyntaxHighlighter.REF),
            new AttributesDescriptor("IN", ModelSyntaxHighlighter.IN),
            new AttributesDescriptor("OUT", ModelSyntaxHighlighter.OUT),
            new AttributesDescriptor("Bad value", ModelSyntaxHighlighter.BAD_CHARACTER),
            new AttributesDescriptor("LBRACE",ModelSyntaxHighlighter.LBRACE),
            new AttributesDescriptor("RBRACE",ModelSyntaxHighlighter.RBRACE),
            new AttributesDescriptor("LBRACKET",ModelSyntaxHighlighter.LBRACKET),
            new AttributesDescriptor("RBRACKET",ModelSyntaxHighlighter.RBRACKET),
            new AttributesDescriptor("SYMBOL",ModelSyntaxHighlighter.SYMBOL),
            new AttributesDescriptor("EQUALS",ModelSyntaxHighlighter.EQUALS),
            new AttributesDescriptor("COMMA",ModelSyntaxHighlighter.COMMA)
    };

    @Nullable
    @Override
    public Icon getIcon() {
        return ModelIcons.FILE;
    }

    @NotNull
    @Override
    public SyntaxHighlighter getHighlighter() {
        return new ModelSyntaxHighlighter();
    }

    @NotNull
    @Override
    public String getDemoText() {
        return
                "channel CIO {\n" +
                        "\tout temp_f(p, observe(x)) == x\n" +
                        "}\n" +
                        "\n" +
                        "channel C1 {\n" +
                        "\tin  temp_f(q, conv(y)) == y\n" +
                        "\tout temp_c(r, conv(y)) == (y-32) / 1.8\n" +
                        "}\n" +
                        "\n" +
                        "channel C2 {\n" +
                        "\tin temp_f(q, update(z)) == z\n" +
                        "\tout highest(h, update(z)) == if(gt(z, h), z, h)\n" +
                        "}";

    }

    @Nullable
    @Override
    public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return null;
    }

    @Override
    public AttributesDescriptor @NotNull [] getAttributeDescriptors() {
        return DESCRIPTORS;
    }

    @Override
    public ColorDescriptor @NotNull [] getColorDescriptors() {
        return ColorDescriptor.EMPTY_ARRAY;
    }

    @NotNull
    @Override
    public String getDisplayName() {
        return "Model";
    }

}
