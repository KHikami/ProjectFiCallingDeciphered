package defpackage;

import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.List;

public final class eua extends euj<lub, luc> {
    private final int a;
    private final int b;

    protected /* synthetic */ evz a(nzf nzf) {
        return eyt.a((luc) nzf);
    }

    protected /* synthetic */ void b(nzf nzf) {
        a((lub) nzf);
    }

    public eua(Context context, int i, int i2, fgz fgz) {
        super(jvc.newBuilder().a(context, i).a(), fgz, "presence/querypresence", fom.HANGOUTS_API, new lub(), new luc());
        this.a = i2;
        this.b = i;
    }

    public void a(int i, String str, Exception exception) {
        evz d = d();
        if (d != null) {
            RealTimeChatService.a(this.b, d);
        }
    }

    private void a(lub lub) {
        fgz fgz = (fgz) this.e;
        List d = fgz.d();
        int size = d.size();
        lub.a = new ltr[size];
        for (int i = 0; i < size; i++) {
            ltr ltr = new ltr();
            ltr.b = (String) d.get(i);
            ltr.a = ltr.b;
            lub.a[i] = ltr;
        }
        lub.requestHeader = a(new esq().b(this.a).a(this.b).a());
        List e = ba.e();
        int c = fgz.c();
        for (etx etx : etx.h) {
            if (etx.a(c)) {
                e.add(Integer.valueOf(etx.k));
            }
        }
        int size2 = e.size();
        lub.b = new int[size2];
        for (c = 0; c < size2; c++) {
            lub.b[c] = gwb.a((Integer) e.get(c));
        }
    }
}
