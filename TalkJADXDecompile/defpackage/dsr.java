package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: dsr */
final class dsr implements OnClickListener {
    final /* synthetic */ boolean a;
    final /* synthetic */ dsk b;
    final /* synthetic */ String c;
    final /* synthetic */ String d;
    final /* synthetic */ int e;
    final /* synthetic */ dso f;

    dsr(dso dso, boolean z, dsk dsk, String str, String str2, int i) {
        this.f = dso;
        this.a = z;
        this.b = dsk;
        this.c = str;
        this.d = str2;
        this.e = i;
    }

    public void onClick(View view) {
        dso.a(this.f, this.a, this.b, this.c, this.d, this.e);
    }
}
