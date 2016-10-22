import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.Window.Callback;

/* compiled from: PG */
class qd extends sf {
    private /* synthetic */ qc a;

    qd(qc qcVar, Callback callback) {
        this.a = qcVar;
        super(callback);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.a.a(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return super.dispatchKeyShortcutEvent(keyEvent) || this.a.a(keyEvent.getKeyCode(), keyEvent);
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof su)) {
            return super.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    public void onContentChanged() {
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        su suVar;
        if (menu instanceof su) {
            suVar = (su) menu;
        } else {
            suVar = null;
        }
        if (i == 0 && suVar == null) {
            return false;
        }
        if (suVar != null) {
            suVar.j = true;
        }
        boolean onPreparePanel = super.onPreparePanel(i, view, menu);
        if (suVar == null) {
            return onPreparePanel;
        }
        suVar.j = false;
        return onPreparePanel;
    }

    public boolean onMenuOpened(int i, Menu menu) {
        super.onMenuOpened(i, menu);
        this.a.e(i);
        return true;
    }

    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
        this.a.d(i);
    }
}
