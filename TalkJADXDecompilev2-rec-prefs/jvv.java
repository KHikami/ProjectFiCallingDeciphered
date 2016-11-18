package p000;

import android.content.Context;

public final class jvv extends jxk {
    private final jvu f21149c;

    public jvv(Context context, int i, String str) {
        this(context, i, str, null);
    }

    public jvv(Context context, int i, String str, Boolean bool) {
        super(context);
        if (bool == null) {
            bool = Boolean.FALSE;
        }
        m5128b((Object) bool);
        this.f21149c = new jvu(context, i, str);
    }

    protected void mo530a(boolean z, Object obj) {
        mo534a(mo3621c(gwb.m2061b((Boolean) obj)));
    }

    protected boolean mo3620b(boolean z) {
        this.f21149c.m25330a(z);
        return true;
    }

    protected boolean mo3621c(boolean z) {
        return gwb.m2061b(this.f21149c.m25331b(z));
    }
}
