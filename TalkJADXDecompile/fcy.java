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
    private final Context a;
    private boolean b;
    private iih c;

    public fcy(Context context) {
        this.a = context;
        this.c = (iih) jyn.a(context, iih.class);
    }

    protected void k_() {
        this.b = true;
    }

    protected void a(Activity activity) {
        int i;
        bko b = fde.b(this.a);
        iid a = this.c.a(b != null ? b.g() : -1);
        if (this.b) {
            a.b().c(3249);
        }
        iie b2 = a.b();
        if (activity instanceof BabelHomeActivity) {
            if (this.b) {
                i = 2266;
            } else {
                i = 2269;
            }
        } else if (activity instanceof HangoutUrlHandlerActivity) {
            if (this.b) {
                i = 1962;
            } else {
                i = 1971;
            }
        } else if (activity instanceof ShareIntentActivity) {
            if (this.b) {
                i = 1966;
            } else {
                i = 1975;
            }
        } else if (activity instanceof ShowDialerActivity) {
            if (this.b) {
                i = 2267;
            } else {
                i = 2270;
            }
        } else if (!(activity instanceof HangoutActivity)) {
            if (activity instanceof ConversationActivity) {
                Intent intent = activity.getIntent();
                if (intent != null && intent.getBooleanExtra("is_chat_notification", false) && this.b) {
                    ((dti) jyn.a(this.a, dti.class)).a(17).a("hangout_launch_remote_notification");
                    i = 1963;
                }
            }
            if (this.b) {
                i = 1967;
            } else {
                i = 1976;
            }
        } else if (this.b) {
            i = 2268;
        } else {
            i = 2271;
        }
        b2.c(i);
        iie a2 = a.b().a(1, TimeUnit.DAYS);
        if (fde.i()) {
            i = 2752;
        } else {
            i = 2753;
        }
        a2.c(i);
        this.b = false;
    }

    protected void b(Activity activity) {
        gwb.a(null, 2272);
    }
}
