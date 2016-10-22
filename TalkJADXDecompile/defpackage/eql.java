package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* renamed from: eql */
public final class eql extends jzn implements eqk {
    iid a;
    private epw aj;
    private epv ak;
    private View al;
    private int am;
    fra b;
    String c;
    EditText d;
    TextView e;
    EditText f;
    private bko g;
    private String h;
    private eps i;

    public eql() {
        this.aj = epw.SETTINGS;
        this.ak = epv.ENABLED;
        this.am = eqr.a;
    }

    public int a() {
        return gwb.tG;
    }

    public int b() {
        if (this.aj == epw.SETTINGS) {
            return gwb.tE;
        }
        return gwb.tO;
    }

    public boolean c() {
        mfa s = s();
        if (s.a()) {
            if (!((String) s.b()).equals(this.c)) {
                this.c = (String) s.b();
                this.a.b().c(1980);
            }
            this.a.b().c(2195);
            if (this.am == eqr.c || this.am == eqr.b) {
                if (this.am == eqr.c) {
                    this.a.b().c(2632);
                } else {
                    this.a.b().c(2633);
                }
            }
            this.i.a(this.c, this.h, this.ak);
            return true;
        }
        Toast makeText = Toast.makeText(getActivity(), getActivity().getString(gwb.tL), 0);
        makeText.setGravity(49, 0, 0);
        makeText.show();
        return false;
    }

    public boolean d() {
        bkq.d(getContext(), this.g, true);
        if (this.aj == epw.PROMO) {
            this.a.b().c(2684);
        }
        return true;
    }

    public CharSequence a(dw dwVar, String str) {
        return Html.fromHtml(dwVar.getString(gwb.tN, new Object[]{str}));
    }

    public int e() {
        return 0;
    }

    public void onSaveInstanceState(Bundle bundle) {
        mfa s = s();
        if (s.a()) {
            this.i.b((String) s.b());
        }
        super.onSaveInstanceState(bundle);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((eia) this.binder.a(eia.class)).a(bn.a, new eqm(this, bundle));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z;
        boolean z2 = true;
        this.aj = (epw) getArguments().getSerializable("source_activity");
        this.ak = (epv) getArguments().getSerializable("set_discoverability");
        jca jca = (jca) this.binder.a(jca.class);
        int a = jca.a();
        this.g = fde.e(a);
        this.h = jca.c().b("account_name");
        this.i = (eps) this.binder.a(eps.class);
        this.a = ((iih) this.binder.a(iih.class)).a(a);
        if (bundle == null) {
            this.a.b().c(2685);
            if (this.aj == epw.SETTINGS) {
                this.a.b().c(1977);
            } else {
                this.a.b().c(1596);
            }
            bkq.d(this.context, this.g, true);
        }
        this.al = layoutInflater.inflate(gwb.tB, viewGroup, false);
        this.d = (EditText) this.al.findViewById(bn.m);
        this.e = (TextView) this.al.findViewById(bn.i);
        if (this.ak == epv.ENABLED) {
            this.e.setVisibility(0);
            Uri h = gwb.h("https://support.google.com/hangouts/answer/3116671?hl=%locale%", "phone_verification");
            gwb.a(this.e, this.context, getActivity().getString(gwb.tI, new Object[]{h.toString()}));
            this.e.setOnClickListener(new eqn(this));
        } else {
            this.e.setVisibility(8);
        }
        if (bundle != null) {
            z = true;
        } else {
            z = false;
        }
        if (glq.h(this.context)) {
            this.c = r();
            if (z) {
                z2 = false;
            }
            a(z2);
        } else if (!z) {
            ((eia) this.binder.a(eia.class)).a(new eie(bn.a, 2655), Collections.singletonList("android.permission.READ_PHONE_STATE"));
            this.a.b().c(2634);
        }
        ((eqg) this.binder.a(eqg.class)).b();
        return this.al;
    }

    void a(boolean z) {
        String country;
        CharSequence charSequence;
        String a;
        if (TextUtils.isEmpty(this.c)) {
            country = Locale.getDefault().getCountry();
            charSequence = "";
            if (z) {
                this.a.b().c(1979);
            }
        } else {
            country = glq.a().a(this.c);
            a = glq.a(this.context, this.c, glu.c);
            charSequence = a.substring(a.indexOf(32) + 1);
        }
        this.d.setText(charSequence);
        fqz.a(country);
        this.b = fqz.b(country);
        List b = fqz.b();
        Object bbk = new bbk(country);
        this.d.addTextChangedListener(bbk);
        this.f = (EditText) this.al.findViewById(bn.g);
        EditText editText = this.f;
        String str = "+";
        a = String.valueOf(this.b.c);
        editText.setText(a.length() != 0 ? str.concat(a) : new String(str));
        Spinner spinner = (Spinner) this.al.findViewById(bn.h);
        spinner.setAdapter(new eqq(getActivity(), b));
        spinner.setPrompt(getActivity().getString(gwb.tH));
        this.f.setOnClickListener(new eqo(this, spinner));
        spinner.setOnItemSelectedListener(new eqp(this, b, bbk));
    }

    String q() {
        return this.c;
    }

    private mfa<String> s() {
        if (this.d == null || this.b == null) {
            return mdv.a;
        }
        return mfa.c(glq.c(this.d.getText().toString(), this.b.b));
    }

    String r() {
        Object f = glq.f(this.context);
        if (!TextUtils.isEmpty(f)) {
            return f;
        }
        String c = this.i.c();
        return TextUtils.isEmpty(c) ? this.i.d() : c;
    }
}
