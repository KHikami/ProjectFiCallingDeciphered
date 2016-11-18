package p000;

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

final class fuy implements jwm {
    final /* synthetic */ int f14059a;
    final /* synthetic */ ftv f14060b;
    final /* synthetic */ jvv f14061c;
    final /* synthetic */ jwb f14062d;
    final /* synthetic */ fux f14063e;

    fuy(fux fux, int i, ftv ftv, jvv jvv, jwb jwb) {
        this.f14063e = fux;
        this.f14059a = i;
        this.f14060b = ftv;
        this.f14061c = jvv;
        this.f14062d = jwb;
    }

    public boolean mo1377a(jwi jwi, Object obj) {
        int i;
        boolean z;
        boolean z2 = false;
        String str = (String) obj;
        boolean z3 = true;
        switch (str.hashCode()) {
            case 64897:
                if (str.equals("ALL")) {
                    z3 = true;
                    break;
                }
                break;
            case 2402104:
                if (str.equals("NONE")) {
                    z3 = false;
                    break;
                }
                break;
            case 2025998793:
                if (str.equals("IMPORTANT_ONLY")) {
                    z3 = true;
                    break;
                }
                break;
        }
        switch (z3) {
            case false:
                i = 10;
                break;
            case true:
                i = 25;
                break;
            case true:
                i = 30;
                break;
            default:
                i = 30;
                break;
        }
        ((fuz) jyn.m25426a(this.f14063e.context, fuz.class)).m16293b(this.f14063e.f14056b.mo2317a(), i);
        if (fdq.f12773O.m14370b(this.f14059a)) {
            RealTimeChatService.m9013a(fde.m15018e(this.f14059a), i);
        }
        boolean z4 = i == 10;
        ftv ftv = this.f14060b;
        if (z4) {
            z = false;
        } else {
            z = true;
        }
        ftv.m5137d(z);
        jvv jvv = this.f14061c;
        if (!z4) {
            z2 = true;
        }
        jvv.m5137d(z2);
        this.f14062d.m16373a(str);
        this.f14062d.mo2102b(this.f14062d.m16387i());
        Integer num = (Integer) fux.f14055a.get(Integer.valueOf(i));
        if (num != null) {
            this.f14063e.f14057c.mo1979a(this.f14063e.f14056b.mo2317a()).mo1693b().mo1714c(gwb.m1507a(num));
        }
        return true;
    }
}
