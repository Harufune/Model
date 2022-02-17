package ModelEditor;

import com.intellij.lang.Language;

public class ModelLanguage extends Language {

        public static final ModelLanguage INSTANCE = new ModelLanguage();

        private ModelLanguage(){super("Model");}
}
