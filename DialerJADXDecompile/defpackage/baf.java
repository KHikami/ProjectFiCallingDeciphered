package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: baf */
final class baf implements bal {
    private /* synthetic */ Context a;
    private /* synthetic */ bad b;
    private /* synthetic */ bal c;

    baf(Context context, bad bad, bal bal) {
        this.a = context;
        this.b = bad;
        this.c = bal;
    }

    public final void a(int i, Object obj, bad bad) {
        bdf.a("CallerInfoAsyncQuery", "contactsProviderQueryCompleteListener done");
        if (((bad != null && bad.j) || !bae.b(i, this.a, this.b, this.c, obj)) && this.c != null && bad != null) {
            this.c.a(i, obj, bad);
        }
    }
}
