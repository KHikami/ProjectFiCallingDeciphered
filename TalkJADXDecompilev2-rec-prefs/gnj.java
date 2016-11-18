package p000;

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
    private static final boolean f15714b = false;
    private final LinearLayout f15715c;
    private final int f15716d;
    private final TextView f15717e;
    private final AvatarView f15718f;
    private final View f15719g;
    private final ContactDetailItemView f15720h;
    private final TextView f15721i;
    private final TextView f15722j;
    private final bko f15723k;
    private String f15724l;
    private String f15725m;
    private String f15726n;
    private String f15727o;
    private String f15728p;
    private int f15729q;
    private int f15730r;
    private int f15731s;
    private dak f15732t;
    private dac f15733u;
    private String f15734v;
    private final SpannableStringBuilder f15735w;

    static {
        kae kae = glk.f15574u;
    }

    public gnj(Context context, bko bko) {
        this(context, bko, null);
    }

    private gnj(Context context, bko bko, AttributeSet attributeSet) {
        super(context, null);
        this.f15735w = new SpannableStringBuilder();
        this.f15723k = bko;
        View inflate = LayoutInflater.from(context).inflate(gwb.fP, this);
        this.f15715c = (LinearLayout) inflate.findViewById(ba.df);
        this.f15716d = this.f15715c.getPaddingTop();
        this.f15717e = (TextView) inflate.findViewById(ba.dy);
        this.f15718f = (AvatarView) inflate.findViewById(ba.f2662A);
        this.f15719g = inflate.findViewById(ba.f2667F);
        this.f15720h = (ContactDetailItemView) inflate.findViewById(ba.ab);
        this.f15721i = (TextView) inflate.findViewById(ba.fL);
        this.f15722j = (TextView) inflate.findViewById(ba.ep);
    }

    public dak m18171a() {
        return this.f15732t;
    }

    public dac m18174b() {
        return this.f15733u;
    }

    public String m18175c() {
        return this.f15724l;
    }

    public String m18176d() {
        return this.f15733u != null ? this.f15733u.m11361a() : null;
    }

    public String m18177e() {
        return m18181i() ? this.f15725m : null;
    }

    public void m18173a(String str, String str2, String str3, String str4, String str5, int i, int i2, dak dak, dac dac, int i3) {
        String valueOf;
        this.f15724l = str;
        this.f15725m = str2;
        this.f15726n = str4;
        this.f15727o = str5;
        this.f15732t = dak;
        this.f15729q = i;
        this.f15730r = i2;
        this.f15728p = null;
        this.f15733u = dac;
        this.f15731s = i3;
        if (f15714b) {
            String str6 = "Redrawing call contact item: mName=";
            valueOf = String.valueOf(this.f15725m);
            if (valueOf.length() != 0) {
                str6.concat(valueOf);
            } else {
                valueOf = new String(str6);
            }
        }
        if (m18170a(2)) {
            this.f15717e.setVisibility(0);
            m18164a(this.f15717e, this.f15725m, this.f15735w, this.f15734v, bji.NAME);
        } else {
            this.f15717e.setVisibility(8);
        }
        if (m18170a(1)) {
            this.f15715c.setPadding(this.f15715c.getPaddingLeft(), this.f15716d, this.f15715c.getPaddingRight(), this.f15715c.getPaddingBottom());
            this.f15718f.setVisibility(0);
            this.f15718f.m9238a(this.f15727o, this.f15725m, this.f15723k);
            this.f15718f.m9231a(this.f15729q == 1 ? 3 : 2);
            this.f15719g.setVisibility(8);
        } else {
            this.f15715c.setPadding(this.f15715c.getPaddingLeft(), 0, this.f15715c.getPaddingRight(), this.f15715c.getPaddingBottom());
            this.f15719g.setVisibility(0);
            this.f15718f.setVisibility(8);
            this.f15718f.m9238a(null, null, null);
        }
        dam dam = null;
        if (this.f15729q == 1 && !TextUtils.isEmpty(this.f15728p)) {
            dam = new dal(this.f15728p);
        } else if (this.f15732t != null) {
            dam e = this.f15732t.m11391e();
            if (e == null) {
                String str7 = this.f15725m;
                glk.m17982e("Babel", new StringBuilder(String.valueOf(str7).length() + 45).append("Call contact item ").append(str7).append(" doesn't have phone number!").toString(), new Object[0]);
            } else if (m18181i()) {
                dam = e;
            } else {
                valueOf = gls.f15608a.m18046a(glq.m18012c(getContext(), e.f9435a));
                if (valueOf != null) {
                    dam = new dal(new Locale(Locale.getDefault().getLanguage(), valueOf).getDisplayCountry());
                }
            }
        }
        this.f15720h.setText("");
        if (dam != null) {
            this.f15720h.m9249a(dam, this.f15734v);
        }
        this.f15722j.setText("");
        this.f15722j.setContentDescription(null);
        if (this.f15733u == null || !m18170a(8)) {
            this.f15721i.setVisibility(8);
            this.f15721i.setText("");
            this.f15721i.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        } else {
            int i4 = R$drawable.aE;
            long c = this.f15733u.m11363c();
            long a = glj.m17956a();
            CharSequence b = glj.m17966b(c, a, false);
            CharSequence b2 = glj.m17966b(c, a, true);
            switch (this.f15733u.m11364d()) {
                case 0:
                    i4 = R$drawable.aE;
                    this.f15721i.setContentDescription(getResources().getString(bc.bf, new Object[]{b2}));
                    break;
                case 1:
                    i4 = R$drawable.aG;
                    this.f15721i.setContentDescription(getResources().getString(bc.bh, new Object[]{b2}));
                    break;
                case 2:
                    i4 = R$drawable.aF;
                    this.f15721i.setContentDescription(getResources().getString(bc.bg, new Object[]{b2}));
                    break;
                default:
                    glk.m17982e("Babel", "unsupported call type!", new Object[0]);
                    break;
            }
            this.f15721i.setVisibility(0);
            this.f15721i.setText(b);
            this.f15721i.setCompoundDrawablesWithIntrinsicBounds(i4, 0, 0, 0);
            if (!(this.f15733u.m11366f() || TextUtils.isEmpty(this.f15733u.m11365e()))) {
                this.f15722j.setText(getResources().getString(bc.bo, new Object[]{this.f15733u.m11365e()}));
                this.f15722j.setContentDescription(getResources().getString(bc.bp, new Object[]{this.f15733u.m11365e()}));
            }
        }
        invalidate();
    }

    public String m18178f() {
        return this.f15726n;
    }

    public String m18179g() {
        return this.f15727o;
    }

    public int m18180h() {
        return this.f15729q;
    }

    public boolean m18181i() {
        return (this.f15730r == 2 || m18170a(16)) ? false : true;
    }

    public void m18172a(String str) {
        if (str == null) {
            this.f15734v = null;
        } else {
            this.f15734v = str.toUpperCase(Locale.getDefault());
        }
    }

    private boolean m18170a(int i) {
        return (this.f15731s & i) != 0;
    }
}
