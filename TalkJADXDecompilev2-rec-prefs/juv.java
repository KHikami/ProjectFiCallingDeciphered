package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class juv {
    private final ky<String, juw> f21084a = new ky();
    private juw f21085b;
    private long f21086c;
    private long f21087d;
    private long f21088e;
    private long f21089f;

    public void m25257a(String str, String[] strArr) {
        this.f21085b = (juw) this.f21084a.get(str);
        if (this.f21085b == null) {
            this.f21085b = new juw();
            this.f21085b.f21090a = str;
            this.f21085b.f21099j = Arrays.asList(strArr);
            this.f21084a.put(str, this.f21085b);
        }
        this.f21086c = System.currentTimeMillis();
        this.f21088e = 0;
    }

    public void m25255a() {
        this.f21087d = System.currentTimeMillis();
    }

    public List<String> m25259b() {
        List arrayList = new ArrayList();
        for (juw juw : this.f21084a.values()) {
            arrayList.addAll(juw.f21099j);
        }
        return arrayList;
    }

    public void m25260c() {
        this.f21088e = System.currentTimeMillis();
    }

    private void m25254n() {
        if (this.f21088e != 0) {
            juw juw = this.f21085b;
            juw.f21092c += System.currentTimeMillis() - this.f21088e;
            this.f21088e = 0;
        }
        this.f21089f = System.currentTimeMillis();
    }

    public void m25261d() {
        m25254n();
        juw juw = this.f21085b;
        juw.f21091b += System.currentTimeMillis() - this.f21086c;
    }

    public void m25258a(juz juz) {
        juw juw = this.f21085b;
        juw.f21094e += juz.m25274a();
        juw = this.f21085b;
        juw.f21095f += juz.m25277b();
        juw = this.f21085b;
        juw.f21093d += (long) juz.m25282e();
        this.f21085b.f21098i = juz.m25280c();
        this.f21085b.f21096g = juz.m25283f();
        this.f21085b.f21097h.m28015a(juz.m25285h());
        this.f21085b.f21100k = juz.m25284g();
    }

    public void m25256a(String str, String str2) {
        List arrayList = new ArrayList(this.f21084a.keySet());
        Collections.sort(arrayList);
        ArrayList arrayList2 = (ArrayList) arrayList;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            String valueOf = String.valueOf(this.f21084a.get((String) obj));
            new StringBuilder((String.valueOf(str2).length() + 0) + String.valueOf(valueOf).length()).append(str2).append(valueOf);
        }
    }

    public String m25262e() {
        if (this.f21084a.isEmpty()) {
            return "Unknown";
        }
        return (String) this.f21084a.keySet().iterator().next();
    }

    public String m25263f() {
        return this.f21085b.f21100k;
    }

    public long m25264g() {
        ArrayList arrayList = new ArrayList(this.f21084a.keySet());
        int size = arrayList.size();
        long j = 0;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            j += ((juw) this.f21084a.get((String) obj)).f21094e;
        }
        return j;
    }

    public long m25265h() {
        return this.f21086c;
    }

    public long m25266i() {
        return this.f21089f;
    }

    public long m25267j() {
        return this.f21087d;
    }

    public long m25268k() {
        ArrayList arrayList = new ArrayList(this.f21084a.keySet());
        int size = arrayList.size();
        long j = 0;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            j += ((juw) this.f21084a.get((String) obj)).f21095f;
        }
        return j;
    }

    public long m25269l() {
        return this.f21085b.f21096g;
    }

    public ky<String, Long> m25270m() {
        return this.f21085b.f21097h;
    }
}
