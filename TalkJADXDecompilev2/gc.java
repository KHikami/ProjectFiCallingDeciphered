package defpackage;

import android.net.Uri;

public final class gc {
    final CharSequence a;
    final long b;
    final CharSequence c;
    String d;
    Uri e;

    public gc(CharSequence charSequence, long j, CharSequence charSequence2) {
        this.a = charSequence;
        this.b = j;
        this.c = charSequence2;
    }

    public gc a(String str, Uri uri) {
        this.d = str;
        this.e = uri;
        return this;
    }

    public CharSequence a() {
        return this.a;
    }

    public long b() {
        return this.b;
    }

    public CharSequence c() {
        return this.c;
    }

    public String d() {
        return this.d;
    }

    public Uri e() {
        return this.e;
    }
}
