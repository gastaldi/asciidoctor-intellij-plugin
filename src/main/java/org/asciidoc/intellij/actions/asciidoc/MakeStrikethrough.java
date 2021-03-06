package org.asciidoc.intellij.actions.asciidoc;

/**
 * @author Erik Pragt
 */
public class MakeStrikethrough extends FormatAsciiDocAction {
  @Override
  public String getName() {
    return "MakeStrikethrough";
  }

  @Override
  public String updateSelection(String selection) {
    if(selection.startsWith("[line-through]#") && selection.endsWith("#")) {
      return selection.substring(15, selection.length() - 1);
    }

    return "[line-through]#" + selection + "#";
  }
}
