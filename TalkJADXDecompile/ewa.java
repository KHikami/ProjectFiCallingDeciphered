import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class ewa extends evz {
    private static final long serialVersionUID = 1;
    private final String g;

    ewa(ohz ohz) {
        String str = (ohz == null || ohz.b == null) ? null : ohz.b.a;
        this.g = str;
    }

    public String k() {
        return this.g;
    }

    public void a(Context context, bko bko) {
        RealTimeChatService.i.post(new fhy(this));
    }
}
