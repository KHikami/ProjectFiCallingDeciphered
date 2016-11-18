package p000;

import android.content.Context;

public final class drn extends drk {
    private final String f10398c;

    public drn(drp drp) {
        super(drp);
        this.f10398c = drp.m12564e();
    }

    protected euj mo1013a(Context context, int i, int i2) {
        return new dro(context, i, i2, (drp) this.a);
    }

    protected void mo1014a(Context context, int i, fdo fdo) {
        glk.m17982e("Babel_Request_glss", "Failed to execute group link sharing network request.", new Object[0]);
        ((iih) jyn.m25426a(context, iih.class)).mo1979a(i).mo1693b().mo1714c(3202);
        ayo bow = new bow(this.f10398c, i, box.GROUP_LINK_SHARING_STATUS);
        ((gid) jyn.m25426a(context, gid.class)).mo2277a(bow, fdo, bow.m6328a());
    }
}
