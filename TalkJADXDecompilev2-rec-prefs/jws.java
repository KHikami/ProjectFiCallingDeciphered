package p000;

import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;

final class jws implements OnKeyListener {
    final /* synthetic */ jwp f21167a;

    jws(jwp jwp) {
        this.f21167a = jwp;
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (this.f21167a.f13967e.getSelectedItem() instanceof jwi) {
            this.f21167a.f13967e.getSelectedView();
        }
        return false;
    }
}
