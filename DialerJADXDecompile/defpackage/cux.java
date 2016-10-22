package defpackage;

import android.os.Process;

/* compiled from: PG */
/* renamed from: cux */
final class cux implements Runnable {
    private /* synthetic */ String a;
    private /* synthetic */ int b;
    private /* synthetic */ cuv c;

    cux(cuv cuv, String str, int i) {
        this.c = cuv;
        this.a = str;
        this.b = i;
    }

    public final void run() {
        cva cva = this.c.a;
        String str = this.a;
        cuq cuq = this.c.b;
        Integer valueOf = Integer.valueOf(this.b);
        dln dln = new dln();
        dln.a = cwv.a(valueOf.intValue(), Process.myPid(), null, cuq.a);
        cva.a(str, dln);
    }
}
