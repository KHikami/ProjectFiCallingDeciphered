package p000;

import android.content.Context;

public final class fbb extends euj<lwz, lxa> {
    private final int f12613a;
    private final String f12614b;
    private final long f12615u;

    protected /* synthetic */ evz mo1045a(nzf nzf) {
        return fan.m14849a((lxa) nzf);
    }

    protected /* synthetic */ void mo1041b(nzf nzf) {
        m14876a((lwz) nzf);
    }

    public fbb(Context context, int i, String str, long j) {
        super(jvc.newBuilder().m25299a(context, i).m25298a(), null, "conversations/updatewatermark", fom.HANGOUTS_API, new lwz(), new lxa());
        this.f12614b = str;
        this.f12615u = j;
        this.f12613a = i;
    }

    private void m14876a(lwz lwz) {
        euj.m8097a(this.f12614b, true);
        lwz.requestHeader = m8100a(new esq().m14381a(this.f12613a).m14380a());
        lwz.f26738a = euk.m14555a(this.f12614b);
        lwz.f26739b = Long.valueOf(this.f12615u);
        lwz.f26740c = Integer.valueOf(2);
    }
}
