package defpackage;

import android.database.ContentObserver;

/* compiled from: PG */
/* renamed from: amq */
public final class amq extends ContentObserver {
    private /* synthetic */ amo a;

    public amq(amo amo) {
        this.a = amo;
        super(amo.a);
    }

    public final void onChange(boolean z) {
        this.a.d = true;
    }
}
