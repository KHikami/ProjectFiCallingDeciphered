package com.google.android.apps.hangouts.peoplelistv2.impl;

import android.animation.Animator.AnimatorListener;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import bbx;
import bc;
import bcb;
import bcj;
import bck;
import bcm;
import bcn;
import bko;
import bm;
import bnc;
import bxt;
import com.google.android.apps.hangouts.views.AvatarView;
import efs;
import ega;
import egb;
import egc;
import egd;
import ege;
import egf;
import egg;
import egh;
import fdq;
import gld;
import glk;
import gwb;
import java.util.List;
import kae;

public class EditParticipantsView extends FrameLayout {
    public static final boolean a;
    public bck b;
    public ScrollViewCustom c;
    public ViewGroup d;
    public DeleteOnEmptyEditText e;
    public View f;
    public bko g;
    public OnClickListener h;
    public AnimatorListener i;
    private int j;
    private bxt k;
    private TextWatcher l;
    private final bcm m;

    static {
        kae kae = glk.u;
        a = false;
    }

    public EditParticipantsView(Context context) {
        this(context, null);
    }

    public EditParticipantsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public EditParticipantsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f = null;
        this.l = new ege(this);
        this.m = new egf(this);
        this.h = new egg(this);
        this.i = new egh(this);
    }

    public void a(bko bko) {
        this.g = bko;
    }

    protected void onAttachedToWindow() {
        boolean z;
        super.onAttachedToWindow();
        this.c = (ScrollViewCustom) findViewById(bm.U);
        this.d = (ViewGroup) findViewById(bm.Z);
        this.d.setOnClickListener(this.h);
        this.e = (DeleteOnEmptyEditText) this.d.findViewById(bm.T);
        this.e.addTextChangedListener(this.l);
        if (!(TextUtils.isEmpty(this.e.getText()) || this.b == null)) {
            this.b.a(this.e.getText().toString());
        }
        this.e.setOnFocusChangeListener(new ega(this));
        this.e.a(new efs(this));
        this.e.requestFocus();
        this.e.sendAccessibilityEvent(32);
        this.j = getResources().getInteger(gwb.sy);
        if (this.g == null || gwb.a(this.g, bnc.GROUP_CONVERSATIONS)) {
            z = true;
        } else {
            z = false;
        }
        List c = this.b.c();
        List d;
        if (this.b.f() == bcj.UPGRADE_TO_GROUPCHAT) {
            d = this.b.d();
        } else {
            d = c;
        }
        int i = 0;
        while (i < this.d.getChildCount() - 1) {
            View childAt = this.d.getChildAt(i);
            Object tag = childAt.getTag();
            if (r5.contains(tag)) {
                a(childAt, (bcn) tag);
                r5.remove(tag);
            } else if (z) {
                childAt.setOnClickListener(null);
                TextView textView = (TextView) childAt.findViewById(bm.af);
                ((AvatarView) childAt.findViewById(bm.ac)).setVisibility(4);
                textView.setVisibility(4);
                PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat(SCALE_X, new float[]{1.0f, 0.0f});
                ValueAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(childAt, new PropertyValuesHolder[]{ofFloat});
                ofPropertyValuesHolder.setInterpolator(new bbx(bcb.a));
                ofPropertyValuesHolder.setDuration(200);
                ofPropertyValuesHolder.addListener(this.i);
                ofPropertyValuesHolder.start();
            } else {
                this.d.removeView(childAt);
                i--;
            }
            i++;
        }
        if (!r5.isEmpty()) {
            this.e.setText("");
        }
        for (bcn bcn : r5) {
            OnClickListener egb = new egb(this, bcn);
            View inflate = LayoutInflater.from(getContext()).inflate(gwb.sD, this, false);
            inflate.setOnClickListener(new egc(this, egb));
            inflate.setScaleX(0.0f);
            this.d.addView(inflate, this.d.getChildCount() - 1);
            a(inflate, bcn);
            ofFloat = PropertyValuesHolder.ofFloat(SCALE_X, new float[]{0.0f, 1.0f});
            ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(inflate, new PropertyValuesHolder[]{ofFloat});
            ofPropertyValuesHolder.setInterpolator(new bbx(bcb.a));
            ofPropertyValuesHolder.setDuration(200);
            ofPropertyValuesHolder.start();
        }
        if (gld.a(getContext()) || this.d.getChildCount() <= 1) {
            this.e.setHint(gwb.tj);
        } else {
            this.e.setHint("");
        }
        requestLayout();
    }

    public void a(View view, bcn bcn) {
        String string;
        int i;
        Resources resources = getResources();
        CharSequence charSequence = "";
        if (bcn.c()) {
            charSequence = bcn.d();
        } else if (bcn.e()) {
            charSequence = bcn.f();
        } else if (bcn.a()) {
            charSequence = bcn.b().d;
        }
        if (TextUtils.isEmpty(charSequence)) {
            string = resources.getString(17039374);
        } else {
            CharSequence charSequence2 = charSequence;
        }
        String g = bcn.g();
        if (a) {
            String valueOf = String.valueOf(bcn.i());
            new StringBuilder((String.valueOf(string).length() + 36) + String.valueOf(valueOf).length()).append("Displaying chip text '").append(string).append("' for person: ").append(valueOf);
        }
        charSequence = resources.getString(gwb.sZ, new Object[]{string});
        boolean c = this.b.c(bcn);
        Resources resources2 = getResources();
        boolean equals = view.equals(this.f);
        int i2 = (fdq.j.b(this.g.g()) && this.b.f().b() && this.k == bxt.HANGOUTS_MESSAGE) ? 1 : 0;
        view.setContentDescription(charSequence);
        view.setVisibility(0);
        view.setTag(bcn);
        AvatarView avatarView = (AvatarView) view.findViewById(bm.ac);
        avatarView.a(g, string, this.g);
        avatarView.a(0);
        ((ImageView) view.findViewById(bm.N)).setVisibility(c ? 0 : 8);
        ImageView imageView = (ImageView) view.findViewById(bm.ad);
        if (!equals || c) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
            imageView.setContentDescription(getResources().getString(gwb.tm, new Object[]{string}));
        }
        View findViewById = view.findViewById(bm.O);
        int i3;
        if (i2 != 0) {
            if (equals) {
                i3 = bc.uW;
            } else {
                i3 = bc.uU;
            }
            i = i3;
        } else {
            if (equals) {
                i3 = bc.uV;
            } else {
                i3 = bc.uT;
            }
            i = i3;
        }
        ((GradientDrawable) findViewById.getBackground()).setColor(getResources().getColor(i));
        TextView textView = (TextView) view.findViewById(bm.af);
        if (i2 == 0 || equals) {
            textView.setTextColor(resources2.getColor(bc.uX));
        } else {
            textView.setTextColor(resources2.getColor(bc.uY));
        }
        if (equals || this.b.c().size() < this.j) {
            textView.setText(string);
            return;
        }
        String substring = string.substring(0, 1);
        if (string.length() > 1) {
            string = String.valueOf(substring);
            charSequence2 = new StringBuilder(String.valueOf(string).length() + 1).append(string).append("\u2026").toString();
        } else {
            Object obj = substring;
        }
        textView.setText(charSequence2);
    }

    public static void a(View view) {
        PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat(SCALE_X, new float[]{0.0f, 1.0f});
        ValueAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{ofFloat});
        ofPropertyValuesHolder.setInterpolator(new bbx(bcb.a));
        ofPropertyValuesHolder.setDuration(200);
        ofPropertyValuesHolder.start();
    }

    public void a(bck bck) {
        this.b = bck;
        bck.a(this.m);
    }

    public void b() {
        this.e.post(new egd(this));
    }

    public void a(bxt bxt) {
        this.k = bxt;
    }

    public void a() {
        boolean z;
        if (this.g == null || gwb.a(this.g, bnc.GROUP_CONVERSATIONS)) {
            z = true;
        } else {
            z = false;
        }
        List c = this.b.c();
        List d;
        if (this.b.f() == bcj.UPGRADE_TO_GROUPCHAT) {
            d = this.b.d();
        } else {
            d = c;
        }
        int i = 0;
        while (i < this.d.getChildCount() - 1) {
            View childAt = this.d.getChildAt(i);
            Object tag = childAt.getTag();
            if (r5.contains(tag)) {
                a(childAt, (bcn) tag);
                r5.remove(tag);
            } else if (z) {
                childAt.setOnClickListener(null);
                TextView textView = (TextView) childAt.findViewById(bm.af);
                ((AvatarView) childAt.findViewById(bm.ac)).setVisibility(4);
                textView.setVisibility(4);
                PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat(SCALE_X, new float[]{1.0f, 0.0f});
                ValueAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(childAt, new PropertyValuesHolder[]{ofFloat});
                ofPropertyValuesHolder.setInterpolator(new bbx(bcb.a));
                ofPropertyValuesHolder.setDuration(200);
                ofPropertyValuesHolder.addListener(this.i);
                ofPropertyValuesHolder.start();
            } else {
                this.d.removeView(childAt);
                i--;
            }
            i++;
        }
        if (!r5.isEmpty()) {
            this.e.setText("");
        }
        for (bcn bcn : r5) {
            OnClickListener egb = new egb(this, bcn);
            View inflate = LayoutInflater.from(getContext()).inflate(gwb.sD, this, false);
            inflate.setOnClickListener(new egc(this, egb));
            inflate.setScaleX(0.0f);
            this.d.addView(inflate, this.d.getChildCount() - 1);
            a(inflate, bcn);
            ofFloat = PropertyValuesHolder.ofFloat(SCALE_X, new float[]{0.0f, 1.0f});
            ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(inflate, new PropertyValuesHolder[]{ofFloat});
            ofPropertyValuesHolder.setInterpolator(new bbx(bcb.a));
            ofPropertyValuesHolder.setDuration(200);
            ofPropertyValuesHolder.start();
        }
        if (gld.a(getContext()) || this.d.getChildCount() <= 1) {
            this.e.setHint(gwb.tj);
        } else {
            this.e.setHint("");
        }
        requestLayout();
    }
}
