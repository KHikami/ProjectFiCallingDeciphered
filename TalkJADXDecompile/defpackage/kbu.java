package defpackage;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: kbu */
public class kbu {
    private static final Bundle d;
    public final List<kcq> a;
    public final List<kbz> b;
    private HashSet<String> c;
    private kbz e;
    private kbz f;
    private kbz g;
    private kbz h;

    public kbu() {
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new HashSet();
    }

    static {
        d = new Bundle();
    }

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

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.content.res.Configuration r3) {
        /*
        r2 = this;
        r0 = 0;
        r1 = r0;
    L_0x0002:
        r0 = r2.a;	 Catch:{ all -> 0x001a }
        r0 = r0.size();	 Catch:{ all -> 0x001a }
        if (r1 >= r0) goto L_0x001c;
    L_0x000a:
        r0 = r2.a;	 Catch:{ all -> 0x001a }
        r0 = r0.get(r1);	 Catch:{ all -> 0x001a }
        r0 = (defpackage.kcq) r0;	 Catch:{ all -> 0x001a }
        r0 = r0 instanceof defpackage.kcb;	 Catch:{ all -> 0x001a }
        if (r0 == 0) goto L_0x0016;
    L_0x0016:
        r0 = r1 + 1;
        r1 = r0;
        goto L_0x0002;
    L_0x001a:
        r0 = move-exception;
        throw r0;
    L_0x001c:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: kbu.a(android.content.res.Configuration):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(int r4, int r5, android.content.Intent r6) {
        /*
        r3 = this;
        r0 = 0;
        r1 = r0;
    L_0x0002:
        r0 = r3.a;	 Catch:{ all -> 0x0021 }
        r0 = r0.size();	 Catch:{ all -> 0x0021 }
        if (r1 >= r0) goto L_0x0023;
    L_0x000a:
        r0 = r3.a;	 Catch:{ all -> 0x0021 }
        r0 = r0.get(r1);	 Catch:{ all -> 0x0021 }
        r0 = (defpackage.kcq) r0;	 Catch:{ all -> 0x0021 }
        r2 = r0 instanceof defpackage.kca;	 Catch:{ all -> 0x0021 }
        if (r2 == 0) goto L_0x001b;
    L_0x0016:
        r0 = (defpackage.kca) r0;	 Catch:{ all -> 0x001f }
        r0.a(r4, r5, r6);	 Catch:{ all -> 0x001f }
    L_0x001b:
        r0 = r1 + 1;
        r1 = r0;
        goto L_0x0002;
    L_0x001f:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0021 }
    L_0x0021:
        r0 = move-exception;
        throw r0;
    L_0x0023:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: kbu.a(int, int, android.content.Intent):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(int r4, java.lang.String[] r5, int[] r6) {
        /*
        r3 = this;
        r0 = 0;
        r1 = r0;
    L_0x0002:
        r0 = r3.a;	 Catch:{ all -> 0x0021 }
        r0 = r0.size();	 Catch:{ all -> 0x0021 }
        if (r1 >= r0) goto L_0x0023;
    L_0x000a:
        r0 = r3.a;	 Catch:{ all -> 0x0021 }
        r0 = r0.get(r1);	 Catch:{ all -> 0x0021 }
        r0 = (defpackage.kcq) r0;	 Catch:{ all -> 0x0021 }
        r2 = r0 instanceof defpackage.kcl;	 Catch:{ all -> 0x0021 }
        if (r2 == 0) goto L_0x001b;
    L_0x0016:
        r0 = (defpackage.kcl) r0;	 Catch:{ all -> 0x001f }
        r0.a(r4, r5, r6);	 Catch:{ all -> 0x001f }
    L_0x001b:
        r0 = r1 + 1;
        r1 = r0;
        goto L_0x0002;
    L_0x001f:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0021 }
    L_0x0021:
        r0 = move-exception;
        throw r0;
    L_0x0023:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: kbu.a(int, java.lang.String[], int[]):void");
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
