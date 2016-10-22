package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* renamed from: au */
final class au implements Runnable {
    private /* synthetic */ at a;

    au(at atVar) {
        this.a = atVar;
    }

    public final void run() {
        at atVar = this.a;
        if (atVar.c) {
            float b = buf.b(((float) (SystemClock.uptimeMillis() - atVar.b)) / ((float) atVar.d), 0.0f, 1.0f);
            if (atVar.e != null) {
                b = atVar.e.getInterpolation(b);
            }
            atVar.g = b;
            if (atVar.f != null) {
                atVar.f.a();
            }
            if (SystemClock.uptimeMillis() >= atVar.b + atVar.d) {
                atVar.c = false;
            }
        }
        if (atVar.c) {
            at.a.postDelayed(atVar.h, 10);
        }
    }
}
