package defpackage;

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;

/* renamed from: fir */
final class fir implements fit {
    final /* synthetic */ fiq a;

    fir(fiq fiq) {
        this.a = fiq;
    }

    public void a(fip fip) {
        RealTimeChatService.a(fip);
    }

    public void b(fip fip) {
        RealTimeChatService.b(fip);
    }

    public void a(fme fme, bko bko, ArrayList<fbt> arrayList, String str, boolean z) {
        RealTimeChatService.a(fme, bko, (ArrayList) arrayList, null, true);
    }

    public void a(fme fme, bko bko, String str, long j, boolean z, boolean z2) {
        RealTimeChatService.a(fme, bko, str, j, true, false);
    }

    public void a(fme fme, bko bko, String[] strArr, long[] jArr, boolean z, boolean z2) {
        RealTimeChatService.a(fme, bko, strArr, jArr, z, false);
    }

    public void a(bko bko, String str, long j) {
        RealTimeChatService.a(bko, str, j);
    }

    public void a(bko bko, String str) {
        RealTimeChatService.g(bko, str);
    }

    public void a(int i, boolean z, fjl fjl, flt flt) {
        RealTimeChatService.a(i, false, fjl, flt);
    }

    public void a(fme fme, bko bko, juh juh, String str) {
        RealTimeChatService.a(fme, bko, juh, str);
    }

    public void a(bko bko, String[] strArr) {
        RealTimeChatService.b(bko, strArr);
    }

    public void a(bko bko, String str, String str2) {
        RealTimeChatService.b(bko, str, str2);
    }

    public void a(bko bko, String str, int i) {
        RealTimeChatService.b(bko, str, i);
    }

    public void b(bko bko, String str, String str2) {
        RealTimeChatService.c(bko, str, str2);
    }

    public void c(bko bko, String str, String str2) {
        RealTimeChatService.d(bko, str, str2);
    }

    public void a(fme fme, int i, String str, String str2, String str3, boolean z, boolean z2) {
        RealTimeChatService.a(fme, i, str, str2, str3, z, true);
    }

    public void b(bko bko, String str, long j) {
        RealTimeChatService.b(bko, str, j);
    }

    public boolean a(fme fme, int i, String str) {
        return RealTimeChatService.b(fme, i, str);
    }
}
