package p000;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.libraries.social.settings.PreferenceCategory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class jou extends jzn implements jcm, jwg {
    joy f20621a;
    jek f20622b = new jek(this.lifecycle).m24034a(this.binder).m24033a(gwb.zy, this.f20623c);
    private final jej f20623c = new jov(this);
    private final jwf f20624d = new jwf(this, this.lifecycle);
    private jwo f20625e;
    private jca f20626f;
    private jcf f20627g;
    private PreferenceCategory f20628h;

    public void onAttachBinder(Bundle bundle) {
        super.onAttachBinder(bundle);
        this.f20621a = (joy) this.binder.m25454b(joy.class);
        this.f20626f = (jca) this.binder.m25443a(jca.class);
        this.f20627g = (jcf) this.binder.m25443a(jcf.class);
    }

    public void onResume() {
        super.onResume();
        if (!getActivity().isFinishing() && this.f20626f.mo2319b() && !this.f20626f.mo2320c().mo3437a() && this.f20621a != null) {
            this.f20621a.mo1085j();
        }
    }

    public void onStart() {
        super.onStart();
        this.f20627g.mo3460a((jcm) this);
        S_();
    }

    public void onStop() {
        super.onStop();
        this.f20627g.mo3465b((jcm) this);
    }

    private jwi m24874b() {
        jwi a = this.f20625e.m25343a(getString(gwb.zA), null);
        a.m5122a(new jow(this));
        return a;
    }

    private jmb m24875c() {
        jmb jmb = (jmb) getArguments().getParcelable("account_filter");
        if (jmb == null) {
            return new jmd().m24685a("logged_in");
        }
        return jmb;
    }

    private void m24873a(PreferenceCategory preferenceCategory) {
        jcf jcf = (jcf) jyn.m25426a(this.context, jcf.class);
        List<Integer> a = jcf.mo3453a();
        jmb c = m24875c();
        for (Integer num : a) {
            jch a2 = jcf.mo3456a(num.intValue());
            if (c.mo459a(num.intValue(), a2)) {
                Intent intent = (Intent) getArguments().getParcelable("account_intent");
                if (intent != null) {
                    intent = (Intent) intent.clone();
                    intent.putExtra("account_id", num);
                    preferenceCategory.m10483c(this.f20625e.m25344a(a2.mo3440b("display_name"), a2.mo3440b("account_name"), intent));
                } else {
                    throw new IllegalStateException("Must set intent for accounts to be visible");
                }
            }
        }
    }

    public void mo495a() {
        this.f20625e = new jwo(this.context);
        this.f20628h = this.f20625e.m25342a(getString(gwb.zz));
        this.f20624d.m25336a(this.f20628h);
        m24873a(this.f20628h);
        this.f20628h.m10483c(m24874b());
    }

    public void S_() {
        List arrayList;
        int intValue;
        int i = 0;
        if (!getArguments().getBoolean("allow_no_accounts")) {
            arrayList = new ArrayList();
            List<Integer> a = this.f20627g.mo3453a();
            jmb c = m24875c();
            for (Integer intValue2 : a) {
                intValue = intValue2.intValue();
                if (c.mo459a(intValue, this.f20627g.mo3456a(intValue))) {
                    arrayList.add(Integer.valueOf(intValue));
                }
            }
            Collections.sort(arrayList, new jbz(this.f20627g));
            if (arrayList.isEmpty()) {
                getActivity().finish();
                return;
            }
        }
        arrayList = new ArrayList();
        for (intValue = 0; intValue < this.f20628h.mo531a(); intValue++) {
            arrayList.add(this.f20628h.m10477a(intValue));
        }
        while (i < arrayList.size()) {
            this.f20628h.m10485d((jwi) arrayList.get(i));
            i++;
        }
        m24873a(this.f20628h);
        this.f20628h.m10483c(m24874b());
    }
}
