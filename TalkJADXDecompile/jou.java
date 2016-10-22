import android.content.Intent;
import android.os.Bundle;
import com.google.android.libraries.social.settings.PreferenceCategory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class jou extends jzn implements jcm, jwg {
    joy a;
    jek b;
    private final jej c;
    private final jwf d;
    private jwo e;
    private jca f;
    private jcf g;
    private PreferenceCategory h;

    public jou() {
        this.c = new jov(this);
        this.d = new jwf(this, this.lifecycle);
        this.b = new jek(this.lifecycle).a(this.binder).a(gwb.zy, this.c);
    }

    public void onAttachBinder(Bundle bundle) {
        super.onAttachBinder(bundle);
        this.a = (joy) this.binder.b(joy.class);
        this.f = (jca) this.binder.a(jca.class);
        this.g = (jcf) this.binder.a(jcf.class);
    }

    public void onResume() {
        super.onResume();
        if (!getActivity().isFinishing() && this.f.b() && !this.f.c().a() && this.a != null) {
            this.a.j();
        }
    }

    public void onStart() {
        super.onStart();
        this.g.a((jcm) this);
        S_();
    }

    public void onStop() {
        super.onStop();
        this.g.b((jcm) this);
    }

    private jwi b() {
        jwi a = this.e.a(getString(gwb.zA), null);
        a.a(new jow(this));
        return a;
    }

    private jmb c() {
        jmb jmb = (jmb) getArguments().getParcelable("account_filter");
        if (jmb == null) {
            return new jmd().a("logged_in");
        }
        return jmb;
    }

    private void a(PreferenceCategory preferenceCategory) {
        jcf jcf = (jcf) jyn.a(this.context, jcf.class);
        List<Integer> a = jcf.a();
        jmb c = c();
        for (Integer num : a) {
            jch a2 = jcf.a(num.intValue());
            if (c.a(num.intValue(), a2)) {
                Intent intent = (Intent) getArguments().getParcelable("account_intent");
                if (intent != null) {
                    intent = (Intent) intent.clone();
                    intent.putExtra("account_id", num);
                    preferenceCategory.c(this.e.a(a2.b("display_name"), a2.b("account_name"), intent));
                } else {
                    throw new IllegalStateException("Must set intent for accounts to be visible");
                }
            }
        }
    }

    public void a() {
        this.e = new jwo(this.context);
        this.h = this.e.a(getString(gwb.zz));
        this.d.a(this.h);
        a(this.h);
        this.h.c(b());
    }

    public void S_() {
        List arrayList;
        int intValue;
        int i = 0;
        if (!getArguments().getBoolean("allow_no_accounts")) {
            arrayList = new ArrayList();
            List<Integer> a = this.g.a();
            jmb c = c();
            for (Integer intValue2 : a) {
                intValue = intValue2.intValue();
                if (c.a(intValue, this.g.a(intValue))) {
                    arrayList.add(Integer.valueOf(intValue));
                }
            }
            Collections.sort(arrayList, new jbz(this.g));
            if (arrayList.isEmpty()) {
                getActivity().finish();
                return;
            }
        }
        arrayList = new ArrayList();
        for (intValue = 0; intValue < this.h.a(); intValue++) {
            arrayList.add(this.h.a(intValue));
        }
        while (i < arrayList.size()) {
            this.h.d((jwi) arrayList.get(i));
            i++;
        }
        a(this.h);
        this.h.c(b());
    }
}
