import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.AsyncTask;
import android.telecom.PhoneAccountHandle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.QuickContactBadge;
import android.widget.TextView;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
final class aly extends AsyncTask {
    private /* synthetic */ amv a;
    private /* synthetic */ ala b;
    private /* synthetic */ int c;
    private /* synthetic */ alt d;

    aly(alt alt, amv amv, ala ala, int i) {
        this.d = alt;
        this.a = amv;
        this.b = ala;
        this.c = i;
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            CharSequence string;
            int a = this.d.a(this.a.B);
            if (a != this.b.H) {
                this.a.R = 0;
                amv amv = this.a;
                alt alt = this.d;
                if (a == 0) {
                    string = alt.c.getResources().getString(cob.bp);
                } else if (a == 1) {
                    string = alt.c.getResources().getString(cob.bq);
                } else {
                    string = alt.c.getResources().getString(cob.bo);
                }
                amv.S = string;
            } else {
                this.a.R = 8;
            }
            alt alt2 = this.d;
            amv amv2 = this.a;
            ala ala = this.b;
            a = this.c;
            avl.a();
            if (amv2.T && a == amv2.d()) {
                Integer valueOf;
                CharSequence string2;
                amv2.o.setVisibility(0);
                amv2.A.setVisibility(ala.x == 1 ? 0 : 8);
                amu amu = alt2.h;
                anw anw = amu.a;
                anx anx = amv2.p;
                anx.b.a();
                int length = ala.g.length;
                Object obj2 = null;
                int i = 0;
                while (i < length && i < 3) {
                    anx.b.a(ala.g[i]);
                    if (i == 0) {
                        obj2 = ala.g[i] == 4 ? 1 : null;
                    }
                    i++;
                }
                anx.b.a((ala.t & 1) == 1);
                anx.b.requestLayout();
                anx.b.setVisibility(0);
                if (length > 3) {
                    valueOf = Integer.valueOf(length);
                } else {
                    valueOf = null;
                }
                CharSequence charSequence = ala.B;
                if (valueOf != null) {
                    string2 = anw.b.getString(cob.br, new Object[]{valueOf, charSequence});
                } else {
                    string2 = charSequence;
                }
                if (ala.g[0] != 4 || ala.i <= 0) {
                    anx.c.setText(string2);
                } else {
                    TextView textView = anx.c;
                    Resources resources = anw.b;
                    int i2 = cob.dw;
                    Object[] objArr = new Object[2];
                    objArr[0] = string2;
                    long toMinutes = TimeUnit.SECONDS.toMinutes(ala.i);
                    long toSeconds = ala.i - TimeUnit.MINUTES.toSeconds(toMinutes);
                    if (toMinutes > 99) {
                        toMinutes = 99;
                    }
                    objArr[1] = anw.b.getString(cob.dy, new Object[]{Long.valueOf(toMinutes), Long.valueOf(toSeconds)});
                    textView.setText(resources.getString(i2, objArr));
                }
                string2 = anw.c.a(ala.s);
                if (!TextUtils.isEmpty(ala.c)) {
                    if (TextUtils.isEmpty(string2)) {
                        string2 = anw.b.getString(cob.bv, new Object[]{ala.c});
                    } else {
                        string2 = anw.b.getString(cob.bw, new Object[]{string2, ala.c});
                    }
                }
                if (TextUtils.isEmpty(string2)) {
                    anx.e.setVisibility(8);
                } else {
                    anx.e.setVisibility(0);
                    anx.e.setText(string2);
                    i = anw.c.b(ala.s);
                    if (i == 0) {
                        anx.e.setTextColor(anw.a.getResources().getColor(cob.ae));
                    } else {
                        anx.e.setTextColor(i);
                    }
                }
                string2 = ala.w;
                if (TextUtils.isEmpty(ala.a())) {
                    anx.a.setTextDirection(3);
                } else {
                    string2 = ala.a();
                }
                anx.a.setText(string2);
                if (obj2 != null) {
                    TextView textView2 = anx.d;
                    if (TextUtils.isEmpty(ala.v)) {
                        string = null;
                    } else {
                        string = ala.v;
                    }
                    textView2.setText(string);
                }
                Typeface typeface = ala.y ? Typeface.SANS_SERIF : Typeface.DEFAULT_BOLD;
                anx.a.setTypeface(typeface);
                anx.d.setTypeface(typeface);
                anx.c.setTypeface(typeface);
                anx.c.setTextColor(gd.c(anw.a, ala.y ? cob.Y : cob.aa));
                QuickContactBadge quickContactBadge = amv2.n;
                if (ala.z) {
                    string = amu.b.getString(cob.bP, new Object[]{amu.a(ala)});
                } else {
                    string = amu.b.getString(cob.bG, new Object[]{amu.a(ala)});
                }
                quickContactBadge.setContentDescription(string);
                amv2.o.setContentDescription(ala.C);
                amv2.M = amu.a(ala);
                amv2.N = amu.a.a(ala);
                amv2.I = ala.e;
                amv2.n.assignContactUri(amv2.O.b);
                if (amv2.P && amv2.Q) {
                    amv2.n.setImageDrawable(amv2.s.getDrawable(cob.aj));
                } else {
                    a = 1;
                    if (amv2.t.a(null, amv2.D)) {
                        a = 3;
                    }
                    abc abc = new abc(TextUtils.isEmpty(amv2.O.d) ? amv2.F : amv2.O.d, amv2.O.b != null ? buf.e(amv2.O.b) : null, a, true);
                    if (amv2.O.k != 0 || amv2.O.l == null) {
                        aaz.a(amv2.s).a(amv2.n, amv2.O.k, false, true, abc);
                    } else {
                        aaz.a(amv2.s).a(amv2.n, amv2.O.l, amv2.v, false, true, abc);
                    }
                }
                if (alt2.l == amv2.B) {
                    alt2.k = amv2.d();
                    amv2.b(true);
                } else {
                    amv2.b(false);
                }
                amv2.q.setVisibility(amv2.R);
                amv2.q.setText(amv2.S);
            }
        }
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        this.a.K = this.d.f.a(this.a.D, this.a.I);
        this.b.A = this.a.K != null;
        if (isCancelled()) {
            return Boolean.valueOf(false);
        }
        alt alt;
        amv amv;
        int i;
        ala ala;
        boolean z;
        aws aws;
        aoe aoe;
        String valueOf;
        String stringBuilder;
        String str;
        aws aws2;
        aok aok;
        arp a;
        Object obj;
        CharSequence charSequence;
        amu amu;
        anw anw;
        CharSequence spannableStringBuilder;
        int[] iArr;
        boolean z2;
        if (this.d.q) {
            this.a.P = true;
            this.a.Q = buf.J(this.d.c).a(this.a.D, this.a.I);
            this.b.z = this.a.Q;
            if (isCancelled()) {
                return Boolean.valueOf(false);
            }
            alt = this.d;
            amv = this.a;
            i = this.c;
            ala = this.b;
            avl.b();
            if (i != amv.d()) {
                z = false;
            } else {
                PhoneAccountHandle c = buf.c(ala.D, ala.E);
                boolean a2 = alt.e.a(c, ala.a);
                aws = aws.a;
                if (awy.a(ala.a, ala.d) && !a2) {
                    aoe = alt.i;
                    valueOf = String.valueOf(ala.a);
                    String str2 = ala.b;
                    stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 0) + String.valueOf(str2).length()).append(valueOf).append(str2).toString();
                    str = ala.e;
                    aws2 = ala.F;
                    aok = new aok(stringBuilder, str);
                    a = aoe.b.a(aok);
                    aws = a == null ? null : (aws) a.a();
                    if (a == null) {
                        aoe.b.a(aok, aws.a);
                        aoe.a(stringBuilder, str, aws2, true);
                        aws = aws2;
                    } else {
                        if (a.b()) {
                            aoe.a(stringBuilder, str, aws2, false);
                        } else {
                            if (TextUtils.equals(aws2.d, aws.d) && aws2.f == aws.f && TextUtils.equals(aws2.g, aws.g)) {
                                obj = 1;
                            } else {
                                obj = null;
                            }
                            if (obj == null) {
                                aoe.a(stringBuilder, str, aws2, false);
                            }
                        }
                        if (aws == aws.a) {
                            aws = aws2;
                        }
                    }
                }
                if (aws.i == null) {
                    charSequence = null;
                } else {
                    charSequence = buf.a(aws.i);
                }
                ala.a(alt.c, charSequence, a2);
                amv.F = ala.w;
                ala.s = c;
                if (!(TextUtils.isEmpty(aws.d) && TextUtils.isEmpty(aws.e))) {
                    ala.o = aws.b;
                    ala.j = aws.d;
                    ala.k = aws.e;
                    ala.l = alt.p.b();
                    ala.m = aws.f;
                    ala.n = aws.g;
                    ala.p = aws.l;
                    ala.q = aws.p;
                    ala.r = aws.n;
                    ala.x = aws.o;
                }
                amv.O = aws;
                if (alt.g == 2) {
                    amv.L = awg.a(ala.G).toString();
                }
                amu = alt.h;
                avl.b();
                anw = amu.a;
                anw.d.clear();
                if (ala.g[0] != 4) {
                    charSequence = anw.a(ala);
                    if (!TextUtils.isEmpty(charSequence)) {
                        anw.d.add(charSequence);
                    }
                }
                anw.d.add(anw.b(ala));
                ala.B = buf.a(anw.b, anw.d);
                CharSequence a3 = amu.a(ala);
                charSequence = amu.a.a(ala);
                CharSequence b = amu.a.b(ala);
                spannableStringBuilder = new SpannableStringBuilder();
                if (ala.g.length > 1) {
                    spannableStringBuilder.append(amu.b.getString(cob.bL, new Object[]{Integer.valueOf(ala.g.length)}));
                }
                if ((ala.t & 1) == 1) {
                    spannableStringBuilder.append(amu.b.getString(cob.bT));
                }
                CharSequence a4 = ala.a(amu.b, ala.c, amu.c.a(ala.s));
                iArr = ala.g;
                z2 = ala.y;
                if (iArr.length > 0) {
                    i = iArr[0];
                } else {
                    i = 3;
                }
                if (i == 3) {
                    i = cob.bK;
                } else if (i == 1) {
                    i = cob.bJ;
                } else if (i != 4) {
                    i = cob.bM;
                } else if (z2) {
                    i = cob.bO;
                } else {
                    i = cob.bQ;
                }
                CharSequence string = amu.b.getString(i);
                CharSequence[] charSequenceArr = new CharSequence[4];
                charSequenceArr[0] = a3;
                if (charSequence == null) {
                    valueOf = "";
                } else {
                    CharSequence charSequence2 = charSequence;
                }
                charSequenceArr[1] = valueOf;
                charSequenceArr[2] = b;
                charSequenceArr[3] = a4;
                spannableStringBuilder.append(TextUtils.expandTemplate(string, charSequenceArr));
                ala.C = spannableStringBuilder;
                z = true;
            }
            return Boolean.valueOf(z);
        }
        alt = this.d;
        amv = this.a;
        i = this.c;
        ala = this.b;
        avl.b();
        if (i != amv.d()) {
            z = false;
        } else {
            c = buf.c(ala.D, ala.E);
            a2 = alt.e.a(c, ala.a);
            aws = aws.a;
            if (awy.a(ala.a, ala.d) && !a2) {
                aoe = alt.i;
                valueOf = String.valueOf(ala.a);
                str2 = ala.b;
                stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 0) + String.valueOf(str2).length()).append(valueOf).append(str2).toString();
                str = ala.e;
                aws2 = ala.F;
                aok = new aok(stringBuilder, str);
                a = aoe.b.a(aok);
                aws = a == null ? null : (aws) a.a();
                if (a == null) {
                    aoe.b.a(aok, aws.a);
                    aoe.a(stringBuilder, str, aws2, true);
                    aws = aws2;
                } else {
                    if (a.b()) {
                        aoe.a(stringBuilder, str, aws2, false);
                    } else {
                        if (TextUtils.equals(aws2.d, aws.d) && aws2.f == aws.f && TextUtils.equals(aws2.g, aws.g)) {
                            obj = 1;
                        } else {
                            obj = null;
                        }
                        if (obj == null) {
                            aoe.a(stringBuilder, str, aws2, false);
                        }
                    }
                    if (aws == aws.a) {
                        aws = aws2;
                    }
                }
            }
            if (aws.i == null) {
                charSequence = null;
            } else {
                charSequence = buf.a(aws.i);
            }
            ala.a(alt.c, charSequence, a2);
            amv.F = ala.w;
            ala.s = c;
            if (!(TextUtils.isEmpty(aws.d) && TextUtils.isEmpty(aws.e))) {
                ala.o = aws.b;
                ala.j = aws.d;
                ala.k = aws.e;
                ala.l = alt.p.b();
                ala.m = aws.f;
                ala.n = aws.g;
                ala.p = aws.l;
                ala.q = aws.p;
                ala.r = aws.n;
                ala.x = aws.o;
            }
            amv.O = aws;
            if (alt.g == 2) {
                amv.L = awg.a(ala.G).toString();
            }
            amu = alt.h;
            avl.b();
            anw = amu.a;
            anw.d.clear();
            if (ala.g[0] != 4) {
                charSequence = anw.a(ala);
                if (!TextUtils.isEmpty(charSequence)) {
                    anw.d.add(charSequence);
                }
            }
            anw.d.add(anw.b(ala));
            ala.B = buf.a(anw.b, anw.d);
            a3 = amu.a(ala);
            charSequence = amu.a.a(ala);
            b = amu.a.b(ala);
            spannableStringBuilder = new SpannableStringBuilder();
            if (ala.g.length > 1) {
                spannableStringBuilder.append(amu.b.getString(cob.bL, new Object[]{Integer.valueOf(ala.g.length)}));
            }
            if ((ala.t & 1) == 1) {
                spannableStringBuilder.append(amu.b.getString(cob.bT));
            }
            a4 = ala.a(amu.b, ala.c, amu.c.a(ala.s));
            iArr = ala.g;
            z2 = ala.y;
            if (iArr.length > 0) {
                i = iArr[0];
            } else {
                i = 3;
            }
            if (i == 3) {
                i = cob.bK;
            } else if (i == 1) {
                i = cob.bJ;
            } else if (i != 4) {
                i = cob.bM;
            } else if (z2) {
                i = cob.bO;
            } else {
                i = cob.bQ;
            }
            string = amu.b.getString(i);
            charSequenceArr = new CharSequence[4];
            charSequenceArr[0] = a3;
            if (charSequence == null) {
                valueOf = "";
            } else {
                charSequence2 = charSequence;
            }
            charSequenceArr[1] = valueOf;
            charSequenceArr[2] = b;
            charSequenceArr[3] = a4;
            spannableStringBuilder.append(TextUtils.expandTemplate(string, charSequenceArr));
            ala.C = spannableStringBuilder;
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
