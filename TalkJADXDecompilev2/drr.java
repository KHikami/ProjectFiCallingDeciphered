package defpackage;

import android.accounts.NetworkErrorException;
import android.content.Context;

public final class drr extends drk {
    public drr(drt drt) {
        super(drt);
    }

    protected euj<lto, ltp> a(Context context, int i, int i2) {
        return new drs(context, i, i2, (drt) this.a);
    }

    protected void a(Context context, int i, fdo fdo) {
        glk.e("Babel_Request_glss", "Failed to execute an open group conversation from url network request.", new Object[0]);
        ayo bow = new bow("unknown_conversation_id", i, box.JOIN_CONVERSATION_BY_LINK);
        if (fdo.getMessage() == null || !(fdo.getMessage().contains("ERROR_UNEXPECTED") || fdo.getMessage().contains("ERROR_RESPONSE_NOT_FOUND"))) {
            ((gid) jyn.a(context, gid.class)).a(bow, new NetworkErrorException(), bow.a());
            return;
        }
        ((iih) jyn.a(context, iih.class)).a(i).b().c(3202);
        ((gid) jyn.a(context, gid.class)).a(bow, new Exception(fdo.getMessage()), bow.a());
    }
}
