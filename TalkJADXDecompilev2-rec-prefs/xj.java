package p000;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window.Callback;
import android.view.WindowManager.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

public class xj implements Callback {
    final Callback f35323e;

    public xj(Callback callback) {
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f35323e = callback;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f35323e.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f35323e.dispatchKeyShortcutEvent(keyEvent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f35323e.dispatchTouchEvent(motionEvent);
    }

    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f35323e.dispatchTrackballEvent(motionEvent);
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f35323e.dispatchGenericMotionEvent(motionEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f35323e.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public View onCreatePanelView(int i) {
        return this.f35323e.onCreatePanelView(i);
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        return this.f35323e.onCreatePanelMenu(i, menu);
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        return this.f35323e.onPreparePanel(i, view, menu);
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return this.f35323e.onMenuOpened(i, menu);
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f35323e.onMenuItemSelected(i, menuItem);
    }

    public void onWindowAttributesChanged(LayoutParams layoutParams) {
        this.f35323e.onWindowAttributesChanged(layoutParams);
    }

    public void onContentChanged() {
        this.f35323e.onContentChanged();
    }

    public void onWindowFocusChanged(boolean z) {
        this.f35323e.onWindowFocusChanged(z);
    }

    public void onAttachedToWindow() {
        this.f35323e.onAttachedToWindow();
    }

    public void onDetachedFromWindow() {
        this.f35323e.onDetachedFromWindow();
    }

    public void onPanelClosed(int i, Menu menu) {
        this.f35323e.onPanelClosed(i, menu);
    }

    public boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f35323e.onSearchRequested(searchEvent);
    }

    public boolean onSearchRequested() {
        return this.f35323e.onSearchRequested();
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f35323e.onWindowStartingActionMode(callback);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        return this.f35323e.onWindowStartingActionMode(callback, i);
    }

    public void onActionModeStarted(ActionMode actionMode) {
        this.f35323e.onActionModeStarted(actionMode);
    }

    public void onActionModeFinished(ActionMode actionMode) {
        this.f35323e.onActionModeFinished(actionMode);
    }

    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
        this.f35323e.onProvideKeyboardShortcuts(list, menu, i);
    }
}
