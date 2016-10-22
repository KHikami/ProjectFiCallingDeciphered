package defpackage;

import android.app.PendingIntent;
import android.net.Uri;

/* renamed from: dib */
public final class dib {
    private final String a;
    private final int b;
    private int c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;
    private PendingIntent m;
    private Uri n;

    public dib(String str, int i) {
        this.c = 1;
        this.a = str;
        this.b = i;
    }

    public dib a(int i) {
        this.c = i;
        return this;
    }

    public dib a(String str) {
        this.d = str;
        return this;
    }

    public dib b(String str) {
        this.e = str;
        return this;
    }

    public dib c(String str) {
        this.f = str;
        return this;
    }

    public dib d(String str) {
        this.g = str;
        return this;
    }

    public dib e(String str) {
        this.h = str;
        return this;
    }

    public dib f(String str) {
        this.i = str;
        return this;
    }

    public dib g(String str) {
        this.j = str;
        return this;
    }

    public dib h(String str) {
        this.k = str;
        return this;
    }

    public dib i(String str) {
        this.l = str;
        return this;
    }

    public dhz a() {
        return new dhz(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n);
    }
}
