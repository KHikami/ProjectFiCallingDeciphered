package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* renamed from: afj */
public final class afj {
    private String A;
    private String B;
    private String C;
    private String D;
    private int E;
    final Uri a;
    final long b;
    public final int c;
    public final long d;
    final String e;
    public final String f;
    final boolean g;
    public czt h;
    czy i;
    czt j;
    czt k;
    public byte[] l;
    byte[] m;
    private final Uri n;
    private final Uri o;
    private final String p;
    private final long q;
    private final long r;
    private final String s;
    private final String t;
    private final boolean u;
    private final Integer v;
    private final boolean w;
    private final String x;
    private final afk y;
    private final Exception z;

    afj(Uri uri, afk afk, Exception exception) {
        if (afk == afk.ERROR && exception == null) {
            throw new IllegalArgumentException("ERROR result must have exception");
        }
        this.y = afk;
        this.z = exception;
        this.n = uri;
        this.a = null;
        this.o = null;
        this.b = -1;
        this.p = null;
        this.q = -1;
        this.h = null;
        this.i = null;
        this.r = -1;
        this.c = 0;
        this.d = -1;
        this.e = null;
        this.f = null;
        this.s = null;
        this.t = null;
        this.u = false;
        this.v = null;
        this.j = null;
        this.w = false;
        this.x = null;
        this.g = false;
    }

    public afj(Uri uri, Uri uri2, Uri uri3, long j, String str, long j2, long j3, int i, long j4, String str2, String str3, String str4, String str5, boolean z, Integer num, boolean z2, String str6, boolean z3) {
        this.y = afk.LOADED;
        this.z = null;
        this.n = uri;
        this.a = uri3;
        this.o = uri2;
        this.b = j;
        this.p = str;
        this.q = j2;
        this.h = null;
        this.i = null;
        this.r = j3;
        this.c = i;
        this.d = j4;
        this.e = str2;
        this.f = str3;
        this.s = str4;
        this.t = str5;
        this.u = z;
        this.v = num;
        this.j = null;
        this.w = z2;
        this.x = str6;
        this.g = z3;
    }

    public static afj a(Uri uri) {
        return new afj(uri, afk.NOT_FOUND, null);
    }

    public final void a(String str, String str2, String str3, String str4, int i) {
        this.A = str;
        this.B = str2;
        this.C = str3;
        this.D = str4;
        this.E = i;
    }

    public final boolean a() {
        return this.y == afk.LOADED;
    }

    public final boolean b() {
        return (this.b == -1 || this.b == 0 || this.b == 1) ? false : true;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.n);
        String str = this.p;
        String valueOf2 = String.valueOf(this.o);
        String valueOf3 = String.valueOf(this.y);
        return new StringBuilder((((String.valueOf(valueOf).length() + 36) + String.valueOf(str).length()) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append("{requested=").append(valueOf).append(",lookupkey=").append(str).append(",uri=").append(valueOf2).append(",status=").append(valueOf3).append("}").toString();
    }
}
