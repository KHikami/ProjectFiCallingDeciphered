package p000;

import android.content.Context;
import com.google.api.client.http.HttpStatusCodes;

public final class fat extends euj<lvn, lvo> {
    private final int f12585a;
    private final String f12586b;
    private final boolean f12587u;
    private final int f12588v;

    protected /* synthetic */ evz mo1045a(nzf nzf) {
        return ezy.m14830a((lvo) nzf);
    }

    protected /* synthetic */ void mo1041b(nzf nzf) {
        m14853a((lvn) nzf);
    }

    public fat(Context context, int i, String str, boolean z, int i2) {
        super(jvc.newBuilder().m25299a(context, i).m25298a(), null, "conversations/setfocus", fom.HANGOUTS_API, new lvn(), new lvo());
        this.f12586b = str;
        this.f12587u = z;
        if (i2 <= 0) {
            i2 = HttpStatusCodes.STATUS_CODE_MULTIPLE_CHOICES;
        }
        this.f12588v = i2;
        this.f12585a = i;
    }

    private void m14853a(lvn lvn) {
        euj.m8097a(this.f12586b, true);
        lvn.requestHeader = m8100a(new esq().m14381a(this.f12585a).m14380a());
        lvn.f26603a = euk.m14555a(this.f12586b);
        lvn.f26604b = Integer.valueOf(this.f12587u ? 1 : 2);
        lvn.f26606d = Boolean.valueOf(true);
        lvn.f26605c = Integer.valueOf(this.f12588v);
    }
}
