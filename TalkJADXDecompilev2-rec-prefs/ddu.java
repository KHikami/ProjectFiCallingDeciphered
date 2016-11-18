package p000;

import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class ddu extends cyk implements cyl {
    public static ddu m11491a(Resources resources) {
        dr ddu = new ddu();
        Bundle bundle = new Bundle();
        bundle.putString("title", resources.getString(bc.jO));
        bundle.putString("message", resources.getString(bc.jN));
        bundle.putString("positive", resources.getString(bc.af));
        bundle.putString("negative", resources.getString(bc.f2931O));
        ddu.setArguments(bundle);
        ddu.setTargetFragment(ddu, 0);
        return ddu;
    }

    public void m11493a(ed edVar) {
        mo2341a(edVar, "clear_recent_calls");
    }

    public void mo678a(Bundle bundle, String str) {
        if (str.equals("clear_recent_calls")) {
            RealTimeChatService.m9086c(((jca) this.an.m25443a(jca.class)).mo2317a());
        }
    }

    public void b_(String str) {
    }

    public void mo679b(String str) {
    }
}
