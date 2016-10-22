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
    private static final Typeface e;
    jca a;
    bck b;
    LinearLayout c;
    iih d;
    private bxt f;
    private Bundle g;
    private EditParticipantsView h;
    private LinearLayout i;

    static {
        Typeface create;
        if (VERSION.SDK_INT >= 21) {
            create = Typeface.create("sans-serif-medium", 0);
        } else {
            create = Typeface.create("sans-serif", 1);
        }
        e = create;
    }

    protected void onAttachBinder(Bundle bundle) {
        super.onAttachBinder(bundle);
        this.g = bundle;
        this.a = (jca) this.binder.a(jca.class);
        this.f = (bxt) this.binder.a(bxt.class);
        this.b = (bck) this.binder.a(bck.class);
        this.d = (iih) this.binder.a(iih.class);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        LinearLayout linearLayout = (LinearLayout) layoutInflater.inflate(gwb.sJ, viewGroup, false);
        linearLayout.setVisibility(0);
        int dimensionPixelSize = getResources().getDimensionPixelSize(gwb.sw);
        this.i = (LinearLayout) layoutInflater.inflate(gwb.sK, null);
        FrameLayout frameLayout = (FrameLayout) this.i.findViewById(bm.Y);
        this.i.findViewById(bm.X).setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        ImageView imageView = (ImageView) this.i.findViewById(bm.W);
        imageView.setImageResource(bc.vo);
        imageView.setColorFilter(getResources().getColor(bc.uZ), Mode.SRC_IN);
        LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        imageView.setLayoutParams(layoutParams);
        this.h = (EditParticipantsView) layoutInflater.inflate(gwb.sC, null);
        this.h.a(this.b);
        this.h.a(fde.e(this.a.a()));
        this.h.a(this.f);
        frameLayout.addView(this.h);
        a(this.b.f(), linearLayout, false);
        return linearLayout;
    }

    void a(bcj bcj, LinearLayout linearLayout, boolean z) {
        LayoutInflater layoutInflater = getLayoutInflater(this.g);
        if (this.c != null) {
            linearLayout.removeView(this.c);
            this.c = null;
        }
        if (linearLayout.findViewById(this.i.getId()) == null) {
            linearLayout.addView(this.i, 0);
        }
        ImageView imageView;
        View textView;
        switch (egu.a[bcj.ordinal()]) {
            case wi.j /*1*/:
                this.c = (LinearLayout) layoutInflater.inflate(gwb.sK, null);
                imageView = (ImageView) this.c.findViewById(bm.W);
                imageView.setBackground(getResources().getDrawable(bc.ve));
                imageView.setImageResource(bc.vk);
                imageView.setColorFilter(getResources().getColor(bc.vc), Mode.SRC_IN);
                textView = new TextView(this.context);
                textView.setText(getResources().getString(gwb.ta));
                textView.setTextColor(getResources().getColor(bc.vb));
                textView.setTextSize(0, getResources().getDimension(gwb.sx));
                textView.setTypeface(e);
                ((FrameLayout) this.c.findViewById(bm.Y)).addView(textView);
                this.c.setOnClickListener(new egs(this));
                gld.a(this.c, true);
                linearLayout.addView(this.c, 1);
                break;
            case wi.l /*2*/:
            case wi.z /*3*/:
            case wi.h /*4*/:
                this.c = (LinearLayout) layoutInflater.inflate(gwb.sK, null);
                imageView = (ImageView) this.c.findViewById(bm.W);
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
                ((FrameLayout) this.c.findViewById(bm.Y)).addView(textView);
                linearLayout.addView(this.c, 0);
                break;
        }
        this.b.a(bcj);
        if (z) {
            this.h.b();
        }
    }
}
