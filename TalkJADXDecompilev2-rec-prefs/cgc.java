package p000;

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

final class cgc {
    String f5231a;
    int f5232b;
    long f5233c;
    boolean f5234d;
    int f5235e = -1;
    String f5236f;
    public long f5237g;
    public long f5238h;

    cgc() {
    }

    public void m7518a(bko bko) {
        fme a = ((fmf) jyn.m25426a(gwb.m1400H(), fmf.class)).mo2035a();
        this.f5235e = a.m15674a();
        RealTimeChatService.m9045a(a, bko.m5638g(), this.f5231a);
    }

    public String toString() {
        String str = this.f5231a;
        int i = this.f5232b;
        String str2 = this.f5236f;
        boolean z = this.f5234d;
        return new StringBuilder((String.valueOf(str).length() + 40) + String.valueOf(str2).length()).append(str).append("/").append(i).append("/").append(str2).append("/").append(z).append("/").append(this.f5233c).toString();
    }
}
