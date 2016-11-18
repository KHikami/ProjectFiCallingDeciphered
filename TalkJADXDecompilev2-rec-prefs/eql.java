package p000;

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

public final class eql extends jzn implements eqk {
    iid f12050a;
    private epw aj = epw.SETTINGS;
    private epv ak = epv.ENABLED;
    private View al;
    private int am = eqr.f12068a;
    fra f12051b;
    String f12052c;
    EditText f12053d;
    TextView f12054e;
    EditText f12055f;
    private bko f12056g;
    private String f12057h;
    private eps f12058i;

    public int mo495a() {
        return gwb.tG;
    }

    public int mo1932b() {
        if (this.aj == epw.SETTINGS) {
            return gwb.tE;
        }
        return gwb.tO;
    }

    public boolean mo1933c() {
        mfa s = m14268s();
        if (s.mo3733a()) {
            if (!((String) s.mo3734b()).equals(this.f12052c)) {
                this.f12052c = (String) s.mo3734b();
                this.f12050a.mo1693b().mo1714c(1980);
            }
            this.f12050a.mo1693b().mo1714c(2195);
            if (this.am == eqr.f12070c || this.am == eqr.f12069b) {
                if (this.am == eqr.f12070c) {
                    this.f12050a.mo1693b().mo1714c(2632);
                } else {
                    this.f12050a.mo1693b().mo1714c(2633);
                }
            }
            this.f12058i.m14231a(this.f12052c, this.f12057h, this.ak);
            return true;
        }
        Toast makeText = Toast.makeText(getActivity(), getActivity().getString(gwb.tL), 0);
        makeText.setGravity(49, 0, 0);
        makeText.show();
        return false;
    }

    public boolean mo1934d() {
        bkq.m5691d(getContext(), this.f12056g, true);
        if (this.aj == epw.PROMO) {
            this.f12050a.mo1693b().mo1714c(2684);
        }
        return true;
    }

    public CharSequence mo1931a(dw dwVar, String str) {
        return Html.fromHtml(dwVar.getString(gwb.tN, new Object[]{str}));
    }

    public int mo1935e() {
        return 0;
    }

    public void onSaveInstanceState(Bundle bundle) {
        mfa s = m14268s();
        if (s.mo3733a()) {
            this.f12058i.m14233b((String) s.mo3734b());
        }
        super.onSaveInstanceState(bundle);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((eia) this.binder.m25443a(eia.class)).mo1884a(bn.f4005a, new eqm(this, bundle));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z;
        boolean z2 = true;
        this.aj = (epw) getArguments().getSerializable("source_activity");
        this.ak = (epv) getArguments().getSerializable("set_discoverability");
        jca jca = (jca) this.binder.m25443a(jca.class);
        int a = jca.mo2317a();
        this.f12056g = fde.m15018e(a);
        this.f12057h = jca.mo2320c().mo3440b("account_name");
        this.f12058i = (eps) this.binder.m25443a(eps.class);
        this.f12050a = ((iih) this.binder.m25443a(iih.class)).mo1979a(a);
        if (bundle == null) {
            this.f12050a.mo1693b().mo1714c(2685);
            if (this.aj == epw.SETTINGS) {
                this.f12050a.mo1693b().mo1714c(1977);
            } else {
                this.f12050a.mo1693b().mo1714c(1596);
            }
            bkq.m5691d(this.context, this.f12056g, true);
        }
        this.al = layoutInflater.inflate(gwb.tB, viewGroup, false);
        this.f12053d = (EditText) this.al.findViewById(bn.f4017m);
        this.f12054e = (TextView) this.al.findViewById(bn.f4013i);
        if (this.ak == epv.ENABLED) {
            this.f12054e.setVisibility(0);
            Uri h = gwb.m2231h("https://support.google.com/hangouts/answer/3116671?hl=%locale%", "phone_verification");
            gwb.m1819a(this.f12054e, this.context, getActivity().getString(gwb.tI, new Object[]{h.toString()}));
            this.f12054e.setOnClickListener(new eqn(this));
        } else {
            this.f12054e.setVisibility(8);
        }
        if (bundle != null) {
            z = true;
        } else {
            z = false;
        }
        if (glq.m18035h(this.context)) {
            this.f12052c = m14277r();
            if (z) {
                z2 = false;
            }
            m14271a(z2);
        } else if (!z) {
            ((eia) this.binder.m25443a(eia.class)).mo1886a(new eie(bn.f4005a, 2655), Collections.singletonList("android.permission.READ_PHONE_STATE"));
            this.f12050a.mo1693b().mo1714c(2634);
        }
        ((eqg) this.binder.m25443a(eqg.class)).mo1929b();
        return this.al;
    }

    void m14271a(boolean z) {
        String country;
        CharSequence charSequence;
        String a;
        if (TextUtils.isEmpty(this.f12052c)) {
            country = Locale.getDefault().getCountry();
            charSequence = "";
            if (z) {
                this.f12050a.mo1693b().mo1714c(1979);
            }
        } else {
            country = glq.m18000a().m18046a(this.f12052c);
            a = glq.m18002a(this.context, this.f12052c, glu.f15611c);
            charSequence = a.substring(a.indexOf(32) + 1);
        }
        this.f12053d.setText(charSequence);
        fqz.m16011a(country);
        this.f12051b = fqz.m16012b(country);
        List b = fqz.m16013b();
        Object bbk = new bbk(country);
        this.f12053d.addTextChangedListener(bbk);
        this.f12055f = (EditText) this.al.findViewById(bn.f4011g);
        EditText editText = this.f12055f;
        String str = "+";
        a = String.valueOf(this.f12051b.f13803c);
        editText.setText(a.length() != 0 ? str.concat(a) : new String(str));
        Spinner spinner = (Spinner) this.al.findViewById(bn.f4012h);
        spinner.setAdapter(new eqq(getActivity(), b));
        spinner.setPrompt(getActivity().getString(gwb.tH));
        this.f12055f.setOnClickListener(new eqo(this, spinner));
        spinner.setOnItemSelectedListener(new eqp(this, b, bbk));
    }

    String m14276q() {
        return this.f12052c;
    }

    private mfa<String> m14268s() {
        if (this.f12053d == null || this.f12051b == null) {
            return mdv.f27537a;
        }
        return mfa.m31911c(glq.m18014c(this.f12053d.getText().toString(), this.f12051b.f13802b));
    }

    String m14277r() {
        Object f = glq.m18025f(this.context);
        if (!TextUtils.isEmpty(f)) {
            return f;
        }
        String c = this.f12058i.m14235c();
        return TextUtils.isEmpty(c) ? this.f12058i.m14236d() : c;
    }
}
