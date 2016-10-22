package defpackage;

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.List;

/* renamed from: fid */
public final class fid extends fhb {
    final /* synthetic */ List a;
    final /* synthetic */ RealTimeChatService b;

    public fid(RealTimeChatService realTimeChatService, bko bko, List list) {
        this.b = realTimeChatService;
        this.a = list;
        super(bko);
    }

    public List<fok> i() {
        return this.a;
    }
}
