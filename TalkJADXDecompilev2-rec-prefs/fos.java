package p000;

import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

@Deprecated
public final class fos implements C0058for {
    private Context f13590a;

    public void mo2059a(bko bko, String str, CharSequence charSequence, String str2, int i, String str3, int i2, int i3, String str4, String str5, boolean z, hkh hkh, int i4, String str6) {
        ((dqc) jyn.m25426a(this.f13590a, dqc.class)).mo1652a(bko.m5638g(), dqd.MESSAGE_SENT);
        RealTimeChatService.m9023a(bko, str, str6, charSequence, str2, i, str3, i2, i3, str4, str5, z, hkh, i4);
    }

    public C0058for m15823a(Context context) {
        this.f13590a = context;
        return this;
    }
}
