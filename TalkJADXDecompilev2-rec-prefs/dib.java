package p000;

import android.app.PendingIntent;
import android.net.Uri;

public final class dib {
    private final String f9804a;
    private final int f9805b;
    private int f9806c = 1;
    private String f9807d;
    private String f9808e;
    private String f9809f;
    private String f9810g;
    private String f9811h;
    private String f9812i;
    private String f9813j;
    private String f9814k;
    private String f9815l;
    private PendingIntent f9816m;
    private Uri f9817n;

    public dib(String str, int i) {
        this.f9804a = str;
        this.f9805b = i;
    }

    public dib m11911a(int i) {
        this.f9806c = i;
        return this;
    }

    public dib m11912a(String str) {
        this.f9807d = str;
        return this;
    }

    public dib m11913b(String str) {
        this.f9808e = str;
        return this;
    }

    public dib m11914c(String str) {
        this.f9809f = str;
        return this;
    }

    public dib m11915d(String str) {
        this.f9810g = str;
        return this;
    }

    public dib m11916e(String str) {
        this.f9811h = str;
        return this;
    }

    public dib m11917f(String str) {
        this.f9812i = str;
        return this;
    }

    public dib m11918g(String str) {
        this.f9813j = str;
        return this;
    }

    public dib m11919h(String str) {
        this.f9814k = str;
        return this;
    }

    public dib m11920i(String str) {
        this.f9815l = str;
        return this;
    }

    public dhz m11910a() {
        return new dhz(this.f9804a, this.f9805b, this.f9806c, this.f9807d, this.f9808e, this.f9809f, this.f9810g, this.f9811h, this.f9812i, this.f9813j, this.f9814k, this.f9815l, this.f9816m, this.f9817n);
    }
}
