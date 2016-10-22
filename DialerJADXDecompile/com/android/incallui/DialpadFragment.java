package com.android.incallui;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnHoverListener;
import android.view.View.OnKeyListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import ayn;
import az;
import bbm;
import bbn;
import bbo;
import bbp;
import bcj;
import bdf;
import bdj;
import bdq;
import buf;
import com.android.dialer.dialpadview.DialpadKeyButton;
import com.android.dialer.dialpadview.DialpadView;
import java.util.HashMap;
import rl;
import rq;

/* compiled from: PG */
public class DialpadFragment extends ayn implements OnClickListener, OnHoverListener, OnKeyListener, OnTouchListener, bbp {
    private static final HashMap c;
    private static final Handler d;
    EditText a;
    bbn b;
    private final int[] f;
    private DialpadView g;
    private int h;

    /* compiled from: PG */
    public class DialpadSlidingLinearLayout extends LinearLayout {
        public DialpadSlidingLinearLayout(Context context) {
            super(context);
        }

        public DialpadSlidingLinearLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public DialpadSlidingLinearLayout(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
        }
    }

    public DialpadFragment() {
        this.f = new int[]{az.aS, az.aj, az.aN, az.aM, az.S, az.O, az.aG, az.aF, az.M, az.ai, az.aJ, az.ar};
    }

    public final /* synthetic */ bdq g() {
        return this;
    }

    static {
        c = new HashMap();
        d = new Handler(Looper.getMainLooper());
        c.put(Integer.valueOf(az.aj), Character.valueOf('1'));
        c.put(Integer.valueOf(az.aN), Character.valueOf('2'));
        c.put(Integer.valueOf(az.aM), Character.valueOf('3'));
        c.put(Integer.valueOf(az.S), Character.valueOf('4'));
        c.put(Integer.valueOf(az.O), Character.valueOf('5'));
        c.put(Integer.valueOf(az.aG), Character.valueOf('6'));
        c.put(Integer.valueOf(az.aF), Character.valueOf('7'));
        c.put(Integer.valueOf(az.M), Character.valueOf('8'));
        c.put(Integer.valueOf(az.ai), Character.valueOf('9'));
        c.put(Integer.valueOf(az.aS), Character.valueOf('0'));
        c.put(Integer.valueOf(az.ar), Character.valueOf('#'));
        c.put(Integer.valueOf(az.aJ), Character.valueOf('*'));
    }

    public void onClick(View view) {
        if (((AccessibilityManager) view.getContext().getSystemService("accessibility")).isEnabled()) {
            int id = view.getId();
            if (!view.isPressed() && c.containsKey(Integer.valueOf(id))) {
                ((bbo) this.e).a(((Character) c.get(Integer.valueOf(id))).charValue());
                d.postDelayed(new bbm(this), 50);
            }
        }
        if (view.getId() == az.I) {
            getActivity().onBackPressed();
        }
    }

    public boolean onHover(View view, MotionEvent motionEvent) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int paddingLeft = view.getPaddingLeft();
            int width = view.getWidth() - view.getPaddingRight();
            int paddingTop = view.getPaddingTop();
            int height = view.getHeight() - view.getPaddingBottom();
            switch (motionEvent.getActionMasked()) {
                case rl.l /*9*/:
                    view.setClickable(false);
                    break;
                case rl.m /*10*/:
                    int x = (int) motionEvent.getX();
                    int y = (int) motionEvent.getY();
                    if (x > paddingLeft && x < width && y > paddingTop && y < height) {
                        view.performClick();
                    }
                    view.setClickable(true);
                    break;
            }
        }
        return false;
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        String valueOf = String.valueOf(view);
        bdf.a((Object) this, new StringBuilder(String.valueOf(valueOf).length() + 34).append("onKey:  keyCode ").append(i).append(", view ").append(valueOf).toString());
        if (i == 23 || i == 66) {
            int id = view.getId();
            if (c.containsKey(Integer.valueOf(id))) {
                switch (keyEvent.getAction()) {
                    case rl.c /*0*/:
                        if (keyEvent.getRepeatCount() == 0) {
                            ((bbo) this.e).a(((Character) c.get(Integer.valueOf(id))).charValue());
                            break;
                        }
                        break;
                    case rq.b /*1*/:
                        ((bbo) this.e).a();
                        break;
                }
            }
        }
        return false;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        bdf.a((Object) this, "onTouch");
        int id = view.getId();
        if (c.containsKey(Integer.valueOf(id))) {
            switch (motionEvent.getAction()) {
                case rl.c /*0*/:
                    ((bbo) this.e).a(((Character) c.get(Integer.valueOf(id))).charValue());
                    break;
                case rq.b /*1*/:
                case rl.e /*3*/:
                    ((bbo) this.e).a();
                    break;
            }
        }
        return false;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(buf.kW, viewGroup, false);
        this.g = (DialpadView) inflate.findViewById(az.K);
        this.g.a(false);
        this.g.setBackgroundResource(buf.jX);
        this.a = (EditText) inflate.findViewById(az.L);
        if (this.a != null) {
            this.b = new bbn(this);
            this.a.setKeyListener(this.b);
            this.a.setLongClickable(false);
            this.a.setElegantTextHeight(false);
            for (int findViewById : this.f) {
                DialpadKeyButton dialpadKeyButton = (DialpadKeyButton) this.g.findViewById(findViewById);
                dialpadKeyButton.setOnTouchListener(this);
                dialpadKeyButton.setOnKeyListener(this);
                dialpadKeyButton.setOnHoverListener(this);
                dialpadKeyButton.setOnClickListener(this);
            }
        }
        View findViewById2 = this.g.findViewById(az.I);
        findViewById2.setVisibility(0);
        findViewById2.setOnClickListener(this);
        return inflate;
    }

    public void onResume() {
        super.onResume();
        int i = bcj.b().y.a;
        if (this.h != i) {
            for (int findViewById : this.f) {
                ((TextView) ((DialpadKeyButton) this.g.findViewById(findViewById)).findViewById(az.J)).setTextColor(i);
            }
            this.h = i;
        }
    }

    public void onDestroyView() {
        this.b = null;
        super.onDestroyView();
    }

    public final void a(char c) {
        if (this.a != null) {
            this.a.getText().append(c);
        }
    }

    public final boolean a(KeyEvent keyEvent) {
        bdf.a((Object) this, "Notifying dtmf key up.");
        if (this.b != null) {
            return this.b.b(keyEvent);
        }
        return false;
    }

    public final /* synthetic */ bdj h() {
        return new bbo();
    }
}
