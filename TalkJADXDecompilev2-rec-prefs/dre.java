package p000;

import android.content.Context;

public final class dre extends drk {
    private final String f10385c;

    public dre(drg drg) {
        super(drg);
        this.f10385c = drg.m12547c();
    }

    protected euj mo1013a(Context context, int i, int i2) {
        return new drf(context, i, i2, (drg) this.a);
    }

    protected void mo1014a(Context context, int i, fdo fdo) {
        glk.m17982e("Babel_Request_glss", "Failed to execute group link sharing network request.", new Object[0]);
        ((iih) jyn.m25426a(context, iih.class)).mo1979a(i).mo1693b().mo1714c(3202);
        ayo bow = new bow(this.f10385c, i, box.GROUP_CONVERSATION_LINK);
        ((gid) jyn.m25426a(context, gid.class)).mo2277a(bow, new Exception(fdo.getMessage()), bow.m6328a());
    }
}
