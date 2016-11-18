package p000;

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

public final class gon extends gnk {
    bjg f15800b;
    private SpannableStringBuilder f15801c;
    private bko f15802d;
    private gou f15803e;
    private AvatarView f15804f;
    private ImageView f15805g;
    private TextView f15806h;
    private TextView f15807i;
    private ImageView f15808j;
    private boolean f15809k;
    private ViewGroup f15810l;
    private gpe f15811m;
    private gqs f15812n;

    public gon(Context context, bko bko, gou gou) {
        this(context, bko, gou, null, true);
    }

    public gon(Context context, bko bko, gou gou, bck bck) {
        this(context, bko, gou, bck, false);
    }

    private gon(Context context, bko bko, gou gou, bck bck, boolean z) {
        View inflate;
        super(context);
        this.f15801c = new SpannableStringBuilder();
        this.f15803e = gou;
        this.f15802d = bko;
        if (bck != null) {
            got got = new got(this, bck);
        }
        if (gou.equals(gou.PEOPLE_OPTIONS) || gou.equals(gou.PEOPLE_OPTIONS_GUEST)) {
            inflate = LayoutInflater.from(context).inflate(gwb.ge, this);
            this.f15810l = (ViewGroup) inflate.findViewById(ba.ar);
            this.f15811m = null;
            gld.m17934a(this.f15810l, true);
        } else {
            inflate = LayoutInflater.from(context).inflate(gwb.hm, this);
            this.f15810l = (ViewGroup) inflate.findViewById(ba.cT);
            grg grg = (grg) jyn.m25433b(context, grg.class);
            if (grg != null) {
                this.f15811m = grg.mo1667a(this.f15810l, bko.m5638g(), LayoutInflater.from(context));
            } else {
                this.f15810l.setVisibility(8);
            }
        }
        this.f15804f = (AvatarView) inflate.findViewById(ba.f2662A);
        this.f15804f.m9243b(false);
        this.f15805g = (ImageView) inflate.findViewById(ba.f2684W);
        this.f15806h = (TextView) inflate.findViewById(ba.dy);
        this.f15807i = (TextView) inflate.findViewById(ba.aE);
        this.f15808j = (ImageView) inflate.findViewById(ba.cl);
        gav gav = (gav) jyn.m25433b(context, gav.class);
        if (gav == null) {
            this.f15812n = new gqs(this.f15807i);
            return;
        }
        View view;
        kbu kbu = (kbu) jyn.m25435b(getContext()).m25443a(kbc.class);
        if (z) {
            view = this;
        } else {
            view = null;
        }
        if (gou.equals(gou.PEOPLE_OPTIONS)) {
            if (fdq.f12793i.m14370b(bko.m5638g())) {
                this.f15812n = gav.mo2177a(kbu, bko.m5638g(), this.f15807i, null);
                return;
            }
        }
        this.f15812n = gav.mo2177a(kbu, bko.m5638g(), this.f15807i, view);
    }

    public bjg m18227a() {
        return this.f15800b;
    }

    public gou m18233b() {
        return this.f15803e;
    }

    public void m18228a(bjg bjg, String str, boolean z, boolean z2, gou gou) {
        String toUpperCase;
        this.f15800b = bjg;
        this.f15803e = gou;
        String e = bjg.mo571e();
        if (TextUtils.isEmpty(e)) {
            e = getContext().getString(bc.tB);
        }
        this.f15809k = z;
        this.f15804f.m9238a(bjg.mo572f(), e, this.f15802d);
        if (z) {
            this.f15805g.setBackgroundResource(R$drawable.f5928b);
            this.f15805g.setContentDescription(getResources().getText(bc.ai));
        }
        if (str != null) {
            toUpperCase = str.toUpperCase(Locale.getDefault());
        } else {
            toUpperCase = str;
        }
        if (!fdq.f12774P.m14370b(this.f15802d.m5638g())) {
            m18164a(this.f15806h, e, this.f15801c, toUpperCase, bjg.mo583q());
            m18226a(z2, bjg);
        } else if (TextUtils.isEmpty(toUpperCase)) {
            this.f15806h.setText(e);
            m18226a(z2, bjg);
        } else if (bjg.mo583q() == bji.NAME) {
            m18164a(this.f15806h, bjg.mo584r(), this.f15801c, toUpperCase, bjg.mo583q());
            m18226a(z2, bjg);
        } else {
            this.f15806h.setText(e);
            m18164a(this.f15807i, bjg.mo584r(), this.f15801c, toUpperCase, bjg.mo583q());
            m18225a(bjg);
        }
    }

