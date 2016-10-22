package defpackage;

import android.app.Fragment;
import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* renamed from: bx */
class bx {
    public void a(Fragment fragment, boolean z) {
    }

    public void b(Fragment fragment, boolean z) {
    }

    public void a(Fragment fragment, String[] strArr, int i) {
        new Handler(Looper.getMainLooper()).post(new bw(this, strArr, fragment, i));
    }

    bx() {
    }
}
