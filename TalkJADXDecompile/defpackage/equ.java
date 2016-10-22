package defpackage;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/* renamed from: equ */
public final class equ extends jzn implements eqk {
    EditText a;
    TextView b;
    Button c;
    String d;
    epv e;
    bko f;
    eps g;
    iid h;
    private View i;

    public equ() {
        this.e = epv.ENABLED;
    }

    public int a() {
        return gwb.tR;
    }

    public int b() {
        return gwb.tE;
    }

    public boolean c() {
        String obj = this.a.getText().toString();
        if (obj.length() < 4) {
            this.c.setVisibility(8);
            this.b.setVisibility(0);
            return false;
        }
        this.h.b().c(2196);
        this.g.a(obj);
        bkq.d(getContext(), this.f, true);
        return true;
    }

    public boolean d() {
        this.h.b().c(2407);
        return true;
    }

    public int e() {
        return 8;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.e = (epv) getArguments().getSerializable("set_discoverability");
        this.d = getArguments().getString("phone_number", "");
        int a = ((jca) this.binder.a(jca.class)).a();
        this.f = fde.e(a);
        this.g = (eps) this.binder.a(eps.class);
        this.h = ((iih) this.binder.a(iih.class)).a(a);
        this.i = layoutInflater.inflate(gwb.tD, viewGroup, false);
        this.a = (EditText) this.i.findViewById(bn.n);
        this.b = (TextView) this.i.findViewById(bn.l);
        this.c = (Button) this.i.findViewById(bn.p);
        this.c.getCompoundDrawables()[0].setAlpha(Color.alpha(this.c.getTextColors().getDefaultColor()));
        this.c.setOnClickListener(new eqv(this));
        this.a.addTextChangedListener(new eqw(this));
        this.a.setOnFocusChangeListener(new eqx(this));
        ((eqg) this.binder.a(eqg.class)).b();
        return this.i;
    }

    public void onResume() {
        this.a.requestFocus();
        super.onResume();
    }

    public /* synthetic */ CharSequence a(dw dwVar, String str) {
        return "";
    }
}
