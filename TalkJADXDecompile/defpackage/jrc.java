package defpackage;

import android.content.Context;

/* renamed from: jrc */
public final class jrc {
    private static final jre i;
    private final Context a;
    private String b;
    private String c;
    private String d;
    private jre e;
    private boolean f;
    private jrk g;
    private jpu h;

    static {
        i = new jrd();
    }

    public jrc(Context context) {
        this.e = i;
        this.g = jrk.NO_POLICY;
        this.h = jpu.a;
        ba.a((Object) context, (Object) "context must be non-null");
        this.a = context;
    }

    public jrc a(String str) {
        this.b = str;
        return this;
    }

    public jrc b(String str) {
        this.c = str;
        return this;
    }

    public jrc a(jre jre) {
        ba.a((Object) jre, (Object) "progressListener must be non-null");
        this.e = jre;
        return this;
    }

    public jrc a(jrk jrk) {
        this.g = (jrk) ba.a((Object) jrk);
        return this;
    }

    Context a() {
        return this.a;
    }

    String b() {
        return this.b;
    }

    String c() {
        return this.c;
    }

    String d() {
        return this.d;
    }

    jre e() {
        return this.e;
    }

    boolean f() {
        return this.f;
    }

    jrk g() {
        return this.g;
    }

    jpu h() {
        return this.h;
    }
}
