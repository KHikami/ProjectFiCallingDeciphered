package p000;

import android.view.View;
import android.view.View.OnClickListener;

final class dsr implements OnClickListener {
    final /* synthetic */ boolean f10464a;
    final /* synthetic */ dsk f10465b;
    final /* synthetic */ String f10466c;
    final /* synthetic */ String f10467d;
    final /* synthetic */ int f10468e;
    final /* synthetic */ dso f10469f;

    dsr(dso dso, boolean z, dsk dsk, String str, String str2, int i) {
        this.f10469f = dso;
        this.f10464a = z;
        this.f10465b = dsk;
        this.f10466c = str;
        this.f10467d = str2;
        this.f10468e = i;
    }

    public void onClick(View view) {
        dso.m12623a(this.f10469f, this.f10464a, this.f10465b, this.f10466c, this.f10467d, this.f10468e);
    }
}
