package p000;

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

public class bck implements Serializable {
    transient List<bcm> f3032a;
    private final List<bcn> f3033b;
    private final Map<fbw, bcn> f3034c;
    private final List<bcn> f3035d;
    private final Map<fbw, bcn> f3036e;
    private bcj f3037f;
    private String f3038g;
    private String f3039h;
    private boolean f3040i;

    public bck() {
        this.f3033b = new ArrayList();
        this.f3034c = new HashMap();
        this.f3035d = new ArrayList();
        this.f3036e = new HashMap();
        this.f3039h = "";
        this.f3032a = new ArrayList();
    }

    private bck(Collection<bcn> collection, bcj bcj) {
        this.f3033b = new ArrayList();
        this.f3034c = new HashMap();
        this.f3035d = new ArrayList();
        this.f3036e = new HashMap();
        this.f3039h = "";
        this.f3032a = new ArrayList();
        this.f3037f = bcj;
        Object obj = (bcj == bcj.UPGRADE_TO_GROUPCHAT || bcj == bcj.INVITE_MORE_TO_GROUPCHAT || bcj == bcj.INVITE_MORE_TO_HANGOUT || bcj == bcj.INVITE_GAIA_IDS_TO_HANGOUT) ? 1 : null;
        if (obj != null) {
            this.f3035d.addAll(collection);
            for (bcn bcn : collection) {
                this.f3036e.put(bcn.m4893b(), bcn);
            }
            return;
        }
        this.f3033b.addAll(collection);
        for (bcn bcn2 : collection) {
            this.f3034c.put(bcn2.m4893b(), bcn2);
        }
    }

    public bck(juh juh, bcj bcj) {
        this(juh != null ? juh.m25222g() : Collections.emptyList(), bcj);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.f3032a = new ArrayList();
    }

    public juh m4861a() {
        return juh.newBuilder().m4842a(this.f3035d).m4842a(this.f3033b).m4843a();
    }

    public int m4867b() {
        return this.f3035d.size() + this.f3033b.size();
    }

    public void m4864a(bcm bcm) {
        this.f3032a.add(bcm);
    }

    public void m4865a(bcn bcn) {
        if (!this.f3036e.containsKey(bcn.m4893b()) && !this.f3034c.containsKey(bcn.m4893b())) {
            this.f3033b.add(bcn);
            this.f3034c.put(bcn.m4893b(), bcn);
            m4860l();
        }
    }

    public void m4868b(bcn bcn) {
        bm.m6151b(m4875d(bcn), (Object) "Person has already been removed from the model.");
        this.f3033b.remove(bcn);
        if (this.f3034c.remove(bcn.m4893b()) != null) {
            m4860l();
        }
    }

    public void m4862a(Context context, bjg bjg) {
        bm.m6151b(m4872c(context, bjg), (Object) "Person has already been removed from the model.");
        for (fbw fbw : bjg.m5381a(context)) {
            if (m4859a(fbw)) {
                m4868b((bcn) this.f3034c.get(fbw));
            }
        }
    }

    public List<bcn> m4871c() {
        return new ArrayList(this.f3033b);
    }

    public List<bcn> m4874d() {
        List<bcn> arrayList = new ArrayList();
        arrayList.addAll(this.f3035d);
        arrayList.addAll(this.f3033b);
        return arrayList;
    }

    public int m4876e() {
        return this.f3035d.size() + this.f3033b.size();
    }

    public bcj m4877f() {
        return this.f3037f;
    }

    public void m4863a(bcj bcj) {
        if (bcj != this.f3037f) {
            this.f3037f = bcj;
            for (bcm a : this.f3032a) {
                a.mo1869a(this.f3037f);
            }
        }
    }

    public boolean m4873c(bcn bcn) {
        return this.f3035d.contains(bcn);
    }

    public boolean m4870b(Context context, bjg bjg) {
        for (fbw containsKey : bjg.m5381a(context)) {
            if (this.f3036e.containsKey(containsKey)) {
                return true;
            }
        }
        return false;
    }

    boolean m4875d(bcn bcn) {
        return m4859a(bcn.m4893b());
    }

    private boolean m4859a(fbw fbw) {
        return this.f3036e.containsKey(fbw) || this.f3034c.containsKey(fbw);
    }

    public boolean m4872c(Context context, bjg bjg) {
        for (fbw a : bjg.m5381a(context)) {
            if (m4859a(a)) {
                return true;
            }
        }
        return false;
    }

    public void m4878g() {
        this.f3033b.clear();
        this.f3034c.clear();
        m4860l();
    }

    public boolean m4879h() {
        return this.f3035d.isEmpty() && this.f3033b.isEmpty();
    }

    public boolean m4880i() {
        return !this.f3033b.isEmpty();
    }

    public String m4881j() {
        return this.f3039h;
    }

    public void m4866a(String str) {
        if (str == null) {
            str = "";
        }
        if (!TextUtils.equals(this.f3039h, str)) {
            this.f3039h = str;
            for (bcm a : this.f3032a) {
                a.mo1870a(this.f3039h);
            }
            this.f3040i = true;
        }
    }

    public boolean m4882k() {
        return this.f3040i;
    }

    public void m4869b(String str) {
        if (!TextUtils.equals(this.f3038g, str)) {
            this.f3038g = str;
            for (bcm b : this.f3032a) {
                b.mo1871b(this.f3038g);
            }
        }
    }

    private void m4860l() {
        Runnable bcl = new bcl(this);
        if (gwb.aI()) {
            bcl.run();
        } else {
            gwb.m1863a(bcl);
        }
    }
}
