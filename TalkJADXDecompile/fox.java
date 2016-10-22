import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

public final class fox extends fpl {
    static final boolean d;
    private static final long serialVersionUID = 1;
    private long A;
    private final List<fpd> u;
    private final List<foz> v;
    private int w;
    private int x;
    private long y;
    private long z;

    static {
        kae kae = glk.l;
        d = d;
    }

    public fox(lqg lqg, int i, long j, lob lob, long j2, long j3, long j4) {
        super(lqg, i, j);
        this.y = j2;
        this.z = j3;
        this.A = j4;
        this.u = fpd.a(lob.a.a);
        ofm[] ofmArr = lob.a.b;
        int a = gwb.a(lqg.u);
        List arrayList = new ArrayList();
        if (ofmArr.length > 0) {
            for (ofm a2 : ofmArr) {
                foz a3 = foz.a(a2, a);
                if (a3 != null) {
                    arrayList.add(a3);
                }
            }
        }
        this.v = arrayList;
        int i2 = 0;
        for (fpd fpd : this.u) {
            i2 = fpd.b.length() + i2;
        }
        Object obj = (this.v.isEmpty() || (TextUtils.isEmpty(((foz) this.v.get(0)).f) && TextUtils.isEmpty(((foz) this.v.get(0)).g))) ? null : 1;
        if (i2 == 0 && obj == null) {
            String valueOf = String.valueOf(lqg.d);
            String valueOf2 = String.valueOf(lqg.a.a);
            glk.e("Babel", new StringBuilder((String.valueOf(valueOf).length() + 112) + String.valueOf(valueOf2).length()).append("Message without text or image: eventId ").append(valueOf).append(" conversationId ").append(valueOf2).append(" num segments = ").append(lob.a.a.length).append(" num attachments = ").append(lob.a.b.length).toString(), new Object[0]);
        }
    }

    public List<fpd> d() {
        return this.u;
    }

    public List<foz> e() {
        return this.v;
    }

    protected void b(blo blo, fhc fhc) {
        a(1);
        new fea().a(this).a(true).a(this.y).b(this.z).c(this.A).f(fle.a(blo.f(), blo.h(), a())).a().a(blo, fhc);
        blf.a(blo, this);
        if (!blo.g().b().equals(b())) {
            ((dqc) jyn.a(gwb.H(), dqc.class)).a(blo.g().g(), dqd.MESSAGE_RECEIVED);
        }
    }

    public List<edo> f() {
        List<edo> arrayList = new ArrayList();
        arrayList.add(this.b);
        return arrayList;
    }

    public void a(int i) {
        this.w = i;
    }

    public int g() {
        return this.w;
    }

    public void b(int i) {
        this.x = i;
    }

    public int h() {
        return this.x;
    }
}
