package defpackage;

import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;

final class jws implements OnKeyListener {
    final /* synthetic */ jwp a;

    jws(jwp jwp) {
        this.a = jwp;
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (this.a.e.getSelectedItem() instanceof jwi) {
            this.a.e.getSelectedView();
        }
        return false;
    }
}
