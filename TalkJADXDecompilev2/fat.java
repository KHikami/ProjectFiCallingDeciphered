package defpackage;

import android.content.Context;
import com.google.api.client.http.HttpStatusCodes;

public final class fat extends euj<lvn, lvo> {
    private final int a;
    private final String b;
    private final boolean u;
    private final int v;

    protected /* synthetic */ evz a(nzf nzf) {
        return ezy.a((lvo) nzf);
    }

    protected /* synthetic */ void b(nzf nzf) {
        a((lvn) nzf);
    }

    public fat(Context context, int i, String str, boolean z, int i2) {
        super(jvc.newBuilder().a(context, i).a(), null, "conversations/setfocus", fom.HANGOUTS_API, new lvn(), new lvo());
        this.b = str;
        this.u = z;
        if (i2 <= 0) {
            i2 = HttpStatusCodes.STATUS_CODE_MULTIPLE_CHOICES;
        }
        this.v = i2;
        this.a = i;
    }

    private void a(lvn lvn) {
        euj.a(this.b, true);
        lvn.requestHeader = a(new esq().a(this.a).a());
        lvn.a = euk.a(this.b);
        lvn.b = Integer.valueOf(this.u ? 1 : 2);
        lvn.d = Boolean.valueOf(true);
        lvn.c = Integer.valueOf(this.v);
    }
}