    private void m18226a(boolean z, bjg bjg) {
        if (z || !bjg.mo585s()) {
            CharSequence d;
            if (bjg.m5407z()) {
                d = bjg.mo567a().m5474d();
            } else {
                d = bjg.mo569c();
                if (TextUtils.isEmpty(d)) {
                    d = null;
                }
            }
            if (d == null || d.equals(bjg.mo571e())) {
                this.f15807i.setVisibility(8);
                return;
            } else {
                this.f15807i.setText(d);
                return;
            }
        }
        if (!fdq.f12774P.m14370b(this.f15802d.m5638g())) {
            this.f15808j.setVisibility(0);
        }
        this.f15812n.mo2174a(bjg.mo571e(), bjg.mo575i());
        m18225a(bjg);
    }

    private void m18225a(bjg bjg) {
        if (this.f15811m != null) {
            this.f15811m.mo1662a(bjg.mo585s());
            this.f15811m.mo1663b(bjg.mo590x());
            this.f15811m.mo1661a(bjg.mo575i());
        }
    }

    public void mo2311a(boolean z, boolean z2) {
        super.mo2311a(z, z2);
        if (!this.f15809k) {
            this.f15805g.setContentDescription(z ? getContext().getResources().getText(bc.ah) : "");
        }
    }

    public void m18229a(gor gor) {
        OnClickListener goo;
        OnLongClickListener onLongClickListener = null;
        if (gor != null) {
            goo = new goo(this, gor);
            onLongClickListener = new gop(this, gor);
        } else {
            goo = null;
        }
        this.f15804f.setOnClickListener(goo);
        if (!this.f15803e.equals(gou.PEOPLE_OPTIONS) && !this.f15803e.equals(gou.PEOPLE_OPTIONS_GUEST)) {
            setOnLongClickListener(onLongClickListener);
        }
    }

    public void m18230a(gos gos) {
        OnClickListener onClickListener = null;
        if (gos != null) {
            onClickListener = new goq(this, gos);
        }
        if (this.f15803e.equals(gou.PEOPLE_OPTIONS) || this.f15803e.equals(gou.PEOPLE_OPTIONS_GUEST)) {
            this.f15810l.setOnClickListener(onClickListener);
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (TextUtils.isEmpty(accessibilityNodeInfo.getText())) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (!(this.f15805g == null || TextUtils.isEmpty(this.f15805g.getContentDescription()))) {
                gld.m17924a(spannableStringBuilder, this.f15805g.getContentDescription());
            }
            if (!(this.f15806h == null || TextUtils.isEmpty(this.f15806h.getText()))) {
                gld.m17924a(spannableStringBuilder, this.f15806h.getText());
            }
            if (!(this.f15807i == null || TextUtils.isEmpty(this.f15807i.getText()))) {
                gld.m17924a(spannableStringBuilder, this.f15807i.getText());
            }
            if (!(this.f15810l == null || TextUtils.isEmpty(this.f15810l.getContentDescription()))) {
                gld.m17924a(spannableStringBuilder, this.f15810l.getContentDescription());
            }
            accessibilityNodeInfo.setText(spannableStringBuilder);
            accessibilityNodeInfo.setContentDescription(spannableStringBuilder);
        }
    }

    protected void mo2310a(boolean z) {
        View findViewById = findViewById(ba.f2684W);
        if (findViewById instanceof Checkable) {
            ((Checkable) findViewById).setChecked(isChecked());
        }
        m18163a(findViewById, z);
    }

    public void mo2312k() {
        super.mo2312k();
        this.f15806h.setText(null);
        this.f15812n.mo2173a();
        this.f15805g.setBackgroundResource(R$drawable.f5927a);
        if (this.f15811m != null) {
            this.f15811m.mo1662a(false);
            this.f15811m.mo1661a(null);
        }
        this.f15808j.setVisibility(8);
        this.f15807i.setVisibility(0);
    }
}
