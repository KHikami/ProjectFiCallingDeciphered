package defpackage;

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
    private static final Bundle d = new Bundle();
    public final List<kcq> a = new ArrayList();
    public final List<kbz> b = new ArrayList();
    private HashSet<String> c = new HashSet();
    private kbz e;
    private kbz f;
    private kbz g;
    private kbz h;

    public <T extends kcq> T a(T t) {
        gwb.aJ();
        String b = kbu.b((kcq) t);
        if (b != null) {
            if (this.c.contains(b)) {
                throw new IllegalStateException(String.format("Duplicate observer tag: '%s'. Implement LifecycleObserverTag to provide unique tags.", new Object[]{b}));
            }
            this.c.add(b);
        }
        this.a.add(t);
        for (int i = 0; i < this.b.size(); i++) {
            ((kbz) this.b.get(i)).a(t);
        }
        return t;
    }

    public kbz a(kbz kbz) {
        for (int i = 0; i < this.a.size(); i++) {
            kbz.a((kcq) this.a.get(i));
        }
        this.b.add(kbz);
        return kbz;
    }

    public void b(kbz kbz) {
        this.b.remove(kbz);
    }

    public Bundle a(kcq kcq, Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        String b = kbu.b(kcq);
        if (b != null) {
            return bundle.getBundle(b);
        }
        return d;
    }

    public void c(Bundle bundle) {
        this.e = a(new kbv(this, bundle));
    }

    public void a(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        for (kcq kcq : this.a) {
            if (kcq instanceof kce) {
            }
        }
    }

    public boolean a(MenuItem menuItem) {
        for (kcq kcq : this.a) {
            if (kcq instanceof kcc) {
                if (((kcc) kcq).a()) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean a(Menu menu) {
        boolean z = false;
        for (kcq kcq : this.a) {
            boolean a;
            if (kcq instanceof kcf) {
                a = ((kcf) kcq).a(menu) | z;
            } else {
                a = z;
            }
            z = a;
        }
        return z;
    }

    public boolean b(Menu menu) {
        boolean z = false;
        for (kcq kcq : this.a) {
            if (kcq instanceof kck) {
                z = ((kck) kcq).b(menu) | z;
            }
        }
        return z;
    }

    public boolean b(MenuItem menuItem) {
        for (kcq kcq : this.a) {
            if (kcq instanceof kci) {
                if (((kci) kcq).a(menuItem)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void i() {
        this.f = a(new kbw(this));
    }

    public void j() {
        this.g = a(new kbx(this));
    }

    public void b() {
        b(this.g);
        for (int i = 0; i < this.a.size(); i++) {
            kcq kcq = (kcq) this.a.get(i);
            if (kcq instanceof kcj) {
                ((kcj) kcq).T_();
            }
        }
    }

    public void k() {
        b(this.f);
        for (int i = 0; i < this.a.size(); i++) {
            kcq kcq = (kcq) this.a.get(i);
            if (kcq instanceof kcp) {
                ((kcp) kcq).A_();
            }
        }
    }

    public void d(Bundle bundle) {
        this.h = a(new kby(this, bundle));
    }

    public void c() {
        b(this.h);
        b(this.e);
        for (int i = 0; i < this.a.size(); i++) {
            kcq kcq = (kcq) this.a.get(i);
            if (kcq instanceof kcg) {
                ((kcg) kcq).o_();
            }
        }
    }

    public void a(Configuration configuration) {
        int i = 0;
        while (i < this.a.size()) {
            i = ((kcq) this.a.get(i)) instanceof kcb ? i + 1 : i + 1;
        }
    }

    public void a(int i, int i2, Intent intent) {
        for (int i3 = 0; i3 < this.a.size(); i3++) {
            kcq kcq = (kcq) this.a.get(i3);
            if (kcq instanceof kca) {
                ((kca) kcq).a(i, i2, intent);
            }
        }
    }

    public void a(int i, String[] strArr, int[] iArr) {
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            kcq kcq = (kcq) this.a.get(i2);
            if (kcq instanceof kcl) {
                ((kcl) kcq).a(i, strArr, iArr);
            }
        }
    }

    public void l() {
        for (kcq kcq : this.a) {
            if (kcq instanceof kch) {
            }
        }
    }

    static String b(kcq kcq) {
        if (!(kcq instanceof kcn)) {
            return null;
        }
        if (kcq instanceof kcr) {
            return ((kcr) kcq).a();
        }
        return kcq.getClass().getName();
    }
}
