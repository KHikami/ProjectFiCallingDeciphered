package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: alo */
public abstract class alo<T> implements Comparable<alo<T>> {
    final alz a;
    Integer b;
    boolean c;
    public boolean d;
    private final int e;
    private final String f;
    private final int g;
    private final alt h;
    private alr i;
    private boolean j;
    private boolean k;
    private alw l;
    private alg m;

    public abstract als<T> a(aln aln);

    public abstract void a(T t);

    public /* synthetic */ int compareTo(Object obj) {
        return a((alo) obj);
    }

    @Deprecated
    public alo(String str, alt alt) {
        this(-1, str, alt);
    }

    private alo(int i, String str, alt alt) {
        alz alz;
        int hashCode;
        if (alz.a) {
            alz = new alz();
        } else {
            alz = null;
        }
        this.a = alz;
        this.c = true;
        this.j = false;
        this.k = false;
        this.d = false;
        this.m = null;
        this.e = -1;
        this.f = str;
        this.h = alt;
        a(new alw());
        if (!TextUtils.isEmpty(str)) {
            Uri parse = Uri.parse(str);
            if (parse != null) {
                String host = parse.getHost();
                if (host != null) {
                    hashCode = host.hashCode();
                    this.g = hashCode;
                }
            }
        }
        hashCode = 0;
        this.g = hashCode;
    }

    public int a() {
        return this.e;
    }

    public int b() {
        return this.g;
    }

    public alo<?> a(alw alw) {
        this.l = alw;
        return this;
    }

    public void a(String str) {
        if (alz.a) {
            this.a.a(str, Thread.currentThread().getId());
        }
    }

    void b(String str) {
        if (this.i != null) {
            this.i.b(this);
        }
        if (alz.a) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new alp(this, str, id));
                return;
            }
            this.a.a(str, id);
            this.a.a(toString());
        }
    }

    public alo<?> a(alr alr) {
        this.i = alr;
        return this;
    }

    public String c() {
        return this.f;
    }

    public String d() {
        return c();
    }

    public alo<?> a(alg alg) {
        this.m = alg;
        return this;
    }

    public alg e() {
        return this.m;
    }

    public boolean f() {
        return this.j;
    }

    public Map<String, String> g() {
        return Collections.emptyMap();
    }

    @Deprecated
    protected Map<String, String> h() {
        return null;
    }

    @Deprecated
    protected String i() {
        return l();
    }

    @Deprecated
    public String j() {
        return m();
    }

    @Deprecated
    public byte[] k() {
        Map h = h();
        if (h == null || h.size() <= 0) {
            return null;
        }
        return alo.a(h, i());
    }

    protected String l() {
        return "UTF-8";
    }

    public String m() {
        return "application/x-www-form-urlencoded; charset=" + l();
    }

    public byte[] n() {
        return null;
    }

    private static byte[] a(Map<String, String> map, String str) {
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

    public alq o() {
        return alq.NORMAL;
    }

    public final int p() {
        return this.l.a();
    }

    public alw q() {
        return this.l;
    }

    public void r() {
        this.k = true;
    }

    public boolean s() {
        return this.k;
    }

    protected alx a(alx alx) {
        return alx;
    }

    public void b(alx alx) {
        if (this.h != null) {
            this.h.a(alx);
        }
    }

    public int a(alo<T> alo_T) {
        alq o = o();
        alq o2 = alo_T.o();
        return o == o2 ? this.b.intValue() - alo_T.b.intValue() : o2.ordinal() - o.ordinal();
    }

    public String toString() {
        return (this.j ? "[X] " : "[ ] ") + c() + " " + ("0x" + Integer.toHexString(b())) + " " + o() + " " + this.b;
    }
}
