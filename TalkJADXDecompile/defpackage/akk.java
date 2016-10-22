package defpackage;

import android.accounts.Account;
import java.util.ArrayList;
import java.util.List;

/* renamed from: akk */
public final class akk implements akn {
    private static String a;
    private final List<ajr> b;
    private ajr c;
    private final int d;
    private final Account e;
    private final List<akm> f;

    static {
        a = "vCard";
    }

    public akk() {
        this(-1073741824, null, (byte) 0);
    }

    public akk(int i, Account account) {
        this(i, null, (byte) 0);
    }

    @Deprecated
    private akk(int i, Account account, byte b) {
        this.b = new ArrayList();
        this.f = new ArrayList();
        this.d = i;
        this.e = account;
    }

    public void a(akm akm) {
        this.f.add(akm);
    }

    public void a() {
        for (akm a : this.f) {
            a.a();
        }
    }

    public void b() {
        for (akm b : this.f) {
            b.b();
        }
    }

    public void c() {
        this.c = null;
        this.b.clear();
    }

    public void d() {
        this.c = new ajr(this.d, this.e);
        this.b.add(this.c);
    }

    public void e() {
        this.c.a();
        for (akm a : this.f) {
            a.a(this.c);
        }
        int size = this.b.size();
        if (size > 1) {
            ajr ajr = (ajr) this.b.get(size - 2);
            ajr.a(this.c);
            this.c = ajr;
        } else {
            this.c = null;
        }
        this.b.remove(size - 1);
    }

    public void a(aku aku) {
        this.c.a(aku);
    }
}
