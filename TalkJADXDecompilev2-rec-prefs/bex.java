package p000;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;

public final class bex implements OnClickListener {
    final /* synthetic */ fdv f3167a;
    final /* synthetic */ Context f3168b;
    final /* synthetic */ int f3169c;
    final /* synthetic */ String f3170d;
    final /* synthetic */ bgc f3171e;

    public bex(fdv fdv, Context context, int i, String str, bgc bgc) {
        this.f3167a = fdv;
        this.f3168b = context;
        this.f3169c = i;
        this.f3170d = str;
        this.f3171e = bgc;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Intent a = this.f3167a.m15104a(this.f3168b, this.f3169c, this.f3170d);
        this.f3171e.m5185a(2250);
        this.f3168b.startActivity(a);
    }
}
