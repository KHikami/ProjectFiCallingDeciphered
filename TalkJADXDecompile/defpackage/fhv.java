package defpackage;

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Iterator;

/* renamed from: fhv */
public final class fhv implements Runnable {
    final /* synthetic */ bko a;
    final /* synthetic */ String b;
    final /* synthetic */ edo c;
    final /* synthetic */ String d;
    final /* synthetic */ long e;
    final /* synthetic */ boolean f;

    public fhv(bko bko, String str, edo edo, String str2, long j, boolean z) {
        this.a = bko;
        this.b = str;
        this.c = edo;
        this.d = str2;
        this.e = j;
        this.f = z;
    }

    public void run() {
        Iterator it = RealTimeChatService.f.iterator();
        while (it.hasNext()) {
            ((fip) it.next()).a(this.a, this.b, this.c, this.d, this.e, this.f);
        }
    }
}
