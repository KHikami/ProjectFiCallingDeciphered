package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.hangouts.R$drawable;
import com.google.android.apps.hangouts.views.AvatarView;
import java.util.Locale;

/* renamed from: gon */
public final class gon extends gnk {
    bjg b;
    private SpannableStringBuilder c;
    private bko d;
    private gou e;
    private AvatarView f;
    private ImageView g;
    private TextView h;
    private TextView i;
    private ImageView j;
    private boolean k;
    private ViewGroup l;
    private gpe m;
    private gqs n;

    public gon(Context context, bko bko, gou gou) {
        this(context, bko, gou, null, true);
    }

    public gon(Context context, bko bko, gou gou, bck bck) {
        this(context, bko, gou, bck, false);
    }

    private gon(Context context, bko bko, gou gou, bck bck, boolean z) {
        View inflate;
        super(context);
        this.c = new SpannableStringBuilder();
        this.e = gou;
        this.d = bko;
        if (bck != null) {
            got got = new got(this, bck);
        }
        if (gou.equals(gou.PEOPLE_OPTIONS) || gou.equals(gou.PEOPLE_OPTIONS_GUEST)) {
            inflate = LayoutInflater.from(context).inflate(gwb.ge, this);
            this.l = (ViewGroup) inflate.findViewById(ba.ar);
            this.m = null;
            gld.a(this.l, true);
        } else {
            inflate = LayoutInflater.from(context).inflate(gwb.hm, this);
            this.l = (ViewGroup) inflate.findViewById(ba.cT);
            grg grg = (grg) jyn.b(context, grg.class);
            if (grg != null) {
                this.m = grg.a(this.l, bko.g(), LayoutInflater.from(context));
            } else {
                this.l.setVisibility(8);
            }
        }
        this.f = (AvatarView) inflate.findViewById(ba.A);
        this.f.b(false);
        this.g = (ImageView) inflate.findViewById(ba.W);
        this.h = (TextView) inflate.findViewById(ba.dy);
        this.i = (TextView) inflate.findViewById(ba.aE);
        this.j = (ImageView) inflate.findViewById(ba.cl);
        gav gav = (gav) jyn.b(context, gav.class);
        if (gav == null) {
            this.n = new gqs(this.i);
            return;
        }
        View view;
        kbu kbu = (kbu) jyn.b(getContext()).a(kbc.class);
        if (z) {
            view = this;
        } else {
            view = null;
        }
        if (gou.equals(gou.PEOPLE_OPTIONS)) {
            if (fdq.i.b(bko.g())) {
                this.n = gav.a(kbu, bko.g(), this.i, null);
                return;
            }
        }
        this.n = gav.a(kbu, bko.g(), this.i, view);
    }

    public bjg a() {
        return this.b;
    }

    public gou b() {
        return this.e;
    }

    public void a(bjg bjg, String str, boolean z, boolean z2, gou gou) {
        String toUpperCase;
        this.b = bjg;
        this.e = gou;
        String e = bjg.e();
        if (TextUtils.isEmpty(e)) {
            e = getContext().getString(bc.tB);
        }
        this.k = z;
        this.f.a(bjg.f(), e, this.d);
        if (z) {
            this.g.setBackgroundResource(R$drawable.b);
            this.g.setContentDescription(getResources().getText(bc.ai));
        }
        if (str != null) {
            toUpperCase = str.toUpperCase(Locale.getDefault());
        } else {
            toUpperCase = str;
        }
        if (!fdq.P.b(this.d.g())) {
            a(this.h, e, this.c, toUpperCase, bjg.q());
            a(z2, bjg);
        } else if (TextUtils.isEmpty(toUpperCase)) {
            this.h.setText(e);
            a(z2, bjg);
        } else if (bjg.q() == bji.NAME) {
            a(this.h, bjg.r(), this.c, toUpperCase, bjg.q());
            a(z2, bjg);
        } else {
            this.h.setText(e);
            a(this.i, bjg.r(), this.c, toUpperCase, bjg.q());
            a(bjg);
        }
    }

    private void a(boolean z, bjg bjg) {
        if (z || !bjg.s()) {
            CharSequence d;
            if (bjg.z()) {
                d = bjg.a().d();
            } else {
                d = bjg.c();
                if (TextUtils.isEmpty(d)) {
                    d = null;
                }
            }
            if (d == null || d.equals(bjg.e())) {
                this.i.setVisibility(8);
                return;
            } else {
                this.i.setText(d);
                return;
            }
        }
        if (!fdq.P.b(this.d.g())) {
            this.j.setVisibility(0);
        }
        this.n.a(bjg.e(), bjg.i());
        a(bjg);
    }

    private void a(bjg bjg) {
        if (this.m != null) {
            this.m.a(bjg.s());
            this.m.b(bjg.x());
            this.m.a(bjg.i());
        }
    }

    public void a(boolean z, boolean z2) {
        super.a(z, z2);
        if (!this.k) {
            this.g.setContentDescription(z ? getContext().getResources().getText(bc.ah) : "");
        }
    }

    public void a(gor gor) {
        OnClickListener goo;
        OnLongClickListener onLongClickListener = null;
        if (gor != null) {
            goo = new goo(this, gor);
            onLongClickListener = new gop(this, gor);
        } else {
            goo = null;
        }
        this.f.setOnClickListener(goo);
        if (!this.e.equals(gou.PEOPLE_OPTIONS) && !this.e.equals(gou.PEOPLE_OPTIONS_GUEST)) {
            setOnLongClickListener(onLongClickListener);
        }
    }

    public void a(gos gos) {
        OnClickListener onClickListener = null;
        if (gos != null) {
            onClickListener = new goq(this, gos);
        }
        if (this.e.equals(gou.PEOPLE_OPTIONS) || this.e.equals(gou.PEOPLE_OPTIONS_GUEST)) {
            this.l.setOnClickListener(onClickListener);
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (TextUtils.isEmpty(accessibilityNodeInfo.getText())) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (!(this.g == null || TextUtils.isEmpty(this.g.getContentDescription()))) {
                gld.a(spannableStringBuilder, this.g.getContentDescription());
            }
            if (!(this.h == null || TextUtils.isEmpty(this.h.getText()))) {
                gld.a(spannableStringBuilder, this.h.getText());
            }
            if (!(this.i == null || TextUtils.isEmpty(this.i.getText()))) {
                gld.a(spannableStringBuilder, this.i.getText());
            }
            if (!(this.l == null || TextUtils.isEmpty(this.l.getContentDescription()))) {
                gld.a(spannableStringBuilder, this.l.getContentDescription());
            }
            accessibilityNodeInfo.setText(spannableStringBuilder);
            accessibilityNodeInfo.setContentDescription(spannableStringBuilder);
        }
    }

    protected void a(boolean z) {
        View findViewById = findViewById(ba.W);
        if (findViewById instanceof Checkable) {
            ((Checkable) findViewById).setChecked(isChecked());
        }
        a(findViewById, z);
    }

    public void k() {
        super.k();
        this.h.setText(null);
        this.n.a();
        this.g.setBackgroundResource(R$drawable.a);
        if (this.m != null) {
            this.m.a(false);
            this.m.a(null);
        }
        this.j.setVisibility(8);
        this.i.setVisibility(0);
    }
}
