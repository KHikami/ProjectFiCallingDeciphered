package p000;

import android.util.Log;

final class hbb {
    final boolean f16497a;
    private final String f16498b;
    private final int f16499c;

    protected hbb(String str, int i, boolean z) {
        this.f16498b = str;
        this.f16499c = i;
        this.f16497a = z;
    }

    protected void m19122a(String str) {
        Log.println(this.f16499c, this.f16498b, str);
    }

    protected boolean m19123a() {
        return Log.isLoggable(this.f16498b, this.f16499c);
    }
}
