import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import com.google.android.apps.hangouts.service.NoConfirmationSmsSendService;

public final class fsv extends fip {
    final Context a;
    final int b;
    final String c;
    final String d;
    final /* synthetic */ NoConfirmationSmsSendService e;

    public fsv(NoConfirmationSmsSendService noConfirmationSmsSendService, Context context, int i, String str, String str2) {
        this.e = noConfirmationSmsSendService;
        this.a = context;
        this.b = i;
        this.c = str;
        this.d = str2;
    }

    public void a(int i, bko bko, fek fek, fiu fiu) {
        if (i == this.b) {
            if (fiu.b() == 1) {
                ((for) jyn.a(this.a, for.class)).a(bko, fek.a, this.d, null, 0, null, 0, 0, null, this.c, false, null, 0, blo.a(bko.g(), 7));
            } else {
                String str = "Babel";
                int b = fiu.b();
                String valueOf = String.valueOf(fek);
                String str2 = fek != null ? fek.a : "NULL";
                glk.e(str, new StringBuilder((String.valueOf(valueOf).length() + 55) + String.valueOf(str2).length()).append("couldn't create conversation; error code: ").append(b).append(" ").append(valueOf).append(" ").append(str2).toString(), new Object[0]);
            }
            RealTimeChatService.b((fip) this);
        }
    }
}
