package com.tyron.code.ui.file.tree.model;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.appcompat.content.res.AppCompatResources;
import java.io.File;
import org.codeassist.unofficial.R;

public class TreeImage extends TreeFile {

  public TreeImage(File file) {
    super(file);
  }

  @Override
  public Drawable getIcon(Context context) {
    return AppCompatResources.getDrawable(context, R.drawable.image_dark);
  }
}