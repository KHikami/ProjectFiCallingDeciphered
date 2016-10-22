package defpackage;

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

/* renamed from: fuy */
final class fuy implements jwm {
    final /* synthetic */ int a;
    final /* synthetic */ ftv b;
    final /* synthetic */ jvv c;
    final /* synthetic */ jwb d;
    final /* synthetic */ fux e;

    fuy(fux fux, int i, ftv ftv, jvv jvv, jwb jwb) {
        this.e = fux;
        this.a = i;
        this.b = ftv;
        this.c = jvv;
        this.d = jwb;
    }

    public boolean a(jwi jwi, Object obj) {
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
            case wi.w /*0*/:
                i = 10;
                break;
            case wi.j /*1*/:
                i = 25;
                break;
            case wi.l /*2*/:
                i = 30;
                break;
            default:
                i = 30;
                break;
        }
        ((fuz) jyn.a(this.e.context, fuz.class)).b(this.e.b.a(), i);
        if (fdq.O.b(this.a)) {
            RealTimeChatService.a(fde.e(this.a), i);
        }
        boolean z4 = i == 10;
        ftv ftv = this.b;
        if (z4) {
            z = false;
        } else {
            z = true;
        }
        ftv.d(z);
        jvv jvv = this.c;
        if (!z4) {
            z2 = true;
        }
        jvv.d(z2);
        this.d.a(str);
        this.d.b(this.d.i());
        Integer num = (Integer) fux.a.get(Integer.valueOf(i));
        if (num != null) {
            this.e.c.a(this.e.b.a()).b().c(gwb.a(num));
        }
        return true;
    }
}
