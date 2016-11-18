package defpackage;

import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.Window.Callback;
import java.util.List;

final class uy extends vf {
    final /* synthetic */ ux b;

    uy(ux uxVar, Callback callback) {
        this.b = uxVar;
        super(uxVar, callback);
    }

    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
        vq g = this.b.g(0);
        if (g == null || g.j == null) {
            super.onProvideKeyboardShortcuts(list, menu, i);
        } else {
            super.onProvideKeyboardShortcuts(list, g.j, i);
        }
    }
}
