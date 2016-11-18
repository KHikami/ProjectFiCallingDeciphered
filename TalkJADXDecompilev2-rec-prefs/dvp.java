package p000;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

public final class dvp implements iii {
    public final List<pbq> f10642a = new ArrayList();
    private final iid f10643b;
    private final pbm f10644c;
    private pbn f10645d;
    private pbo f10646e;

    dvp(iid iid, Context context) {
        this.f10643b = iid;
        this.f10644c = new pbm();
        this.f10644c.e = new pbp();
        this.f10644c.e.b = gwb.m2362u(context);
    }

    public iij mo1719a() {
        return new iij();
    }

    public iii mo1717a(int i) {
        if (this.f10645d == null) {
            this.f10645d = new pbn();
        }
        this.f10645d.a = Integer.valueOf(i);
        return this;
    }

    public iii mo1718a(long j) {
        if (this.f10645d == null) {
            this.f10645d = new pbn();
        }
        if (this.f10646e == null) {
            this.f10646e = new pbo();
        }
        this.f10646e.a = Long.valueOf(j);
        return this;
    }

    public iii mo1721b(long j) {
        if (this.f10645d == null) {
            this.f10645d = new pbn();
        }
        if (this.f10646e == null) {
            this.f10646e = new pbo();
        }
        this.f10646e.b = Long.valueOf(j);
        return this;
    }

    public iii mo1722c(long j) {
        if (this.f10645d == null) {
            this.f10645d = new pbn();
        }
        if (this.f10646e == null) {
            this.f10646e = new pbo();
        }
        this.f10646e.c = Long.valueOf(j);
        return this;
    }

    public void mo1720a(int i, int i2) {
        pbv pbv = new pbv();
        if (this.f10645d != null) {
            this.f10645d.c = this.f10646e;
        }
        pbv.a = this.f10645d;
        this.f10644c.e.a = i;
        this.f10644c.a = i2;
        this.f10644c.b = (pbq[]) this.f10642a.toArray(new pbq[this.f10642a.size()]);
        this.f10644c.d = pbv;
        this.f10643b.mo1692a(this.f10644c);
    }
}
