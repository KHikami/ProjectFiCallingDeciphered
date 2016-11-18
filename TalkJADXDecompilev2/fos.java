package defpackage;

import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

@Deprecated
public final class fos implements for {
    private Context a;

    public void a(bko bko, String str, CharSequence charSequence, String str2, int i, String str3, int i2, int i3, String str4, String str5, boolean z, hkh hkh, int i4, String str6) {
        ((dqc) jyn.a(this.a, dqc.class)).a(bko.g(), dqd.MESSAGE_SENT);
        RealTimeChatService.a(bko, str, str6, charSequence, str2, i, str3, i2, i3, str4, str5, z, hkh, i4);
    }

    public for a(Context context) {
        this.a = context;
        return this;
    }
}
