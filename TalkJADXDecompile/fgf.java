import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class fgf extends fgg<ete, eyj> {
    public fgf(Context context, int i, fgh fgh) {
        super(context, i, fgh, bc.ui);
    }

    protected int h() {
        return gwb.a(gwb.H(), "babel_get_voice_account_info_request_timeout_millis", 20000);
    }

    public void a(fme fme) {
        RealTimeChatService.b(fme, this.d);
    }

    public Class<ete> d() {
        return ete.class;
    }

    public Class<eyj> e() {
        return eyj.class;
    }
}
