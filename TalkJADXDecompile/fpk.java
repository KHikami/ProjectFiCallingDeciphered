import android.content.Intent;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class fpk implements fqd {
    private static final long serialVersionUID = 1;
    private final String a;
    private String b;
    private edo c;

    public fpk(lpy lpy) {
        this.b = lpy.b != null ? lpy.b.a : null;
        this.c = gwb.a(gwb.H(), lpy.a, null);
        if (lpy.c != null) {
            this.a = lpy.c.a;
        } else {
            this.a = null;
        }
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public edo c() {
        return this.c;
    }

    public void a(int i, mfa<Intent> mfa_android_content_Intent) {
        RealTimeChatService.i.post(new fhi(fde.e(i), this));
    }
}
