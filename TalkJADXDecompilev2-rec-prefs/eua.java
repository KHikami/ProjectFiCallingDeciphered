package p000;

import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.List;

public final class eua extends euj<lub, luc> {
    private final int f12284a;
    private final int f12285b;

    protected /* synthetic */ evz mo1045a(nzf nzf) {
        return eyt.m14792a((luc) nzf);
    }

    protected /* synthetic */ void mo1041b(nzf nzf) {
        m14528a((lub) nzf);
    }

    public eua(Context context, int i, int i2, fgz fgz) {
        super(jvc.newBuilder().m25299a(context, i).m25298a(), fgz, "presence/querypresence", fom.HANGOUTS_API, new lub(), new luc());
        this.f12284a = i2;
        this.f12285b = i;
    }

    public void mo1046a(int i, String str, Exception exception) {
        evz d = mo1043d();
        if (d != null) {
            RealTimeChatService.m8998a(this.f12285b, d);
        }
    }

    private void m14528a(lub lub) {
        fgz fgz = (fgz) this.f5790e;
        List d = fgz.m15301d();
        int size = d.size();
        lub.f26436a = new ltr[size];
        for (int i = 0; i < size; i++) {
            ltr ltr = new ltr();
            ltr.f26403b = (String) d.get(i);
            ltr.f26402a = ltr.f26403b;
            lub.f26436a[i] = ltr;
        }
        lub.requestHeader = m8100a(new esq().m14384b(this.f12284a).m14381a(this.f12285b).m14380a());
        List e = ba.m4633e();
        int c = fgz.m15300c();
        for (etx etx : etx.f12266h) {
            if (etx.m14523a(c)) {
                e.add(Integer.valueOf(etx.f12270k));
            }
        }
        int size2 = e.size();
        lub.f26437b = new int[size2];
        for (c = 0; c < size2; c++) {
            lub.f26437b[c] = gwb.m1507a((Integer) e.get(c));
        }
    }
}
