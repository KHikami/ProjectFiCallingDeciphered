package p000;

import android.content.Context;

final class jgr implements Runnable {
    final /* synthetic */ jgc f20027a;
    final /* synthetic */ jgo f20028b;

    jgr(jgo jgo, jgc jgc) {
        this.f20028b = jgo;
        this.f20027a = jgc;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        boolean z = false;
        jgc jgc = this.f20027a;
        Context context = this.f20028b.f20020a;
        jgz jgz = new jgz(false);
        if (context == null) {
            try {
            } catch (Throwable th) {
                try {
                    jgc.f4190e.mo3504a(jgc, jgz);
                } finally {
                    jgc.m6405d(context);
                }
            } finally {
                jgc.m6405d(context);
            }
        }
        z = true;
        ba.m4578a(z, (Object) "You must provide a Context with your background task, or if you're using deprecated methods, you must provide your BackgroundTask with a Context.");
        jgz c = jgc.mo2093c();
        if (c == null && context != null) {
            c = jgc.mo648a(context);
        }
        if (c == null) {
            String valueOf = String.valueOf(jgc.getClass());
            throw new AssertionError(new StringBuilder(String.valueOf(valueOf).length() + 31).append("Null result in BackgroundTask: ").append(valueOf).toString());
        }
        c.m24189a(jgc.f4191f);
        c.f20048b = lka.m29200a();
        try {
            jgc.f4190e.mo3504a(jgc, c);
        } finally {
            jgc.m6405d(context);
        }
    }
}
