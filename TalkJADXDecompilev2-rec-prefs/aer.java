package p000;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class aer {
    private static final List<Object> f437p = Collections.EMPTY_LIST;
    public final View f438a;
    public int f439b = -1;
    int f440c = -1;
    public long f441d = -1;
    int f442e = -1;
    int f443f = -1;
    public aer f444g = null;
    public aer f445h = null;
    int f446i;
    List<Object> f447j = null;
    List<Object> f448k = null;
    aek f449l = null;
    boolean f450m = false;
    int f451n = 0;
    RecyclerView f452o;
    private int f453q = 0;

    public aer(View view) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.f438a = view;
    }

    public void m855a(int i, int i2, boolean z) {
        m862b(8);
        m856a(i2, z);
        this.f439b = i;
    }

    public void m856a(int i, boolean z) {
        if (this.f440c == -1) {
            this.f440c = this.f439b;
        }
        if (this.f443f == -1) {
            this.f443f = this.f439b;
        }
        if (z) {
            this.f443f += i;
        }
        this.f439b += i;
        if (this.f438a.getLayoutParams() != null) {
            ((aeg) this.f438a.getLayoutParams()).f288e = true;
        }
    }

    public void m853a() {
        this.f440c = -1;
        this.f443f = -1;
    }

    public void m861b() {
        if (this.f440c == -1) {
            this.f440c = this.f439b;
        }
    }

    public boolean m863c() {
        return (this.f446i & 128) != 0;
    }

    public final int m864d() {
        return this.f443f == -1 ? this.f439b : this.f443f;
    }

    public final int m865e() {
        if (this.f452o == null) {
            return -1;
        }
        return this.f452o.m3071c(this);
    }

    boolean m866f() {
        return this.f449l != null;
    }

    void m867g() {
        this.f449l.m815b(this);
    }

    boolean m868h() {
        return (this.f446i & 32) != 0;
    }

    void m869i() {
        this.f446i &= -33;
    }

    public void m870j() {
        this.f446i &= -257;
    }

    void m857a(aek aek, boolean z) {
        this.f449l = aek;
        this.f450m = z;
    }

    public boolean m871k() {
        return (this.f446i & 4) != 0;
    }

    boolean m872l() {
        return (this.f446i & 2) != 0;
    }

    public boolean m873m() {
        return (this.f446i & 1) != 0;
    }

    public boolean m874n() {
        return (this.f446i & 8) != 0;
    }

    public boolean m860a(int i) {
        return (this.f446i & i) != 0;
    }

    public boolean m875o() {
        return (this.f446i & 256) != 0;
    }

    boolean m876p() {
        return (this.f446i & 512) != 0 || m871k();
    }

    public void m854a(int i, int i2) {
        this.f446i = (this.f446i & (i2 ^ -1)) | (i & i2);
    }

    public void m862b(int i) {
        this.f446i |= i;
    }

    public void m858a(Object obj) {
        if (obj == null) {
            m862b(1024);
        } else if ((this.f446i & 1024) == 0) {
            if (this.f447j == null) {
                this.f447j = new ArrayList();
                this.f448k = Collections.unmodifiableList(this.f447j);
            }
            this.f447j.add(obj);
        }
    }

    void m877q() {
        if (this.f447j != null) {
            this.f447j.clear();
        }
        this.f446i &= -1025;
    }

    public List<Object> m878r() {
        if ((this.f446i & 1024) != 0) {
            return f437p;
        }
        if (this.f447j == null || this.f447j.size() == 0) {
            return f437p;
        }
        return this.f448k;
    }

    void m879s() {
        this.f446i = 0;
        this.f439b = -1;
        this.f440c = -1;
        this.f441d = -1;
        this.f443f = -1;
        this.f453q = 0;
        this.f444g = null;
        this.f445h = null;
        m877q();
        this.f451n = 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("ViewHolder{" + Integer.toHexString(hashCode()) + " position=" + this.f439b + " id=" + this.f441d + ", oldPos=" + this.f440c + ", pLpos:" + this.f443f);
        if (m866f()) {
            stringBuilder.append(" scrap ").append(this.f450m ? "[changeScrap]" : "[attachedScrap]");
        }
        if (m871k()) {
            stringBuilder.append(" invalid");
        }
        if (!m873m()) {
            stringBuilder.append(" unbound");
        }
        if (m872l()) {
            stringBuilder.append(" update");
        }
        if (m874n()) {
            stringBuilder.append(" removed");
        }
        if (m863c()) {
            stringBuilder.append(" ignored");
        }
        if (m875o()) {
            stringBuilder.append(" tmpDetached");
        }
        if (!m880t()) {
            stringBuilder.append(" not recyclable(" + this.f453q + ")");
        }
        if (m876p()) {
            stringBuilder.append(" undefined adapter position");
        }
        if (this.f438a.getParent() == null) {
            stringBuilder.append(" no parent");
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final void m859a(boolean z) {
        this.f453q = z ? this.f453q - 1 : this.f453q + 1;
        if (this.f453q < 0) {
            this.f453q = 0;
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
        } else if (!z && this.f453q == 1) {
            this.f446i |= 16;
        } else if (z && this.f453q == 0) {
            this.f446i &= -17;
        }
    }

    public final boolean m880t() {
        return (this.f446i & 16) == 0 && !oa.a(this.f438a);
    }

    public boolean m881u() {
        return (this.f446i & 2) != 0;
    }
}
