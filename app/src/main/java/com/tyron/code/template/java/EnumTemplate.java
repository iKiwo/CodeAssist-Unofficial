package com.tyron.code.template.java;

import android.os.Parcel;
import com.tyron.code.template.CodeTemplate;

public class EnumTemplate extends JavaClassTemplate {

  public EnumTemplate() {}

  public EnumTemplate(Parcel in) {
    super(in);
  }

  @Override
  public String getName() {
    return "Interface";
  }

  @Override
  public void setup() {
    setContents(
        "package "
            + CodeTemplate.PACKAGE_NAME
            + ";\n"
            + "\npublic enum "
            + CodeTemplate.CLASS_NAME
            + " {\n\t\n}");
  }
}
