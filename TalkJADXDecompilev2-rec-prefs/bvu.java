package p000;

import android.graphics.PorterDuff.Mode;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.apps.hangouts.conversation.messagelist.impl.LinearLayoutEx;
import com.google.android.apps.hangouts.views.AvatarView;
import java.util.ArrayList;
import java.util.List;

public final class bvu extends btm {
    final bvz f4590d = new bvz(this);
    btf f4591e;
    edk f4592f;
    boolean f4593g;
    String f4594h;
    String f4595i;
    Spanned f4596j;
    cpw f4597k;
    private final TextView f4598l;
    private final ViewGroup f4599m;
    private final View f4600n;
    private final View f4601o;
    private final AvatarView f4602p;
    private final TextView f4603q;
    private final ImageView f4604r;
    private final ImageView f4605s;
    private final ImageView f4606t;
    private final ViewGroup f4607u;
    private final ViewGroup f4608v;
    private String f4609w;
    private btd f4610x;

    public bvu(dr drVar, View view) {
        super(drVar, view);
        this.f4600n = view.findViewById(bm.f3843s);
        this.f4601o = view.findViewById(bm.f3842r);
        this.f4598l = (TextView) view.findViewById(bm.f3841q);
        this.f4598l.setOnLongClickListener(new bvv(this, view));
        this.f4599m = (ViewGroup) view.findViewById(bm.f3845u);
        this.f4602p = (AvatarView) view.findViewById(bm.f3826b);
        this.f4604r = (ImageView) view.findViewById(bm.f3833i);
        this.f4603q = (TextView) this.f4599m.findViewById(bm.f3834j);
        this.f4606t = (ImageView) this.f4599m.findViewById(bm.f3800B);
        this.f4605s = (ImageView) this.f4599m.findViewById(bm.f3799A);
        this.f4607u = (ViewGroup) this.f4600n.findViewById(bm.f3825a);
        this.f4608v = (ViewGroup) view.findViewById(bm.f3847w);
        ((LinearLayoutEx) ((ViewGroup) view.findViewById(bm.f3844t)).getChildAt(0)).setOnLongClickListener(null);
        view.setOnCreateContextMenuListener(this.f4590d);
    }

    private void m6794c(btf btf) {
        Spanned spannedString;
        bvu bvu;
        String str = null;
        this.f4591e = btf;
        this.f4592f = btf.m6584a(this.c);
        this.f4593g = btf.f4396i == fwy.OUTGOING_USER_MESSAGE;
        this.f4594h = TextUtils.isEmpty(btf.f4407t.f4423g) ? null : btf.f4407t.f4423g;
        if (!TextUtils.isEmpty(btf.f4407t.f4422f)) {
            str = btf.f4407t.f4422f;
        }
        this.f4595i = str;
        this.f4609w = btf.f4393f;
        if (TextUtils.isEmpty(btf.f4393f)) {
            spannedString = new SpannedString("");
            bvu = this;
        } else {
            if (this.f4609w.charAt(this.f4609w.length() - 1) == ' ') {
                int length = this.f4609w.length() - 2;
                while (length >= 0 && this.f4609w.charAt(length) == ' ') {
                    length--;
                }
                this.f4609w = this.f4609w.substring(0, length + 1);
            }
            if (btf.f4407t.f4425i != 0 && btf.f4407t.f4425i != 1) {
                this.f4596j = gwb.m2313o(this.f4609w);
                Spanned spanned = this.f4596j;
                if (TextUtils.isEmpty(spanned)) {
                    spannedString = spanned;
                    bvu = this;
                } else {
                    String str2 = ((cgr) jyn.m25426a(m6595c(), cgr.class)).mo940b().f2992r;
                    if (str2 == null) {
                        spannedString = spanned;
                        bvu = this;
                    } else {
                        spannedString = gkb.m17868a(spanned, str2);
                        bvu = this;
                    }
                }
            } else if (TextUtils.isEmpty(btf.f4407t.f4421e)) {
                spannedString = new SpannedString(this.f4609w);
                bvu = this;
            } else {
                spannedString = new SpannedString(fyi.m16593a(btf.f4407t.f4421e, this.f4609w));
                bvu = this;
            }
        }
        bvu.f4596j = spannedString;
        this.f4596j = gwb.m1580a(m6595c(), this.f4596j, 7);
    }

