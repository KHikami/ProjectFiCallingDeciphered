package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.Button;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

/* renamed from: duy */
public final class duy extends hle implements btd, duq {
    public grf a;
    public String b;
    public double c;
    public double d;
    public hlb e;
    private final int g;
    private String h;

    public duy(Context context) {
        super(context, new GoogleMapOptions().a(true));
        this.g = context.getResources().getDimensionPixelSize(gwb.rH);
    }

    public void onMeasure(int i, int i2) {
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        size = MeasureSpec.makeMeasureSpec(Math.min(a(size, MeasureSpec.getMode(i)), a(size2, MeasureSpec.getMode(i2))), 1073741824);
        super.onMeasure(size, size);
    }

    private int a(int i, int i2) {
        switch (i2) {
            case nzf.UNSET_ENUM_VALUE /*-2147483648*/:
                return Math.min(this.g, i);
            case 1073741824:
                return i;
            default:
                return this.g;
        }
    }

    public void a(String str, String str2, double d, double d2, grf grf) {
        CharSequence string;
        this.b = str;
        this.h = str2;
        this.c = d;
        this.d = d2;
        this.a = grf;
        this.f.a(null);
        if (this.f.a() == null) {
            Context context = getContext();
            int a = gtt.a(context);
            CharSequence a2 = gwb.a(context, a, gtv.h(context));
            CharSequence t = gwb.t(context, a);
            View linearLayout = new LinearLayout(getContext());
            linearLayout.setOrientation(1);
            linearLayout.setLayoutParams(new LayoutParams(-2, -2));
            addView(linearLayout);
            View textView = new TextView(getContext());
            textView.setLayoutParams(new LayoutParams(-2, -2));
            textView.setText(a2);
            linearLayout.addView(textView);
            if (t != null) {
                View button = new Button(context);
                button.setLayoutParams(new LayoutParams(-2, -2));
                button.setText(t);
                linearLayout.addView(button);
                button.setOnClickListener(new gyg(context, a));
            }
        }
        this.f.b();
        a(new hlj(this));
        Resources resources = getResources();
        if (TextUtils.isEmpty(str2)) {
            string = resources.getString(gwb.rJ);
        } else if (TextUtils.isEmpty(str)) {
            string = resources.getString(gwb.rI, new Object[]{str2});
        } else {
            string = resources.getString(gwb.rK, new Object[]{str, str2});
        }
        setContentDescription(string);
        setLongClickable(true);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        onTouchEvent(motionEvent);
        return false;
    }

    public void b_() {
    }

    public void c_() {
    }

    public void d_() {
    }

    public void a(String str) {
    }

    public void e() {
        Context context = getContext();
        if (context != null) {
            hli.a(context);
        }
        hlb hlb = this.e;
        try {
            hlb.a.a(new hlc(hlb, new hld(this, context)));
            LatLng latLng = new LatLng(this.c, this.d);
            this.e.a(gwb.a(latLng, 16.0f));
            this.e.a(new MarkerOptions().a(latLng).a(this.b).b(this.h)).a();
        } catch (RemoteException e) {
            throw new dt(e);
        }
    }

    public boolean a() {
        return false;
    }

    public void a(btf btf) {
        a(btf.s.e, btf.s.h, btf.s.f, btf.s.g, null);
    }

    public void b(btf btf) {
        if (!TextUtils.equals(this.b, btf.s.e) || !TextUtils.equals(this.h, btf.s.h) || this.c != btf.s.f || this.d != btf.s.g) {
            this.b = btf.s.e;
            this.h = btf.s.h;
            this.c = btf.s.f;
            this.d = btf.s.g;
            LatLng latLng = new LatLng(this.c, this.d);
            if (this.e != null) {
                this.e.a(gwb.a(latLng, 16.0f));
            }
        }
    }

    public void p_() {
        this.f.c();
        this.f.d();
    }
}
