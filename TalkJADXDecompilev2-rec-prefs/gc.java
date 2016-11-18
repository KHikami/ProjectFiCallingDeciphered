package p000;

import android.net.Uri;

public final class gc {
    final CharSequence f14633a;
    final long f14634b;
    final CharSequence f14635c;
    String f14636d;
    Uri f14637e;

    public gc(CharSequence charSequence, long j, CharSequence charSequence2) {
        this.f14633a = charSequence;
        this.f14634b = j;
        this.f14635c = charSequence2;
    }

    public gc m16883a(String str, Uri uri) {
        this.f14636d = str;
        this.f14637e = uri;
        return this;
    }

    public CharSequence m16884a() {
        return this.f14633a;
    }

    public long m16885b() {
        return this.f14634b;
    }

    public CharSequence m16886c() {
        return this.f14635c;
    }

    public String m16887d() {
        return this.f14636d;
    }

    public Uri m16888e() {
        return this.f14637e;
    }
}
