package p000;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;

public abstract class alo<T> implements Comparable<alo<T>> {
    final alz f1213a;
    Integer f1214b;
    boolean f1215c;
    public boolean f1216d;
    private final int f1217e;
    private final String f1218f;
    private final int f1219g;
    private final alt f1220h;
    private alr f1221i;
    private boolean f1222j;
    private boolean f1223k;
    private alw f1224l;
    private alg f1225m;

    public abstract als<T> mo460a(aln aln);

    public abstract void mo461a(T t);

    public /* synthetic */ int compareTo(Object obj) {
        return m2836a((alo) obj);
    }

    @Deprecated
    public alo(String str, alt alt) {
        this(-1, str, alt);
    }

    private alo(int i, String str, alt alt) {
        alz alz;
        int hashCode;
        if (alz.f1263a) {
            alz = new alz();
        } else {
            alz = null;
        }
        this.f1213a = alz;
        this.f1215c = true;
        this.f1222j = false;
        this.f1223k = false;
        this.f1216d = false;
        this.f1225m = null;
        this.f1217e = -1;
        this.f1218f = str;
        this.f1220h = alt;
        m2839a(new alw());
        if (!TextUtils.isEmpty(str)) {
            Uri parse = Uri.parse(str);
            if (parse != null) {
                String host = parse.getHost();
                if (host != null) {
                    hashCode = host.hashCode();
                    this.f1219g = hashCode;
                }
            }
        }
        hashCode = 0;
        this.f1219g = hashCode;
    }

    public int m2835a() {
        return this.f1217e;
    }

    public int m2844b() {
        return this.f1219g;
    }

    public alo<?> m2839a(alw alw) {
        this.f1224l = alw;
        return this;
    }

    public void m2843a(String str) {
        if (alz.f1263a) {
            this.f1213a.m2887a(str, Thread.currentThread().getId());
        }
    }

    void m2846b(String str) {
        if (this.f1221i != null) {
            this.f1221i.m2869b(this);
        }
        if (alz.f1263a) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new alp(this, str, id));
                return;
            }
            this.f1213a.m2887a(str, id);
            this.f1213a.m2886a(toString());
        }
    }

    public alo<?> m2838a(alr alr) {
        this.f1221i = alr;
        return this;
    }

    public String m2847c() {
        return this.f1218f;
    }

    public String m2848d() {
        return m2847c();
    }

    public alo<?> m2837a(alg alg) {
        this.f1225m = alg;
        return this;
    }

    public alg m2849e() {
        return this.f1225m;
    }

    public boolean m2850f() {
        return this.f1222j;
    }

    public Map<String, String> mo462g() {
        return Collections.emptyMap();
    }

    @Deprecated
    protected Map<String, String> m2852h() {
        return null;
    }

    @Deprecated
    protected String m2853i() {
        return m2856l();
    }

    @Deprecated
    public String m2854j() {
        return m2857m();
    }

    @Deprecated
    public byte[] m2855k() {
        Map h = m2852h();
        if (h == null || h.size() <= 0) {
            return null;
        }
        return alo.m2834a(h, m2853i());
    }

    protected String m2856l() {
        return "UTF-8";
    }

    public String m2857m() {
        return "application/x-www-form-urlencoded; charset=" + m2856l();
    }

    public byte[] m2858n() {
        return null;
    }

    private static byte[] m2834a(Map<String, String> map, String str) {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            for (Entry entry : map.entrySet()) {
                stringBuilder.append(URLEncoder.encode((String) entry.getKey(), str));
                stringBuilder.append('=');
                stringBuilder.append(URLEncoder.encode((String) entry.getValue(), str));
                stringBuilder.append('&');
            }
            return stringBuilder.toString().getBytes(str);
        } catch (Throwable e) {
            throw new RuntimeException("Encoding not supported: " + str, e);
        }
    }

    public alq mo463o() {
        return alq.NORMAL;
    }

    public final int m2860p() {
        return this.f1224l.m2878a();
    }

    public alw m2861q() {
        return this.f1224l;
    }

    public void m2862r() {
        this.f1223k = true;
    }

    public boolean m2863s() {
        return this.f1223k;
    }

    protected alx m2841a(alx alx) {
        return alx;
    }

    public void m2845b(alx alx) {
        if (this.f1220h != null) {
            this.f1220h.m2872a(alx);
        }
    }

    public int m2836a(alo<T> alo_T) {
        alq o = mo463o();
        alq o2 = alo_T.mo463o();
        return o == o2 ? this.f1214b.intValue() - alo_T.f1214b.intValue() : o2.ordinal() - o.ordinal();
    }

    public String toString() {
        return (this.f1222j ? "[X] " : "[ ] ") + m2847c() + " " + ("0x" + Integer.toHexString(m2844b())) + " " + mo463o() + " " + this.f1214b;
    }
}
