package ModelEditor;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class ModelFileType extends LanguageFileType {

    public static final ModelFileType INSTANCE = new ModelFileType();

    private ModelFileType(){super(ModelLanguage.INSTANCE);}

    @NotNull
    @Override
    public String getName(){return "Model File";}

    @NotNull
    @Override
    public String getDescription(){return "Model language file";}

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "Model";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return  ModelIcons.FILE;
    }



}