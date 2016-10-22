package defpackage;

import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.WindowInsets;

/* compiled from: PG */
/* renamed from: ky */
public final class ky implements OnApplyWindowInsetsListener {
    private /* synthetic */ kf a;

    public ky(kf kfVar) {
        this.a = kfVar;
    }

    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        return ((mk) this.a.a(view, new mk(windowInsets))).a;
    }
}
