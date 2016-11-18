package p000;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.Transition.EpicenterCallback;

public final class ex extends EpicenterCallback {
    final /* synthetic */ Rect f12424a;

    public ex(Rect rect) {
        this.f12424a = rect;
    }

    public Rect onGetEpicenter(Transition transition) {
        return this.f12424a;
    }
}
