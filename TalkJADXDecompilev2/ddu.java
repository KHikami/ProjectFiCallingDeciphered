package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class ddu extends cyk implements cyl {
    public static ddu a(Resources resources) {
        dr ddu = new ddu();
        Bundle bundle = new Bundle();
        bundle.putString("title", resources.getString(bc.jO));
        bundle.putString("message", resources.getString(bc.jN));
        bundle.putString("positive", resources.getString(bc.af));
        bundle.putString("negative", resources.getString(bc.O));
        ddu.setArguments(bundle);
        ddu.setTargetFragment(ddu, 0);
        return ddu;
    }

    public void a(ed edVar) {
        a(edVar, "clear_recent_calls");
    }

    public void a(Bundle bundle, String str) {
        if (str.equals("clear_recent_calls")) {
            RealTimeChatService.c(((jca) this.an.a(jca.class)).a());
        }
    }

    public void b_(String str) {
    }

    public void b(String str) {
    }
}
