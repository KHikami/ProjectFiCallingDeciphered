package p000;

import android.animation.ObjectAnimator;
import android.os.Build.VERSION;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import com.google.android.gms.people.accountswitcherview.ExpanderView;
import com.google.android.gms.people.accountswitcherview.SelectedAccountNavigationView;
import com.google.android.gms.people.accountswitcherview.ShrinkingItem;
import java.util.List;

public final class hss extends FrameLayout implements OnClickListener, OnItemClickListener, htq, hts {
    public hth f17186a;
    private C0000a f17187b;
    private C0000a f17188c;
    private C0000a f17189d;
    private hwn f17190e;
    private List<hwn> f17191f;
    private FrameLayout f17192g;
    private SelectedAccountNavigationView f17193h;
    private htc f17194i;
    private ShrinkingItem f17195j;
    private boolean f17196k;
    private ViewGroup f17197l;
    private ExpanderView f17198m;
    private C0000a f17199n;
    private boolean f17200o;
    private int f17201p;
    private int f17202q;
    private boolean f17203r;
    private View f17204s;

    public int getNestedScrollAxes() {
        return 2;
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f17204s != null) {
            this.f17204s.setOnApplyWindowInsetsListener(null);
            this.f17204s = null;
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if (getChildAt(i3).equals(this.f17192g)) {
                if (this.f17196k) {
                    i3 = this.f17197l.getMeasuredHeight();
                } else {
                    i3 = this.f17193h.getMeasuredHeight();
                }
                this.f17192g.setPadding(this.f17192g.getPaddingLeft(), i3, this.f17192g.getPaddingRight(), this.f17192g.getPaddingBottom());
                if (!this.f17200o) {
                    i3 = 0;
                }
                this.f17192g.measure(i, i3 + MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                return;
            }
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View view = this.f17196k ? this.f17197l : this.f17193h;
        if (this.f17201p != view.getTop()) {
            view.offsetTopAndBottom(this.f17201p - view.getTop());
        }
        if (this.f17202q != this.f17192g.getTop()) {
            this.f17192g.offsetTopAndBottom(this.f17202q - this.f17192g.getTop());
        }
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        View view2 = this.f17196k ? this.f17197l : this.f17193h;
        if (z || f2 >= 0.0f || view2.getBottom() >= 0) {
            if (z && f2 > 0.0f) {
                if (view2.getTop() > (-view2.getMeasuredHeight())) {
                    m20779a(view2, (-view2.getMeasuredHeight()) - view2.getTop());
                }
                if (this.f17192g.getTop() > (-view2.getMeasuredHeight())) {
                    m20783b((-view2.getMeasuredHeight()) - this.f17192g.getTop());
                }
            }
            return false;
        }
        m20779a(view2, -view2.getTop());
        m20783b(-view2.getTop());
        return true;
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return this.f17200o;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        View view2 = this.f17196k ? this.f17197l : this.f17193h;
        if (this.f17193h.m9959a() != 1) {
            int i3;
            if (i2 <= 0 || view2.getBottom() <= 0) {
                i3 = 0;
            } else if (view2.getBottom() > i2) {
                i3 = -i2;
            } else {
                i3 = -view2.getBottom();
            }
            if (i3 != 0) {
                if (view2.getTop() + i3 < (-view2.getMeasuredHeight())) {
                    m20779a(view2, (-view2.getMeasuredHeight()) - view2.getTop());
                } else {
                    m20779a(view2, i3);
                }
                if (this.f17192g.getTop() + i3 < (-view2.getMeasuredHeight())) {
                    m20783b((-view2.getMeasuredHeight()) - this.f17192g.getTop());
                } else {
                    m20783b(i3);
                }
                iArr[0] = 0;
                iArr[1] = i3;
            }
        }
    }

    private void m20779a(View view, int i) {
        view.offsetTopAndBottom(i);
        this.f17201p = view.getTop();
    }

    private void m20783b(int i) {
        this.f17192g.offsetTopAndBottom(i);
        this.f17202q = this.f17192g.getTop();
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        View view2 = this.f17196k ? this.f17197l : this.f17193h;
        if (i4 >= 0 || view2.getTop() >= 0) {
            i4 = 0;
        } else if (i4 <= view2.getTop()) {
            i4 = view2.getTop();
        }
        if (i4 != 0) {
            if (view2.getTop() - i4 > 0) {
                m20779a(view2, -view2.getTop());
            } else {
                m20779a(view2, -i4);
            }
            if (this.f17192g.getTop() - i4 > view2.getMeasuredHeight()) {
                m20783b(view2.getMeasuredHeight() - this.f17192g.getTop());
            } else {
                m20783b(-i4);
            }
        }
    }

    private void m20780a(hwn hwn, boolean z) {
        hwn hwn2 = this.f17190e;
        this.f17190e = hwn;
        if (this.f17191f != null) {
            this.f17191f = htc.m20817a(this.f17191f, hwn2, this.f17190e);
            if (!z) {
                this.f17193h.m9968a(this.f17190e);
            }
            this.f17194i.m20825b(this.f17191f);
            return;
        }
        this.f17193h.m9968a(null);
    }

    private void m20781a(boolean z, Interpolator interpolator) {
        int i;
        int i2;
        if (z) {
            i = 1;
            i2 = 0;
        } else {
            i = 0;
            i2 = 1;
        }
        if (hss.m20782a(11)) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f17195j, "animatedHeightFraction", new float[]{(float) i2, (float) i});
            ofFloat.setDuration(200);
            ofFloat.setInterpolator(interpolator);
            ofFloat.start();
            return;
        }
        this.f17195j.m9976a((float) i);
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        if (this.f17194i.getItemViewType(i) == 0) {
            if (this.f17189d != null) {
                C0000a c0000a = this.f17189d;
                this.f17194i.m20821a(i);
                if (c0000a.m16m()) {
                    return;
                }
            }
            m20780a(this.f17194i.m20821a(i), false);
            if (this.f17187b == null) {
            }
        } else if (this.f17194i.getItemViewType(i) != 1) {
            this.f17194i.getItemViewType(i);
        } else if (this.f17188c == null) {
        }
    }

    public void mo1132a(hwn hwn) {
        m20780a(hwn, true);
    }

    public void onClick(View view) {
        boolean z = true;
        if (view == this.f17197l) {
            if (this.f17199n == null) {
            }
        } else if (view == this.f17198m) {
            int i;
            if (this.f17193h.m9959a() == 1) {
                i = 0;
            } else {
                i = 1;
            }
            this.f17193h.m9975c(i);
            ExpanderView expanderView = this.f17198m;
            if (this.f17193h.m9959a() != 1) {
                z = false;
            }
            expanderView.m9951a(z);
            mo1131a(this.f17193h);
        }
    }

    public static boolean m20782a(int i) {
        return VERSION.SDK_INT >= i;
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        if (this.f17203r) {
            m20784c(i2);
            i2 = 0;
        }
        super.setPadding(i, i2, i3, i4);
    }

    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        if (this.f17203r) {
            m20784c(i2);
            i2 = 0;
        }
        super.setPaddingRelative(i, i2, i3, i4);
    }

    private void m20784c(int i) {
        this.f17197l.setPadding(this.f17197l.getPaddingLeft(), i, this.f17197l.getPaddingRight(), this.f17197l.getPaddingBottom());
        this.f17186a.m20829a(i);
        this.f17193h.m9960a(i);
    }

    public void mo1131a(SelectedAccountNavigationView selectedAccountNavigationView) {
        Animation alphaAnimation;
        switch (this.f17193h.m9959a()) {
            case 0:
                alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(200);
                this.f17192g.setAnimation(alphaAnimation);
                m20781a(false, new AccelerateInterpolator(0.8f));
                this.f17192g.setVisibility(0);
                this.f17195j.setVisibility(8);
                return;
            case 1:
                alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(200);
                alphaAnimation.setStartOffset(133);
                m20781a(true, new DecelerateInterpolator(0.8f));
                this.f17192g.setVisibility(8);
                this.f17195j.setVisibility(0);
                return;
            default:
                return;
        }
    }
}
