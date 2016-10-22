package com.google.android.apps.hangouts.views;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.PorterDuff.Mode;
import android.os.Handler;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ba;
import bbw;
import bc;
import bko;
import com.google.android.apps.hangouts.R$drawable;
import cpw;
import daq;
import dto;
import dtp;
import dw;
import dye;
import dyf;
import dyg;
import edk;
import edo;
import fwx;
import fwy;
import fyi;
import fyj;
import gld;
import glj;
import glq;
import gob;
import gph;
import gpi;
import gpm;
import gpn;
import gpo;
import gpp;
import gpq;
import gpr;
import gpt;
import gpu;
import gpv;
import gqa;
import gqb;
import gqz;
import grf;
import gwb;
import iil;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import jyn;
import meu;
import wi;

public class MessageListItemView extends LinearLayout implements OnClickListener, OnLongClickListener, dyg, grf {
    private static boolean k;
    private static String l;
    private static String m;
    private static String n;
    private static String o;
    private static String p;
    private String A;
    private CharSequence B;
    private String C;
    private ViewGroup D;
    private LinearLayout E;
    private List<dye> F;
    private List<dye> G;
    private boolean H;
    private Set<dye> I;
    private boolean J;
    private boolean K;
    private boolean L;
    private MessageBubbleView M;
    private FrameLayout N;
    private AccessibilityManager O;
    private CharSequence P;
    private final Runnable Q;
    private final Runnable R;
    private int S;
    private boolean T;
    private fwx U;
    private String V;
    private Spanned W;
    public MessageStatusView a;
    private CharSequence aa;
    private String ab;
    private String ac;
    private int ad;
    private String ae;
    private int af;
    private int ag;
    private int ah;
    private long ai;
    private long aj;
    private String ak;
    private String al;
    private int am;
    private String an;
    private String ao;
    private Handler ap;
    private ArrayList<fyj> aq;
    private cpw ar;
    public AvatarView b;
    public daq c;
    public long d;
    public String e;
    public boolean f;
    public String g;
    public String h;
    public bko i;
    public boolean j;
    private TextView q;
    private edo r;
    private int s;
    private String t;
    private String u;
    private long v;
    private gph w;
    private ImageView x;
    private LinearLayout y;
    private String z;

    public MessageListItemView(Context context) {
        this(context, null);
    }

