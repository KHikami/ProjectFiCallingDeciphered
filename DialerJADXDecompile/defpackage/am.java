package defpackage;

import android.view.View;

/* compiled from: PG */
/* renamed from: am */
final class am implements Runnable {
    private final View a;
    private final boolean b;
    private /* synthetic */ aj c;

    am(aj ajVar, View view, boolean z) {
        this.c = ajVar;
        this.a = view;
        this.b = z;
    }

    public final void run() {
        if (this.c.a != null && this.c.a.a(true)) {
            kn.a(this.a, (Runnable) this);
        } else if (this.b && this.c.b != null) {
            this.c.b.a(this.a);
        }
    }
}
