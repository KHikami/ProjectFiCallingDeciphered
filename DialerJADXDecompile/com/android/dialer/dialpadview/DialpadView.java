package com.android.dialer.dialpadview;

import ake;
import android.animation.Animator.AnimatorListener;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.text.Spannable;
import android.text.Spannable.Factory;
import android.text.TextUtils;
import android.text.style.TtsSpan.VerbatimBuilder;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import awk;
import awl;
import buf;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

/* compiled from: PG */
public class DialpadView extends LinearLayout {
    private static final String g;
    public EditText a;
    public ImageButton b;
    public View c;
    public ViewGroup d;
    public TextView e;
    public TextView f;
    private final boolean h;
    private final boolean i;
    private final int[] j;
    private ColorStateList k;
    private int l;

    static {
        g = DialpadView.class.getSimpleName();
    }

    public DialpadView(Context context) {
        this(context, null);
    }

    public DialpadView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DialpadView(Context context, AttributeSet attributeSet, int i) {
        boolean z;
        boolean z2 = true;
        super(context, attributeSet, i);
        this.j = new int[]{buf.ja, buf.iS, buf.iZ, buf.iY, buf.iO, buf.iN, buf.iW, buf.iV, buf.iM, buf.iR, buf.iX, buf.iT};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, awl.a);
        this.k = obtainStyledAttributes.getColorStateList(awl.b);
        obtainStyledAttributes.recycle();
        this.l = getResources().getDimensionPixelSize(buf.iF);
        if (getResources().getConfiguration().orientation == 2) {
            z = true;
        } else {
            z = false;
        }
        this.h = z;
        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) != 1) {
            z2 = false;
        }
        this.i = z2;
    }

    protected void onFinishInflate() {
        NumberFormat instance;
        int[] iArr = new int[]{buf.jd, buf.je, buf.jf, buf.jg, buf.jh, buf.ji, buf.jj, buf.jk, buf.jl, buf.jm, buf.jp, buf.jn};
        Resources resources = getContext().getResources();
        if ("fa".equals(resources.getConfiguration().locale.getLanguage())) {
            instance = DecimalFormat.getInstance(resources.getConfiguration().locale);
        } else {
            instance = DecimalFormat.getInstance(Locale.ENGLISH);
        }
        for (int i = 0; i < this.j.length; i++) {
            CharSequence charSequence;
            CharSequence charSequence2;
            Drawable drawable;
            DialpadKeyButton dialpadKeyButton = (DialpadKeyButton) findViewById(this.j[i]);
            TextView textView = (TextView) dialpadKeyButton.findViewById(buf.iJ);
            TextView textView2 = (TextView) dialpadKeyButton.findViewById(buf.iI);
            String string;
            if (this.j[i] == buf.iT) {
                string = resources.getString(buf.jo);
                charSequence = string;
                charSequence2 = string;
            } else if (this.j[i] == buf.iX) {
                string = resources.getString(buf.jq);
                r7 = string;
                r8 = string;
            } else {
                String format = instance.format((long) i);
                String string2 = resources.getString(iArr[i]);
                Spannable newSpannable = Factory.getInstance().newSpannable(new StringBuilder((String.valueOf(format).length() + 1) + String.valueOf(string2).length()).append(format).append(",").append(string2).toString());
                newSpannable.setSpan(new VerbatimBuilder(string2).build(), format.length() + 1, string2.length() + (format.length() + 1), 33);
                r8 = format;
                r7 = newSpannable;
            }
            Context context = getContext();
            int i2 = buf.iG;
            if (VERSION.SDK_INT >= 21) {
                drawable = context.getDrawable(i2);
            } else {
                drawable = context.getResources().getDrawable(i2);
            }
            RippleDrawable rippleDrawable = (RippleDrawable) drawable;
            if (this.k != null) {
                rippleDrawable.setColor(this.k);
            }
            textView.setText(charSequence2);
            textView.setElegantTextHeight(false);
            dialpadKeyButton.setContentDescription(charSequence);
            dialpadKeyButton.setBackground(rippleDrawable);
            if (textView2 != null) {
                textView2.setText(resources.getString(iArr[i]));
            }
        }
        ((DialpadKeyButton) findViewById(buf.iS)).a(resources.getText(buf.jc));
        ((DialpadKeyButton) findViewById(buf.ja)).a(resources.getText(buf.jb));
        this.a = (EditText) findViewById(buf.iL);
        this.b = (ImageButton) findViewById(buf.iH);
        this.c = findViewById(buf.iK);
        this.d = (ViewGroup) findViewById(buf.iU);
        this.e = (TextView) this.d.findViewById(buf.iP);
        this.f = (TextView) this.d.findViewById(buf.iQ);
        if (((AccessibilityManager) getContext().getSystemService("accessibility")).isEnabled()) {
            this.a.setSelected(true);
        }
    }

    public final void a(boolean z) {
        int i = 8;
        findViewById(buf.iH).setVisibility(z ? 0 : 8);
        View findViewById = findViewById(buf.iK);
        if (z) {
            i = 0;
        }
        findViewById.setVisibility(i);
        EditText editText = (EditText) findViewById(buf.iL);
        editText.setClickable(z);
        editText.setLongClickable(z);
        editText.setFocusableInTouchMode(z);
        editText.setCursorVisible(false);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        return true;
    }

    public final void a() {
        AnimatorListener awk = new awk(this);
        for (int i = 0; i < this.j.length; i++) {
            int i2 = this.j[i];
            if (this.h) {
                if (this.i) {
                    if (i2 == buf.iY) {
                        i2 = 33;
                    } else if (i2 == buf.iW) {
                        i2 = 66;
                    } else if (i2 == buf.iR) {
                        i2 = 99;
                    } else if (i2 == buf.iT) {
                        i2 = 132;
                    } else if (i2 == buf.iZ) {
                        i2 = 165;
                    } else if (i2 == buf.iN) {
                        i2 = 198;
                    } else if (i2 == buf.iM) {
                        i2 = 231;
                    } else if (i2 == buf.ja) {
                        i2 = 264;
                    } else if (i2 == buf.iS) {
                        i2 = 297;
                    } else if (i2 == buf.iO) {
                        i2 = 330;
                    } else {
                        if (i2 == buf.iV || i2 == buf.iX) {
                            i2 = 363;
                        }
                        Log.wtf(g, "Attempted to get animation delay for invalid key button id.");
                        i2 = 0;
                    }
                } else if (i2 == buf.iS) {
                    i2 = 33;
                } else if (i2 == buf.iO) {
                    i2 = 66;
                } else if (i2 == buf.iV) {
                    i2 = 99;
                } else if (i2 == buf.iX) {
                    i2 = 132;
                } else if (i2 == buf.iZ) {
                    i2 = 165;
                } else if (i2 == buf.iN) {
                    i2 = 198;
                } else if (i2 == buf.iM) {
                    i2 = 231;
                } else if (i2 == buf.ja) {
                    i2 = 264;
                } else if (i2 == buf.iY) {
                    i2 = 297;
                } else if (i2 == buf.iW) {
                    i2 = 330;
                } else {
                    if (i2 == buf.iR || i2 == buf.iT) {
                        i2 = 363;
                    }
                    Log.wtf(g, "Attempted to get animation delay for invalid key button id.");
                    i2 = 0;
                }
            } else if (i2 == buf.iS) {
                i2 = 33;
            } else if (i2 == buf.iZ) {
                i2 = 66;
            } else if (i2 == buf.iY) {
                i2 = 99;
            } else if (i2 == buf.iO) {
                i2 = 132;
            } else if (i2 == buf.iN) {
                i2 = 165;
            } else if (i2 == buf.iW) {
                i2 = 198;
            } else if (i2 == buf.iV) {
                i2 = 231;
            } else if (i2 == buf.iM) {
                i2 = 264;
            } else if (i2 == buf.iR) {
                i2 = 297;
            } else if (i2 == buf.iX) {
                i2 = 330;
            } else {
                if (i2 == buf.ja || i2 == buf.iT) {
                    i2 = 363;
                }
                Log.wtf(g, "Attempted to get animation delay for invalid key button id.");
                i2 = 0;
            }
            int i3 = (int) (((double) i2) * 0.66d);
            i2 = this.j[i];
            if (this.h) {
                if (this.i) {
                    if (i2 == buf.iS || i2 == buf.iO || i2 == buf.iV || i2 == buf.iX) {
                        i2 = 264;
                    } else if (i2 == buf.iZ || i2 == buf.iN || i2 == buf.iM || i2 == buf.ja) {
                        i2 = 297;
                    } else {
                        if (i2 == buf.iY || i2 == buf.iW || i2 == buf.iR || i2 == buf.iT) {
                            i2 = 330;
                        }
                        Log.wtf(g, "Attempted to get animation duration for invalid key button id.");
                        i2 = 0;
                    }
                } else if (i2 == buf.iS || i2 == buf.iO || i2 == buf.iV || i2 == buf.iX) {
                    i2 = 330;
                } else if (i2 == buf.iZ || i2 == buf.iN || i2 == buf.iM || i2 == buf.ja) {
                    i2 = 297;
                } else {
                    if (i2 == buf.iY || i2 == buf.iW || i2 == buf.iR || i2 == buf.iT) {
                        i2 = 264;
                    }
                    Log.wtf(g, "Attempted to get animation duration for invalid key button id.");
                    i2 = 0;
                }
            } else if (i2 == buf.iS || i2 == buf.iZ || i2 == buf.iY || i2 == buf.iO || i2 == buf.iN || i2 == buf.iW) {
                i2 = 330;
            } else if (i2 == buf.iV || i2 == buf.iM || i2 == buf.iR) {
                i2 = 297;
            } else {
                if (i2 == buf.iX || i2 == buf.ja || i2 == buf.iT) {
                    i2 = 264;
                }
                Log.wtf(g, "Attempted to get animation duration for invalid key button id.");
                i2 = 0;
            }
            int i4 = (int) (((double) i2) * 0.8d);
            DialpadKeyButton dialpadKeyButton = (DialpadKeyButton) findViewById(this.j[i]);
            ViewPropertyAnimator animate = dialpadKeyButton.animate();
            if (this.h) {
                dialpadKeyButton.setTranslationX((float) ((this.i ? -1 : 1) * this.l));
                animate.translationX(0.0f);
            } else {
                dialpadKeyButton.setTranslationY((float) this.l);
                animate.translationY(0.0f);
            }
            animate.setInterpolator(ake.c).setStartDelay((long) i3).setDuration((long) i4).setListener(awk).start();
        }
    }
}
