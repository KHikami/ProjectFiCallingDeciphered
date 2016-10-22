package defpackage;

import android.content.Context;

/* renamed from: iyp */
final class iyp implements Runnable {
    final /* synthetic */ Context a;
    final /* synthetic */ iyo b;

    iyp(iyo iyo, Context context) {
        this.b = iyo;
        this.a = context;
    }

    public void run() {
        iyn.a.c(this.a);
    }
}
