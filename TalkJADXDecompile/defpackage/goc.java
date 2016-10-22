package defpackage;

import android.content.Context;
import android.graphics.Paint.FontMetrics;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.hangouts.R$drawable;
import java.lang.reflect.Field;
import java.util.Arrays;

/* renamed from: goc */
public final class goc extends gob {
    static final Rect c;
    static final Rect d;
    final giz a;
    final FontMetrics b;
    private final SparseIntArray e;
    private final SparseArray<Pair<Integer, Integer>> f;
    private Drawable g;

    static {
        c = new Rect();
        d = new Rect();
    }

    protected goc(Context context) {
        this.b = new FontMetrics();
        this.e = new SparseIntArray();
        for (Field field : R$drawable.class.getFields()) {
            if (field.getName().startsWith("emoji_u")) {
                int i = -1;
                try {
                    i = Integer.parseInt(field.getName().substring(7), 16);
                } catch (NumberFormatException e) {
                    String str = "Babel";
                    String str2 = "Unable to parse resource: ";
                    String valueOf = String.valueOf(field.getName());
                    glk.d(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
                }
                if (i >= 0) {
                    try {
                        this.e.put(i, gwb.a((Integer) field.get(null)));
                    } catch (Throwable e2) {
                        throw new RuntimeException(e2);
                    }
                }
                continue;
            }
        }
        this.a = gjs.a(context.getApplicationContext());
        this.f = new SparseArray();
        this.f.put(127471, new Pair(Integer.valueOf(127477), Integer.valueOf(1041637)));
        this.f.put(127482, new Pair(Integer.valueOf(127480), Integer.valueOf(1041638)));
        this.f.put(127467, new Pair(Integer.valueOf(127479), Integer.valueOf(1041639)));
        this.f.put(127465, new Pair(Integer.valueOf(127466), Integer.valueOf(1041640)));
        this.f.put(127470, new Pair(Integer.valueOf(127481), Integer.valueOf(1041641)));
        this.f.put(127468, new Pair(Integer.valueOf(127463), Integer.valueOf(1041642)));
        this.f.put(127466, new Pair(Integer.valueOf(127480), Integer.valueOf(1041643)));
        this.f.put(127479, new Pair(Integer.valueOf(127482), Integer.valueOf(1041644)));
        this.f.put(127464, new Pair(Integer.valueOf(127475), Integer.valueOf(1041645)));
        this.f.put(127472, new Pair(Integer.valueOf(127479), Integer.valueOf(1041646)));
        this.f.put(49, new Pair(Integer.valueOf(8419), Integer.valueOf(1042478)));
        this.f.put(50, new Pair(Integer.valueOf(8419), Integer.valueOf(1042479)));
        this.f.put(51, new Pair(Integer.valueOf(8419), Integer.valueOf(1042480)));
        this.f.put(52, new Pair(Integer.valueOf(8419), Integer.valueOf(1042481)));
        this.f.put(53, new Pair(Integer.valueOf(8419), Integer.valueOf(1042482)));
        this.f.put(54, new Pair(Integer.valueOf(8419), Integer.valueOf(1042483)));
        this.f.put(55, new Pair(Integer.valueOf(8419), Integer.valueOf(1042484)));
        this.f.put(56, new Pair(Integer.valueOf(8419), Integer.valueOf(1042485)));
        this.f.put(57, new Pair(Integer.valueOf(8419), Integer.valueOf(1042486)));
        this.f.put(48, new Pair(Integer.valueOf(8419), Integer.valueOf(1042487)));
        this.f.put(35, new Pair(Integer.valueOf(8419), Integer.valueOf(1042476)));
    }

    public int a(int i) {
        return this.e.get(i, -1);
    }

    public SpannableString a(CharSequence charSequence, FontMetrics fontMetrics, TextView textView) {
        if (charSequence == null || textView == null) {
            return null;
        }
        FontMetrics fontMetrics2 = textView.getPaint().getFontMetrics();
        return a(charSequence, null, fontMetrics2.descent - fontMetrics2.ascent, textView, false);
    }

    public void a(Spannable spannable, FontMetrics fontMetrics, TextView textView) {
        if (spannable != null && textView != null) {
            FontMetrics fontMetrics2 = textView.getPaint().getFontMetrics();
            a(spannable, spannable, fontMetrics2.descent - fontMetrics2.ascent, textView, false);
        }
    }

    public void a(Spanned spanned) {
        int i = 0;
        if (spanned != null) {
            gof[] gofArr = (gof[]) spanned.getSpans(0, spanned.length(), gof.class);
            int length = gofArr.length;
            while (i < length) {
                gofArr[i].a();
                i++;
            }
        }
    }

    private SpannableString a(CharSequence charSequence, Spannable spannable, float f, View view, boolean z) {
        gof[] gofArr;
        int length;
        CharSequence charSequence2 = null;
        int length2 = charSequence.length();
        int i = (int) f;
        int i2 = 0;
        if (spannable != null) {
            gof[] gofArr2 = (gof[]) spannable.getSpans(0, spannable.length(), gof.class);
            Arrays.sort(gofArr2, new gog(spannable));
            gofArr = gofArr2;
            length = gofArr2.length;
        } else {
            gofArr = null;
            length = 0;
        }
        int i3 = 0;
        int i4 = 0;
        Spannable spannable2 = spannable;
        goe goe = null;
        while (i3 < length2) {
            int codePointAt;
            int a;
            int a2;
            Spannable spannable3;
            CharSequence charSequence3;
            Object obj;
            int i5;
            goe goe2;
            gof gof;
            int i6;
            goe goe3;
            int codePointAt2 = Character.codePointAt(charSequence, i3);
            int charCount = Character.charCount(codePointAt2);
            Pair pair = (Pair) this.f.get(codePointAt2);
            if (pair != null && i3 + charCount < charSequence.length()) {
                codePointAt = Character.codePointAt(charSequence, i3 + charCount);
                if (codePointAt == gwb.a((Integer) pair.first)) {
                    a = gwb.a((Integer) pair.second);
                    codePointAt = Character.charCount(codePointAt) + charCount;
                    a2 = a(a);
                    if (a2 < 0) {
                        if (spannable2 != null) {
                            CharSequence spannableString = new SpannableString(charSequence);
                            spannable3 = spannableString;
                            charSequence3 = spannableString;
                        } else {
                            charSequence3 = charSequence2;
                            spannable3 = spannable2;
                        }
                        obj = 1;
                        if (i2 < length) {
                            if (spannable.getSpanStart(gofArr[i2]) == i3) {
                                if (gofArr[i2].getSource().equals(Integer.toString(a2, 16))) {
                                    spannable.removeSpan(gofArr[i2]);
                                } else {
                                    obj = null;
                                }
                                i5 = i2 + 1;
                                if (i4 > gwb.a(gwb.H(), "babel_emoji_max_per_message", 256)) {
                                    obj = null;
                                }
                                if (obj == null) {
                                    if (goe != null) {
                                        goe2 = new goe(view);
                                    } else {
                                        goe2 = goe;
                                    }
                                    if (this.g == null || this.g.getMinimumHeight() != i) {
                                        this.g = new ColorDrawable(0);
                                        this.g.setBounds(0, 0, (gwb.H().getResources().getDimensionPixelOffset(gwb.eO) * 2) + i, i);
                                    }
                                    gof = new gof(this, this.g, Integer.toString(a2, 16), i, i);
                                    spannable3.setSpan(gof, i3, i3 + codePointAt, 33);
                                    goe2.a(a2, gof);
                                    i6 = i4 + 1;
                                    goe3 = goe2;
                                    i2 = i5;
                                    spannable2 = spannable3;
                                    charSequence2 = charSequence3;
                                } else {
                                    i2 = i5;
                                    goe3 = goe;
                                    spannable2 = spannable3;
                                    i6 = i4;
                                    charSequence2 = charSequence3;
                                }
                            }
                        }
                        i5 = i2;
                        if (i4 > gwb.a(gwb.H(), "babel_emoji_max_per_message", 256)) {
                            obj = null;
                        }
                        if (obj == null) {
                            i2 = i5;
                            goe3 = goe;
                            spannable2 = spannable3;
                            i6 = i4;
                            charSequence2 = charSequence3;
                        } else {
                            if (goe != null) {
                                goe2 = goe;
                            } else {
                                goe2 = new goe(view);
                            }
                            this.g = new ColorDrawable(0);
                            this.g.setBounds(0, 0, (gwb.H().getResources().getDimensionPixelOffset(gwb.eO) * 2) + i, i);
                            gof = new gof(this, this.g, Integer.toString(a2, 16), i, i);
                            spannable3.setSpan(gof, i3, i3 + codePointAt, 33);
                            goe2.a(a2, gof);
                            i6 = i4 + 1;
                            goe3 = goe2;
                            i2 = i5;
                            spannable2 = spannable3;
                            charSequence2 = charSequence3;
                        }
                    } else {
                        goe3 = goe;
                        i6 = i4;
                    }
                    if (goe3 != null && (goe3.b.size() >= 20 || i3 + codePointAt >= length2)) {
                        new god(this, goe3).execute(new Void[0]);
                        goe3 = null;
                    }
                    i3 += codePointAt;
                    i4 = i6;
                    goe = goe3;
                }
            }
            a = codePointAt2;
            codePointAt = charCount;
            a2 = a(a);
            if (a2 < 0) {
                goe3 = goe;
                i6 = i4;
            } else {
                if (spannable2 != null) {
                    charSequence3 = charSequence2;
                    spannable3 = spannable2;
                } else {
                    CharSequence spannableString2 = new SpannableString(charSequence);
                    spannable3 = spannableString2;
                    charSequence3 = spannableString2;
                }
                obj = 1;
                if (i2 < length) {
                    if (spannable.getSpanStart(gofArr[i2]) == i3) {
                        if (gofArr[i2].getSource().equals(Integer.toString(a2, 16))) {
                            obj = null;
                        } else {
                            spannable.removeSpan(gofArr[i2]);
                        }
                        i5 = i2 + 1;
                        if (i4 > gwb.a(gwb.H(), "babel_emoji_max_per_message", 256)) {
                            obj = null;
                        }
                        if (obj == null) {
                            if (goe != null) {
                                goe2 = new goe(view);
                            } else {
                                goe2 = goe;
                            }
                            this.g = new ColorDrawable(0);
                            this.g.setBounds(0, 0, (gwb.H().getResources().getDimensionPixelOffset(gwb.eO) * 2) + i, i);
                            gof = new gof(this, this.g, Integer.toString(a2, 16), i, i);
                            spannable3.setSpan(gof, i3, i3 + codePointAt, 33);
                            goe2.a(a2, gof);
                            i6 = i4 + 1;
                            goe3 = goe2;
                            i2 = i5;
                            spannable2 = spannable3;
                            charSequence2 = charSequence3;
                        } else {
                            i2 = i5;
                            goe3 = goe;
                            spannable2 = spannable3;
                            i6 = i4;
                            charSequence2 = charSequence3;
                        }
                    }
                }
                i5 = i2;
                if (i4 > gwb.a(gwb.H(), "babel_emoji_max_per_message", 256)) {
                    obj = null;
                }
                if (obj == null) {
                    i2 = i5;
                    goe3 = goe;
                    spannable2 = spannable3;
                    i6 = i4;
                    charSequence2 = charSequence3;
                } else {
                    if (goe != null) {
                        goe2 = goe;
                    } else {
                        goe2 = new goe(view);
                    }
                    this.g = new ColorDrawable(0);
                    this.g.setBounds(0, 0, (gwb.H().getResources().getDimensionPixelOffset(gwb.eO) * 2) + i, i);
                    gof = new gof(this, this.g, Integer.toString(a2, 16), i, i);
                    spannable3.setSpan(gof, i3, i3 + codePointAt, 33);
                    goe2.a(a2, gof);
                    i6 = i4 + 1;
                    goe3 = goe2;
                    i2 = i5;
                    spannable2 = spannable3;
                    charSequence2 = charSequence3;
                }
            }
            new god(this, goe3).execute(new Void[0]);
            goe3 = null;
            i3 += codePointAt;
            i4 = i6;
            goe = goe3;
        }
        return charSequence2;
    }
}
