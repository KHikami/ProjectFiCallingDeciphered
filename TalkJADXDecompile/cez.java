import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

final class cez implements cgh {
    final /* synthetic */ cdr a;

    cez(cdr cdr) {
        this.a = cdr;
    }

    public void a(String str, cgc cgc) {
        this.a.a_(str);
        RealTimeChatService.b(((fmf) this.a.binder.a(fmf.class)).a(-1), this.a.av.g(), str);
        int g = this.a.av.g();
        ((ect) this.a.binder.a(ect.class)).a(g, str);
        ((ect) this.a.binder.a(ect.class)).c(g, str);
        RealTimeChatService.i(this.a.av, str);
    }
}
