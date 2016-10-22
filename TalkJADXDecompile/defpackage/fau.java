package defpackage;

import android.content.Context;

/* renamed from: fau */
public final class fau extends euj<lvw, lvx> {
    private final int a;
    private final String b;
    private final int u;

    protected /* synthetic */ evz a(nzf nzf) {
        return faf.a((lvx) nzf);
    }

    protected /* synthetic */ void b(nzf nzf) {
        a((lvw) nzf);
    }

    public fau(Context context, int i, String str, int i2) {
        super(jvc.newBuilder().a(context, i).a(), null, "conversations/settyping", fom.HANGOUTS_API, new lvw(), new lvx());
        this.b = str;
        this.u = i2;
        this.a = i;
    }

    private void a(lvw lvw) {
        euj.a(this.b, true);
        lvw.requestHeader = a(new esq().a(this.a).a());
        lvw.a = euk.a(this.b);
        lvw.b = Integer.valueOf(this.u);
    }
}
