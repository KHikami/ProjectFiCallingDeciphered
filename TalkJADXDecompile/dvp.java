import android.content.Context;
import java.util.ArrayList;
import java.util.List;

public final class dvp implements iii {
    public final List<pbq> a;
    private final iid b;
    private final pbm c;
    private pbn d;
    private pbo e;

    dvp(iid iid, Context context) {
        this.a = new ArrayList();
        this.b = iid;
        this.c = new pbm();
        this.c.e = new pbp();
        this.c.e.b = gwb.u(context);
    }

    public iij a() {
        return new iij();
    }

    public iii a(int i) {
        if (this.d == null) {
            this.d = new pbn();
        }
        this.d.a = Integer.valueOf(i);
        return this;
    }

    public iii a(long j) {
        if (this.d == null) {
            this.d = new pbn();
        }
        if (this.e == null) {
            this.e = new pbo();
        }
        this.e.a = Long.valueOf(j);
        return this;
    }

    public iii b(long j) {
        if (this.d == null) {
            this.d = new pbn();
        }
        if (this.e == null) {
            this.e = new pbo();
        }
        this.e.b = Long.valueOf(j);
        return this;
    }

    public iii c(long j) {
        if (this.d == null) {
            this.d = new pbn();
        }
        if (this.e == null) {
            this.e = new pbo();
        }
        this.e.c = Long.valueOf(j);
        return this;
    }

    public void a(int i, int i2) {
        pbv pbv = new pbv();
        if (this.d != null) {
            this.d.c = this.e;
        }
        pbv.a = this.d;
        this.c.e.a = i;
        this.c.a = i2;
        this.c.b = (pbq[]) this.a.toArray(new pbq[this.a.size()]);
        this.c.d = pbv;
        this.b.a(this.c);
    }
}
