package p000;

import android.content.Context;

public final class jvu {
    private final int f21146a;
    private final String f21147b;
    private final jcf f21148c;

    public jvu(Context context, int i, String str) {
        this.f21148c = (jcf) jyn.m25426a(context, jcf.class);
        this.f21146a = i;
        this.f21147b = str;
    }

    public void m25330a(boolean z) {
        this.f21148c.mo3464b(this.f21146a).m23881b(this.f21147b, z).m23891d();
    }

    public Boolean m25331b(boolean z) {
        return Boolean.valueOf(this.f21148c.mo3456a(this.f21146a).mo3439a(this.f21147b, z));
    }
}
