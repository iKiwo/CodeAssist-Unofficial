package com.tyron.code.ui.file.tree.model;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.appcompat.content.res.AppCompatResources;
import java.io.File;
import org.codeassist.unofficial.R;

public class TreeJavaFile extends TreeFile {

  public TreeJavaFile(File file) {
    super(file);
  }

  @Override
  public Drawable getIcon(Context context) {
    return AppCompatResources.getDrawable(context, R.drawable.java_dark);
  }
}