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
    final bvz d;
    btf e;
    edk f;
    boolean g;
    String h;
    String i;
    Spanned j;
    cpw k;
    private final TextView l;
    private final ViewGroup m;
    private final View n;
    private final View o;
    private final AvatarView p;
    private final TextView q;
    private final ImageView r;
    private final ImageView s;
    private final ImageView t;
    private final ViewGroup u;
    private final ViewGroup v;
    private String w;
    private btd x;

    public bvu(dr drVar, View view) {
        super(drVar, view);
        this.d = new bvz(this);
        this.n = view.findViewById(bm.s);
        this.o = view.findViewById(bm.r);
        this.l = (TextView) view.findViewById(bm.q);
        this.l.setOnLongClickListener(new bvv(this, view));
        this.m = (ViewGroup) view.findViewById(bm.u);
        this.p = (AvatarView) view.findViewById(bm.b);
        this.r = (ImageView) view.findViewById(bm.i);
        this.q = (TextView) this.m.findViewById(bm.j);
        this.t = (ImageView) this.m.findViewById(bm.B);
        this.s = (ImageView) this.m.findViewById(bm.A);
        this.u = (ViewGroup) this.n.findViewById(bm.a);
        this.v = (ViewGroup) view.findViewById(bm.w);
        ((LinearLayoutEx) ((ViewGroup) view.findViewById(bm.t)).getChildAt(0)).setOnLongClickListener(null);
        view.setOnCreateContextMenuListener(this.d);
    }

    private void c(btf btf) {
        Spanned spannedString;
        bvu bvu;
        String str = null;
        this.e = btf;
        this.f = btf.a(this.c);
        this.g = btf.i == fwy.OUTGOING_USER_MESSAGE;
        this.h = TextUtils.isEmpty(btf.t.g) ? null : btf.t.g;
        if (!TextUtils.isEmpty(btf.t.f)) {
            str = btf.t.f;
        }
        this.i = str;
        this.w = btf.f;
        if (TextUtils.isEmpty(btf.f)) {
            spannedString = new SpannedString("");
            bvu = this;
        } else {
            if (this.w.charAt(this.w.length() - 1) == '\u00a0') {
                int length = this.w.length() - 2;
                while (length >= 0 && this.w.charAt(length) == '\u00a0') {
                    length--;
                }
                this.w = this.w.substring(0, length + 1);
            }
            if (btf.t.i != 0 && btf.t.i != 1) {
                this.j = gwb.o(this.w);
                Spanned spanned = this.j;
                if (TextUtils.isEmpty(spanned)) {
                    spannedString = spanned;
                    bvu = this;
                } else {
                    String str2 = ((cgr) jyn.a(c(), cgr.class)).b().r;
                    if (str2 == null) {
                        spannedString = spanned;
                        bvu = this;
                    } else {
                        spannedString = gkb.a(spanned, str2);
                        bvu = this;
                    }
                }
            } else if (TextUtils.isEmpty(btf.t.e)) {
                spannedString = new SpannedString(this.w);
                bvu = this;
            } else {
                spannedString = new SpannedString(fyi.a(btf.t.e, this.w));
                bvu = this;
            }
        }
        bvu.j = spannedString;
        this.j = gwb.a(c(), this.j, 7);
    }

    private void h() {
        int g = b().g();
        if (fdq.u.b(g) && this.e.t.i == -1) {
            this.k = new bua(this.e, g, this.b);
            if (this.k.n()) {
                this.k.m().setVisibility(0);
                this.k.m().setOnClickListener(new bvw(this));
                return;
            }
            this.k.m().setVisibility(8);
            this.k.m().setOnClickListener(null);
        }
    }

    public void a(btf btf) {
        int i;
        int i2;
        int i3;
        c(btf);
        this.l.setMovementMethod(null);
        if (TextUtils.isEmpty(this.j)) {
            this.l.setVisibility(8);
        } else {
            this.l.setVisibility(0);
            TextView textView = this.l;
            CharSequence charSequence = this.j;
            CharSequence a = gob.a(c()).a(charSequence, null, this.l);
            if (a != null) {
                charSequence = a;
            }
            textView.setText(charSequence);
            if (btf.h != fwx.FAILED_TO_SEND && ((URLSpan[]) this.j.getSpans(0, this.j.length() - 1, URLSpan.class)).length > 0) {
                this.l.setMovementMethod(LinkMovementMethod.getInstance());
            }
        }
        this.x = null;
        this.u.setVisibility(8);
        this.u.removeAllViews();
        this.v.setVisibility(8);
        this.v.removeAllViews();
        btq btq = (btq) jyn.a(c(), btq.class);
        if (btf.s.a(c()) != btc.UNKNOWN) {
            this.x = btq.a(c(), btf);
            if (this.x != null) {
                this.x.a(btf);
                if (this.x.a()) {
                    this.u.setVisibility(0);
                    this.u.addView((View) this.x);
                } else {
                    ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.a.getContext()).inflate(ba.hs, this.v, false);
                    viewGroup.addView((View) this.x);
                    this.v.setVisibility(0);
                    this.v.addView(viewGroup);
                }
            } else {
                glk.d("Babel_MsgList", "Attachment type %s not handled", Integer.valueOf(r1.ordinal()));
            }
        }
        for (URLSpan url : (URLSpan[]) this.j.getSpans(0, this.j.length(), URLSpan.class)) {
            String url2 = url.getURL();
            if (bxl.b(url2)) {
                View bxl = new bxl(c());
                bxl.a(b(), url2);
                this.v.setVisibility(0);
                this.v.addView(bxl);
            }
        }
        if (!TextUtils.isEmpty(this.e.f) || this.u.getVisibility() == 0) {
            this.n.setVisibility(0);
            if (this.o != null) {
                this.o.setVisibility(0);
            }
        } else {
            this.n.setVisibility(8);
            if (this.o != null) {
                this.o.setVisibility(8);
            }
        }
        if (this.g && this.e.u.a) {
            i = gwb.kd;
            i2 = 4;
        } else if (this.g && !this.e.u.a) {
            i = gwb.ke;
            i2 = 4;
        } else if (this.g || !this.e.u.a) {
            i = gwb.kc;
            i2 = 4;
        } else {
            i = gwb.kb;
            i2 = 0;
        }
        if (this.p != null) {
            this.p.setVisibility(i2);
        }
        this.n.setBackgroundResource(i);
        if (this.e.k && this.g) {
            i3 = ba.hg;
            i = ba.ho;
            i2 = ba.hk;
        } else if (this.e.k && !this.g) {
            i3 = ba.he;
            i = ba.hm;
            i2 = ba.hi;
        } else if (this.e.k || !this.g) {
            i3 = ba.hd;
            i = ba.hl;
            i2 = ba.hh;
        } else {
            i3 = ba.hf;
            i = ba.hn;
            i2 = ba.hj;
        }
        this.n.getBackground().setColorFilter(ia.c(c(), i3), Mode.SRC_IN);
        this.l.setTextColor(ia.c(c(), i));
        this.l.setLinkTextColor(ia.c(c(), i2));
        i();
        j();
        k();
        l();
        h();
    }

    public void b(btf btf) {
        c(btf);
        j();
        k();
        l();
        i();
        if (this.x != null) {
            this.x.b(btf);
        }
        h();
    }

    public CharSequence e() {
        int i = 0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        List arrayList = new ArrayList();
        for (int i2 = 0; i2 < this.v.getChildCount(); i2++) {
            arrayList.add(this.v.getChildAt(i2).getContentDescription());
        }
        while (i < this.u.getChildCount()) {
            arrayList.add(this.u.getChildAt(i).getContentDescription());
            i++;
        }
        if (!TextUtils.isEmpty(this.l.getText())) {
            arrayList.add(this.l.getText());
        }
        arrayList.add(this.q.getText());
        gld.a(c(), spannableStringBuilder, arrayList);
        return spannableStringBuilder;
    }

    boolean f() {
        return this.c.e() == 1;
    }

    private void i() {
        if (this.p != null && this.p.getVisibility() == 0 && !this.g && this.f != null) {
            String str;
            String d = this.c.k().d(this.f.b);
            if (f()) {
                str = this.f.e;
            } else {
                str = this.c.k().e(this.f.b);
            }
            this.p.a(d, str, b());
            this.p.setOnClickListener(new bvx(this));
        }
    }

    public void g() {
        Object b = this.f.b();
        String str = this.i;
        if (this.e.o == 2) {
            b = null;
            CharSequence f = this.f.f();
        } else {
            Object obj = str;
        }
        String e = this.c.k().e(this.f.b);
        if (TextUtils.isEmpty(b) && TextUtils.isEmpty(f)) {
            glk.d("Babel_MsgList", "Not showing SmartProfile from conversation because there's no personId", new Object[0]);
            Toast.makeText(c(), ba.iq, 0).show();
            return;
        }
        fxa fxa = (fxa) jyn.a(c(), fxa.class);
        if (TextUtils.isEmpty(b)) {
            fxa.b(c(), this.a, f, e, this.p.a());
        } else {
            fxa.a(c(), this.a, b, e, this.p.a());
        }
        gwb.a(b(), 2141);
    }

    private void j() {
        if (this.e.h == fwx.FAILED_TO_SEND) {
            if (this.r != null) {
                this.r.setVisibility(0);
            }
        } else if (this.r != null) {
            this.r.setVisibility(8);
        }
    }

    private void k() {
        if (this.e.h == fwx.FAILED_TO_SEND) {
            a(new bwc(this));
        } else {
            a(null);
        }
        btl btl = (btl) jyn.b(c(), btl.class);
        if (btl != null) {
            a(btl.a());
        }
    }

    private void a(OnClickListener onClickListener) {
        boolean z;
        boolean z2 = true;
        LinearLayoutEx linearLayoutEx = (LinearLayoutEx) ((ViewGroup) this.b.findViewById(bm.t)).getChildAt(0);
        linearLayoutEx.setOnClickListener(onClickListener);
        if (onClickListener != null) {
            z = true;
        } else {
            z = false;
        }
        linearLayoutEx.a(z);
        if (onClickListener == null) {
            z2 = false;
        }
        linearLayoutEx.setClickable(z2);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void l() {
        /*
        r11 = this;
        r10 = 2;
        r1 = 1;
        r3 = 8;
        r2 = 0;
        r0 = r11.e;
        r0 = r0.t;
        r0 = r0.i;
        if (r0 != r10) goto L_0x0025;
    L_0x000d:
        r0 = r1;
    L_0x000e:
        r4 = bvy.a;
        r5 = r11.e;
        r5 = r5.h;
        r5 = r5.ordinal();
        r4 = r4[r5];
        switch(r4) {
            case 1: goto L_0x0027;
            case 2: goto L_0x0034;
            case 3: goto L_0x003e;
            case 4: goto L_0x0042;
            case 5: goto L_0x0046;
            case 6: goto L_0x0108;
            default: goto L_0x001d;
        };
    L_0x001d:
        r0 = r11.m;
        if (r1 == 0) goto L_0x0161;
    L_0x0021:
        r0.setVisibility(r2);
        return;
    L_0x0025:
        r0 = r2;
        goto L_0x000e;
    L_0x0027:
        if (r0 == 0) goto L_0x0030;
    L_0x0029:
        r0 = ba.hH;
        r4 = r11;
    L_0x002c:
        r4.a(r0, r3, r3);
        goto L_0x001d;
    L_0x0030:
        r0 = ba.hJ;
        r4 = r11;
        goto L_0x002c;
    L_0x0034:
        if (r0 == 0) goto L_0x003a;
    L_0x0036:
        r0 = ba.hH;
        r4 = r11;
        goto L_0x002c;
    L_0x003a:
        r0 = ba.hK;
        r4 = r11;
        goto L_0x002c;
    L_0x003e:
        r0 = ba.hL;
        r4 = r11;
        goto L_0x002c;
    L_0x0042:
        r0 = ba.hI;
        r4 = r11;
        goto L_0x002c;
    L_0x0046:
        if (r0 == 0) goto L_0x004c;
    L_0x0048:
        r0 = ba.io;
        r4 = r11;
        goto L_0x002c;
    L_0x004c:
        r0 = r11.e;
        r0 = r0.t;
        r0 = r0.h;
        r4 = 64;
        if (r0 != r4) goto L_0x005c;
    L_0x0056:
        r0 = ba.iA;
        r11.a(r0, r3, r2);
        goto L_0x001d;
    L_0x005c:
        r4 = glj.a();
        r6 = new java.lang.StringBuilder;
        r6.<init>();
        r0 = r11.f;
        if (r0 == 0) goto L_0x008d;
    L_0x0069:
        r0 = r11.g;
        if (r0 != 0) goto L_0x008d;
    L_0x006d:
        r0 = r11.f();
        if (r0 != 0) goto L_0x008d;
    L_0x0073:
        r0 = r11.c();
        r7 = r11.f;
        r0 = gwb.a(r0, r7, r1);
        r6.append(r0);
        r0 = r11.d();
        r7 = ba.hY;
        r0 = r0.getText(r7);
        r6.append(r0);
    L_0x008d:
        r0 = r11.e;
        r8 = r0.b();
        r0 = glj.b(r8, r4, r2);
        r6.append(r0);
        r0 = " ";
        r6.append(r0);
        r0 = r11.e;
        r0 = r0.l;
        if (r0 != 0) goto L_0x00dd;
    L_0x00a5:
        r0 = r11.g;
        if (r0 == 0) goto L_0x00dd;
    L_0x00a9:
        r0 = r1;
    L_0x00aa:
        r4 = r11.e;
        r4 = r4.o;
        if (r4 != r10) goto L_0x00e2;
    L_0x00b0:
        r0 = r11.b();
        if (r0 == 0) goto L_0x00df;
    L_0x00b6:
        r0 = r11.b();
        r0 = r0.M();
        if (r0 == 0) goto L_0x00df;
    L_0x00c0:
        r0 = ba.iT;
    L_0x00c2:
        if (r0 != 0) goto L_0x00fd;
    L_0x00c4:
        r0 = "";
    L_0x00c6:
        r6.append(r0);
        r0 = r11.e;
        r0 = r0.t;
        r0 = r0.h;
        if (r0 != 0) goto L_0x0106;
    L_0x00d1:
        r0 = r2;
    L_0x00d2:
        r11.a(r6, r0, r3);
        r0 = r11.e;
        r0 = r0.u;
        r1 = r0.b;
        goto L_0x001d;
    L_0x00dd:
        r0 = r2;
        goto L_0x00aa;
    L_0x00df:
        r0 = ba.iQ;
        goto L_0x00c2;
    L_0x00e2:
        r4 = r11.e;
        r4 = r4.t;
        r4 = r4.i;
        if (r4 != 0) goto L_0x00ed;
    L_0x00ea:
        r0 = ba.iS;
        goto L_0x00c2;
    L_0x00ed:
        r4 = r11.e;
        r4 = r4.t;
        r4 = r4.i;
        if (r4 != r1) goto L_0x00f8;
    L_0x00f5:
        r0 = ba.iR;
        goto L_0x00c2;
    L_0x00f8:
        if (r0 == 0) goto L_0x0164;
    L_0x00fa:
        r0 = ba.iP;
        goto L_0x00c2;
    L_0x00fd:
        r1 = r11.d();
        r0 = r1.getText(r0);
        goto L_0x00c6;
    L_0x0106:
        r0 = r3;
        goto L_0x00d2;
    L_0x0108:
        r4 = r11.e;
        r4 = r4.p;
        switch(r4) {
            case 123: goto L_0x0116;
            case 124: goto L_0x011b;
            case 125: goto L_0x0120;
            case 126: goto L_0x0125;
            case 127: goto L_0x012a;
            case 128: goto L_0x0143;
            case 129: goto L_0x0139;
            case 130: goto L_0x0148;
            case 131: goto L_0x0152;
            case 132: goto L_0x012f;
            case 133: goto L_0x013e;
            case 134: goto L_0x0134;
            case 135: goto L_0x014d;
            case 136: goto L_0x0157;
            default: goto L_0x010f;
        };
    L_0x010f:
        if (r0 == 0) goto L_0x015c;
    L_0x0111:
        r0 = ba.ir;
        r4 = r11;
        goto L_0x002c;
    L_0x0116:
        r0 = ba.ij;
        r4 = r11;
        goto L_0x002c;
    L_0x011b:
        r0 = ba.in;
        r4 = r11;
        goto L_0x002c;
    L_0x0120:
        r0 = ba.id;
        r4 = r11;
        goto L_0x002c;
    L_0x0125:
        r0 = ba.ik;
        r4 = r11;
        goto L_0x002c;
    L_0x012a:
        r0 = ba.ih;
        r4 = r11;
        goto L_0x002c;
    L_0x012f:
        r0 = ba.ia;
        r4 = r11;
        goto L_0x002c;
    L_0x0134:
        r0 = ba.ib;
        r4 = r11;
        goto L_0x002c;
    L_0x0139:
        r0 = ba.ic;
        r4 = r11;
        goto L_0x002c;
    L_0x013e:
        r0 = ba.if;
        r4 = r11;
        goto L_0x002c;
    L_0x0143:
        r0 = ba.ig;
        r4 = r11;
        goto L_0x002c;
    L_0x0148:
        r0 = ba.ii;
        r4 = r11;
        goto L_0x002c;
    L_0x014d:
        r0 = ba.il;
        r4 = r11;
        goto L_0x002c;
    L_0x0152:
        r0 = ba.im;
        r4 = r11;
        goto L_0x002c;
    L_0x0157:
        r0 = ba.ie;
        r4 = r11;
        goto L_0x002c;
    L_0x015c:
        r0 = ba.is;
        r4 = r11;
        goto L_0x002c;
    L_0x0161:
        r2 = r3;
        goto L_0x0021;
    L_0x0164:
        r0 = r2;
        goto L_0x00c2;
        */
        throw new UnsupportedOperationException("Method not decompiled: bvu.l():void");
    }

    private void a(CharSequence charSequence, int i, int i2) {
        this.s.setVisibility(i);
        this.t.setVisibility(i2);
        this.q.setText(charSequence);
    }

    private void a(int i, int i2, int i3) {
        a(d().getString(i), 8, i3);
    }
}
