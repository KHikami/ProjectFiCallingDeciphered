package p000;

import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;

public class ehl extends dcj {
    private ViewGroup f11501a;
    private ViewGroup f11502b;
    private ObjectAnimator f11503c;
    private ObjectAnimator f11504d;
    private int f11505e;
    private OnClickListener f11506f;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        Bundle arguments = getArguments();
        boolean z = arguments.getBoolean("PeopleListProceedButton.key_show_element");
        boolean z2 = arguments.getBoolean("PeopleListProceedButton.key_render_off_screen");
        boolean z3 = arguments.getBoolean("PeopleListProceedButton.key_creating_video_call");
        this.f11502b = (ViewGroup) getActivity().findViewById(ba.eh);
        this.f11505e = getContext().getResources().getDimensionPixelSize(gwb.sv);
        if (VERSION.SDK_INT >= 17 && getContext().getResources().getConfiguration().getLayoutDirection() == 1) {
            this.f11505e = -this.f11505e;
        }
        if (z2) {
            this.f11502b.setTranslationX((float) this.f11505e);
        }
        this.f11501a = (ViewGroup) getActivity().findViewById(ba.eg);
        if (VERSION.SDK_INT >= 21) {
            this.f11501a.setTranslationZ((float) getResources().getDimensionPixelSize(gwb.su));
            this.f11501a.setStateListAnimator(AnimatorInflater.loadStateListAnimator(getContext(), gwb.sr));
        }
        this.f11501a.setBackgroundDrawable(this.f11501a.getResources().getDrawable(bc.vf));
        getActivity().getLayoutInflater().inflate(gwb.sN, this.f11501a, true);
        if (z) {
            m13924c();
        }
        ImageView imageView = (ImageView) this.f11501a.findViewById(bm.aa);
        if (z3) {
            imageView.setImageDrawable(getResources().getDrawable(bc.vq));
            imageView.setContentDescription(getContext().getString(gwb.tl));
        } else {
            if (fdq.f12794j.m14370b(((jca) this.binder.m25443a(jca.class)).mo2317a())) {
                imageView.setImageDrawable(getResources().getDrawable(bc.vh));
            }
            imageView.setContentDescription(getContext().getString(gwb.tk));
        }
        int integer = getContext().getResources().getInteger(gwb.sz);
        this.f11504d = ObjectAnimator.ofFloat(this.f11502b, View.TRANSLATION_X, new float[]{0.0f});
        this.f11504d.setInterpolator(new bbx(bcb.f2972a));
        this.f11504d.setDuration((long) integer);
        this.f11503c = ObjectAnimator.ofFloat(this.f11502b, View.TRANSLATION_X, new float[]{(float) this.f11505e});
        this.f11503c.setInterpolator(new bbx(bcb.f2973b));
        this.f11503c.setDuration((long) integer);
        this.f11506f = (OnClickListener) this.binder.m25443a(efz.class);
        this.f11501a.setOnClickListener(this.f11506f);
        return null;
    }

    private void m13924c() {
        if (!gld.m17937a(this.context)) {
            this.f11502b.setVisibility(0);
            this.f11502b.bringToFront();
        }
    }

    public boolean mo495a() {
        return ((int) this.f11502b.getTranslationX()) == 0;
    }

    public boolean m13927b() {
        return this.f11502b == null || ((int) this.f11502b.getTranslationX()) == this.f11505e;
    }

    public void m13925a(boolean z) {
        if (z && m13927b()) {
            m13924c();
        }
        if (z && !mo495a()) {
            if (this.f11503c.isRunning()) {
                this.f11503c.cancel();
            }
            if (!this.f11504d.isRunning()) {
                this.f11504d.start();
            }
        } else if (!z && !m13927b()) {
            if (this.f11504d.isRunning()) {
                this.f11504d.cancel();
            }
            if (!this.f11503c.isRunning()) {
                this.f11503c.start();
            }
        }
    }

    protected boolean isEmpty() {
        return false;
    }
}
