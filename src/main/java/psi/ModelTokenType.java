package psi;

//import com.esotericsoftware.kryo.NotNull;

import com.intellij.psi.tree.IElementType;
import ModelEditor.ModelLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class ModelTokenType extends IElementType {

    public ModelTokenType(@NotNull @NonNls String debugName) {
        super(debugName, ModelLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "ModelTokenType." + super.toString();
    }

}

