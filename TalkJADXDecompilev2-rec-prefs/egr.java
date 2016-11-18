package p000;

import android.graphics.PorterDuff.Mode;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.hangouts.peoplelistv2.impl.EditParticipantsView;

public final class egr extends jzn {
    private static final Typeface f11455e;
    jca f11456a;
    bck f11457b;
    LinearLayout f11458c;
    iih f11459d;
    private bxt f11460f;
    private Bundle f11461g;
    private EditParticipantsView f11462h;
    private LinearLayout f11463i;

    static {
        Typeface create;
        if (VERSION.SDK_INT >= 21) {
            create = Typeface.create("sans-serif-medium", 0);
        } else {
            create = Typeface.create("sans-serif", 1);
        }
        f11455e = create;
    }

    protected void onAttachBinder(Bundle bundle) {
        super.onAttachBinder(bundle);
        this.f11461g = bundle;
        this.f11456a = (jca) this.binder.m25443a(jca.class);
        this.f11460f = (bxt) this.binder.m25443a(bxt.class);
        this.f11457b = (bck) this.binder.m25443a(bck.class);
        this.f11459d = (iih) this.binder.m25443a(iih.class);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        LinearLayout linearLayout = (LinearLayout) layoutInflater.inflate(gwb.sJ, viewGroup, false);
        linearLayout.setVisibility(0);
        int dimensionPixelSize = getResources().getDimensionPixelSize(gwb.sw);
        this.f11463i = (LinearLayout) layoutInflater.inflate(gwb.sK, null);
        FrameLayout frameLayout = (FrameLayout) this.f11463i.findViewById(bm.f3823Y);
        this.f11463i.findViewById(bm.f3822X).setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        ImageView imageView = (ImageView) this.f11463i.findViewById(bm.f3821W);
        imageView.setImageResource(bc.vo);
        imageView.setColorFilter(getResources().getColor(bc.uZ), Mode.SRC_IN);
        LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        imageView.setLayoutParams(layoutParams);
        this.f11462h = (EditParticipantsView) layoutInflater.inflate(gwb.sC, null);
        this.f11462h.m8768a(this.f11457b);
        this.f11462h.m8769a(fde.m15018e(this.f11456a.mo2317a()));
        this.f11462h.m8770a(this.f11460f);
        frameLayout.addView(this.f11462h);
        m13895a(this.f11457b.m4877f(), linearLayout, false);
        return linearLayout;
    }

    void m13895a(bcj bcj, LinearLayout linearLayout, boolean z) {
        LayoutInflater layoutInflater = getLayoutInflater(this.f11461g);
        if (this.f11458c != null) {
            linearLayout.removeView(this.f11458c);
            this.f11458c = null;
        }
        if (linearLayout.findViewById(this.f11463i.getId()) == null) {
            linearLayout.addView(this.f11463i, 0);
        }
        ImageView imageView;
        View textView;
        switch (egu.f11466a[bcj.ordinal()]) {
            case 1:
                this.f11458c = (LinearLayout) layoutInflater.inflate(gwb.sK, null);
                imageView = (ImageView) this.f11458c.findViewById(bm.f3821W);
                imageView.setBackground(getResources().getDrawable(bc.ve));
                imageView.setImageResource(bc.vk);
                imageView.setColorFilter(getResources().getColor(bc.vc), Mode.SRC_IN);
                textView = new TextView(this.context);
                textView.setText(getResources().getString(gwb.ta));
                textView.setTextColor(getResources().getColor(bc.vb));
                textView.setTextSize(0, getResources().getDimension(gwb.sx));
                textView.setTypeface(f11455e);
                ((FrameLayout) this.f11458c.findViewById(bm.f3823Y)).addView(textView);
                this.f11458c.setOnClickListener(new egs(this));
                gld.m17934a(this.f11458c, true);
                linearLayout.addView(this.f11458c, 1);
                break;
            case 2:
            case 3:
            case 4:
                this.f11458c = (LinearLayout) layoutInflater.inflate(gwb.sK, null);
                imageView = (ImageView) this.f11458c.findViewById(bm.f3821W);
                imageView.setBackground(getResources().getDrawable(bc.vd));
                imageView.setImageResource(bc.vl);
                imageView.setColorFilter(getResources().getColor(bc.vb), Mode.SRC_IN);
                textView = new EditText(this.context);
                textView.setBackgroundColor(0);
                textView.setHint(getResources().getString(gwb.sX));
                textView.setHintTextColor(getResources().getColor(bc.va));
                textView.setImeOptions(268435456);
                textView.setTextSize(0, getResources().getDimension(gwb.sx));
                textView.setFilters(new InputFilter[]{new LengthFilter(128)});
                textView.addTextChangedListener(new egt(this));
                ((FrameLayout) this.f11458c.findViewById(bm.f3823Y)).addView(textView);
                linearLayout.addView(this.f11458c, 0);
                break;
        }
        this.f11457b.m4863a(bcj);
        if (z) {
            this.f11462h.m8771b();
        }
    }
}
