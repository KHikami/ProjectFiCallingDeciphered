package defpackage;

import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

/* renamed from: dsn */
final class dsn extends czj<evj, ezl> {
    private final Context d;
    private final bko e;
    private final String f;

    dsn(Context context, bko bko, String str) {
        this.d = context;
        this.e = bko;
        this.f = str;
    }

    public void a(fme fme) {
        RealTimeChatService.c(fme, this.e, this.f);
    }

    public void b() {
        a(new gah(this.d).a(this.d.getString(ba.lR)).a());
    }

    public Class<evj> d() {
        return evj.class;
    }

    public Class<ezl> e() {
        return ezl.class;
    }

    public String a() {
        return null;
    }

    public void c() {
        a(new gah(this.d).a(this.d.getString(ba.lT)).a());
    }

    private void a(gag gag) {
        ((gai) jyn.a(this.d, gai.class)).a(gag);
    }
}
