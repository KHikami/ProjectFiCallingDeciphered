package p000;

import android.util.Log;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.lang.ref.WeakReference;

final class baa implements OnPreDrawListener {
    private final WeakReference<azz> f2716a;

    public baa(azz azz) {
        this.f2716a = new WeakReference(azz);
    }

    public boolean onPreDraw() {
        if (Log.isLoggable("ViewTarget", 2)) {
            String valueOf = String.valueOf(this);
            new StringBuilder(String.valueOf(valueOf).length() + 39).append("OnGlobalLayoutListener called listener=").append(valueOf);
        }
        azz azz = (azz) this.f2716a.get();
        if (azz != null) {
            azz.m4513a();
        }
        return true;
    }
}
