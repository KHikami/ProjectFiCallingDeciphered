package p000;

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
    private static final InputFilter[] f5058m = new InputFilter[0];
    final TransportSpinner f5059a;
    final MessageEditText f5060b;
    cdn f5061c;
    int f5062d;
    long f5063e;
    final View f5064f;
    fzr f5065g;
    bpe f5066h;
    bpd f5067i;
    final Runnable f5068j = new cdi(this);
    final cdo f5069k = new cdo(this);
    private InputFilter[] f5070l;
    private boolean f5071n = false;

    public cdh(Context context, LayoutInflater layoutInflater, fzr fzr) {
        super(context);
        this.f5065g = fzr;
        jyn b = jyn.m25435b(context);
        View inflate = layoutInflater.inflate(gwb.fR, this, true);
        this.f5062d = 3;
        this.f5064f = inflate.findViewById(ba.dt);
        this.f5060b = (MessageEditText) inflate.findViewById(ba.dx);
        this.f5060b.addTextChangedListener(new cdj(this, context));
        this.f5060b.setOnEditorActionListener(this);
        this.f5060b.setOnFocusChangeListener(new cdk(this));
        this.f5060b.m8347a(new cdl(this));
        this.f5059a = (TransportSpinner) inflate.findViewById(ba.fV);
        this.f5059a.m8353a(b);
        m7257a();
        m7256l();
        this.f5066h = (bpe) jyn.m25426a(context, bpe.class);
        this.f5066h.mo963a(new cdm(this));
    }

    public void m7262a(boolean z) {
        this.f5060b.setFocusable(z);
        this.f5060b.setFocusableInTouchMode(z);
        this.f5060b.setImeOptions(z ? 4 : 0);
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        if (this.f5061c != null) {
            Object itemAtPosition = adapterView.getItemAtPosition(i);
            if (itemAtPosition instanceof bpd) {
                bpd bpd = (bpd) itemAtPosition;
                if (!(bpd.f4153h == null && bpd.f4150e == null)) {
                    this.f5066h.mo962a(bpd);
                }
            }
        }
        m7256l();
    }

    private void m7256l() {
        int i;
        int i2 = 0;
        if ((this.f5059a.getVisibility() != 8 ? 1 : 0) == 0) {
            i2 = getResources().getDimensionPixelSize(gwb.eB);
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(gwb.eB);
        boolean a = gld.m17938a((View) this);
        if (a) {
            i = dimensionPixelSize;
        } else {
            i = i2;
        }
        if (!a) {
            i2 = dimensionPixelSize;
        }
        this.f5064f.setPadding(i, this.f5064f.getPaddingTop(), i2, this.f5064f.getPaddingBottom());
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void m7257a() {
        if (this.f5067i != null && gwb.m2254i(this.f5067i.f4147b)) {
            this.f5059a.m8354a(this.f5065g.m16725b());
        }
        if (this.f5061c != null) {
            this.f5061c.m7280a();
        }
        if (this.f5066h != null && this.f5067i != null) {
            int i;
            CharSequence charSequence;
            boolean i2 = gwb.m2254i(this.f5067i.f4147b);
            int b = this.f5066h.mo965b();
            if (this.f5071n) {
                i = bc.ju;
                charSequence = null;
            } else if (!i2) {
                i = gwb.mc;
                charSequence = null;
            } else if (b == 1) {
                int i3;
                if (dak.m11385b(this.f5066h.mo966c())) {
                    if (this.f5065g.m16725b()) {
                        i3 = gwb.ma;
                    } else {
                        i3 = gwb.mb;
                    }
                    i = i3;
                    charSequence = null;
                } else {
                    if (this.f5065g.m16725b()) {
                        i3 = bc.js;
                    } else {
                        i3 = bc.jt;
                    }
                    ke a = ke.m25637a();
                    i = i3;
                    Object string = getContext().getString(i3, new Object[]{a.m25642a(glq.m18038i(getContext(), r2), kp.f22600a)});
                }
            } else {
                i = gwb.mc;
                charSequence = null;
            }
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = getContext().getString(i);
            }
            this.f5060b.setHint(charSequence);
        }
    }

    public void m7263b() {
        this.f5060b.requestFocus();
    }

    public boolean m7264c() {
        if (getVisibility() != 0 || !this.f5060b.hasFocus()) {
            return false;
        }
        ba.m4658u(this.f5060b);
        return true;
    }

    public void m7259a(cdn cdn) {
        this.f5061c = cdn;
    }

    public void m7265d() {
        this.f5061c = null;
        gwb.m2042b(this.f5068j);
        gwb.m2042b(this.f5069k);
    }

    public void m7261a(CharSequence charSequence, boolean z) {
        if (TextUtils.isEmpty(this.f5060b.getText())) {
            this.f5060b.setText(charSequence);
        }
        if (z) {
            this.f5060b.selectAll();
        } else {
            this.f5060b.setSelection(this.f5060b.getText().length());
        }
        m7257a();
    }

    public String m7266e() {
        return this.f5060b.getText().toString();
    }

    public void m7260a(CharSequence charSequence) {
        int selectionStart = this.f5060b.getSelectionStart();
        int selectionEnd = this.f5060b.getSelectionEnd();
        this.f5060b.getText().replace(Math.min(selectionStart, selectionEnd), Math.max(selectionStart, selectionEnd), charSequence);
    }

    public void m7267f() {
        this.f5060b.dispatchKeyEvent(new KeyEvent(0, 67));
    }

    public void m7268g() {
        this.f5060b.dispatchKeyEvent(new KeyEvent(0, 62));
    }

    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if ((i == 4 || (keyEvent != null && keyEvent.getAction() == 0)) && this.f5060b.getText().length() > 0) {
            ((chy) jyn.m25426a(getContext(), chy.class)).mo898a();
        }
        return true;
    }

    void m7258a(int i) {
        if (this.f5061c != null) {
            this.f5061c.m7281a(i);
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        this.f5060b.setVisibility(i);
    }

    public void m7269h() {
        int i = (this.f5061c == null || !gwb.m2254i(this.f5067i.f4147b)) ? 0 : 1;
        if (i != 0) {
            if (this.f5070l == null) {
                this.f5070l = new InputFilter[]{new LengthFilter(ajf.m2609a().mo2130n())};
            }
            this.f5060b.setFilters(this.f5070l);
            return;
        }
        this.f5060b.setFilters(f5058m);
    }

    public void m7270i() {
        this.f5071n = true;
    }

    public boolean m7271j() {
        return this.f5060b.getText().toString().trim().length() != 0;
    }

    public void m7272k() {
        iil.m21875b("Expected non-null", this.f5061c);
        CharSequence d = gwb.m2131d(this.f5060b.getText());
        if (!TextUtils.isEmpty(d)) {
            this.f5061c.m7282a(d);
        }
        this.f5060b.setText("");
    }
}
