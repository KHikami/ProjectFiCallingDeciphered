package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

final class afd extends acv implements OnLongClickListener {
    final /* synthetic */ aez f511a;
    private final int[] f512b = new int[]{16842964};
    private ts f513c;
    private TextView f514d;
    private ImageView f515e;
    private View f516f;

    public afd(aez aez, Context context, ts tsVar, boolean z) {
        this.f511a = aez;
        super(context, null, gwb.f890t);
        this.f513c = tsVar;
        afp a = afp.m927a(context, null, this.f512b, gwb.f890t, 0);
        if (a.m944g(0)) {
            setBackgroundDrawable(a.m930a(0));
        }
        a.m931a();
        if (z) {
            m634f(8388627);
        }
        m912b();
    }

    public void m914a(ts tsVar) {
        this.f513c = tsVar;
        m912b();
    }

    public void setSelected(boolean z) {
        Object obj = isSelected() != z ? 1 : null;
        super.setSelected(z);
        if (obj != null && z) {
            sendAccessibilityEvent(4);
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(ts.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (VERSION.SDK_INT >= 14) {
            accessibilityNodeInfo.setClassName(ts.class.getName());
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f511a.f500d > 0 && getMeasuredWidth() > this.f511a.f500d) {
            super.onMeasure(MeasureSpec.makeMeasureSpec(this.f511a.f500d, 1073741824), i2);
        }
    }

    private void m912b() {
        ts tsVar = this.f513c;
        View c = tsVar.c();
        if (c != null) {
            afd parent = c.getParent();
            if (parent != this) {
                if (parent != null) {
                    parent.removeView(c);
                }
                addView(c);
            }
            this.f516f = c;
            if (this.f514d != null) {
                this.f514d.setVisibility(8);
            }
            if (this.f515e != null) {
                this.f515e.setVisibility(8);
                this.f515e.setImageDrawable(null);
                return;
            }
            return;
        }
        boolean z;
        if (this.f516f != null) {
            removeView(this.f516f);
            this.f516f = null;
        }
        Drawable a = tsVar.a();
        CharSequence b = tsVar.b();
        if (a != null) {
            if (this.f515e == null) {
                View aap = new aap(getContext());
                LayoutParams acw = new acw(-2, -2);
                acw.f308h = 16;
                aap.setLayoutParams(acw);
                addView(aap, 0);
                this.f515e = aap;
            }
            this.f515e.setImageDrawable(a);
            this.f515e.setVisibility(0);
        } else if (this.f515e != null) {
            this.f515e.setVisibility(8);
            this.f515e.setImageDrawable(null);
        }
        if (TextUtils.isEmpty(b)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (this.f514d == null) {
                aap = new abh(getContext(), null, gwb.f891u);
                aap.setEllipsize(TruncateAt.END);
                acw = new acw(-2, -2);
                acw.f308h = 16;
                aap.setLayoutParams(acw);
                addView(aap);
                this.f514d = aap;
            }
            this.f514d.setText(b);
            this.f514d.setVisibility(0);
        } else if (this.f514d != null) {
            this.f514d.setVisibility(8);
            this.f514d.setText(null);
        }
        if (this.f515e != null) {
            this.f515e.setContentDescription(tsVar.d());
        }
        if (z || TextUtils.isEmpty(tsVar.d())) {
            setOnLongClickListener(null);
            setLongClickable(false);
            return;
        }
        setOnLongClickListener(this);
    }

    public boolean onLongClick(View view) {
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        Context context = getContext();
        int width = getWidth();
        int height = getHeight();
        int i = context.getResources().getDisplayMetrics().widthPixels;
        Toast makeText = Toast.makeText(context, this.f513c.d(), 0);
        makeText.setGravity(49, (iArr[0] + (width / 2)) - (i / 2), height);
        makeText.show();
        return true;
    }

    public ts m913a() {
        return this.f513c;
    }
}
