package defpackage;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.Transition.EpicenterCallback;

/* compiled from: PG */
/* renamed from: eb */
public final class eb extends EpicenterCallback {
    private Rect a;
    private /* synthetic */ ed b;

    public eb(ed edVar) {
        this.b = edVar;
    }

    public final Rect onGetEpicenter(Transition transition) {
        if (this.a == null && this.b.a != null) {
            this.a = buf.e(this.b.a);
        }
        return this.a;
    }
}
