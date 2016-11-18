package p000;

import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.Window.Callback;

class uw extends xj {
    final /* synthetic */ ut f35324a;

    uw(ut utVar, Callback callback) {
        this.f35324a = utVar;
        super(callback);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f35324a.mo4419a(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return super.dispatchKeyShortcutEvent(keyEvent) || this.f35324a.mo4418a(keyEvent.getKeyCode(), keyEvent);
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof xy)) {
            return super.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    public void onContentChanged() {
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        xy xyVar;
        if (menu instanceof xy) {
            xyVar = (xy) menu;
        } else {
            xyVar = null;
        }
        if (i == 0 && xyVar == null) {
            return false;
        }
        if (xyVar != null) {
            xyVar.m41429c(true);
        }
        boolean onPreparePanel = super.onPreparePanel(i, view, menu);
        if (xyVar == null) {
            return onPreparePanel;
        }
        xyVar.m41429c(false);
        return onPreparePanel;
    }

    public boolean onMenuOpened(int i, Menu menu) {
        super.onMenuOpened(i, menu);
        this.f35324a.mo4427e(i);
        return true;
    }

    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
        this.f35324a.mo4426d(i);
    }
}
