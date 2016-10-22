package defpackage;

import android.view.View;

/* compiled from: PG */
/* renamed from: dc */
final class dc extends di {
    private /* synthetic */ db a;

    dc(db dbVar) {
        this.a = dbVar;
    }

    public final View a(int i) {
        if (this.a.K != null) {
            return this.a.K.findViewById(i);
        }
        throw new IllegalStateException("Fragment does not have a view");
    }

    public final boolean a() {
        return this.a.K != null;
    }
}
