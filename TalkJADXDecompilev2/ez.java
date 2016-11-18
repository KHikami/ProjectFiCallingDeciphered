package defpackage;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.Transition.EpicenterCallback;

public final class ez extends EpicenterCallback {
    final /* synthetic */ fb a;
    private Rect b;

    public ez(fb fbVar) {
        this.a = fbVar;
    }

    public Rect onGetEpicenter(Transition transition) {
        if (this.b == null && this.a.a != null) {
            this.b = gwb.f(this.a.a);
        }
        return this.b;
    }
}
