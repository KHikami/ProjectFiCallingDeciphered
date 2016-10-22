package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

/* renamed from: dfy */
final class dfy implements OnClickListener {
    final /* synthetic */ View a;
    final /* synthetic */ dfw b;

    dfy(dfw dfw, View view) {
        this.b = dfw;
        this.a = view;
    }

    public void onClick(View view) {
        this.a.setVisibility(8);
        dfw dfw = this.b;
        dfw.c.a(dfw.a).b().c(2866);
        gwb.j(this.b.b, this.b.a);
        this.b.b();
        Toast.makeText(this.b.b, gwb.pX, 0).show();
    }
}
