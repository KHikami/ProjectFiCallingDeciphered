package defpackage;

import android.util.Log;

/* renamed from: hbb */
final class hbb {
    final boolean a;
    private final String b;
    private final int c;

    protected hbb(String str, int i, boolean z) {
        this.b = str;
        this.c = i;
        this.a = z;
    }

    protected void a(String str) {
        Log.println(this.c, this.b, str);
    }

    protected boolean a() {
        return Log.isLoggable(this.b, this.c);
    }
}
