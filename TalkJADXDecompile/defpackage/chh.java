package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: chh */
final class chh implements bpe {
    private List<bpd> a;
    private bpd b;
    private List<bpf> c;
    private List<bpg> d;
    private edo e;
    private final Map<String, List<edk>> f;

    chh() {
        this.c = new ArrayList();
        this.f = new ky();
    }

    public chh a(jyn jyn) {
        jyn.a(bpe.class, (Object) this);
        return this;
    }

    void a(edo edo) {
        this.e = edo;
    }

    public void a(bpf bpf) {
        this.c.add(bpf);
        if (this.a != null) {
            bpf.a(this.a, this.b);
        }
    }

    public void b(bpf bpf) {
        this.c.remove(bpf);
    }

    public void a(bpg bpg) {
        if (this.a != null) {
            bpg.a(this.b);
            return;
        }
        if (this.d == null) {
            this.d = new ArrayList();
        }
        this.d.add(bpg);
    }

    List<bpd> f() {
        return this.a;
    }

    void g() {
        this.f.clear();
    }

    List<edk> a(String str) {
        List<edk> list = (List) this.f.get(str);
        if (list != null) {
            return list;
        }
        List arrayList = new ArrayList();
        this.f.put(str, arrayList);
        return arrayList;
    }

    public Collection<edk> a() {
        List<edk> list = (List) this.f.get(this.b.a);
        if (list == null) {
            return Collections.emptyList();
        }
        Collection<edk> arrayList = new ArrayList();
        for (edk edk : list) {
            if (!this.e.a(edk.b)) {
                arrayList.add(edk);
            }
        }
        return arrayList;
    }

    public int b() {
        return a().size();
    }

    public String c() {
        Collection a = a();
        if (b() == 1) {
            return ((edk) a.iterator().next()).c;
        }
        return null;
    }

    public void d() {
        for (bpf a : this.c) {
            a.a();
        }
    }

    public void a(bpd bpd) {
        iil.a("Expected condition to be true", this.a.contains(bpd));
        if (this.b != bpd) {
            this.b = bpd;
            ArrayList arrayList = new ArrayList(this.c);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((bpf) obj).a(this.b);
            }
        }
    }

    public void a(String str, String str2) {
        int i;
        bpd bpd;
        int i2 = 0;
        ba.a(this.a);
        int i3 = (this.b == null || !TextUtils.equals(this.b.a, str)) ? 0 : 1;
        while (i2 < this.a.size()) {
            bpd bpd2 = (bpd) this.a.get(i2);
            if (TextUtils.equals(bpd2.a, str)) {
                i = i2;
                bpd = bpd2;
                break;
            }
            i2++;
        }
        bpd = null;
        i = -1;
        if (bpd != null) {
            bpd2 = new bpd(str2, bpd.b, bpd.h, bpd.c, bpd.d, bpd.e, bpd.f, bpd.i, bpd.j, bpd.g);
            this.a.set(i, bpd2);
            if (i3 != 0) {
                a(bpd2);
            }
            h();
        }
    }

    public bpd e() {
        if (this.a != null) {
            for (bpd bpd : this.a) {
                if (gwb.j(bpd.b)) {
                    return bpd;
                }
            }
        }
        return null;
    }

    private void h() {
        ArrayList arrayList = new ArrayList(this.c);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((bpf) obj).a(this.a, this.b);
        }
    }

    void a(List<bpd> list, bpd bpd) {
        boolean z;
        if (this.a == null) {
            z = true;
        } else {
            z = false;
        }
        iil.a("Expected condition to be true", z);
        this.a = list;
        this.b = bpd;
        h();
        if (this.d != null) {
            for (bpg a : this.d) {
                a.a(bpd);
            }
        }
        this.d = null;
    }
}
