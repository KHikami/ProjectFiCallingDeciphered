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
    final /* synthetic */ aez a;
    private final int[] b;
    private ts c;
    private TextView d;
    private ImageView e;
    private View f;

    public afd(aez aez, Context context, ts tsVar, boolean z) {
        this.a = aez;
        super(context, null, gwb.t);
        this.b = new int[]{16842964};
        this.c = tsVar;
        afp a = afp.a(context, null, this.b, gwb.t, 0);
        if (a.g(0)) {
            setBackgroundDrawable(a.a(0));
        }
        a.a();
        if (z) {
            f(8388627);
        }
        b();
    }

    public void a(ts tsVar) {
        this.c = tsVar;
        b();
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
        if (this.a.d > 0 && getMeasuredWidth() > this.a.d) {
            super.onMeasure(MeasureSpec.makeMeasureSpec(this.a.d, 1073741824), i2);
        }
    }

    private void b() {
        ts tsVar = this.c;
        View c = tsVar.c();
        if (c != null) {
            afd parent = c.getParent();
            if (parent != this) {
                if (parent != null) {
                    parent.removeView(c);
                }
                addView(c);
            }
            this.f = c;
            if (this.d != null) {
                this.d.setVisibility(8);
            }
            if (this.e != null) {
                this.e.setVisibility(8);
                this.e.setImageDrawable(null);
                return;
            }
            return;
        }
        boolean z;
        if (this.f != null) {
            removeView(this.f);
            this.f = null;
        }
        Drawable a = tsVar.a();
        CharSequence b = tsVar.b();
        if (a != null) {
            if (this.e == null) {
                View aap = new aap(getContext());
                LayoutParams acw = new acw(-2, -2);
                acw.h = 16;
                aap.setLayoutParams(acw);
                addView(aap, 0);
                this.e = aap;
            }
            this.e.setImageDrawable(a);
            this.e.setVisibility(0);
        } else if (this.e != null) {
            this.e.setVisibility(8);
            this.e.setImageDrawable(null);
        }
        if (TextUtils.isEmpty(b)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (this.d == null) {
                aap = new abh(getContext(), null, gwb.u);
                aap.setEllipsize(TruncateAt.END);
                acw = new acw(-2, -2);
                acw.h = 16;
                aap.setLayoutParams(acw);
                addView(aap);
                this.d = aap;
            }
            this.d.setText(b);
            this.d.setVisibility(0);
        } else if (this.d != null) {
            this.d.setVisibility(8);
            this.d.setText(null);
        }
        if (this.e != null) {
            this.e.setContentDescription(tsVar.d());
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
        Toast makeText = Toast.makeText(context, this.c.d(), 0);
        makeText.setGravity(49, (iArr[0] + (width / 2)) - (i / 2), height);
        makeText.show();
        return true;
    }

    public ts a() {
        return this.c;
    }
}
