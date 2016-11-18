package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnKeyListener;
import android.view.KeyEvent;

final class cxw implements OnKeyListener {
    final /* synthetic */ cxv f9316a;

    cxw(cxv cxv) {
        this.f9316a = cxv;
    }

    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
            return false;
        }
        if (this.f9316a.f9280B) {
            return true;
        }
        this.f9316a.m11242b(true);
        return true;
    }
}
