package p000;

import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Arrays;

public class evh extends euo {
    private static final long serialVersionUID = 1;
    public final edo f12359c;
    public final int f12360d;
    public final int[] f12361k;

    public evh(String str, int i) {
        super(str);
        this.f12360d = 1;
        this.f12359c = null;
        this.f12361k = new int[0];
    }

    public evh(String str, int i, int[] iArr) {
        super(str);
        this.f12360d = i;
        this.f12359c = null;
        this.f12361k = iArr;
    }

    public nzf mo1944a(String str, int i, int i2) {
        if (glk.m17973a("BabelClient", 3)) {
            glk.m17976b("BabelClient", "replyToInviteRequest build protobuf", new Object[0]);
        }
        nzf lun = new lun();
        lun.requestHeader = euk.m14556a(str, i, i2, this.i);
        lun.f26503c = Integer.valueOf(this.f12360d);
        lun.f26501a = euk.m14555a(this.e);
        lun.f26504d = Arrays.copyOf(this.f12361k, this.f12361k.length);
        return lun;
    }

    public String mo1947g() {
        return "conversations/replytoinvite";
    }

    public String K_() {
        return "event_queue";
    }

    public void mo1945a(Context context, bko bko, fdo fdo) {
        super.mo1945a(context, bko, fdo);
        if (!this.f) {
            RealTimeChatService.m9067b(bko.m5638g(), this.e);
        }
    }

    public int mo1957i() {
        return 4;
    }
}
