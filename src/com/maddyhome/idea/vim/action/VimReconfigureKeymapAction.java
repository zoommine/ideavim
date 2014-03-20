/*
 * IdeaVim - Vim emulator for IDEs based on the IntelliJ platform
 * Copyright (C) 2003-2013 The IdeaVim authors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package com.maddyhome.idea.vim.action;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.project.DumbAware;
import com.maddyhome.idea.vim.VimKeyMapUtil;
import com.maddyhome.idea.vim.VimPlugin;
import org.jetbrains.annotations.NotNull;

/**
 * This action allows to reconfigure base parent keymap for the Vim keymap
 * @author oleg
 */
public class VimReconfigureKeymapAction extends AnAction implements DumbAware {
  @Override
  public void update(@NotNull final AnActionEvent e) {
    e.getPresentation().setEnabled(VimPlugin.isEnabled());
  }

  @Override
  public void actionPerformed(@NotNull final AnActionEvent e) {
    VimKeyMapUtil.installKeyBoardBindings();
    VimKeyMapUtil.switchKeymapBindings(true);
  }
}