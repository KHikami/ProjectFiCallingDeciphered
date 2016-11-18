package p000;

import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

final class dsn extends czj<evj, ezl> {
    private final Context f10453d;
    private final bko f10454e;
    private final String f10455f;

    dsn(Context context, bko bko, String str) {
        this.f10453d = context;
        this.f10454e = bko;
        this.f10455f = str;
    }

    public void mo1480a(fme fme) {
        RealTimeChatService.m9094c(fme, this.f10454e, this.f10455f);
    }

    public void mo1475b() {
        m12616a(new gah(this.f10453d).m16814a(this.f10453d.getString(ba.lR)).m16811a());
    }

    public Class<evj> mo1481d() {
        return evj.class;
    }

    public Class<ezl> mo1482e() {
        return ezl.class;
    }

    public String mo1479a() {
        return null;
    }

    public void mo1476c() {
        m12616a(new gah(this.f10453d).m16814a(this.f10453d.getString(ba.lT)).m16811a());
    }

    private void m12616a(gag gag) {
        ((gai) jyn.m25426a(this.f10453d, gai.class)).m7655a(gag);
    }
}
