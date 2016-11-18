package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

public final class cgu implements cgr, cis, kcd, kcn, kcq {
    private final Context a;
    private final cgs b;
    private bpd c;
    private bcc d;
    private gln e;
    private glm f;
    private glm g;
    private int h;
    private String i;
    private String j;
    private bkf k;
    private int l;
    private boolean m;
    private boolean n;
    private boolean o;
    private ArrayList<bxn> p = new ArrayList();
    private cgt q;
    private cio r;

    public cgu(Context context, cgs cgs, kbu kbu) {
        this.a = context;
        this.b = (cgs) ba.a((Object) cgs);
        kbu.a((kcq) this);
    }

    public void a(Bundle bundle) {
        if (bundle != null) {
            this.i = bundle.getString("conversation_state_model_conversation_name");
            a(this.a, bundle.getParcelableArrayList("conversation_state_model_attachments"), (cgt) bundle.getSerializable("conversation_state_model_callback"));
        }
    }

    public void b(Bundle bundle) {
        bundle.putString("conversation_state_model_conversation_name", f());
        ArrayList arrayList = new ArrayList(this.p.size());
        ArrayList arrayList2 = this.p;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            arrayList.add((Parcelable) ((bxn) obj));
        }
        bundle.putParcelableArrayList("conversation_state_model_attachments", arrayList);
        bundle.putSerializable("conversation_state_model_callback", this.q);
    }

    public void a(bpd bpd) {
        Object c = c();
        this.c = bpd;
        Object c2 = c();
        if (!gwb.g(c, c2)) {
            this.e.a(c2);
        }
    }

    public bpd a() {
        return this.c;
    }

    public void a(bcc bcc) {
        Object c = c();
        this.d = bcc;
        this.i = bcc.g;
        this.h = bcc.b;
        Object c2 = c();
        if (!gwb.g(c, c2)) {
            this.e.a(c2);
        }
    }

    public bcc b() {
        return this.d;
    }

    public String c() {
        return d().a();
    }

    public gln d() {
        if (this.e == null) {
            gwb.aJ();
            this.e = new gln((byte) 0);
        }
        if (this.c != null) {
            this.e.a(this.c.a);
        } else if (this.d != null) {
            this.e.a(this.d.a);
        }
        return this.e;
    }

    public void a(int i) {
        this.h = i;
    }

    public int e() {
        return this.h;
    }

    public void a(String str, String str2) {
        this.i = str;
        this.j = str2;
    }

    public String f() {
        return !TextUtils.isEmpty(this.i) ? this.i : this.j;
    }

    public void b(int i) {
        this.l = i;
    }

    public int g() {
        return this.l;
    }

    public void a(boolean z) {
        this.m = z;
    }

    public boolean h() {
        return this.m;
    }

    public void b(boolean z) {
        this.n = z;
    }

    public boolean i() {
        return this.n;
    }

    public void c(boolean z) {
        this.o = true;
    }

    public boolean j() {
        return this.o;
    }

    public void a(bkf bkf) {
        this.k = bkf;
    }

    public bkf k() {
        return this.k;
    }

    public mjq<bxn> l() {
        return mjq.a(this.p);
    }

    private void p() {
        if (this.r != null) {
            this.r.cancel(true);
            this.r = null;
        }
    }

    public <T extends bxn & Parcelable> void a(Context context, List<T> list, cgt cgt) {
        this.p = new ArrayList(list);
        this.q = cgt;
        this.b.a(cgt);
        p();
        for (T t : list) {
            if (ba.i(t.a)) {
                this.r = new cio(context, this.p, this);
                this.r.execute(new Void[0]);
                return;
            }
        }
    }

    public void m() {
        this.p = new ArrayList();
        this.b.a(null);
        p();
    }

    public cgu a(jyn jyn) {
        jyn.a(cgr.class, (Object) this);
        return this;
    }

    public void a(mjq<bxn> mjq_bxn) {
        this.p = new ArrayList(mjq_bxn);
    }

    public boolean a(Class<? extends Object> cls) {
        if (this.k != null) {
            List<bek> c = jyn.c(this.a, bek.class);
            for (edk edk : this.k.c()) {
                for (bek bek : c) {
                    if (bek.a().equals(edk.b.a) && !bek.b()) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public glm n() {
        if (this.f == null) {
            this.f = new glm((byte) 0);
            this.f.a(false);
        }
        return this.f;
    }

    public void d(boolean z) {
        if (this.f == null) {
            this.f = new glm((byte) 0);
        }
        this.f.a(true);
    }

    public glm o() {
        if (this.g == null) {
            this.g = new glm((byte) 0);
            this.g.a(false);
        }
        return this.g;
    }

    public void e(boolean z) {
        if (this.g == null) {
            this.g = new glm((byte) 0);
        }
        this.g.a(true);
    }
}
