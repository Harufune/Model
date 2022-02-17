package ModelEditor;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;

public class ModelFile extends PsiFileBase {

    public ModelFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, ModelLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return ModelFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Model File";
    }

}
