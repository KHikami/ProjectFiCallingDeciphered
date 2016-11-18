package p000;

import android.accounts.Account;
import java.util.ArrayList;
import java.util.List;

public final class akk implements akn {
    private static String f1126a = "vCard";
    private final List<ajr> f1127b;
    private ajr f1128c;
    private final int f1129d;
    private final Account f1130e;
    private final List<akm> f1131f;

    public akk() {
        this(-1073741824, null, (byte) 0);
    }

    public akk(int i, Account account) {
        this(i, null, (byte) 0);
    }

    @Deprecated
    private akk(int i, Account account, byte b) {
        this.f1127b = new ArrayList();
        this.f1131f = new ArrayList();
        this.f1129d = i;
        this.f1130e = account;
    }

    public void m2726a(akm akm) {
        this.f1131f.add(akm);
    }

    public void mo237a() {
        for (akm a : this.f1131f) {
            a.m2737a();
        }
    }

    public void mo239b() {
        for (akm b : this.f1131f) {
            b.m2739b();
        }
    }

    public void m2729c() {
        this.f1128c = null;
        this.f1127b.clear();
    }

    public void mo240d() {
        this.f1128c = new ajr(this.f1129d, this.f1130e);
        this.f1127b.add(this.f1128c);
    }

    public void mo241e() {
        this.f1128c.m2658a();
        for (akm a : this.f1131f) {
            a.m2738a(this.f1128c);
        }
        int size = this.f1127b.size();
        if (size > 1) {
            ajr ajr = (ajr) this.f1127b.get(size - 2);
            ajr.m2659a(this.f1128c);
            this.f1128c = ajr;
        } else {
            this.f1128c = null;
        }
        this.f1127b.remove(size - 1);
    }

    public void mo238a(aku aku) {
        this.f1128c.m2660a(aku);
    }
}
