package defpackage;

import android.content.Context;

public final class dre extends drk {
    private final String c;

    public dre(drg drg) {
        super(drg);
        this.c = drg.c();
    }

    protected euj a(Context context, int i, int i2) {
        return new drf(context, i, i2, (drg) this.a);
    }

    protected void a(Context context, int i, fdo fdo) {
        glk.e("Babel_Request_glss", "Failed to execute group link sharing network request.", new Object[0]);
        ((iih) jyn.a(context, iih.class)).a(i).b().c(3202);
        ayo bow = new bow(this.c, i, box.GROUP_CONVERSATION_LINK);
        ((gid) jyn.a(context, gid.class)).a(bow, new Exception(fdo.getMessage()), bow.a());
    }
}
