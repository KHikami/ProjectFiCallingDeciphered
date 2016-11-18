package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

final class egx implements OnClickListener {
    final /* synthetic */ View a;
    final /* synthetic */ egv b;

    egx(egv egv, View view) {
        this.b = egv;
        this.a = view;
    }

    public void onClick(View view) {
        glk.c("Babel", "contact permission banner declined", new Object[0]);
        gwb.a(this.b.i, 2672);
        this.a.setVisibility(8);
        bkq.a(this.b.context, this.b.i.g(), true);
    }
}
