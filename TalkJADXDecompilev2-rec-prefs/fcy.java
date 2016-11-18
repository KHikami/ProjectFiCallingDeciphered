package p000;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.hangouts.hangout.HangoutActivity;
import com.google.android.apps.hangouts.phone.BabelHomeActivity;
import com.google.android.apps.hangouts.phone.ConversationActivity;
import com.google.android.apps.hangouts.phone.HangoutUrlHandlerActivity;
import com.google.android.apps.hangouts.phone.ShareIntentActivity;
import com.google.android.apps.hangouts.phone.ShowDialerActivity;
import java.util.concurrent.TimeUnit;

public final class fcy extends bcq {
    private final Context f12711a;
    private boolean f12712b;
    private iih f12713c;

    public fcy(Context context) {
        this.f12711a = context;
        this.f12713c = (iih) jyn.m25426a(context, iih.class);
    }

    protected void k_() {
        this.f12712b = true;
    }

    protected void mo465a(Activity activity) {
        int i;
        bko b = fde.m15007b(this.f12711a);
        iid a = this.f12713c.mo1979a(b != null ? b.m5638g() : -1);
        if (this.f12712b) {
            a.mo1693b().mo1714c(3249);
        }
        iie b2 = a.mo1693b();
        if (activity instanceof BabelHomeActivity) {
            if (this.f12712b) {
                i = 2266;
            } else {
                i = 2269;
            }
        } else if (activity instanceof HangoutUrlHandlerActivity) {
            if (this.f12712b) {
                i = 1962;
            } else {
                i = 1971;
            }
        } else if (activity instanceof ShareIntentActivity) {
            if (this.f12712b) {
                i = 1966;
            } else {
                i = 1975;
            }
        } else if (activity instanceof ShowDialerActivity) {
            if (this.f12712b) {
                i = 2267;
            } else {
                i = 2270;
            }
        } else if (!(activity instanceof HangoutActivity)) {
            if (activity instanceof ConversationActivity) {
                Intent intent = activity.getIntent();
                if (intent != null && intent.getBooleanExtra("is_chat_notification", false) && this.f12712b) {
                    ((dti) jyn.m25426a(this.f12711a, dti.class)).mo1673a(17).mo1670a("hangout_launch_remote_notification");
                    i = 1963;
                }
            }
            if (this.f12712b) {
                i = 1967;
            } else {
                i = 1976;
            }
        } else if (this.f12712b) {
            i = 2268;
        } else {
            i = 2271;
        }
        b2.mo1714c(i);
        iie a2 = a.mo1693b().mo1697a(1, TimeUnit.DAYS);
        if (fde.m15028i()) {
            i = 2752;
        } else {
            i = 2753;
        }
        a2.mo1714c(i);
        this.f12712b = false;
    }

    protected void mo467b(Activity activity) {
        gwb.m1823a(null, 2272);
    }
}
