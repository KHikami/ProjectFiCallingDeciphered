package p000;

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

final class cez implements cgh {
    final /* synthetic */ cdr f5143a;

    cez(cdr cdr) {
        this.f5143a = cdr;
    }

    public void mo893a(String str, cgc cgc) {
        this.f5143a.a_(str);
        RealTimeChatService.m9082b(((fmf) this.f5143a.binder.m25443a(fmf.class)).mo2036a(-1), this.f5143a.av.m5638g(), str);
        int g = this.f5143a.av.m5638g();
        ((ect) this.f5143a.binder.m25443a(ect.class)).mo1829a(g, str);
        ((ect) this.f5143a.binder.m25443a(ect.class)).mo1836c(g, str);
        RealTimeChatService.m9120i(this.f5143a.av, str);
    }
}
