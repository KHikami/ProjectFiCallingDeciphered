package defpackage;

import android.content.Context;
import android.telecom.PhoneAccountHandle;

/* compiled from: PG */
/* renamed from: alb */
public final class alb extends akd {
    private final Context a;
    private final ald b;
    private final ale c;

    public alb(Context context, ald ald, ale ale) {
        this.a = context;
        this.b = ald;
        this.c = ale;
    }

    public final void a(PhoneAccountHandle phoneAccountHandle, boolean z) {
        buf.a(this.b, this.c, axk.a(this.a, phoneAccountHandle));
    }
}
