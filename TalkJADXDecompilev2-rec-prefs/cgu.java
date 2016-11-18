package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

public final class cgu implements cgr, cis, kcd, kcn, kcq {
    private final Context f5265a;
    private final cgs f5266b;
    private bpd f5267c;
    private bcc f5268d;
    private gln f5269e;
    private glm f5270f;
    private glm f5271g;
    private int f5272h;
    private String f5273i;
    private String f5274j;
    private bkf f5275k;
    private int f5276l;
    private boolean f5277m;
    private boolean f5278n;
    private boolean f5279o;
    private ArrayList<bxn> f5280p = new ArrayList();
    private cgt f5281q;
    private cio f5282r;

    public cgu(Context context, cgs cgs, kbu kbu) {
        this.f5265a = context;
        this.f5266b = (cgs) ba.m4536a((Object) cgs);
        kbu.m25514a((kcq) this);
    }

    public void mo643a(Bundle bundle) {
        if (bundle != null) {
            this.f5273i = bundle.getString("conversation_state_model_conversation_name");
            mo933a(this.f5265a, bundle.getParcelableArrayList("conversation_state_model_attachments"), (cgt) bundle.getSerializable("conversation_state_model_callback"));
        }
    }

    public void mo645b(Bundle bundle) {
        bundle.putString("conversation_state_model_conversation_name", mo949f());
        ArrayList arrayList = new ArrayList(this.f5280p.size());
        ArrayList arrayList2 = this.f5280p;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            arrayList.add((Parcelable) ((bxn) obj));
        }
        bundle.putParcelableArrayList("conversation_state_model_attachments", arrayList);
        bundle.putSerializable("conversation_state_model_callback", this.f5281q);
    }

    public void mo936a(bpd bpd) {
        Object c = mo943c();
        this.f5267c = bpd;
        Object c2 = mo943c();
        if (!gwb.m2223g(c, c2)) {
            this.f5269e.m17987a(c2);
        }
    }

    public bpd mo931a() {
        return this.f5267c;
    }

    public void mo934a(bcc bcc) {
        Object c = mo943c();
        this.f5268d = bcc;
        this.f5273i = bcc.f2981g;
        this.f5272h = bcc.f2976b;
        Object c2 = mo943c();
        if (!gwb.m2223g(c, c2)) {
            this.f5269e.m17987a(c2);
        }
    }

    public bcc mo940b() {
        return this.f5268d;
    }

    public String mo943c() {
        return mo945d().m17986a();
    }

    public gln mo945d() {
        if (this.f5269e == null) {
            gwb.aJ();
            this.f5269e = new gln((byte) 0);
        }
        if (this.f5267c != null) {
            this.f5269e.m17987a(this.f5267c.f4146a);
        } else if (this.f5268d != null) {
            this.f5269e.m17987a(this.f5268d.f2975a);
        }
        return this.f5269e;
    }

    public void mo932a(int i) {
        this.f5272h = i;
    }

    public int mo947e() {
        return this.f5272h;
    }

    public void mo937a(String str, String str2) {
        this.f5273i = str;
        this.f5274j = str2;
    }

    public String mo949f() {
        return !TextUtils.isEmpty(this.f5273i) ? this.f5273i : this.f5274j;
    }

    public void mo941b(int i) {
        this.f5276l = i;
    }

    public int mo950g() {
        return this.f5276l;
    }

    public void mo938a(boolean z) {
        this.f5277m = z;
    }

    public boolean mo951h() {
        return this.f5277m;
    }

    public void mo942b(boolean z) {
        this.f5278n = z;
    }

    public boolean mo952i() {
        return this.f5278n;
    }

    public void mo944c(boolean z) {
        this.f5279o = true;
    }

    public boolean mo953j() {
        return this.f5279o;
    }

    public void mo935a(bkf bkf) {
        this.f5275k = bkf;
    }

    public bkf mo954k() {
        return this.f5275k;
    }

    public mjq<bxn> mo955l() {
        return mjq.m32314a(this.f5280p);
    }

    private void m7574p() {
        if (this.f5282r != null) {
            this.f5282r.cancel(true);
            this.f5282r = null;
        }
    }

    public <T extends bxn & Parcelable> void mo933a(Context context, List<T> list, cgt cgt) {
        this.f5280p = new ArrayList(list);
        this.f5281q = cgt;
        this.f5266b.mo835a(cgt);
        m7574p();
        for (T t : list) {
            if (ba.m4646i(t.f4739a)) {
                this.f5282r = new cio(context, this.f5280p, this);
                this.f5282r.execute(new Void[0]);
                return;
            }
        }
    }

    public void mo956m() {
        this.f5280p = new ArrayList();
        this.f5266b.mo835a(null);
        m7574p();
    }

    public cgu m7576a(jyn jyn) {
        jyn.m25444a(cgr.class, (Object) this);
        return this;
    }

    public void mo841a(mjq<bxn> mjq_bxn) {
        this.f5280p = new ArrayList(mjq_bxn);
    }

    public boolean mo939a(Class<? extends Object> cls) {
        if (this.f5275k != null) {
            List<bek> c = jyn.m25438c(this.f5265a, bek.class);
            for (edk edk : this.f5275k.m5592c()) {
                for (bek bek : c) {
                    if (bek.m5000a().equals(edk.f11213b.f11244a) && !bek.m5001b()) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public glm mo957n() {
        if (this.f5270f == null) {
            this.f5270f = new glm((byte) 0);
            this.f5270f.m17984a(false);
        }
        return this.f5270f;
    }

    public void mo946d(boolean z) {
        if (this.f5270f == null) {
            this.f5270f = new glm((byte) 0);
        }
        this.f5270f.m17984a(true);
    }

    public glm mo958o() {
        if (this.f5271g == null) {
            this.f5271g = new glm((byte) 0);
            this.f5271g.m17984a(false);
        }
        return this.f5271g;
    }

    public void mo948e(boolean z) {
        if (this.f5271g == null) {
            this.f5271g = new glm((byte) 0);
        }
        this.f5271g.m17984a(true);
    }
}