    public MessageListItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.I = new HashSet();
        this.K = false;
        this.L = true;
        this.Q = new gpm(this);
        this.R = new gpn(this);
        this.S = 0;
        this.T = false;
        this.f = false;
        this.j = false;
        this.O = (AccessibilityManager) context.getSystemService("accessibility");
        if (!k) {
            Resources resources = getContext().getApplicationContext().getResources();
            l = resources.getString(bc.tO);
            m = resources.getString(bc.tR);
            n = resources.getString(bc.tQ);
            o = resources.getString(bc.tP);
            p = resources.getString(bc.tC);
            k = true;
        }
    }

    public void a(gph gph) {
        this.w = gph;
    }

    public void a(daq daq) {
        this.c = daq;
    }

    public boolean c() {
        return this.U == fwx.SENDING;
    }

    public boolean d() {
        return this.U == fwx.ON_SERVER;
    }

    private void a(boolean z, boolean z2, boolean z3) {
        int i;
        if (z2 && z) {
            i = gwb.dT;
        } else if (z2 && !z) {
            i = gwb.dR;
        } else if (z2 || !z) {
            i = gwb.dQ;
        } else {
            i = gwb.dS;
        }
        i = getResources().getColor(i);
        if (z) {
            if (z3) {
                this.M.setBackgroundResource(R$drawable.bG);
            } else {
                this.M.setBackgroundResource(R$drawable.bH);
            }
        } else if (z3) {
            this.M.setBackgroundResource(R$drawable.bE);
        } else {
            this.M.setBackgroundResource(R$drawable.bF);
        }
        this.M.getBackground().setColorFilter(i, Mode.SRC_IN);
    }

    public void onClick(View view) {
        if (this.w != null) {
            if (h()) {
                this.w.c(this.s);
            } else if (view == this.b && !this.J) {
                e();
            }
        }
    }

    public void e() {
        String str = null;
        String str2 = this.r == null ? null : this.r.a;
        String str3 = this.al;
        if (this.af != 2 || this.c.Z() == null) {
            str = str2;
            str2 = str3;
        } else {
            str2 = this.c.Z().f();
        }
        new gpo(this, str, str2).b(new Void[0]);
    }

    public CharSequence f() {
        return this.W;
    }

    public String g() {
        return this.V;
    }

    private void b(String str) {
        int i = 0;
        this.V = str;
        if (TextUtils.isEmpty(str)) {
            this.W = new SpannedString("");
            return;
        }
        if (str.charAt(str.length() - 1) == '\u00a0') {
            int length = str.length() - 2;
            while (length >= 0 && str.charAt(length) == '\u00a0') {
                length--;
            }
            str = str.substring(0, length + 1);
        }
        if (this.ag == 0 || this.ag == 1) {
            i = 1;
        }
        if (i == 0) {
            this.W = gwb.o(str);
        } else if (TextUtils.isEmpty(this.ak)) {
            this.W = new SpannedString(str);
        } else {
            this.W = new SpannedString(fyi.a(this.ak, (CharSequence) str));
        }
        this.W = gwb.a(getContext(), this.W, 7);
    }

    public void onFinishInflate() {
        this.M = (MessageBubbleView) findViewById(ba.ds);
        this.N = (FrameLayout) findViewById(ba.C);
        this.a = (MessageStatusView) findViewById(ba.dw);
        this.E = (LinearLayout) findViewById(ba.dP);
        this.x = (ImageView) findViewById(ba.bh);
        this.y = (LinearLayout) findViewById(ba.dr);
        this.b = (AvatarView) findViewById(ba.D);
        if (this.b != null) {
            this.b.setClickable(true);
            this.b.setOnClickListener(this);
            this.b.setLongClickable(true);
            this.b.setOnLongClickListener(this);
        }
        this.q = (TextView) this.M.findViewById(ba.dq);
        M();
        this.D = (ViewGroup) this.M.findViewById(ba.t);
    }

    private boolean G() {
        return this.O != null && this.O.isEnabled() && this.O.isTouchExplorationEnabled();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.j) {
            return false;
        }
        this.j = false;
        return true;
    }

    public boolean h() {
        return (this.J && daq.a(this.U)) || this.ag == 2;
    }

    private void H() {
        if (!TextUtils.isEmpty(f())) {
            this.M.setVisibility(0);
        }
        CharSequence f = f();
        CharSequence a = gob.a(getContext()).a(f, null, this.q);
        if (a != null) {
            f = a;
        }
        if (!h() && (f instanceof Spanned) && ((URLSpan[]) ((Spanned) f).getSpans(0, f.length() - 1, URLSpan.class)).length > 0) {
            this.q.setMovementMethod(LinkMovementMethod.getInstance());
        }
        this.q.setText(f);
        this.q.setTextColor(I());
        gqb gqb = new gqb(this.q);
        for (gqa a2 : jyn.c(getContext(), gqa.class)) {
            a2.a(this.u, this.t, gqb);
        }
    }

    private int I() {
        if (this.K) {
            if (this.J) {
                return getResources().getColor(gwb.ek);
            }
            return getResources().getColor(gwb.ei);
        } else if (this.J) {
            return getResources().getColor(gwb.ej);
        } else {
            return getResources().getColor(gwb.eh);
        }
    }

    private boolean J() {
        return this.J || this.ad == 1;
    }

    private void a(String str, String str2, String str3, String str4) {
        int i = 1;
        int i2 = 0;
        if (TextUtils.isEmpty(str)) {
            this.a.b.setVisibility(8);
        } else {
            this.a.b.setText(gld.d(str));
            this.a.b.setVisibility(0);
        }
        CharSequence a = a(str2, str4);
        int i3;
        if (TextUtils.isEmpty(str)) {
            i3 = 0;
        } else {
            i3 = 1;
        }
        if (TextUtils.isEmpty(a)) {
            i = 0;
        }
        TextView textView = this.a.c;
        if (i == 0 || r0 == 0) {
            i2 = 8;
        }
        textView.setVisibility(i2);
        this.a.d.setText(a);
        this.a.d.setContentDescription(a(str3, str4));
    }

    private String a(String str, String str2) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (isEmpty && isEmpty2) {
            return "";
        }
        if (isEmpty) {
            return getResources().getString(bc.K, new Object[]{str2});
        } else if (isEmpty2) {
            return getResources().getString(bc.I, new Object[]{str});
        } else {
            return getResources().getString(bc.J, new Object[]{str, str2});
        }
    }

    private void a(int i, String str, String str2, String str3) {
        a(this.a.b.getContext().getString(i), null, null, null);
    }

    public void i() {
        c(getResources().getString(bc.cF));
    }

    public void j() {
        c(getResources().getString(bc.cC));
    }

    private void c(String str) {
        this.a.g.setText(str);
        if (!this.T) {
            this.T = true;
            this.a.a.setVisibility(8);
            this.a.h.setVisibility(8);
            this.a.f.setVisibility(0);
            this.a.g.a(1.0f);
            this.a.g.setAlpha(1.0f);
        }
        a(this.aa, this.ab, (CharSequence) str);
    }

    public void a(boolean z) {
        if (this.S != 0) {
            if (z) {
                this.S = 2;
            }
            switch (this.S) {
                case wi.j /*1*/:
                    this.a.f.setVisibility(8);
                    this.a.g.a(0.0f);
                    break;
                case wi.l /*2*/:
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "sendingStatusShrinkPercentage", new float[]{1.0f, 0.0f});
                    ofFloat.setDuration((long) getResources().getInteger(gwb.fC));
                    ofFloat.setInterpolator(new bbw());
                    ofFloat.addListener(new gpp(this));
                    ofFloat.start();
                    break;
            }
            this.S = 0;
        }
    }

    public void a(String str, String str2, bko bko) {
        if (this.b != null) {
            this.b.a(str, str2, bko);
        }
    }

    public void k() {
        if (this.F != null) {
            for (dye b_ : this.F) {
                b_.b_();
            }
        }
        if (this.G != null) {
            for (dye b_2 : this.G) {
                b_2.b_();
            }
        }
    }

    public void l() {
        if (this.F != null) {
            for (dye c_ : this.F) {
                c_.c_();
            }
        }
        if (this.G != null) {
            for (dye c_2 : this.G) {
                c_2.c_();
            }
        }
    }

    private void K() {
        if (this.t != null && this.u != null) {
            for (gqa a : jyn.c(getContext(), gqa.class)) {
                a.a(this.u, this.t);
            }
        }
    }

    public void m() {
        K();
        if (this.q != null) {
            CharSequence text = this.q.getText();
            if (text != null && ((text instanceof SpannableString) || (text instanceof SpannedString))) {
                gob.a(getContext()).a((Spanned) text);
            }
            this.q.setText(null);
            this.q.setMovementMethod(null);
            b(null);
            this.q.setVisibility(0);
        }
        this.M.setVisibility(8);
        a(this.a.b);
        a(this.a.d);
        this.a.f.clearAnimation();
        this.S = 0;
        this.ak = null;
        this.ai = 0;
        this.ah = 0;
        this.r = null;
        this.e = null;
        this.ac = null;
        this.ad = 0;
        this.L = true;
        this.f = false;
        b(false);
        this.I.clear();
        this.al = null;
        this.aj = 0;
        this.g = null;
        this.am = -1;
        this.r = null;
        this.z = null;
        this.B = null;
        L();
        A();
    }

    private void L() {
        this.H = false;
        a(this.F, this.D);
        a(this.G, this.E);
        if (this.F != null && this.F.isEmpty()) {
            this.F = null;
        }
        if (this.G != null && this.G.isEmpty()) {
            this.G = null;
        }
    }

    private void a(List<dye> list, ViewGroup viewGroup) {
        if (list != null) {
            int i = 0;
            while (i < list.size()) {
                dye dye = (dye) list.get(i);
                if (this.I.contains(dye)) {
                    i++;
                } else {
                    list.remove(i);
                    dye.p_();
                    viewGroup.removeView((View) dye);
                }
            }
            if (list.isEmpty()) {
                viewGroup.setVisibility(8);
            }
        }
    }

    private static void a(TextView textView) {
        if (textView != null) {
            textView.setText(null);
        }
    }

    private void a(CharSequence charSequence, String str, CharSequence charSequence2) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            str2 = str;
        } else if (this.B == null) {
            str2 = "";
        } else {
            str2 = this.B.toString();
        }
        this.aa = charSequence;
        this.ab = str2;
        List arrayList = new ArrayList();
        CharSequence text = this.q.getText();
        arrayList.add(str2);
        if ("hangouts/gv_voicemail".equals(this.ao)) {
            Object g;
            String str3 = "";
            for (dye dye : this.F) {
                if (dye instanceof AudioAttachmentView) {
                    g = ((AudioAttachmentView) dye).g();
                    break;
                }
            }
            str2 = str3;
            arrayList.add(getContext().getText(bc.ux));
            arrayList.add(g);
            arrayList.add(text);
        } else {
            arrayList.add(text);
            if (this.U == fwx.FAILED_TO_SEND) {
                arrayList.add(charSequence);
            } else {
                arrayList.add(getContext().getString(bc.gq, new Object[]{charSequence}));
            }
            arrayList.add(charSequence2);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (gwb.a(getContext(), "babel_can_append_spannable", true)) {
            gld.a(spannableStringBuilder, arrayList);
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            gld.a(stringBuilder, arrayList);
            spannableStringBuilder.append(stringBuilder);
            Linkify.addLinks(spannableStringBuilder, 7);
        }
        this.P = spannableStringBuilder;
        setContentDescription(this.P);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.P != null) {
            accessibilityNodeInfo.setText(this.P);
        }
    }

    private void M() {
        Resources resources = getResources();
        TextView textView;
        int color;
        if (this.K) {
            textView = this.q;
            if (this.J) {
                color = resources.getColor(gwb.eg);
            } else {
                color = resources.getColor(gwb.ee);
            }
            textView.setLinkTextColor(color);
        } else {
            textView = this.q;
            if (this.J) {
                color = resources.getColor(gwb.ef);
            } else {
                color = resources.getColor(gwb.ed);
            }
            textView.setLinkTextColor(color);
        }
        requestLayout();
        a(this.J, this.K, this.L);
    }

    public void a(Cursor cursor, int i, bko bko, daq daq, boolean z) {
        String str;
        String str2;
        int i2;
        String string;
        CharSequence text;
        CharSequence text2;
        this.i = bko;
        this.s = cursor.getPosition();
        this.aq = null;
        boolean z2 = cursor.getLong(19) != 0;
        boolean z3 = cursor.getInt(8) == fwy.OUTGOING_USER_MESSAGE.ordinal();
        Object string2 = cursor.getString(1);
        Object string3 = cursor.getString(2);
        if (!(TextUtils.equals(string2, this.t) && TextUtils.equals(string3, this.u))) {
            m();
            this.t = string2;
            this.u = string3;
        }
        this.ap = daq.aj();
        this.v = cursor.getLong(0);
        this.r = new edo(cursor.getString(4), cursor.getString(3));
        this.am = -1;
        this.an = cursor.getString(24);
        this.ag = cursor.getInt(33);
        boolean z4 = this.ag == 0 || this.ag == 1;
        if (z4) {
            this.ah = cursor.getInt(22);
            this.ai = cursor.getLong(21);
            this.aj = cursor.getLong(23) / 1000;
            this.al = cursor.getString(26);
            string2 = cursor.getString(27);
            if (TextUtils.isEmpty(string2)) {
                str = null;
            } else {
                String[] split = string2.split(",");
                if (split.length == 0) {
                    str = null;
                } else {
                    Iterable arrayList = new ArrayList(split.length);
                    for (String i3 : split) {
                        arrayList.add(glq.i(gwb.H(), i3));
                    }
                    str = meu.a(", ").a(arrayList);
                }
            }
            this.g = str;
            if (this.ag == 0 && this.J) {
                this.am = cursor.getInt(29);
            }
            CharSequence b = fyi.b(getContext(), cursor.getString(25));
            if (!TextUtils.equals(b, this.ak)) {
                this.ak = b;
            }
            if (TextUtils.isEmpty(b)) {
                str = null;
            } else {
                String valueOf = String.valueOf(getContext().getApplicationContext().getResources().getString(bc.ro));
                str = String.valueOf(b);
                str = str.length() != 0 ? valueOf.concat(str) : new String(valueOf);
            }
            str2 = str;
        } else {
            if (this.ag == 2) {
                this.aj = cursor.getLong(23) / 1000;
            }
            str2 = null;
        }
        if (this.af == 2 && this.J) {
            this.h = cursor.getString(2);
        }
        int i4 = cursor.getInt(36);
        if (!(this.K == z2 && this.J == z3 && this.af == i4)) {
            this.K = z2;
            this.J = z3;
            this.af = i4;
            M();
        }
        String string4 = cursor.getString(5);
        this.U = fwx.values()[cursor.getInt(7)];
        if (!TextUtils.equals(string4, g())) {
            b(string4);
            if (TextUtils.isEmpty(g()) && TextUtils.isEmpty(this.ak)) {
                this.q.setVisibility(8);
            } else {
                H();
                a(bko.g(), z);
            }
        }
        string4 = cursor.getString(9);
        String string5 = cursor.getString(10);
        if (string4 != null && string4.contains(fyi.a)) {
            this.aq = fyi.b(string4);
        }
        if (string5 != null && string5.contains(fyi.a)) {
            this.aq = fyi.b(string5);
        }
        str = this.z;
        if (!TextUtils.isEmpty(string5)) {
            this.z = string5;
        } else if (TextUtils.isEmpty(string4)) {
            this.z = "";
        } else {
            this.z = string4;
        }
        CharSequence charSequence = this.C;
        this.C = cursor.getString(30);
        if ((TextUtils.isEmpty(str) || !(str.equals(string5) || str.equals(string4))) && (TextUtils.isEmpty(this.C) || !TextUtils.equals(this.C, charSequence))) {
            string2 = null;
        } else {
            string2 = 1;
        }
        if (string2 == null) {
            L();
        }
        string5 = cursor.getString(20);
        this.ao = string5 == null ? "" : string5;
        edk Z = daq.Z();
        int i5 = cursor.getInt(47);
        if (TextUtils.isEmpty(this.z) && TextUtils.isEmpty(this.C) && !"hangouts/askjane_result".equals(this.ao)) {
            L();
        } else {
            Object obj;
            if (string2 != null && this.G == null && this.F == null) {
                string4 = "Image added with no previous attachment view:";
                str = String.valueOf(this.C);
                if (str.length() != 0) {
                    string4.concat(str);
                } else {
                    str = new String(string4);
                }
                obj = null;
            } else {
                obj = string2;
            }
            if (this.ao.equals("multipart/mixed")) {
                i4 = 0;
                ArrayList arrayList2 = this.aq;
                int size = arrayList2.size();
                i2 = 0;
                while (i2 < size) {
                    int i6 = i2 + 1;
                    fyj fyj = (fyj) arrayList2.get(i2);
                    if (obj != null) {
                        a(i4, fyj.b, fyj.a, null, 0, false, i5);
                        i2 = i6;
                    } else {
                        a(fyj.a, fyj.b, fyj.c, fyj.d, 0, z, bko, daq, z4, null, null, null, 0, null, 0.0d, 0.0d, null, null, cursor.getString(2), 0, null, null, this.U, i5);
                        i4++;
                        i2 = i6;
                    }
                }
            } else {
                string = cursor.getString(31);
                long j = cursor.getLong(32);
                if (obj != null) {
                    boolean z5 = ba.c(string5) || "hangouts/gv_voicemail".equals(string5);
                    a(0, this.ao, this.z, string, j, z5, i5);
                } else {
                    a(this.z, this.ao, cursor.getInt(11), cursor.getInt(12), cursor.getInt(40), z, bko, daq, z4, this.C, cursor.getString(4), string, j, cursor.getString(13), cursor.getDouble(14), cursor.getDouble(15), cursor.getString(16), cursor.getString(17), cursor.getString(2), cursor.getInt(39), cursor.getString(9), cursor.getBlob(41), this.U, i5);
                }
            }
        }
        this.ad = i;
        this.e = daq.f(this.r);
        this.ac = daq.g(this.r);
        if (daq.ai() != 1 || this.J) {
            if (this.J) {
                a(this.ae, this.i.c(), bko);
            } else {
                a(daq.d(this.r), daq.f(this.r), bko);
            }
        } else if (Z != null) {
            a(daq.d(Z.b), Z.e, bko);
        } else {
            a(null, null, bko);
        }
        this.d = cursor.getLong(6) / 1000;
        long a = glj.a();
        String charSequence2 = glj.b(this.d, a, false).toString();
        string = glj.b(this.d, a, true).toString();
        Object obj2 = (cursor.getInt(28) == 0 && cursor.getInt(8) == fwy.OUTGOING_USER_MESSAGE.ordinal()) ? 1 : null;
        i2 = cursor.getInt(37);
        if (!(this.a.b == null || this.a.d == null)) {
            string2 = null;
            Object obj3 = null;
            Object obj4 = this.ag == 2 ? 1 : null;
            switch (gpt.a[this.U.ordinal()]) {
                case wi.j /*1*/:
                case wi.l /*2*/:
                case wi.z /*3*/:
                case wi.h /*4*/:
                    string2 = 1;
                    break;
                case wi.p /*5*/:
                    break;
                case wi.s /*6*/:
                    int i7;
                    z();
                    switch (i2) {
                        case 123:
                            i7 = bc.gS;
                            break;
                        case 124:
                            i7 = bc.gW;
                            break;
                        case 125:
                            i7 = bc.gM;
                            break;
                        case 126:
                            i7 = bc.gT;
                            break;
                        case 127:
                            i7 = bc.gQ;
                            break;
                        case 128:
                            i7 = bc.gP;
                            break;
                        case 129:
                            i7 = bc.gL;
                            break;
                        case 130:
                            i7 = bc.gR;
                            break;
                        case 131:
                            i7 = bc.gV;
                            break;
                        case 132:
                            i7 = bc.gJ;
                            break;
                        case 133:
                            i7 = bc.gO;
                            break;
                        case 134:
                            i7 = bc.gK;
                            break;
                        case 135:
                            i7 = bc.gU;
                            break;
                        case 136:
                            i7 = bc.gN;
                            break;
                        default:
                            if (obj4 == null) {
                                i7 = bc.ih;
                                break;
                            } else {
                                i7 = bc.ig;
                                break;
                            }
                    }
                    a(i7, null, null, null);
                    break;
            }
            if (this.U == fwx.ON_SERVER) {
                z();
            }
            if (obj4 != null) {
                a(bc.gY, null, null, null);
            } else {
                if (J()) {
                    valueOf = null;
                } else {
                    valueOf = this.ac;
                }
                if (this.af == 2) {
                    if (this.i == null || !this.i.M()) {
                        string4 = l;
                    } else {
                        string4 = m;
                    }
                } else if (this.ag == 0) {
                    string4 = n;
                } else if (this.ag == 1) {
                    string4 = o;
                } else if (obj2 != null) {
                    string4 = p;
                } else {
                    string4 = "";
                }
                a(valueOf, charSequence2, string, string4);
                if (this.am == 0) {
                    this.a.e.setVisibility(0);
                } else {
                    if (this.am == 64) {
                        obj2 = 1;
                    } else {
                        obj2 = null;
                    }
                    obj3 = obj2;
                }
            }
            if (string2 != null) {
                switch (gpt.a[this.U.ordinal()]) {
                    case wi.j /*1*/:
                        c(getResources().getString(bc.cE));
                        break;
                    case wi.l /*2*/:
                        if ((glj.a() - this.d < 0 ? 1 : null) == null) {
                            if (obj4 == null) {
                                i();
                                break;
                            } else {
                                j();
                                break;
                            }
                        }
                        c("");
                        z();
                        if (obj4 == null) {
                            this.ap.postDelayed(this.R, 0);
                            break;
                        } else {
                            this.ap.postDelayed(this.Q, 0);
                            break;
                        }
                    case wi.z /*3*/:
                        c(getResources().getString(bc.cG));
                        break;
                    case wi.h /*4*/:
                        c(getResources().getString(bc.cD));
                        break;
                }
            } else if (obj3 != null) {
                this.a.a.setVisibility(8);
                this.a.f.setVisibility(8);
                this.a.h.setVisibility(0);
            } else if (this.T) {
                this.T = false;
                this.a.h.setVisibility(8);
                this.a.d.a(1.0f);
                this.a.a.setVisibility(0);
                this.S = 1;
            } else {
                this.a.h.setVisibility(8);
                this.a.d.a(1.0f);
                this.a.a.setVisibility(0);
            }
        }
        if (this.a.f.getVisibility() == 0 && !TextUtils.isEmpty(this.a.g.getText())) {
            text = this.a.g.getText();
        } else if (!TextUtils.isEmpty(this.a.d.getContentDescription())) {
            text = this.a.d.getContentDescription();
        } else if ("hangouts/gv_voicemail".equals(this.ao)) {
            obj2 = string;
        } else {
            text = this.a.d.getText();
        }
        if (this.a.b.getVisibility() == 0) {
            text2 = this.a.b.getText();
        } else {
            text2 = daq.f(this.r);
        }
        a(text2, str2, text);
        if (h()) {
            if (G()) {
                View view = this;
                do {
                    view = (View) view.getParent();
                    if (view == null) {
                        setOnClickListener(this);
                    }
                } while (!(view instanceof MessageListItemWrapperView));
                view.setOnClickListener(this);
            } else {
                this.M.setOnClickListener(this);
                this.q.setOnClickListener(this);
            }
            this.M.setClickable(true);
        } else {
            this.M.setClickable(false);
        }
        this.M.setLongClickable(true);
        this.q.setClickable(true);
        this.q.setLongClickable(true);
        OnLongClickListener gpq = new gpq(this);
        if (G()) {
            ((View) getParent().getParent()).setOnLongClickListener(gpq);
        } else {
            this.q.setOnLongClickListener(gpq);
        }
        if (this.x != null) {
            ImageView imageView = this.x;
            if (this.U == fwx.FAILED_TO_SEND) {
                obj2 = 1;
            } else {
                obj2 = null;
            }
            imageView.setVisibility(obj2 != null ? 0 : 8);
        }
        if (this.y != null) {
            this.y.setVisibility(this.M.getVisibility() == 0 ? 0 : 8);
        }
        for (gpi a2 : jyn.c(getContext(), gpi.class)) {
            a2.a(bko, this, cursor);
        }
    }

    private void a(int i, String str, String str2, String str3, long j, boolean z, int i2) {
        this.A = str3;
        if (ba.b(str) || ba.d(str) || ba.c(str) || "hangouts/gv_voicemail".equals(str)) {
            dye e;
            dye dye = z ? (dye) this.F.get(i) : (dye) this.G.get(i);
            if (dye instanceof AttachmentViewContainerCardView) {
                e = ((AttachmentViewContainerCardView) dye).e();
            } else {
                e = dye;
            }
            e.a(str2);
            if (e instanceof gpv) {
                ((gpv) e).a(str3, j);
            }
            if (e instanceof gqz) {
                ((gqz) e).a(this.U, i2);
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(java.lang.String r19, java.lang.String r20, int r21, int r22, int r23, boolean r24, bko r25, daq r26, boolean r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, long r31, java.lang.String r33, double r34, double r36, java.lang.String r38, java.lang.String r39, java.lang.String r40, int r41, java.lang.String r42, byte[] r43, fwx r44, int r45) {
        /*
        r18 = this;
        r0 = r30;
        r1 = r18;
        r1.A = r0;
        r5 = r18.getContext();
        r4 = ba.b(r20);
        if (r4 == 0) goto L_0x0081;
    L_0x0010:
        r4 = 0;
        if (r28 == 0) goto L_0x003b;
    L_0x0013:
        if (r42 == 0) goto L_0x003b;
    L_0x0015:
        r6 = "sticker://";
        r0 = r42;
        r6 = r0.startsWith(r6);
        if (r6 != 0) goto L_0x002f;
    L_0x001f:
        r6 = r18.getContext();
        r6 = gwb.i(r6);
        r0 = r42;
        r6 = r0.startsWith(r6);
        if (r6 == 0) goto L_0x003b;
    L_0x002f:
        r4 = r18.getContext();
        r6 = gqw.class;
        r4 = jyn.b(r4, r6);
        r4 = (gqw) r4;
    L_0x003b:
        if (r4 == 0) goto L_0x0062;
    L_0x003d:
        r0 = r18;
        r14 = r0.w;
        r6 = r25;
        r7 = r24;
        r8 = r42;
        r9 = r19;
        r10 = r21;
        r11 = r22;
        r12 = r28;
        r13 = r18;
        r4 = r4.a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14);
        r5 = 1;
        r0 = r18;
        r0.H = r5;
    L_0x005a:
        r5 = 0;
        r6 = 0;
        r0 = r18;
        r0.a(r4, r5, r6);
    L_0x0061:
        return;
    L_0x0062:
        r4 = new gpc;
        r4.<init>(r5);
        r0 = r18;
        r11 = r0.w;
        r5 = r25;
        r6 = r24;
        r7 = r19;
        r8 = r21;
        r9 = r22;
        r10 = r23;
        r12 = r18;
        r13 = r20;
        r14 = r40;
        r4.a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14);
        goto L_0x005a;
    L_0x0081:
        r4 = "hangouts/location";
        r0 = r20;
        r4 = r4.equals(r0);
        if (r4 == 0) goto L_0x00ac;
    L_0x008b:
        r4 = dut.class;
        r4 = jyn.a(r5, r4);
        r4 = (dut) r4;
        r5 = r4.b(r5);
        r6 = r33;
        r7 = r38;
        r8 = r34;
        r10 = r36;
        r12 = r18;
        r5.a(r6, r7, r8, r10, r12);
        r4 = 0;
        r6 = 0;
        r0 = r18;
        r0.a(r5, r4, r6);
        goto L_0x0061;
    L_0x00ac:
        r4 = ba.d(r20);
        if (r4 == 0) goto L_0x0103;
    L_0x00b2:
        if (r27 == 0) goto L_0x00d4;
    L_0x00b4:
        r4 = new grc;
        r4.<init>(r5);
        r5 = r25;
        r6 = r24;
        r7 = r19;
        r8 = r20;
        r9 = r26;
        r10 = r21;
        r11 = r22;
        r12 = r23;
        r4.a(r5, r6, r7, r8, r9, r10, r11, r12);
        r5 = 0;
        r6 = 0;
        r0 = r18;
        r0.a(r4, r5, r6);
        goto L_0x0061;
    L_0x00d4:
        r4 = new gqz;
        r4.<init>(r5);
        r0 = r18;
        r0 = r0.w;
        r16 = r0;
        r5 = r25;
        r6 = r24;
        r7 = r19;
        r8 = r28;
        r9 = r29;
        r10 = r30;
        r11 = r21;
        r12 = r22;
        r13 = r23;
        r14 = r44;
        r15 = r45;
        r17 = r18;
        r4.a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17);
        r5 = 0;
        r6 = 0;
        r0 = r18;
        r0.a(r4, r5, r6);
        goto L_0x0061;
    L_0x0103:
        r4 = ba.c(r20);
        if (r4 == 0) goto L_0x015b;
    L_0x0109:
        r4 = android.view.LayoutInflater.from(r5);
        r5 = gwb.fJ;
        r0 = r18;
        r6 = r0.D;
        r7 = 0;
        r5 = r4.inflate(r5, r6, r7);
        r5 = (com.google.android.apps.hangouts.views.AudioAttachmentView) r5;
        r4 = android.text.TextUtils.isEmpty(r28);
        if (r4 != 0) goto L_0x0153;
    L_0x0120:
        r4 = 1;
    L_0x0121:
        if (r4 == 0) goto L_0x0155;
    L_0x0123:
        r7 = r30;
    L_0x0125:
        if (r4 == 0) goto L_0x0158;
    L_0x0127:
        r8 = r31;
    L_0x0129:
        r16 = r18.I();
        r0 = r18;
        r11 = r0.t;
        r4 = r18.getContext();
        r4 = r4.getResources();
        r6 = bc.x;
        r13 = r4.getString(r6);
        r14 = 0;
        r6 = r25;
        r10 = r28;
        r12 = r20;
        r5.a(r6, r7, r8, r10, r11, r12, r13, r14, r16);
        r4 = 1;
        r6 = 0;
        r0 = r18;
        r0.a(r5, r4, r6);
        goto L_0x0061;
    L_0x0153:
        r4 = 0;
        goto L_0x0121;
    L_0x0155:
        r7 = r19;
        goto L_0x0125;
    L_0x0158:
        r8 = 0;
        goto L_0x0129;
    L_0x015b:
        r4 = "hangouts/gv_voicemail";
        r0 = r20;
        r4 = r4.equals(r0);
        if (r4 == 0) goto L_0x01a5;
    L_0x0165:
        r4 = android.view.LayoutInflater.from(r5);
        r5 = gwb.fJ;
        r0 = r18;
        r6 = r0.D;
        r7 = 0;
        r5 = r4.inflate(r5, r6, r7);
        r5 = (com.google.android.apps.hangouts.views.AudioAttachmentView) r5;
        r16 = r18.I();
        r0 = r18;
        r11 = r0.t;
        r4 = r18.getContext();
        r4 = r4.getResources();
        r6 = bc.ux;
        r13 = r4.getString(r6);
        r0 = r41;
        r14 = (long) r0;
        r6 = r25;
        r7 = r30;
        r8 = r31;
        r10 = r28;
        r12 = r20;
        r5.a(r6, r7, r8, r10, r11, r12, r13, r14, r16);
        r4 = 1;
        r6 = 0;
        r0 = r18;
        r0.a(r5, r4, r6);
        goto L_0x0061;
    L_0x01a5:
        r4 = "hangouts/*";
        r0 = r20;
        r4 = r4.equals(r0);
        if (r4 == 0) goto L_0x01d2;
    L_0x01af:
        r4 = new goj;
        r4.<init>(r5);
        r5 = r25;
        r6 = r24;
        r7 = r19;
        r8 = r21;
        r9 = r22;
        r10 = r23;
        r11 = r39;
        r12 = r26;
        r13 = r33;
        r4.a(r5, r6, r7, r8, r9, r10, r11, r12, r13);
        r5 = 1;
        r6 = 0;
        r0 = r18;
        r0.a(r4, r5, r6);
        goto L_0x0061;
    L_0x01d2:
        r4 = ba.e(r20);
        if (r4 == 0) goto L_0x01ef;
    L_0x01d8:
        r4 = new gqx;
        r4.<init>(r5);
        r0 = r25;
        r1 = r19;
        r2 = r26;
        r4.a(r0, r1, r2);
        r5 = 0;
        r6 = 0;
        r0 = r18;
        r0.a(r4, r5, r6);
        goto L_0x0061;
    L_0x01ef:
        r4 = "hangouts/askjane_result";
        r0 = r20;
        r4 = r4.equals(r0);
        if (r4 == 0) goto L_0x024d;
    L_0x01f9:
        r6 = 0;
        r4 = bef.class;
        r4 = jyn.b(r5, r4);
        r4 = (bef) r4;
        if (r4 == 0) goto L_0x0291;
    L_0x0204:
        r25.g();
        r4 = r4.a();
    L_0x020b:
        if (r4 != 0) goto L_0x0220;
    L_0x020d:
        r4 = 2915; // 0xb63 float:4.085E-42 double:1.44E-320;
        r0 = r25;
        gwb.a(r0, r4);
        r4 = "Babel";
        r5 = "No feature available to render blob data.";
        r6 = 0;
        r6 = new java.lang.Object[r6];
        glk.a(r4, r5, r6);
        goto L_0x0061;
    L_0x0220:
        r25.g();
        r5 = r4.d();
        if (r5 == 0) goto L_0x0244;
    L_0x0229:
        r0 = r18;
        r5 = r0.q;
        r6 = 8;
        r5.setVisibility(r6);
        r0 = r18;
        r5 = r0.M;
        r6 = 8;
        r5.setVisibility(r6);
        r5 = 0;
        r6 = 0;
        r0 = r18;
        r0.a(r4, r5, r6);
        goto L_0x0061;
    L_0x0244:
        r4 = 2915; // 0xb63 float:4.085E-42 double:1.44E-320;
        r0 = r25;
        gwb.a(r0, r4);
        goto L_0x0061;
    L_0x024d:
        r4 = "Babel";
        r5 = new java.lang.StringBuilder;
        r6 = java.lang.String.valueOf(r20);
        r6 = r6.length();
        r6 = r6 + 87;
        r7 = java.lang.String.valueOf(r19);
        r7 = r7.length();
        r6 = r6 + r7;
        r5.<init>(r6);
        r6 = "We do not recognize the contentType ";
        r5 = r5.append(r6);
        r0 = r20;
        r5 = r5.append(r0);
        r6 = " for image url ";
        r5 = r5.append(r6);
        r0 = r19;
        r5 = r5.append(r0);
        r6 = " and are not handling the attachment";
        r5 = r5.append(r6);
        r5 = r5.toString();
        r6 = 0;
        r6 = new java.lang.Object[r6];
        glk.d(r4, r5, r6);
        goto L_0x0061;
    L_0x0291:
        r4 = r6;
        goto L_0x020b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.hangouts.views.MessageListItemView.a(java.lang.String, java.lang.String, int, int, int, boolean, bko, daq, boolean, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, double, double, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, byte[], fwx, int):void");
    }

    private void a(dye dye, boolean z, boolean z2) {
        if (z) {
            this.M.setVisibility(0);
            if (this.F == null) {
                this.F = new ArrayList();
                this.D.setVisibility(0);
            }
            this.D.addView((View) dye);
            this.F.add(dye);
            if (z2) {
                this.I.add(dye);
            }
        } else {
            dyf dyf = (dyf) LayoutInflater.from(getContext()).inflate(gwb.fI, null);
            dyf.a(dye);
            if (this.G == null) {
                this.G = new ArrayList();
                this.E.setVisibility(0);
            }
            this.E.addView((View) dyf);
            this.G.add(dyf);
            if (z2) {
                this.I.add(dyf);
            }
        }
        this.B = ((View) dye).getContentDescription();
    }

    public fyj n() {
        if (this.aq != null) {
            return null;
        }
        if (ba.b(this.ao) || ba.d(this.ao)) {
            return N();
        }
        return null;
    }

    private fyj N() {
        fyj fyj = new fyj();
        if (TextUtils.isEmpty(this.A)) {
            fyj.a = this.z;
        } else {
            fyj.a = this.A;
        }
        fyj.b = this.ao;
        return fyj;
    }

    public List<fyj> o() {
        if (this.aq != null) {
            return this.aq;
        }
        List<fyj> arrayList = new ArrayList();
        arrayList.add(N());
        return arrayList;
    }

    public boolean p() {
        return (this.H || TextUtils.isEmpty(this.ao) || !ba.g(this.ao)) ? false : true;
    }

    public int q() {
        if (this.aq != null) {
            return this.aq.size();
        }
        if (TextUtils.isEmpty(this.z)) {
            return 0;
        }
        return 1;
    }

    public int r() {
        return this.ag;
    }

    public int s() {
        return this.af;
    }

    public String t() {
        return this.an;
    }

    public int u() {
        return this.s;
    }

    public void v() {
        if (this.F != null) {
            for (dye d_ : this.F) {
                d_.d_();
            }
        }
        if (this.G != null) {
            for (dye d_2 : this.G) {
                d_2.d_();
            }
        }
    }

    public long a() {
        return this.d;
    }

    public View b() {
        return this;
    }

    public void b(boolean z) {
        if (!this.f) {
            int i;
            if (this.am == 0) {
                z = false;
            } else if (this.T) {
                z = false;
            }
            this.a.a(z ? 0.0f : 1.0f);
            MessageStatusView messageStatusView = this.a;
            if (z) {
                i = 8;
            } else {
                i = 0;
            }
            messageStatusView.setVisibility(i);
            if (z || this.am != 0) {
                this.a.e.setVisibility(8);
            } else {
                this.a.e.setVisibility(0);
            }
        }
    }

    public void c(boolean z) {
        boolean z2 = true;
        boolean z3 = this.E.getChildCount() > 0;
        if (this.N != null) {
            FrameLayout frameLayout = this.N;
            int i = ((z || z3) && !this.J) ? 0 : 4;
            frameLayout.setVisibility(i);
        }
        if (!z || z3) {
            z2 = false;
        }
        this.L = z2;
        a(this.J, this.K, this.L);
    }

    public void w() {
        if (this.a.getVisibility() != 8 && !this.f && this.am != 0) {
            this.f = true;
            post(new gpr(this));
        }
    }

    public void setSelected(boolean z) {
        this.M.setSelected(z);
    }

    public void a(String str) {
        this.ae = str;
    }

    public boolean x() {
        return this.J;
    }

    public void a(dw dwVar) {
        int i;
        Object[] objArr;
        String str;
        Resources resources;
        switch (this.ag) {
            case -1:
                Resources resources2;
                int i2;
                if (this.af != 2) {
                    edk a;
                    Context context = getContext();
                    resources2 = getContext().getResources();
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(resources2.getString(bc.gB, new Object[]{resources2.getString(bc.fn)}));
                    i2 = this.c.ai() == 1 ? 1 : 0;
                    if (!this.J || i2 == 0) {
                        a = this.c.a(this.r);
                    } else {
                        a = this.c.Z();
                    }
                    if (!(a == null || TextUtils.isEmpty(a.e))) {
                        stringBuilder.append('\n');
                        if (!this.J || i2 == 0) {
                            stringBuilder.append(resources2.getString(bc.cN, new Object[]{a.e}));
                        } else {
                            stringBuilder.append(resources2.getString(bc.sV, new Object[]{a.e}));
                        }
                    }
                    stringBuilder.append('\n');
                    stringBuilder.append(resources2.getString(bc.kh, new Object[]{glj.a(this.d).toString()}));
                    ba.a(context, stringBuilder.toString());
                } else if (this.J) {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    resources2 = getContext().getResources();
                    i = bc.gB;
                    objArr = new Object[1];
                    Resources resources3 = getContext().getResources();
                    if (this.i.M()) {
                        i2 = bc.ti;
                    } else {
                        i2 = bc.cW;
                    }
                    objArr[0] = resources3.getString(i2);
                    stringBuilder2.append(resources2.getString(i, objArr));
                    if (this.g != null) {
                        ba.a(getContext(), stringBuilder2, this.d, null, this.g);
                        return;
                    }
                    boolean z;
                    str = "Outbound GV SMS messages must have a Conversation ID";
                    if (TextUtils.isEmpty(this.h)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    iil.a(str, z);
                    dwVar.f().b(1, null, new gpu(this, getContext(), stringBuilder2)).v();
                } else {
                    StringBuilder stringBuilder3 = new StringBuilder();
                    resources = getContext().getResources();
                    int i3 = bc.gB;
                    Object[] objArr2 = new Object[1];
                    Resources resources4 = getContext().getResources();
                    if (this.i.M()) {
                        i2 = bc.ti;
                    } else {
                        i2 = bc.cW;
                    }
                    objArr2[0] = resources4.getString(i2);
                    stringBuilder3.append(resources.getString(i3, objArr2));
                    this.al = this.c.a(this.r).f();
                    ba.a(getContext(), stringBuilder3, this.d, this.al, null);
                }
            case wi.w /*0*/:
                Context context2 = getContext();
                resources = getContext().getResources();
                StringBuilder stringBuilder4 = new StringBuilder();
                stringBuilder4.append(resources.getString(bc.gB, new Object[]{resources.getString(bc.sT)}));
                if (this.J) {
                    if (this.g != null) {
                        stringBuilder4.append('\n');
                        stringBuilder4.append(resources.getString(bc.sV, new Object[]{this.g}));
                    }
                } else if (!TextUtils.isEmpty(this.al)) {
                    stringBuilder4.append('\n');
                    stringBuilder4.append(resources.getString(bc.cN, new Object[]{glq.i(gwb.H(), this.al)}));
                }
                if (!(this.J || this.aj == 0)) {
                    stringBuilder4.append('\n');
                    stringBuilder4.append(resources.getString(bc.kh, new Object[]{glj.a(this.aj).toString()}));
                }
                stringBuilder4.append('\n');
                str = glj.a(this.d).toString();
                if (this.J) {
                    stringBuilder4.append(resources.getString(bc.kh, new Object[]{str}));
                } else {
                    stringBuilder4.append(resources.getString(bc.jM, new Object[]{str}));
                }
                ba.a(context2, stringBuilder4.toString());
            case wi.j /*1*/:
                String string;
                Context context3 = getContext();
                Resources resources5 = getContext().getResources();
                StringBuilder stringBuilder5 = new StringBuilder();
                stringBuilder5.append(resources5.getString(bc.gB, new Object[]{resources5.getString(bc.hb)}));
                if (!TextUtils.isEmpty(this.al)) {
                    stringBuilder5.append('\n');
                    if (TextUtils.isEmpty(this.al)) {
                        string = resources5.getString(bc.fq);
                    } else {
                        string = glq.i(gwb.H(), this.al);
                    }
                    stringBuilder5.append(resources5.getString(bc.cN, new Object[]{string}));
                }
                if (this.g != null) {
                    stringBuilder5.append('\n');
                    stringBuilder5.append(resources5.getString(bc.sV, new Object[]{this.g}));
                }
                stringBuilder5.append('\n');
                string = glj.a(this.d).toString();
                if (this.J) {
                    stringBuilder5.append(resources5.getString(bc.kh, new Object[]{string}));
                } else {
                    stringBuilder5.append(resources5.getString(bc.jM, new Object[]{string}));
                }
                if (!TextUtils.isEmpty(fyi.b(getContext(), this.ak))) {
                    stringBuilder5.append('\n');
                    stringBuilder5.append(resources5.getString(bc.ro, new Object[]{this.ak}));
                }
                stringBuilder5.append('\n');
                i = bc.ix;
                objArr = new Object[1];
                switch (this.ah) {
                    case 128:
                        string = resources5.getString(bc.iy);
                        break;
                    case 130:
                        string = resources5.getString(bc.iw);
                        break;
                    default:
                        string = resources5.getString(bc.iz);
                        break;
                }
                objArr[0] = string;
                stringBuilder5.append(resources5.getString(i, objArr));
                if (this.ai > 0) {
                    stringBuilder5.append('\n');
                    stringBuilder5.append(resources5.getString(bc.gz, new Object[]{Long.valueOf(fyi.b(this.ai))}));
                }
                ba.a(context3, stringBuilder5.toString());
            default:
        }
    }

    public long y() {
        return this.v;
    }

    public boolean onLongClick(View view) {
        if (view != this.b || J() || TextUtils.isEmpty(this.ac)) {
            return false;
        }
        this.w.d(this.ac.replaceAll("\\s+", "_"));
        return true;
    }

    public void onDetachedFromWindow() {
        K();
        super.onDetachedFromWindow();
    }

    public void z() {
        if (this.ap != null) {
            this.ap.removeCallbacks(this.Q);
            this.ap.removeCallbacks(this.R);
        }
    }

    public void A() {
        z();
        this.ap = null;
    }

    public void B() {
        this.w.c(u());
    }

    public fwx C() {
        return this.U;
    }

    public String D() {
        return this.u;
    }

    public String E() {
        return this.t;
    }

    public cpw F() {
        return this.ar;
    }

    public void a(cpw cpw) {
        this.ar = cpw;
    }

    private void a(int i, boolean z) {
        Spanned spanned = this.W;
        for (URLSpan url : (URLSpan[]) spanned.getSpans(0, spanned.length(), URLSpan.class)) {
            String url2 = url.getURL();
            for (dto dto : ((dtp) jyn.a(getContext(), dtp.class)).a(getContext())) {
                dye a = dto.a(getContext(), i, z, url2);
                if (a != null) {
                    a(a, false, true);
                    String valueOf = String.valueOf(dto.getClass().getName());
                    new StringBuilder((String.valueOf(valueOf).length() + 22) + String.valueOf(url2).length()).append("LinkHandler ").append(valueOf).append(" handled: ").append(url2);
                    break;
                }
            }
        }
    }
}
