package p000;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Deprecated
public class iqo {
    private final String f18710a;
    private final String f18711b;
    private final String f18712c;
    private int f18713d;
    private final ArrayList<Integer> f18714e = new ArrayList();
    private final ArrayList<Integer> f18715f = new ArrayList();
    private boolean f18716g;
    private boolean f18717h;
    private final boolean f18718i;
    private final boolean f18719j;
    private long f18720k;
    private boolean f18721l = false;
    private boolean f18722m = false;
    private volatile Object f18723n;

    protected iqo(String str, String str2, String str3, int i, boolean z, boolean z2) {
        this.f18710a = str;
        this.f18711b = str2;
        this.f18712c = str3;
        this.f18713d = i;
        this.f18718i = z;
        this.f18719j = z2;
        this.f18720k = i == 1 ? SystemClock.elapsedRealtime() : -1;
    }

    public String m22949a() {
        return this.f18710a;
    }

    public String m22953b() {
        Object obj = this.f18723n;
        if (obj instanceof iqp) {
            return ((iqp) obj).mo1584a();
        }
        return this.f18711b;
    }

    public String m22956c() {
        return this.f18712c;
    }

    public boolean m22961d() {
        return this.f18713d == 20;
    }

    public boolean m22963e() {
        return this.f18713d == 21 || m22961d();
    }

    public boolean m22964f() {
        return this.f18713d == 22 || m22963e();
    }

    public boolean m22952a(int i) {
        int i2 = this.f18713d;
        this.f18713d = i;
        if (this.f18720k == -1 && this.f18713d == 1) {
            this.f18720k = SystemClock.elapsedRealtime();
        }
        if (i2 != this.f18713d) {
            return true;
        }
        return false;
    }

    public long m22965g() {
        return this.f18720k;
    }

    public boolean m22966h() {
        return this.f18713d == 22;
    }

    public boolean m22967i() {
        return this.f18713d == 21;
    }

    public boolean m22968j() {
        return this.f18713d == 1;
    }

    public boolean m22969k() {
        return this.f18718i;
    }

    public List<Integer> m22970l() {
        return Collections.unmodifiableList(this.f18714e);
    }

    public void m22954b(int i) {
        this.f18714e.add(Integer.valueOf(i));
    }

    public void m22957c(int i) {
        this.f18714e.remove(Integer.valueOf(i));
    }

    public List<Integer> m22971m() {
        return Collections.unmodifiableList(this.f18715f);
    }

    public void m22959d(int i) {
        this.f18715f.add(Integer.valueOf(i));
    }

    public void m22962e(int i) {
        this.f18715f.remove(Integer.valueOf(i));
    }

    public boolean m22972n() {
        return this.f18716g;
    }

    public void m22951a(boolean z) {
        this.f18716g = z;
    }

    public boolean m22973o() {
        return this.f18717h;
    }

    public void m22955b(boolean z) {
        this.f18717h = z;
    }

    public void m22950a(Object obj) {
        this.f18723n = obj;
    }

    public Object m22974p() {
        return this.f18723n;
    }

    public void m22958c(boolean z) {
        this.f18721l = true;
    }

    public boolean m22975q() {
        return this.f18721l;
    }

    public void m22960d(boolean z) {
        this.f18722m = true;
    }

    public boolean m22976r() {
        return this.f18722m;
    }

    public String toString() {
        return String.format("%s (%s)", new Object[]{this.f18711b, this.f18710a});
    }
}
