package p000;

import android.net.Uri;

final class cjt {
    private String f5455a;
    private cju f5456b;
    private long f5457c;
    private Uri f5458d;
    private String f5459e;
    private long f5460f;
    private long f5461g;
    private int f5462h;
    private int f5463i;
    private int f5464j;
    private long f5465k;

    cjt(String str, cju cju) {
        boolean z = cju == cju.IMAGE || cju == cju.VIDEO;
        ba.m4577a(z);
        this.f5455a = str;
        this.f5456b = cju;
    }

    cjs m7816a() {
        cjs cjs = new cjs(this.f5455a, this.f5456b);
        cjs.f5446d = this.f5457c;
        cjs.f5447e = this.f5458d;
        cjs.f5448f = this.f5459e;
        cjs.f5449g = this.f5460f;
        cjs.f5451i = this.f5461g;
        cjs.f5452j = this.f5462h;
        cjs.f5453k = this.f5463i;
        cjs.f5454l = this.f5464j;
        cjs.f5445c = this.f5465k;
        return cjs;
    }

    cjt m7818a(long j) {
        this.f5465k = j;
        return this;
    }

    cjt m7822b(long j) {
        this.f5457c = j;
        return this;
    }

    cjt m7819a(Uri uri) {
        this.f5458d = uri;
        return this;
    }

    cjt m7820a(String str) {
        this.f5459e = str;
        return this;
    }

    cjt m7824c(long j) {
        this.f5460f = j;
        return this;
    }

    cjt m7825d(long j) {
        this.f5461g = j;
        return this;
    }

    cjt m7817a(int i) {
        this.f5462h = i;
        return this;
    }

    cjt m7821b(int i) {
        this.f5463i = i;
        return this;
    }

    cjt m7823c(int i) {
        this.f5464j = i;
        return this;
    }
}
