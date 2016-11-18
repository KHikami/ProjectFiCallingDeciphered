package p000;

import android.content.Context;

public final class fau extends euj<lvw, lvx> {
    private final int f12589a;
    private final String f12590b;
    private final int f12591u;

    protected /* synthetic */ evz mo1045a(nzf nzf) {
        return faf.m14842a((lvx) nzf);
    }

    protected /* synthetic */ void mo1041b(nzf nzf) {
        m14856a((lvw) nzf);
    }

    public fau(Context context, int i, String str, int i2) {
        super(jvc.newBuilder().m25299a(context, i).m25298a(), null, "conversations/settyping", fom.HANGOUTS_API, new lvw(), new lvx());
        this.f12590b = str;
        this.f12591u = i2;
        this.f12589a = i;
    }

    private void m14856a(lvw lvw) {
        euj.m8097a(this.f12590b, true);
        lvw.requestHeader = m8100a(new esq().m14381a(this.f12589a).m14380a());
        lvw.f26625a = euk.m14555a(this.f12590b);
        lvw.f26626b = Integer.valueOf(this.f12591u);
    }
}
