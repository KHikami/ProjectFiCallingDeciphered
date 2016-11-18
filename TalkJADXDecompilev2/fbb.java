package defpackage;

import android.content.Context;

public final class fbb extends euj<lwz, lxa> {
    private final int a;
    private final String b;
    private final long u;

    protected /* synthetic */ evz a(nzf nzf) {
        return fan.a((lxa) nzf);
    }

    protected /* synthetic */ void b(nzf nzf) {
        a((lwz) nzf);
    }

    public fbb(Context context, int i, String str, long j) {
        super(jvc.newBuilder().a(context, i).a(), null, "conversations/updatewatermark", fom.HANGOUTS_API, new lwz(), new lxa());
        this.b = str;
        this.u = j;
        this.a = i;
    }

    private void a(lwz lwz) {
        euj.a(this.b, true);
        lwz.requestHeader = a(new esq().a(this.a).a());
        lwz.a = euk.a(this.b);
        lwz.b = Long.valueOf(this.u);
        lwz.c = Integer.valueOf(2);
    }
}
