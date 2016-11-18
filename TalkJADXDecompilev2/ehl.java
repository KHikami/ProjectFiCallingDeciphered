package defpackage;

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
    private ViewGroup a;
    private ViewGroup b;
    private ObjectAnimator c;
    private ObjectAnimator d;
    private int e;
    private OnClickListener f;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        Bundle arguments = getArguments();
        boolean z = arguments.getBoolean("PeopleListProceedButton.key_show_element");
        boolean z2 = arguments.getBoolean("PeopleListProceedButton.key_render_off_screen");
        boolean z3 = arguments.getBoolean("PeopleListProceedButton.key_creating_video_call");
        this.b = (ViewGroup) getActivity().findViewById(ba.eh);
        this.e = getContext().getResources().getDimensionPixelSize(gwb.sv);
        if (VERSION.SDK_INT >= 17 && getContext().getResources().getConfiguration().getLayoutDirection() == 1) {
            this.e = -this.e;
        }
        if (z2) {
            this.b.setTranslationX((float) this.e);
        }
        this.a = (ViewGroup) getActivity().findViewById(ba.eg);
        if (VERSION.SDK_INT >= 21) {
            this.a.setTranslationZ((float) getResources().getDimensionPixelSize(gwb.su));
            this.a.setStateListAnimator(AnimatorInflater.loadStateListAnimator(getContext(), gwb.sr));
        }
        this.a.setBackgroundDrawable(this.a.getResources().getDrawable(bc.vf));
        getActivity().getLayoutInflater().inflate(gwb.sN, this.a, true);
        if (z) {
            c();
        }
        ImageView imageView = (ImageView) this.a.findViewById(bm.aa);
        if (z3) {
            imageView.setImageDrawable(getResources().getDrawable(bc.vq));
            imageView.setContentDescription(getContext().getString(gwb.tl));
        } else {
            if (fdq.j.b(((jca) this.binder.a(jca.class)).a())) {
                imageView.setImageDrawable(getResources().getDrawable(bc.vh));
            }
            imageView.setContentDescription(getContext().getString(gwb.tk));
        }
        int integer = getContext().getResources().getInteger(gwb.sz);
        this.d = ObjectAnimator.ofFloat(this.b, View.TRANSLATION_X, new float[]{0.0f});
        this.d.setInterpolator(new bbx(bcb.a));
        this.d.setDuration((long) integer);
        this.c = ObjectAnimator.ofFloat(this.b, View.TRANSLATION_X, new float[]{(float) this.e});
        this.c.setInterpolator(new bbx(bcb.b));
        this.c.setDuration((long) integer);
        this.f = (OnClickListener) this.binder.a(efz.class);
        this.a.setOnClickListener(this.f);
        return null;
    }

    private void c() {
        if (!gld.a(this.context)) {
            this.b.setVisibility(0);
            this.b.bringToFront();
        }
    }

    public boolean a() {
        return ((int) this.b.getTranslationX()) == 0;
    }

    public boolean b() {
        return this.b == null || ((int) this.b.getTranslationX()) == this.e;
    }

    public void a(boolean z) {
        if (z && b()) {
            c();
        }
        if (z && !a()) {
            if (this.c.isRunning()) {
                this.c.cancel();
            }
            if (!this.d.isRunning()) {
                this.d.start();
            }
        } else if (!z && !b()) {
            if (this.d.isRunning()) {
                this.d.cancel();
            }
            if (!this.c.isRunning()) {
                this.c.start();
            }
        }
    }

    protected boolean isEmpty() {
        return false;
    }
}
