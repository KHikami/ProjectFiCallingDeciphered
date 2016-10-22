package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: dbq */
final class dbq implements OnClickListener {
    final /* synthetic */ dbp a;

    dbq(dbp dbp) {
        this.a = dbp;
    }

    public void onClick(View view) {
        if (this.a.c != null) {
            this.a.c.c();
        }
    }
}
