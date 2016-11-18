package p000;

import android.content.Context;

public final class jrc {
    private static final jre f20824i = new jrd();
    private final Context f20825a;
    private String f20826b;
    private String f20827c;
    private String f20828d;
    private jre f20829e = f20824i;
    private boolean f20830f;
    private jrk f20831g = jrk.NO_POLICY;
    private jpu f20832h = jpu.f20749a;

    public jrc(Context context) {
        ba.m4537a((Object) context, (Object) "context must be non-null");
        this.f20825a = context;
    }

    public jrc m25049a(String str) {
        this.f20826b = str;
        return this;
    }

    public jrc m25053b(String str) {
        this.f20827c = str;
        return this;
    }

    public jrc m25050a(jre jre) {
        ba.m4537a((Object) jre, (Object) "progressListener must be non-null");
        this.f20829e = jre;
        return this;
    }

    public jrc m25051a(jrk jrk) {
        this.f20831g = (jrk) ba.m4536a((Object) jrk);
        return this;
    }

    Context m25048a() {
        return this.f20825a;
    }

    String m25052b() {
        return this.f20826b;
    }

    String m25054c() {
        return this.f20827c;
    }

    String m25055d() {
        return this.f20828d;
    }

    jre m25056e() {
        return this.f20829e;
    }

    boolean m25057f() {
        return this.f20830f;
    }

    jrk m25058g() {
        return this.f20831g;
    }

    jpu m25059h() {
        return this.f20832h;
    }
}
