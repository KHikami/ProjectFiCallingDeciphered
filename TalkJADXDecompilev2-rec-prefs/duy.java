package p000;

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

public final class duy extends hle implements btd, duq {
    public grf f10592a;
    public String f10593b;
    public double f10594c;
    public double f10595d;
    public hlb f10596e;
    private final int f10597g;
    private String f10598h;

    public duy(Context context) {
        super(context, new GoogleMapOptions().m9854a(true));
        this.f10597g = context.getResources().getDimensionPixelSize(gwb.rH);
    }

    public void onMeasure(int i, int i2) {
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        size = MeasureSpec.makeMeasureSpec(Math.min(m12755a(size, MeasureSpec.getMode(i)), m12755a(size2, MeasureSpec.getMode(i2))), 1073741824);
        super.onMeasure(size, size);
    }

    private int m12755a(int i, int i2) {
        switch (i2) {
            case nzf.UNSET_ENUM_VALUE /*-2147483648*/:
                return Math.min(this.f10597g, i);
            case 1073741824:
                return i;
            default:
                return this.f10597g;
        }
    }

    public void mo1680a(String str, String str2, double d, double d2, grf grf) {
        CharSequence string;
        this.f10593b = str;
        this.f10598h = str2;
        this.f10594c = d;
        this.f10595d = d2;
        this.f10592a = grf;
        this.f10591f.m18949a(null);
        if (this.f10591f.m18948a() == null) {
            Context context = getContext();
            int a = gtt.m18579a(context);
            CharSequence a2 = gwb.m1645a(context, a, gtv.m18578h(context));
            CharSequence t = gwb.m2356t(context, a);
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
        this.f10591f.m18951b();
        m12754a(new hlj(this));
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

    public void mo716a(String str) {
    }

    public void m12761e() {
        Context context = getContext();
        if (context != null) {
            hli.m20027a(context);
        }
        hlb hlb = this.f10596e;
        try {
            hlb.f17062a.mo2642a(new hlc(hlb, new hld(this, context)));
            LatLng latLng = new LatLng(this.f10594c, this.f10595d);
            this.f10596e.m20012a(gwb.m1613a(latLng, 16.0f));
            this.f10596e.m20011a(new MarkerOptions().m9903a(latLng).m9904a(this.f10593b).m9906b(this.f10598h)).m20440a();
        } catch (RemoteException e) {
            throw new dt(e);
        }
    }

    public boolean mo717a() {
        return false;
    }

    public void mo715a(btf btf) {
        mo1680a(btf.f4406s.f4362e, btf.f4406s.f4365h, btf.f4406s.f4363f, btf.f4406s.f4364g, null);
    }

    public void mo718b(btf btf) {
        if (!TextUtils.equals(this.f10593b, btf.f4406s.f4362e) || !TextUtils.equals(this.f10598h, btf.f4406s.f4365h) || this.f10594c != btf.f4406s.f4363f || this.f10595d != btf.f4406s.f4364g) {
            this.f10593b = btf.f4406s.f4362e;
            this.f10598h = btf.f4406s.f4365h;
            this.f10594c = btf.f4406s.f4363f;
            this.f10595d = btf.f4406s.f4364g;
            LatLng latLng = new LatLng(this.f10594c, this.f10595d);
            if (this.f10596e != null) {
                this.f10596e.m20012a(gwb.m1613a(latLng, 16.0f));
            }
        }
    }

    public void p_() {
        this.f10591f.m18952c();
        this.f10591f.m18953d();
    }
}
