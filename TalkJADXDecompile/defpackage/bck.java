package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: bck */
public class bck implements Serializable {
    transient List<bcm> a;
    private final List<bcn> b;
    private final Map<fbw, bcn> c;
    private final List<bcn> d;
    private final Map<fbw, bcn> e;
    private bcj f;
    private String g;
    private String h;
    private boolean i;

    public bck() {
        this.b = new ArrayList();
        this.c = new HashMap();
        this.d = new ArrayList();
        this.e = new HashMap();
        this.h = "";
        this.a = new ArrayList();
    }

    private bck(Collection<bcn> collection, bcj bcj) {
        this.b = new ArrayList();
        this.c = new HashMap();
        this.d = new ArrayList();
        this.e = new HashMap();
        this.h = "";
        this.a = new ArrayList();
        this.f = bcj;
        Object obj = (bcj == bcj.UPGRADE_TO_GROUPCHAT || bcj == bcj.INVITE_MORE_TO_GROUPCHAT || bcj == bcj.INVITE_MORE_TO_HANGOUT || bcj == bcj.INVITE_GAIA_IDS_TO_HANGOUT) ? 1 : null;
        if (obj != null) {
            this.d.addAll(collection);
            for (bcn bcn : collection) {
                this.e.put(bcn.b(), bcn);
            }
            return;
        }
        this.b.addAll(collection);
        for (bcn bcn2 : collection) {
            this.c.put(bcn2.b(), bcn2);
        }
    }

    public bck(juh juh, bcj bcj) {
        this(juh != null ? juh.g() : Collections.emptyList(), bcj);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.a = new ArrayList();
    }

    public juh a() {
        return juh.newBuilder().a(this.d).a(this.b).a();
    }

    public int b() {
        return this.d.size() + this.b.size();
    }

    public void a(bcm bcm) {
        this.a.add(bcm);
    }

    public void a(bcn bcn) {
        if (!this.e.containsKey(bcn.b()) && !this.c.containsKey(bcn.b())) {
            this.b.add(bcn);
            this.c.put(bcn.b(), bcn);
            l();
        }
    }

    public void b(bcn bcn) {
        bm.b(d(bcn), (Object) "Person has already been removed from the model.");
        this.b.remove(bcn);
        if (this.c.remove(bcn.b()) != null) {
            l();
        }
    }

    public void a(Context context, bjg bjg) {
        bm.b(c(context, bjg), (Object) "Person has already been removed from the model.");
        for (fbw fbw : bjg.a(context)) {
            if (a(fbw)) {
                b((bcn) this.c.get(fbw));
            }
        }
    }

    public List<bcn> c() {
        return new ArrayList(this.b);
    }

    public List<bcn> d() {
        List<bcn> arrayList = new ArrayList();
        arrayList.addAll(this.d);
        arrayList.addAll(this.b);
        return arrayList;
    }

    public int e() {
        return this.d.size() + this.b.size();
    }

    public bcj f() {
        return this.f;
    }

    public void a(bcj bcj) {
        if (bcj != this.f) {
            this.f = bcj;
            for (bcm a : this.a) {
                a.a(this.f);
            }
        }
    }

    public boolean c(bcn bcn) {
        return this.d.contains(bcn);
    }

    public boolean b(Context context, bjg bjg) {
        for (fbw containsKey : bjg.a(context)) {
            if (this.e.containsKey(containsKey)) {
                return true;
            }
        }
        return false;
    }

    boolean d(bcn bcn) {
        return a(bcn.b());
    }

    private boolean a(fbw fbw) {
        return this.e.containsKey(fbw) || this.c.containsKey(fbw);
    }

    public boolean c(Context context, bjg bjg) {
        for (fbw a : bjg.a(context)) {
            if (a(a)) {
                return true;
            }
        }
        return false;
    }

    public void g() {
        this.b.clear();
        this.c.clear();
        l();
    }

    public boolean h() {
        return this.d.isEmpty() && this.b.isEmpty();
    }

    public boolean i() {
        return !this.b.isEmpty();
    }

    public String j() {
        return this.h;
    }

    public void a(String str) {
        if (str == null) {
            str = "";
        }
        if (!TextUtils.equals(this.h, str)) {
            this.h = str;
            for (bcm a : this.a) {
                a.a(this.h);
            }
            this.i = true;
        }
    }

    public boolean k() {
        return this.i;
    }

    public void b(String str) {
        if (!TextUtils.equals(this.g, str)) {
            this.g = str;
            for (bcm b : this.a) {
                b.b(this.g);
            }
        }
    }

    private void l() {
        Runnable bcl = new bcl(this);
        if (gwb.aI()) {
            bcl.run();
        } else {
            gwb.a(bcl);
        }
    }
}
