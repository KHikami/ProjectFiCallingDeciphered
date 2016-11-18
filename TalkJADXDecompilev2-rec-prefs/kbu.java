package p000;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class kbu {
    private static final Bundle f21347d = new Bundle();
    public final List<kcq> f21348a = new ArrayList();
    public final List<kbz> f21349b = new ArrayList();
    private HashSet<String> f21350c = new HashSet();
    private kbz f21351e;
    private kbz f21352f;
    private kbz f21353g;
    private kbz f21354h;

    public <T extends kcq> T m25514a(T t) {
        gwb.aJ();
        String b = kbu.m25511b((kcq) t);
        if (b != null) {
            if (this.f21350c.contains(b)) {
                throw new IllegalStateException(String.format("Duplicate observer tag: '%s'. Implement LifecycleObserverTag to provide unique tags.", new Object[]{b}));
            }
            this.f21350c.add(b);
        }
        this.f21348a.add(t);
        for (int i = 0; i < this.f21349b.size(); i++) {
            ((kbz) this.f21349b.get(i)).mo1841a(t);
        }
        return t;
    }

    public kbz m25513a(kbz kbz) {
        for (int i = 0; i < this.f21348a.size(); i++) {
            kbz.mo1841a((kcq) this.f21348a.get(i));
        }
        this.f21349b.add(kbz);
        return kbz;
    }

    public void m25522b(kbz kbz) {
        this.f21349b.remove(kbz);
    }

    public Bundle m25512a(kcq kcq, Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        String b = kbu.m25511b(kcq);
        if (b != null) {
            return bundle.getBundle(b);
        }
        return f21347d;
    }

    public void m25526c(Bundle bundle) {
        this.f21351e = m25513a(new kbv(this, bundle));
    }

    public void m25518a(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        for (kcq kcq : this.f21348a) {
            if (kcq instanceof kce) {
            }
        }
    }

    public boolean m25520a(MenuItem menuItem) {
        for (kcq kcq : this.f21348a) {
            if (kcq instanceof kcc) {
                if (((kcc) kcq).m25572a()) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean m25519a(Menu menu) {
        boolean z = false;
        for (kcq kcq : this.f21348a) {
            boolean a;
            if (kcq instanceof kcf) {
                a = ((kcf) kcq).mo670a(menu) | z;
            } else {
                a = z;
            }
            z = a;
        }
        return z;
    }

    public boolean m25523b(Menu menu) {
        boolean z = false;
        for (kcq kcq : this.f21348a) {
            if (kcq instanceof kck) {
                z = ((kck) kcq).mo672b(menu) | z;
            }
        }
        return z;
    }

    public boolean m25524b(MenuItem menuItem) {
        for (kcq kcq : this.f21348a) {
            if (kcq instanceof kci) {
                if (((kci) kcq).mo671a(menuItem)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void m25528i() {
        this.f21352f = m25513a(new kbw(this));
    }

    public void m25529j() {
        this.f21353g = m25513a(new kbx(this));
    }

    public void mo3637b() {
        m25522b(this.f21353g);
        for (int i = 0; i < this.f21348a.size(); i++) {
            kcq kcq = (kcq) this.f21348a.get(i);
            if (kcq instanceof kcj) {
                ((kcj) kcq).T_();
            }
        }
    }

    public void m25530k() {
        m25522b(this.f21352f);
        for (int i = 0; i < this.f21348a.size(); i++) {
            kcq kcq = (kcq) this.f21348a.get(i);
            if (kcq instanceof kcp) {
                ((kcp) kcq).A_();
            }
        }
    }

    public void m25527d(Bundle bundle) {
        this.f21354h = m25513a(new kby(this, bundle));
    }

    public void mo3638c() {
        m25522b(this.f21354h);
        m25522b(this.f21351e);
        for (int i = 0; i < this.f21348a.size(); i++) {
            kcq kcq = (kcq) this.f21348a.get(i);
            if (kcq instanceof kcg) {
                ((kcg) kcq).o_();
            }
        }
    }

    public void m25517a(Configuration configuration) {
        int i = 0;
        while (i < this.f21348a.size()) {
            i = ((kcq) this.f21348a.get(i)) instanceof kcb ? i + 1 : i + 1;
        }
    }

    public void m25515a(int i, int i2, Intent intent) {
        for (int i3 = 0; i3 < this.f21348a.size(); i3++) {
            kcq kcq = (kcq) this.f21348a.get(i3);
            if (kcq instanceof kca) {
                ((kca) kcq).mo3488a(i, i2, intent);
            }
        }
    }

    public void m25516a(int i, String[] strArr, int[] iArr) {
        for (int i2 = 0; i2 < this.f21348a.size(); i2++) {
            kcq kcq = (kcq) this.f21348a.get(i2);
            if (kcq instanceof kcl) {
                ((kcl) kcq).mo3607a(i, strArr, iArr);
            }
        }
    }

    public void m25531l() {
        for (kcq kcq : this.f21348a) {
            if (kcq instanceof kch) {
            }
        }
    }

    static String m25511b(kcq kcq) {
        if (!(kcq instanceof kcn)) {
            return null;
        }
        if (kcq instanceof kcr) {
            return ((kcr) kcq).mo642a();
        }
        return kcq.getClass().getName();
    }
}
