import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Deprecated
public class iqo {
    private final String a;
    private final String b;
    private final String c;
    private int d;
    private final ArrayList<Integer> e;
    private final ArrayList<Integer> f;
    private boolean g;
    private boolean h;
    private final boolean i;
    private final boolean j;
    private long k;
    private boolean l;
    private boolean m;
    private volatile Object n;

    protected iqo(String str, String str2, String str3, int i, boolean z, boolean z2) {
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.l = false;
        this.m = false;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.i = z;
        this.j = z2;
        this.k = i == 1 ? SystemClock.elapsedRealtime() : -1;
    }

    public String a() {
        return this.a;
    }

    public String b() {
        Object obj = this.n;
        if (obj instanceof iqp) {
            return ((iqp) obj).a();
        }
        return this.b;
    }

    public String c() {
        return this.c;
    }

    public boolean d() {
        return this.d == 20;
    }

    public boolean e() {
        return this.d == 21 || d();
    }

    public boolean f() {
        return this.d == 22 || e();
    }

    public boolean a(int i) {
        int i2 = this.d;
        this.d = i;
        if (this.k == -1 && this.d == 1) {
            this.k = SystemClock.elapsedRealtime();
        }
        if (i2 != this.d) {
            return true;
        }
        return false;
    }

    public long g() {
        return this.k;
    }

    public boolean h() {
        return this.d == 22;
    }

    public boolean i() {
        return this.d == 21;
    }

    public boolean j() {
        return this.d == 1;
    }

    public boolean k() {
        return this.i;
    }

    public List<Integer> l() {
        return Collections.unmodifiableList(this.e);
    }

    public void b(int i) {
        this.e.add(Integer.valueOf(i));
    }

    public void c(int i) {
        this.e.remove(Integer.valueOf(i));
    }

    public List<Integer> m() {
        return Collections.unmodifiableList(this.f);
    }

    public void d(int i) {
        this.f.add(Integer.valueOf(i));
    }

    public void e(int i) {
        this.f.remove(Integer.valueOf(i));
    }

    public boolean n() {
        return this.g;
    }

    public void a(boolean z) {
        this.g = z;
    }

    public boolean o() {
        return this.h;
    }

    public void b(boolean z) {
        this.h = z;
    }

    public void a(Object obj) {
        this.n = obj;
    }

    public Object p() {
        return this.n;
    }

    public void c(boolean z) {
        this.l = true;
    }

    public boolean q() {
        return this.l;
    }

    public void d(boolean z) {
        this.m = true;
    }

    public boolean r() {
        return this.m;
    }

    public String toString() {
        return String.format("%s (%s)", new Object[]{this.b, this.a});
    }
}
