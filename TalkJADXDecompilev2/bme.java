package defpackage;

import android.text.Html;
import android.text.TextUtils;

public final class bme {
    public final int A;
    public final int B;
    public final String C;
    public final int D;
    public final String E;
    public final String F;
    public final String G;
    public final int H;
    public final long I;
    public final int J;
    public final int K;
    public final byte[] L;
    private String M = null;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final fwx f;
    public final fwy g;
    public final long h;
    public final long i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;
    public final String q;
    public final double r;
    public final double s;
    public final String t;
    public final String u;
    public final String v;
    public final String w;
    public final int x;
    public final String y;
    public final int z;

    public bme(String str, String str2, String str3, String str4, String str5, fwx fwx, fwy fwy, long j, long j2, String str6, String str7, String str8, String str9, String str10, String str11, String str12, double d, double d2, String str13, String str14, int i, String str15, int i2, int i3, int i4, String str16, int i5, String str17, String str18, String str19, int i6, String str20, String str21, String str22, long j3, int i7, int i8, byte[] bArr) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = fwx;
        this.g = fwy;
        this.h = j;
        this.i = j2;
        this.j = str6;
        this.k = str7;
        this.l = str8;
        this.m = str9;
        this.n = str10;
        this.o = str11;
        this.p = str12;
        this.q = str22;
        this.r = d;
        this.s = d2;
        this.t = str13;
        this.u = str14;
        this.v = str20;
        this.w = str21;
        this.x = i;
        this.y = str15;
        this.z = i2;
        this.A = i3;
        this.B = i4;
        this.C = str16;
        this.D = i5;
        this.E = str17;
        this.F = str18;
        this.G = str19;
        this.H = i6;
        this.I = j3;
        this.J = i7;
        this.K = i8;
        this.L = bArr;
    }

    public String a() {
        if (this.M == null) {
            if (TextUtils.isEmpty(this.e)) {
                this.M = "";
            } else if (this.x == 3) {
                this.M = this.e;
            } else {
                this.M = Html.fromHtml(this.e).toString();
            }
        }
        return this.M;
    }
}
