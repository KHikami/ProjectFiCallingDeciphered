package p000;

import android.accounts.NetworkErrorException;
import android.content.Context;

public final class drr extends drk {
    public drr(drt drt) {
        super(drt);
    }

    protected euj<lto, ltp> mo1013a(Context context, int i, int i2) {
        return new drs(context, i, i2, (drt) this.a);
    }

    protected void mo1014a(Context context, int i, fdo fdo) {
        glk.m17982e("Babel_Request_glss", "Failed to execute an open group conversation from url network request.", new Object[0]);
        ayo bow = new bow("unknown_conversation_id", i, box.JOIN_CONVERSATION_BY_LINK);
        if (fdo.getMessage() == null || !(fdo.getMessage().contains("ERROR_UNEXPECTED") || fdo.getMessage().contains("ERROR_RESPONSE_NOT_FOUND"))) {
            ((gid) jyn.m25426a(context, gid.class)).mo2277a(bow, new NetworkErrorException(), bow.m6328a());
            return;
        }
        ((iih) jyn.m25426a(context, iih.class)).mo1979a(i).mo1693b().mo1714c(3202);
        ((gid) jyn.m25426a(context, gid.class)).mo2277a(bow, new Exception(fdo.getMessage()), bow.m6328a());
    }
}
