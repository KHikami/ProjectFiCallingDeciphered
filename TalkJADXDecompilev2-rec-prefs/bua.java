package p000;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.List;

public final class bua implements cpw {
    private final Context f4463a;
    private final fwy f4464b;
    private final boolean f4465c;
    private final long f4466d;
    private final int f4467e;
    private final int f4468f;
    private final long f4469g;
    private final int f4470h;
    private final int f4471i;
    private final int f4472j;
    private final long f4473k;
    private final long f4474l;
    private final String f4475m;
    private final String f4476n;
    private final ImageView f4477o;
    private final List<cqc> f4478p;

    public bua(btf btf, int i, View view) {
        this.f4464b = btf.f4396i;
        this.f4465c = btf.f4396i == fwy.OUTGOING_USER_MESSAGE;
        this.f4466d = btf.f4394g / 1000;
        this.f4468f = btf.f4409v.f4413a;
        this.f4469g = btf.f4409v.f4414b;
        this.f4470h = btf.f4409v.f4415c;
        this.f4471i = btf.f4403p;
        this.f4472j = btf.f4405r;
        this.f4473k = btf.f4409v.f4416d;
        this.f4474l = this.f4473k - this.f4469g;
        this.f4475m = btf.f4390c;
        this.f4476n = btf.f4389b;
        this.f4467e = i;
        this.f4477o = (ImageView) view.findViewById(bm.f3829e);
        this.f4463a = view.getContext();
        this.f4478p = jyn.m25438c(this.f4463a, cqc.class);
    }

    public Context mo721a() {
        return this.f4463a;
    }

    public boolean mo722b() {
        return this.f4465c;
    }

    public long mo723c() {
        return this.f4466d;
    }

    public int mo724d() {
        return this.f4468f;
    }

    public long mo725e() {
        return this.f4469g;
    }

    public int mo726f() {
        return this.f4470h;
    }

    public int mo727g() {
        return this.f4471i;
    }

    public int mo728h() {
        return this.f4472j;
    }

    public long mo729i() {
        return this.f4473k;
    }

    public long mo730j() {
        return this.f4474l;
    }

    public String mo731k() {
        return this.f4475m;
    }

    public String mo732l() {
        return this.f4476n;
    }

    public ImageView mo733m() {
        return this.f4477o;
    }

    public boolean mo734n() {
        for (cqc a : this.f4478p) {
            if (a.mo1379a(this)) {
                return true;
            }
        }
        return false;
    }

    public List<String> mo735o() {
        List<String> arrayList = new ArrayList();
        for (cqc cqc : this.f4478p) {
            if (cqc.mo1379a(this)) {
                arrayList.add(cqc.mo1380b(this));
            }
        }
        return arrayList;
    }
}
