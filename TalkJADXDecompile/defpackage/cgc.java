package defpackage;

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

/* renamed from: cgc */
final class cgc {
    String a;
    int b;
    long c;
    boolean d;
    int e;
    String f;
    public long g;
    public long h;

    cgc() {
        this.e = -1;
    }

    public void a(bko bko) {
        fme a = ((fmf) jyn.a(gwb.H(), fmf.class)).a();
        this.e = a.a();
        RealTimeChatService.a(a, bko.g(), this.a);
    }

    public String toString() {
        String str = this.a;
        int i = this.b;
        String str2 = this.f;
        boolean z = this.d;
        return new StringBuilder((String.valueOf(str).length() + 40) + String.valueOf(str2).length()).append(str).append("/").append(i).append("/").append(str2).append("/").append(z).append("/").append(this.c).toString();
    }
}
