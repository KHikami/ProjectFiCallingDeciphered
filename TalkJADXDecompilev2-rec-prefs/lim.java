package p000;

import android.content.Context;

public final class lim implements onc {
    private final onc<Context> f25044a;
    private final onc<ihg> f25045b;
    private final onc<idv> f25046c;

    public /* synthetic */ Object mo1297a() {
        return m29101b();
    }

    public lim(onc<Context> onc_android_content_Context, onc<ihg> onc_ihg, onc<idv> onc_idv) {
        this.f25044a = onc_android_content_Context;
        this.f25045b = onc_ihg;
        this.f25046c = onc_idv;
    }

    private lhi m29101b() {
        return (lhi) bn.m6215a(gwb.m1710a((Context) this.f25044a.mo1297a(), (ihg) this.f25045b.mo1297a(), (idv) this.f25046c.mo1297a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
