package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.hangouts.R$drawable;
import com.google.android.apps.hangouts.views.AvatarView;
import com.google.android.apps.hangouts.views.ContactDetailItemView;
import java.util.Locale;

public final class gnj extends gnk {
    private static final boolean b = false;
    private final LinearLayout c;
    private final int d;
    private final TextView e;
    private final AvatarView f;
    private final View g;
    private final ContactDetailItemView h;
    private final TextView i;
    private final TextView j;
    private final bko k;
    private String l;
    private String m;
    private String n;
    private String o;
    private String p;
    private int q;
    private int r;
    private int s;
    private dak t;
    private dac u;
    private String v;
    private final SpannableStringBuilder w;

    static {
        kae kae = glk.u;
    }

    public gnj(Context context, bko bko) {
        this(context, bko, null);
    }

    private gnj(Context context, bko bko, AttributeSet attributeSet) {
        super(context, null);
        this.w = new SpannableStringBuilder();
        this.k = bko;
        View inflate = LayoutInflater.from(context).inflate(gwb.fP, this);
        this.c = (LinearLayout) inflate.findViewById(ba.df);
        this.d = this.c.getPaddingTop();
        this.e = (TextView) inflate.findViewById(ba.dy);
        this.f = (AvatarView) inflate.findViewById(ba.A);
        this.g = inflate.findViewById(ba.F);
        this.h = (ContactDetailItemView) inflate.findViewById(ba.ab);
        this.i = (TextView) inflate.findViewById(ba.fL);
        this.j = (TextView) inflate.findViewById(ba.ep);
    }

    public dak a() {
        return this.t;
    }

    public dac b() {
        return this.u;
    }

    public String c() {
        return this.l;
    }

    public String d() {
        return this.u != null ? this.u.a() : null;
    }

    public String e() {
        return i() ? this.m : null;
    }

    public void a(String str, String str2, String str3, String str4, String str5, int i, int i2, dak dak, dac dac, int i3) {
        String valueOf;
        this.l = str;
        this.m = str2;
        this.n = str4;
        this.o = str5;
        this.t = dak;
        this.q = i;
        this.r = i2;
        this.p = null;
        this.u = dac;
        this.s = i3;
        if (b) {
            String str6 = "Redrawing call contact item: mName=";
            valueOf = String.valueOf(this.m);
            if (valueOf.length() != 0) {
                str6.concat(valueOf);
            } else {
                valueOf = new String(str6);
            }
        }
        if (a(2)) {
            this.e.setVisibility(0);
            a(this.e, this.m, this.w, this.v, bji.NAME);
        } else {
            this.e.setVisibility(8);
        }
        if (a(1)) {
            this.c.setPadding(this.c.getPaddingLeft(), this.d, this.c.getPaddingRight(), this.c.getPaddingBottom());
            this.f.setVisibility(0);
            this.f.a(this.o, this.m, this.k);
            this.f.a(this.q == 1 ? 3 : 2);
            this.g.setVisibility(8);
        } else {
            this.c.setPadding(this.c.getPaddingLeft(), 0, this.c.getPaddingRight(), this.c.getPaddingBottom());
            this.g.setVisibility(0);
            this.f.setVisibility(8);
            this.f.a(null, null, null);
        }
        dam dam = null;
        if (this.q == 1 && !TextUtils.isEmpty(this.p)) {
            dam = new dal(this.p);
        } else if (this.t != null) {
            dam e = this.t.e();
            if (e == null) {
                String str7 = this.m;
                glk.e("Babel", new StringBuilder(String.valueOf(str7).length() + 45).append("Call contact item ").append(str7).append(" doesn't have phone number!").toString(), new Object[0]);
            } else if (i()) {
                dam = e;
            } else {
                valueOf = gls.a.a(glq.c(getContext(), e.a));
                if (valueOf != null) {
                    dam = new dal(new Locale(Locale.getDefault().getLanguage(), valueOf).getDisplayCountry());
                }
            }
        }
        this.h.setText("");
        if (dam != null) {
            this.h.a(dam, this.v);
        }
        this.j.setText("");
        this.j.setContentDescription(null);
        if (this.u == null || !a(8)) {
            this.i.setVisibility(8);
            this.i.setText("");
            this.i.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        } else {
            int i4 = R$drawable.aE;
            long c = this.u.c();
            long a = glj.a();
            CharSequence b = glj.b(c, a, false);
            CharSequence b2 = glj.b(c, a, true);
            switch (this.u.d()) {
                case 0:
                    i4 = R$drawable.aE;
                    this.i.setContentDescription(getResources().getString(bc.bf, new Object[]{b2}));
                    break;
                case 1:
                    i4 = R$drawable.aG;
                    this.i.setContentDescription(getResources().getString(bc.bh, new Object[]{b2}));
                    break;
                case 2:
                    i4 = R$drawable.aF;
                    this.i.setContentDescription(getResources().getString(bc.bg, new Object[]{b2}));
                    break;
                default:
                    glk.e("Babel", "unsupported call type!", new Object[0]);
                    break;
            }
            this.i.setVisibility(0);
            this.i.setText(b);
            this.i.setCompoundDrawablesWithIntrinsicBounds(i4, 0, 0, 0);
            if (!(this.u.f() || TextUtils.isEmpty(this.u.e()))) {
                this.j.setText(getResources().getString(bc.bo, new Object[]{this.u.e()}));
                this.j.setContentDescription(getResources().getString(bc.bp, new Object[]{this.u.e()}));
            }
        }
        invalidate();
    }

    public String f() {
        return this.n;
    }

    public String g() {
        return this.o;
    }

    public int h() {
        return this.q;
    }

    public boolean i() {
        return (this.r == 2 || a(16)) ? false : true;
    }

    public void a(String str) {
        if (str == null) {
            this.v = null;
        } else {
            this.v = str.toUpperCase(Locale.getDefault());
        }
    }

    private boolean a(int i) {
        return (this.s & i) != 0;
    }
}
