package p000;

import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.Window.Callback;
import java.util.List;

final class uy extends vf {
    final /* synthetic */ ux f35357b;

    uy(ux uxVar, Callback callback) {
        this.f35357b = uxVar;
        super(uxVar, callback);
    }

    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
        vq g = this.f35357b.m41005g(0);
        if (g == null || g.f35386j == null) {
            super.onProvideKeyboardShortcuts(list, menu, i);
        } else {
            super.onProvideKeyboardShortcuts(list, g.f35386j, i);
        }
    }
}
