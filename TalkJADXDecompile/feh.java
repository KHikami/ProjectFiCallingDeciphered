import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class feh implements bhg, bhm {
    private static final gma a;
    private final evz b;
    private final int c;

    static {
        a = gma.a("Babel_ConcNetwork");
    }

    public int a(Context context, bhb bhb) {
        bko e = fde.e(this.c);
        RealTimeChatService.a(e, RealTimeChatService.a(context, e, fde.e(e), this.b, null));
        gma gma = a;
        String valueOf = String.valueOf("RES_");
        String valueOf2 = String.valueOf(this.b.c());
        gma.c(new StringBuilder((String.valueOf(valueOf).length() + 12) + String.valueOf(valueOf2).length()).append(valueOf).append(valueOf2).append("_").append(this.b.b()).toString());
        faz.a.c(faz.a(this.b.c()));
        return bhn.a;
    }

    public feh(evz evz, int i) {
        this.b = evz;
        this.c = i;
        gma gma = a;
        String valueOf = String.valueOf("RES_");
        String valueOf2 = String.valueOf(evz.c());
        gma.b(new StringBuilder((String.valueOf(valueOf).length() + 12) + String.valueOf(valueOf2).length()).append(valueOf).append(valueOf2).append("_").append(evz.b()).toString());
    }
}
