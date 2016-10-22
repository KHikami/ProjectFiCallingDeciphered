import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class juv {
    private final ky<String, juw> a;
    private juw b;
    private long c;
    private long d;
    private long e;
    private long f;

    public juv() {
        this.a = new ky();
    }

    public void a(String str, String[] strArr) {
        this.b = (juw) this.a.get(str);
        if (this.b == null) {
            this.b = new juw();
            this.b.a = str;
            this.b.j = Arrays.asList(strArr);
            this.a.put(str, this.b);
        }
        this.c = System.currentTimeMillis();
        this.e = 0;
    }

    public void a() {
        this.d = System.currentTimeMillis();
    }

    public List<String> b() {
        List arrayList = new ArrayList();
        for (juw juw : this.a.values()) {
            arrayList.addAll(juw.j);
        }
        return arrayList;
    }

    public void c() {
        this.e = System.currentTimeMillis();
    }

    private void n() {
        if (this.e != 0) {
            juw juw = this.b;
            juw.c += System.currentTimeMillis() - this.e;
            this.e = 0;
        }
        this.f = System.currentTimeMillis();
    }

    public void d() {
        n();
        juw juw = this.b;
        juw.b += System.currentTimeMillis() - this.c;
    }

    public void a(juz juz) {
        juw juw = this.b;
        juw.e += juz.a();
        juw = this.b;
        juw.f += juz.b();
        juw = this.b;
        juw.d += (long) juz.e();
        this.b.i = juz.c();
        this.b.g = juz.f();
        this.b.h.a(juz.h());
        this.b.k = juz.g();
    }

    public void a(String str, String str2) {
        List arrayList = new ArrayList(this.a.keySet());
        Collections.sort(arrayList);
        ArrayList arrayList2 = (ArrayList) arrayList;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            String valueOf = String.valueOf(this.a.get((String) obj));
            new StringBuilder((String.valueOf(str2).length() + 0) + String.valueOf(valueOf).length()).append(str2).append(valueOf);
        }
    }

    public String e() {
        if (this.a.isEmpty()) {
            return "Unknown";
        }
        return (String) this.a.keySet().iterator().next();
    }

    public String f() {
        return this.b.k;
    }

    public long g() {
        ArrayList arrayList = new ArrayList(this.a.keySet());
        int size = arrayList.size();
        long j = 0;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            j += ((juw) this.a.get((String) obj)).e;
        }
        return j;
    }

    public long h() {
        return this.c;
    }

    public long i() {
        return this.f;
    }

    public long j() {
        return this.d;
    }

    public long k() {
        ArrayList arrayList = new ArrayList(this.a.keySet());
        int size = arrayList.size();
        long j = 0;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            j += ((juw) this.a.get((String) obj)).f;
        }
        return j;
    }

    public long l() {
        return this.b.g;
    }

    public ky<String, Long> m() {
        return this.b.h;
    }
}
