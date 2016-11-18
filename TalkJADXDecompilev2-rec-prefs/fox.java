package p000;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

public final class fox extends fpl {
    static final boolean f13616d = false;
    private static final long serialVersionUID = 1;
    private long f13617A;
    private final List<fpd> f13618u;
    private final List<foz> f13619v;
    private int f13620w;
    private int f13621x;
    private long f13622y;
    private long f13623z;

    static {
        kae kae = glk.f15565l;
    }

    public fox(lqg lqg, int i, long j, lob lob, long j2, long j3, long j4) {
        super(lqg, i, j);
        this.f13622y = j2;
        this.f13623z = j3;
        this.f13617A = j4;
        this.f13618u = fpd.m15868a(lob.f25847a.f26363a);
        ofm[] ofmArr = lob.f25847a.f26364b;
        int a = gwb.m1507a(lqg.f26126u);
        List arrayList = new ArrayList();
        if (ofmArr.length > 0) {
            for (ofm a2 : ofmArr) {
                foz a3 = foz.m15862a(a2, a);
                if (a3 != null) {
                    arrayList.add(a3);
                }
            }
        }
        this.f13619v = arrayList;
        int i2 = 0;
        for (fpd fpd : this.f13618u) {
            i2 = fpd.f13646b.length() + i2;
        }
        Object obj = (this.f13619v.isEmpty() || (TextUtils.isEmpty(((foz) this.f13619v.get(0)).f13629f) && TextUtils.isEmpty(((foz) this.f13619v.get(0)).f13630g))) ? null : 1;
        if (i2 == 0 && obj == null) {
            String valueOf = String.valueOf(lqg.f26109d);
            String valueOf2 = String.valueOf(lqg.f26106a.f25931a);
            glk.m17982e("Babel", new StringBuilder((String.valueOf(valueOf).length() + 112) + String.valueOf(valueOf2).length()).append("Message without text or image: eventId ").append(valueOf).append(" conversationId ").append(valueOf2).append(" num segments = ").append(lob.f25847a.f26363a.length).append(" num attachments = ").append(lob.f25847a.f26364b.length).toString(), new Object[0]);
        }
    }

    public List<fpd> m15857d() {
        return this.f13618u;
    }

    public List<foz> m15858e() {
        return this.f13619v;
    }

    protected void mo2062b(blo blo, fhc fhc) {
        m15854a(1);
        new fea().m15114a(this).m15118a(true).m15112a(this.f13622y).m15121b(this.f13623z).m15126c(this.f13617A).m15136f(fle.m15603a(blo.m6049f(), blo.m6061h(), m15827a())).m15119a().m15617a(blo, fhc);
        blf.m5777a(blo, this);
        if (!blo.m6056g().m5632b().equals(m15831b())) {
            ((dqc) jyn.m25426a(gwb.m1400H(), dqc.class)).mo1652a(blo.m6056g().m5638g(), dqd.MESSAGE_RECEIVED);
        }
    }

    public List<edo> mo2063f() {
        List<edo> arrayList = new ArrayList();
        arrayList.add(this.b);
        return arrayList;
    }

    public void m15854a(int i) {
        this.f13620w = i;
    }

    public int m15860g() {
        return this.f13620w;
    }

    public void m15855b(int i) {
        this.f13621x = i;
    }

    public int m15861h() {
        return this.f13621x;
    }
}
