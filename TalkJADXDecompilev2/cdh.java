package defpackage;

import android.content.Context;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.google.android.apps.hangouts.conversation.v2.MessageEditText;
import com.google.android.apps.hangouts.conversation.v2.TransportSpinner;

public final class cdh extends FrameLayout implements OnItemSelectedListener, OnEditorActionListener {
    private static final InputFilter[] m = new InputFilter[0];
    final TransportSpinner a;
    final MessageEditText b;
    cdn c;
    int d;
    long e;
    final View f;
    fzr g;
    bpe h;
    bpd i;
    final Runnable j = new cdi(this);
    final cdo k = new cdo(this);
    private InputFilter[] l;
    private boolean n = false;

    public cdh(Context context, LayoutInflater layoutInflater, fzr fzr) {
        super(context);
        this.g = fzr;
        jyn b = jyn.b(context);
        View inflate = layoutInflater.inflate(gwb.fR, this, true);
        this.d = 3;
        this.f = inflate.findViewById(ba.dt);
        this.b = (MessageEditText) inflate.findViewById(ba.dx);
        this.b.addTextChangedListener(new cdj(this, context));
        this.b.setOnEditorActionListener(this);
        this.b.setOnFocusChangeListener(new cdk(this));
        this.b.a(new cdl(this));
        this.a = (TransportSpinner) inflate.findViewById(ba.fV);
        this.a.a(b);
        a();
        l();
        this.h = (bpe) jyn.a(context, bpe.class);
        this.h.a(new cdm(this));
    }

    public void a(boolean z) {
        this.b.setFocusable(z);
        this.b.setFocusableInTouchMode(z);
        this.b.setImeOptions(z ? 4 : 0);
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        if (this.c != null) {
            Object itemAtPosition = adapterView.getItemAtPosition(i);
            if (itemAtPosition instanceof bpd) {
                bpd bpd = (bpd) itemAtPosition;
                if (!(bpd.h == null && bpd.e == null)) {
                    this.h.a(bpd);
                }
            }
        }
        l();
    }

    private void l() {
        int i;
        int i2 = 0;
        if ((this.a.getVisibility() != 8 ? 1 : 0) == 0) {
            i2 = getResources().getDimensionPixelSize(gwb.eB);
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(gwb.eB);
        boolean a = gld.a((View) this);
        if (a) {
            i = dimensionPixelSize;
        } else {
            i = i2;
        }
        if (!a) {
            i2 = dimensionPixelSize;
        }
        this.f.setPadding(i, this.f.getPaddingTop(), i2, this.f.getPaddingBottom());
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void a() {
        if (this.i != null && gwb.i(this.i.b)) {
            this.a.a(this.g.b());
        }
        if (this.c != null) {
            this.c.a();
        }
        if (this.h != null && this.i != null) {
            int i;
            CharSequence charSequence;
            boolean i2 = gwb.i(this.i.b);
            int b = this.h.b();
            if (this.n) {
                i = bc.ju;
                charSequence = null;
            } else if (!i2) {
                i = gwb.mc;
                charSequence = null;
            } else if (b == 1) {
                int i3;
                if (dak.b(this.h.c())) {
                    if (this.g.b()) {
                        i3 = gwb.ma;
                    } else {
                        i3 = gwb.mb;
                    }
                    i = i3;
                    charSequence = null;
                } else {
                    if (this.g.b()) {
                        i3 = bc.js;
                    } else {
                        i3 = bc.jt;
                    }
                    ke a = ke.a();
                    i = i3;
                    Object string = getContext().getString(i3, new Object[]{a.a(glq.i(getContext(), r2), kp.a)});
                }
            } else {
                i = gwb.mc;
                charSequence = null;
            }
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = getContext().getString(i);
            }
            this.b.setHint(charSequence);
        }
    }

    public void b() {
        this.b.requestFocus();
    }

    public boolean c() {
        if (getVisibility() != 0 || !this.b.hasFocus()) {
            return false;
        }
        ba.u(this.b);
        return true;
    }

    public void a(cdn cdn) {
        this.c = cdn;
    }

    public void d() {
        this.c = null;
        gwb.b(this.j);
        gwb.b(this.k);
    }

    public void a(CharSequence charSequence, boolean z) {
        if (TextUtils.isEmpty(this.b.getText())) {
            this.b.setText(charSequence);
        }
        if (z) {
            this.b.selectAll();
        } else {
            this.b.setSelection(this.b.getText().length());
        }
        a();
    }

    public String e() {
        return this.b.getText().toString();
    }

    public void a(CharSequence charSequence) {
        int selectionStart = this.b.getSelectionStart();
        int selectionEnd = this.b.getSelectionEnd();
        this.b.getText().replace(Math.min(selectionStart, selectionEnd), Math.max(selectionStart, selectionEnd), charSequence);
    }

    public void f() {
        this.b.dispatchKeyEvent(new KeyEvent(0, 67));
    }

    public void g() {
        this.b.dispatchKeyEvent(new KeyEvent(0, 62));
    }

    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if ((i == 4 || (keyEvent != null && keyEvent.getAction() == 0)) && this.b.getText().length() > 0) {
            ((chy) jyn.a(getContext(), chy.class)).a();
        }
        return true;
    }

    void a(int i) {
        if (this.c != null) {
            this.c.a(i);
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        this.b.setVisibility(i);
    }

    public void h() {
        int i = (this.c == null || !gwb.i(this.i.b)) ? 0 : 1;
        if (i != 0) {
            if (this.l == null) {
                this.l = new InputFilter[]{new LengthFilter(ajf.a().n())};
            }
            this.b.setFilters(this.l);
            return;
        }
        this.b.setFilters(m);
    }

    public void i() {
        this.n = true;
    }

    public boolean j() {
        return this.b.getText().toString().trim().length() != 0;
    }

    public void k() {
        iil.b("Expected non-null", this.c);
        CharSequence d = gwb.d(this.b.getText());
        if (!TextUtils.isEmpty(d)) {
            this.c.a(d);
        }
        this.b.setText("");
    }
}
