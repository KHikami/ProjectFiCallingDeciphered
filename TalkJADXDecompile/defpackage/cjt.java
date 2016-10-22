package defpackage;

import android.net.Uri;

/* renamed from: cjt */
final class cjt {
    private String a;
    private cju b;
    private long c;
    private Uri d;
    private String e;
    private long f;
    private long g;
    private int h;
    private int i;
    private int j;
    private long k;

    cjt(String str, cju cju) {
        boolean z = cju == cju.IMAGE || cju == cju.VIDEO;
        ba.a(z);
        this.a = str;
        this.b = cju;
    }

    cjs a() {
        cjs cjs = new cjs(this.a, this.b);
        cjs.d = this.c;
        cjs.e = this.d;
        cjs.f = this.e;
        cjs.g = this.f;
        cjs.i = this.g;
        cjs.j = this.h;
        cjs.k = this.i;
        cjs.l = this.j;
        cjs.c = this.k;
        return cjs;
    }

    cjt a(long j) {
        this.k = j;
        return this;
    }

    cjt b(long j) {
        this.c = j;
        return this;
    }

    cjt a(Uri uri) {
        this.d = uri;
        return this;
    }

    cjt a(String str) {
        this.e = str;
        return this;
    }

    cjt c(long j) {
        this.f = j;
        return this;
    }

    cjt d(long j) {
        this.g = j;
        return this;
    }

    cjt a(int i) {
        this.h = i;
        return this;
    }

    cjt b(int i) {
        this.i = i;
        return this;
    }

    cjt c(int i) {
        this.j = i;
        return this;
    }
}
