import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public abstract class euo extends esw {
    private static final long serialVersionUID = 1;
    public final String e;
    public transient boolean f;

    public euo(String str) {
        this.f = false;
        this.e = str;
        if (str != null && blo.a(str)) {
            String str2 = "cannot use client generated conversation id:";
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
    }

    public void a(Context context, bko bko, fdo fdo) {
        if (!TextUtils.isEmpty(this.e) && fdo.c() == 113) {
            String str = "Babel";
            String str2 = "ERROR_RESPONSE_NOT_FOUND for ";
            String valueOf = String.valueOf(this.e);
            glk.d(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
            RealTimeChatService.f(bko, this.e);
            this.f = true;
        }
    }
}
