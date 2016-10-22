package defpackage;

import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;

/* compiled from: PG */
/* renamed from: aiu */
public final class aiu implements OnPreDrawListener {
    private /* synthetic */ View a;
    private /* synthetic */ Runnable b;
    private /* synthetic */ boolean c;

    public aiu(View view, Runnable runnable, boolean z) {
        this.a = view;
        this.b = runnable;
        this.c = z;
    }

    public final boolean onPreDraw() {
        this.a.getViewTreeObserver().removeOnPreDrawListener(this);
        this.b.run();
        return this.c;
    }
}
