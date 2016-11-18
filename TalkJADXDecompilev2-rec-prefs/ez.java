package p000;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.Transition.EpicenterCallback;

public final class ez extends EpicenterCallback {
    final /* synthetic */ fb f12526a;
    private Rect f12527b;

    public ez(fb fbVar) {
        this.f12526a = fbVar;
    }

    public Rect onGetEpicenter(Transition transition) {
        if (this.f12527b == null && this.f12526a.f12607a != null) {
            this.f12527b = gwb.m2193f(this.f12526a.f12607a);
        }
        return this.f12527b;
    }
}