    private void m6795h() {
        int g = m6593b().m5638g();
        if (fdq.f12805u.m14370b(g) && this.f4591e.f4407t.f4425i == -1) {
            this.f4597k = new bua(this.f4591e, g, this.b);
            if (this.f4597k.mo734n()) {
                this.f4597k.mo733m().setVisibility(0);
                this.f4597k.mo733m().setOnClickListener(new bvw(this));
                return;
            }
            this.f4597k.mo733m().setVisibility(8);
            this.f4597k.mo733m().setOnClickListener(null);
        }
    }

    public void mo754a(btf btf) {
        int i;
        int i2;
        int i3;
        m6794c(btf);
        this.f4598l.setMovementMethod(null);
        if (TextUtils.isEmpty(this.f4596j)) {
            this.f4598l.setVisibility(8);
        } else {
            this.f4598l.setVisibility(0);
            TextView textView = this.f4598l;
            CharSequence charSequence = this.f4596j;
            CharSequence a = gob.m18199a(m6595c()).mo2307a(charSequence, null, this.f4598l);
            if (a != null) {
                charSequence = a;
            }
            textView.setText(charSequence);
            if (btf.f4395h != fwx.FAILED_TO_SEND && ((URLSpan[]) this.f4596j.getSpans(0, this.f4596j.length() - 1, URLSpan.class)).length > 0) {
                this.f4598l.setMovementMethod(LinkMovementMethod.getInstance());
            }
        }
        this.f4610x = null;
        this.f4607u.setVisibility(8);
        this.f4607u.removeAllViews();
        this.f4608v.setVisibility(8);
        this.f4608v.removeAllViews();
        btq btq = (btq) jyn.m25426a(m6595c(), btq.class);
        if (btf.f4406s.m6573a(m6595c()) != btc.UNKNOWN) {
            this.f4610x = btq.m6609a(m6595c(), btf);
            if (this.f4610x != null) {
                this.f4610x.mo715a(btf);
                if (this.f4610x.mo717a()) {
                    this.f4607u.setVisibility(0);
                    this.f4607u.addView((View) this.f4610x);
                } else {
                    ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.a.getContext()).inflate(ba.hs, this.f4608v, false);
                    viewGroup.addView((View) this.f4610x);
                    this.f4608v.setVisibility(0);
                    this.f4608v.addView(viewGroup);
                }
            } else {
                glk.m17981d("Babel_MsgList", "Attachment type %s not handled", Integer.valueOf(r1.ordinal()));
            }
        }
        for (URLSpan url : (URLSpan[]) this.f4596j.getSpans(0, this.f4596j.length(), URLSpan.class)) {
            String url2 = url.getURL();
            if (bxl.m6892b(url2)) {
                View bxl = new bxl(m6595c());
                bxl.m6895a(m6593b(), url2);
                this.f4608v.setVisibility(0);
                this.f4608v.addView(bxl);
            }
        }
        if (!TextUtils.isEmpty(this.f4591e.f4393f) || this.f4607u.getVisibility() == 0) {
            this.f4600n.setVisibility(0);
            if (this.f4601o != null) {
                this.f4601o.setVisibility(0);
            }
        } else {
            this.f4600n.setVisibility(8);
            if (this.f4601o != null) {
                this.f4601o.setVisibility(8);
            }
        }
        if (this.f4593g && this.f4591e.f4408u.f4411a) {
            i = gwb.kd;
            i2 = 4;
        } else if (this.f4593g && !this.f4591e.f4408u.f4411a) {
            i = gwb.ke;
            i2 = 4;
        } else if (this.f4593g || !this.f4591e.f4408u.f4411a) {
            i = gwb.kc;
            i2 = 4;
        } else {
            i = gwb.kb;
            i2 = 0;
        }
        if (this.f4602p != null) {
            this.f4602p.setVisibility(i2);
        }
        this.f4600n.setBackgroundResource(i);
        if (this.f4591e.f4398k && this.f4593g) {
            i3 = ba.hg;
            i = ba.ho;
            i2 = ba.hk;
        } else if (this.f4591e.f4398k && !this.f4593g) {
            i3 = ba.he;
            i = ba.hm;
            i2 = ba.hi;
        } else if (this.f4591e.f4398k || !this.f4593g) {
            i3 = ba.hd;
            i = ba.hl;
            i2 = ba.hh;
        } else {
            i3 = ba.hf;
            i = ba.hn;
            i2 = ba.hj;
        }
        this.f4600n.getBackground().setColorFilter(ia.m10680c(m6595c(), i3), Mode.SRC_IN);
        this.f4598l.setTextColor(ia.m10680c(m6595c(), i));
        this.f4598l.setLinkTextColor(ia.m10680c(m6595c(), i2));
        m6796i();
        m6797j();
        m6798k();
        m6799l();
        m6795h();
    }

    public void mo760b(btf btf) {
        m6794c(btf);
        m6797j();
        m6798k();
        m6799l();
        m6796i();
        if (this.f4610x != null) {
            this.f4610x.mo718b(btf);
        }
        m6795h();
    }

    public CharSequence mo755e() {
        int i = 0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        List arrayList = new ArrayList();
        for (int i2 = 0; i2 < this.f4608v.getChildCount(); i2++) {
            arrayList.add(this.f4608v.getChildAt(i2).getContentDescription());
        }
        while (i < this.f4607u.getChildCount()) {
            arrayList.add(this.f4607u.getChildAt(i).getContentDescription());
            i++;
        }
        if (!TextUtils.isEmpty(this.f4598l.getText())) {
            arrayList.add(this.f4598l.getText());
        }
        arrayList.add(this.f4603q.getText());
        gld.m17923a(m6595c(), spannableStringBuilder, arrayList);
        return spannableStringBuilder;
    }

    boolean m6803f() {
        return this.c.mo947e() == 1;
    }

    private void m6796i() {
        if (this.f4602p != null && this.f4602p.getVisibility() == 0 && !this.f4593g && this.f4592f != null) {
            String str;
            String d = this.c.mo954k().m5594d(this.f4592f.f11213b);
            if (m6803f()) {
                str = this.f4592f.f11216e;
            } else {
                str = this.c.mo954k().m5598e(this.f4592f.f11213b);
            }
            this.f4602p.m9238a(d, str, m6593b());
            this.f4602p.setOnClickListener(new bvx(this));
        }
    }

    public void m6804g() {
        Object b = this.f4592f.m13590b();
        String str = this.f4595i;
        if (this.f4591e.f4402o == 2) {
            b = null;
            CharSequence f = this.f4592f.m13596f();
        } else {
            Object obj = str;
        }
        String e = this.c.mo954k().m5598e(this.f4592f.f11213b);
        if (TextUtils.isEmpty(b) && TextUtils.isEmpty(f)) {
            glk.m17981d("Babel_MsgList", "Not showing SmartProfile from conversation because there's no personId", new Object[0]);
            Toast.makeText(m6595c(), ba.iq, 0).show();
            return;
        }
        fxa fxa = (fxa) jyn.m25426a(m6595c(), fxa.class);
        if (TextUtils.isEmpty(b)) {
            fxa.mo2110b(m6595c(), this.a, f, e, this.f4602p.m9230a());
        } else {
            fxa.mo2109a(m6595c(), this.a, b, e, this.f4602p.m9230a());
        }
        gwb.m1823a(m6593b(), 2141);
    }

    private void m6797j() {
        if (this.f4591e.f4395h == fwx.FAILED_TO_SEND) {
            if (this.f4604r != null) {
                this.f4604r.setVisibility(0);
            }
        } else if (this.f4604r != null) {
            this.f4604r.setVisibility(8);
        }
    }

    private void m6798k() {
        if (this.f4591e.f4395h == fwx.FAILED_TO_SEND) {
            m6792a(new bwc(this));
        } else {
            m6792a(null);
        }
        btl btl = (btl) jyn.m25433b(m6595c(), btl.class);
        if (btl != null) {
            m6792a(btl.m6590a());
        }
    }

    private void m6792a(OnClickListener onClickListener) {
        boolean z;
        boolean z2 = true;
        LinearLayoutEx linearLayoutEx = (LinearLayoutEx) ((ViewGroup) this.b.findViewById(bm.f3844t)).getChildAt(0);
        linearLayoutEx.setOnClickListener(onClickListener);
        if (onClickListener != null) {
            z = true;
        } else {
            z = false;
        }
        linearLayoutEx.m8297a(z);
        if (onClickListener == null) {
            z2 = false;
        }
        linearLayoutEx.setClickable(z2);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m6799l() {
        int i;
        bvu bvu;
        boolean z = true;
        int i2 = 0;
        boolean z2 = this.f4591e.f4407t.f4425i == 2;
        switch (bvy.f4615a[this.f4591e.f4395h.ordinal()]) {
            case 1:
                if (z2) {
                    i = ba.hH;
                    bvu = this;
                } else {
                    i = ba.hJ;
                    bvu = this;
                }
            case 2:
                if (z2) {
                    i = ba.hH;
                    bvu = this;
                } else {
                    i = ba.hK;
                    bvu = this;
                }
            case 3:
                i = ba.hL;
                bvu = this;
            case 4:
                i = ba.hI;
                bvu = this;
            case 5:
                if (!z2) {
                    if (this.f4591e.f4407t.f4424h != 64) {
                        CharSequence charSequence;
                        long a = glj.m17956a();
                        CharSequence stringBuilder = new StringBuilder();
                        if (!(this.f4592f == null || this.f4593g || m6803f())) {
                            stringBuilder.append(gwb.m1648a(m6595c(), this.f4592f, true));
                            stringBuilder.append(m6596d().getText(ba.hY));
                        }
                        stringBuilder.append(glj.m17966b(this.f4591e.m6587b(), a, false));
                        stringBuilder.append(" ");
                        z2 = !this.f4591e.f4399l && this.f4593g;
                        if (this.f4591e.f4402o == 2) {
                            if (m6593b() == null || !m6593b().m5626M()) {
                                i = ba.iQ;
                            } else {
                                i = ba.iT;
                            }
                        } else if (this.f4591e.f4407t.f4425i == 0) {
                            i = ba.iS;
                        } else if (this.f4591e.f4407t.f4425i == 1) {
                            i = ba.iR;
                        } else if (z2) {
                            i = ba.iP;
                        } else {
                            i = 0;
                        }
                        if (i == 0) {
                            charSequence = "";
                        } else {
                            charSequence = m6596d().getText(i);
                        }
                        stringBuilder.append(charSequence);
                        if (this.f4591e.f4407t.f4424h == 0) {
                            i = 0;
                        } else {
                            i = 8;
                        }
                        m6793a(stringBuilder, i, 8);
                        z = this.f4591e.f4408u.f4412b;
                        break;
                    }
                    m6791a(ba.iA, 8, 0);
                    break;
                }
                i = ba.io;
                bvu = this;
                break;
            case 6:
                switch (this.f4591e.f4403p) {
                    case 123:
                        i = ba.ij;
                        bvu = this;
                    case 124:
                        i = ba.in;
                        bvu = this;
                    case 125:
                        i = ba.id;
                        bvu = this;
                    case 126:
                        i = ba.ik;
                        bvu = this;
                    case 127:
                        i = ba.ih;
                        bvu = this;
                    case 128:
                        i = ba.ig;
                        bvu = this;
                    case 129:
                        i = ba.ic;
                        bvu = this;
                    case 130:
                        i = ba.ii;
                        bvu = this;
                    case 131:
                        i = ba.im;
                        bvu = this;
                    case 132:
                        i = ba.ia;
                        bvu = this;
                    case 133:
                        i = ba.f2698if;
                        bvu = this;
                    case 134:
                        i = ba.ib;
                        bvu = this;
                    case 135:
                        i = ba.il;
                        bvu = this;
                    case 136:
                        i = ba.ie;
                        bvu = this;
                    default:
                        if (z2) {
                            i = ba.ir;
                            bvu = this;
                        } else {
                            i = ba.is;
                            bvu = this;
                        }
                }
                bvu.m6791a(i, 8, 8);
                break;
        }
        bvu.m6791a(i, 8, 8);
        ViewGroup viewGroup = this.f4599m;
        if (!z) {
            i2 = 8;
        }
        viewGroup.setVisibility(i2);
    }

    private void m6793a(CharSequence charSequence, int i, int i2) {
        this.f4605s.setVisibility(i);
        this.f4606t.setVisibility(i2);
        this.f4603q.setText(charSequence);
    }

    private void m6791a(int i, int i2, int i3) {
        m6793a(m6596d().getString(i), 8, i3);
    }
}
