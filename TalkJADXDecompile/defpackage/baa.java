package defpackage;

import android.util.Log;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.lang.ref.WeakReference;

/* renamed from: baa */
final class baa implements OnPreDrawListener {
    private final WeakReference<azz> a;

    public baa(azz azz) {
        this.a = new WeakReference(azz);
    }

    public boolean onPreDraw() {
        if (Log.isLoggable("ViewTarget", 2)) {
            String valueOf = String.valueOf(this);
            new StringBuilder(String.valueOf(valueOf).length() + 39).append("OnGlobalLayoutListener called listener=").append(valueOf);
        }
        azz azz = (azz) this.a.get();
        if (azz != null) {
            azz.a();
        }
        return true;
    }
}
