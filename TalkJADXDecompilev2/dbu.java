package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

final class dbu implements OnClickListener {
    final /* synthetic */ dbp a;

    dbu(dbp dbp) {
        this.a = dbp;
    }

    public void onClick(View view) {
        if (this.a.c != null) {
            this.a.c.b();
        }
    }
}
