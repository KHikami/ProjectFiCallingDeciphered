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

/* compiled from: PG */
final class zw extends xp implements OnLongClickListener {
    pn a;
    private final int[] b;
    private TextView c;
    private ImageView d;
    private View e;
    private /* synthetic */ zs h;

    public zw(zs zsVar, Context context, pn pnVar, boolean z) {
        this.h = zsVar;
        super(context, null, buf.r);
        this.b = new int[]{16842964};
        this.a = pnVar;
        aah a = aah.a(context, null, this.b, buf.r, 0);
        if (a.e(0)) {
            setBackgroundDrawable(a.a(0));
        }
        a.a.recycle();
        if (z) {
            c(8388627);
        }
        a();
    }

    public final void setSelected(boolean z) {
        Object obj = isSelected() != z ? 1 : null;
        super.setSelected(z);
        if (obj != null && z) {
            sendAccessibilityEvent(4);
        }
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(pn.class.getName());
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (VERSION.SDK_INT >= 14) {
            accessibilityNodeInfo.setClassName(pn.class.getName());
        }
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.h.d > 0 && getMeasuredWidth() > this.h.d) {
            super.onMeasure(MeasureSpec.makeMeasureSpec(this.h.d, 1073741824), i2);
        }
    }

    public final void a() {
        pn pnVar = this.a;
        View c = pnVar.c();
        if (c != null) {
            zw parent = c.getParent();
            if (parent != this) {
                if (parent != null) {
                    parent.removeView(c);
                }
                addView(c);
            }
            this.e = c;
            if (this.c != null) {
                this.c.setVisibility(8);
            }
            if (this.d != null) {
                this.d.setVisibility(8);
                this.d.setImageDrawable(null);
                return;
            }
            return;
        }
        boolean z;
        if (this.e != null) {
            removeView(this.e);
            this.e = null;
        }
        Drawable a = pnVar.a();
        CharSequence b = pnVar.b();
        if (a != null) {
            if (this.d == null) {
                View imageView = new ImageView(getContext());
                LayoutParams xqVar = new xq(-2, -2);
                xqVar.h = 16;
                imageView.setLayoutParams(xqVar);
                addView(imageView, 0);
                this.d = imageView;
            }
            this.d.setImageDrawable(a);
            this.d.setVisibility(0);
        } else if (this.d != null) {
            this.d.setVisibility(8);
            this.d.setImageDrawable(null);
        }
        if (TextUtils.isEmpty(b)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (this.c == null) {
                imageView = new wi(getContext(), null, buf.s);
                imageView.setEllipsize(TruncateAt.END);
                xqVar = new xq(-2, -2);
                xqVar.h = 16;
                imageView.setLayoutParams(xqVar);
                addView(imageView);
                this.c = imageView;
            }
            this.c.setText(b);
            this.c.setVisibility(0);
        } else if (this.c != null) {
            this.c.setVisibility(8);
            this.c.setText(null);
        }
        if (this.d != null) {
            this.d.setContentDescription(pnVar.d());
        }
        if (z || TextUtils.isEmpty(pnVar.d())) {
            setOnLongClickListener(null);
            setLongClickable(false);
            return;
        }
        setOnLongClickListener(this);
    }

    public final boolean onLongClick(View view) {
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        Context context = getContext();
        int width = getWidth();
        int height = getHeight();
        int i = context.getResources().getDisplayMetrics().widthPixels;
        Toast makeText = Toast.makeText(context, this.a.d(), 0);
        makeText.setGravity(49, (iArr[0] + (width / 2)) - (i / 2), height);
        makeText.show();
        return true;
    }
}
