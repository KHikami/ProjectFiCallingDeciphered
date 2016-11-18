package p000;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public final class equ extends jzn implements eqk {
    EditText f12082a;
    TextView f12083b;
    Button f12084c;
    String f12085d;
    epv f12086e = epv.ENABLED;
    bko f12087f;
    eps f12088g;
    iid f12089h;
    private View f12090i;

    public int mo495a() {
        return gwb.tR;
    }

    public int mo1932b() {
        return gwb.tE;
    }

    public boolean mo1933c() {
        String obj = this.f12082a.getText().toString();
        if (obj.length() < 4) {
            this.f12084c.setVisibility(8);
            this.f12083b.setVisibility(0);
            return false;
        }
        this.f12089h.mo1693b().mo1714c(2196);
        this.f12088g.m14229a(obj);
        bkq.m5691d(getContext(), this.f12087f, true);
        return true;
    }

    public boolean mo1934d() {
        this.f12089h.mo1693b().mo1714c(2407);
        return true;
    }

    public int mo1935e() {
        return 8;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f12086e = (epv) getArguments().getSerializable("set_discoverability");
        this.f12085d = getArguments().getString("phone_number", "");
        int a = ((jca) this.binder.m25443a(jca.class)).mo2317a();
        this.f12087f = fde.m15018e(a);
        this.f12088g = (eps) this.binder.m25443a(eps.class);
        this.f12089h = ((iih) this.binder.m25443a(iih.class)).mo1979a(a);
        this.f12090i = layoutInflater.inflate(gwb.tD, viewGroup, false);
        this.f12082a = (EditText) this.f12090i.findViewById(bn.f4018n);
        this.f12083b = (TextView) this.f12090i.findViewById(bn.f4016l);
        this.f12084c = (Button) this.f12090i.findViewById(bn.f4020p);
        this.f12084c.getCompoundDrawables()[0].setAlpha(Color.alpha(this.f12084c.getTextColors().getDefaultColor()));
        this.f12084c.setOnClickListener(new eqv(this));
        this.f12082a.addTextChangedListener(new eqw(this));
        this.f12082a.setOnFocusChangeListener(new eqx(this));
        ((eqg) this.binder.m25443a(eqg.class)).mo1929b();
        return this.f12090i;
    }

    public void onResume() {
        this.f12082a.requestFocus();
        super.onResume();
    }

    public /* synthetic */ CharSequence mo1931a(dw dwVar, String str) {
        return "";
    }
}
