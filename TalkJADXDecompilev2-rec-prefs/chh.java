package p000;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

final class chh implements bpe {
    private List<bpd> f5321a;
    private bpd f5322b;
    private List<bpf> f5323c = new ArrayList();
    private List<bpg> f5324d;
    private edo f5325e;
    private final Map<String, List<edk>> f5326f = new ky();

    chh() {
    }

    public chh m7635a(jyn jyn) {
        jyn.m25444a(bpe.class, (Object) this);
        return this;
    }

    void m7641a(edo edo) {
        this.f5325e = edo;
    }

    public void mo963a(bpf bpf) {
        this.f5323c.add(bpf);
        if (this.f5321a != null) {
            bpf.mo819a(this.f5321a, this.f5322b);
        }
    }

    public void m7645b(bpf bpf) {
        this.f5323c.remove(bpf);
    }

    public void mo964a(bpg bpg) {
        if (this.f5321a != null) {
            bpg.mo720a(this.f5322b);
            return;
        }
        if (this.f5324d == null) {
            this.f5324d = new ArrayList();
        }
        this.f5324d.add(bpg);
    }

    List<bpd> m7649f() {
        return this.f5321a;
    }

    void m7650g() {
        this.f5326f.clear();
    }

    List<edk> m7637a(String str) {
        List<edk> list = (List) this.f5326f.get(str);
        if (list != null) {
            return list;
        }
        List arrayList = new ArrayList();
        this.f5326f.put(str, arrayList);
        return arrayList;
    }

    public Collection<edk> mo961a() {
        List<edk> list = (List) this.f5326f.get(this.f5322b.f4146a);
        if (list == null) {
            return Collections.emptyList();
        }
        Collection<edk> arrayList = new ArrayList();
        for (edk edk : list) {
            if (!this.f5325e.m13608a(edk.f11213b)) {
                arrayList.add(edk);
            }
        }
        return arrayList;
    }

    public int mo965b() {
        return mo961a().size();
    }

    public String mo966c() {
        Collection a = mo961a();
        if (mo965b() == 1) {
            return ((edk) a.iterator().next()).f11214c;
        }
        return null;
    }

    public void mo967d() {
        for (bpf a : this.f5323c) {
            a.mo817a();
        }
    }

    public void mo962a(bpd bpd) {
        iil.m21874a("Expected condition to be true", this.f5321a.contains(bpd));
        if (this.f5322b != bpd) {
            this.f5322b = bpd;
            ArrayList arrayList = new ArrayList(this.f5323c);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((bpf) obj).mo818a(this.f5322b);
            }
        }
    }

    public void m7642a(String str, String str2) {
        int i;
        bpd bpd;
        int i2 = 0;
        ba.m4536a(this.f5321a);
        int i3 = (this.f5322b == null || !TextUtils.equals(this.f5322b.f4146a, str)) ? 0 : 1;
        while (i2 < this.f5321a.size()) {
            bpd bpd2 = (bpd) this.f5321a.get(i2);
            if (TextUtils.equals(bpd2.f4146a, str)) {
                i = i2;
                bpd = bpd2;
                break;
            }
            i2++;
        }
        bpd = null;
        i = -1;
        if (bpd != null) {
            bpd2 = new bpd(str2, bpd.f4147b, bpd.f4153h, bpd.f4148c, bpd.f4149d, bpd.f4150e, bpd.f4151f, bpd.f4154i, bpd.f4155j, bpd.f4152g);
            this.f5321a.set(i, bpd2);
            if (i3 != 0) {
                mo962a(bpd2);
            }
            m7634h();
        }
    }

    public bpd mo968e() {
        if (this.f5321a != null) {
            for (bpd bpd : this.f5321a) {
                if (gwb.m2267j(bpd.f4147b)) {
                    return bpd;
                }
            }
        }
        return null;
    }

    private void m7634h() {
        ArrayList arrayList = new ArrayList(this.f5323c);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((bpf) obj).mo819a(this.f5321a, this.f5322b);
        }
    }

    void m7643a(List<bpd> list, bpd bpd) {
        boolean z;
        if (this.f5321a == null) {
            z = true;
        } else {
            z = false;
        }
        iil.m21874a("Expected condition to be true", z);
        this.f5321a = list;
        this.f5322b = bpd;
        m7634h();
        if (this.f5324d != null) {
            for (bpg a : this.f5324d) {
                a.mo720a(bpd);
            }
        }
        this.f5324d = null;
    }
}
