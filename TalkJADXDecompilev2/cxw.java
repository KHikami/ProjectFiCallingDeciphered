package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnKeyListener;
import android.view.KeyEvent;

final class cxw implements OnKeyListener {
    final /* synthetic */ cxv a;

    cxw(cxv cxv) {
        this.a = cxv;
    }

    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
            return false;
        }
        if (this.a.B) {
            return true;
        }
        this.a.b(true);
        return true;
    }
}
