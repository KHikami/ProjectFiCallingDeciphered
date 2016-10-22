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
    public hth a;
    private a b;
    private a c;
    private a d;
    private hwn e;
    private List<hwn> f;
    private FrameLayout g;
    private SelectedAccountNavigationView h;
    private htc i;
    private ShrinkingItem j;
    private boolean k;
    private ViewGroup l;
    private ExpanderView m;
    private a n;
    private boolean o;
    private int p;
    private int q;
    private boolean r;
    private View s;

    public int getNestedScrollAxes() {
        return 2;
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.s != null) {
            this.s.setOnApplyWindowInsetsListener(null);
            this.s = null;
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if (getChildAt(i3).equals(this.g)) {
                if (this.k) {
                    i3 = this.l.getMeasuredHeight();
                } else {
                    i3 = this.h.getMeasuredHeight();
                }
                this.g.setPadding(this.g.getPaddingLeft(), i3, this.g.getPaddingRight(), this.g.getPaddingBottom());
                if (!this.o) {
                    i3 = 0;
                }
                this.g.measure(i, i3 + MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                return;
            }
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View view = this.k ? this.l : this.h;
        if (this.p != view.getTop()) {
            view.offsetTopAndBottom(this.p - view.getTop());
        }
        if (this.q != this.g.getTop()) {
            this.g.offsetTopAndBottom(this.q - this.g.getTop());
        }
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        View view2 = this.k ? this.l : this.h;
        if (z || f2 >= 0.0f || view2.getBottom() >= 0) {
            if (z && f2 > 0.0f) {
                if (view2.getTop() > (-view2.getMeasuredHeight())) {
                    a(view2, (-view2.getMeasuredHeight()) - view2.getTop());
                }
                if (this.g.getTop() > (-view2.getMeasuredHeight())) {
                    b((-view2.getMeasuredHeight()) - this.g.getTop());
                }
            }
            return false;
        }
        a(view2, -view2.getTop());
        b(-view2.getTop());
        return true;
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return this.o;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        View view2 = this.k ? this.l : this.h;
        if (this.h.a() != 1) {
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
                    a(view2, (-view2.getMeasuredHeight()) - view2.getTop());
                } else {
                    a(view2, i3);
                }
                if (this.g.getTop() + i3 < (-view2.getMeasuredHeight())) {
                    b((-view2.getMeasuredHeight()) - this.g.getTop());
                } else {
                    b(i3);
                }
                iArr[0] = 0;
                iArr[1] = i3;
            }
        }
    }

    private void a(View view, int i) {
        view.offsetTopAndBottom(i);
        this.p = view.getTop();
    }

    private void b(int i) {
        this.g.offsetTopAndBottom(i);
        this.q = this.g.getTop();
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        View view2 = this.k ? this.l : this.h;
        if (i4 >= 0 || view2.getTop() >= 0) {
            i4 = 0;
        } else if (i4 <= view2.getTop()) {
            i4 = view2.getTop();
        }
        if (i4 != 0) {
            if (view2.getTop() - i4 > 0) {
                a(view2, -view2.getTop());
            } else {
                a(view2, -i4);
            }
            if (this.g.getTop() - i4 > view2.getMeasuredHeight()) {
                b(view2.getMeasuredHeight() - this.g.getTop());
            } else {
                b(-i4);
            }
        }
    }

    private void a(hwn hwn, boolean z) {
        hwn hwn2 = this.e;
        this.e = hwn;
        if (this.f != null) {
            this.f = htc.a(this.f, hwn2, this.e);
            if (!z) {
                this.h.a(this.e);
            }
            this.i.b(this.f);
            return;
        }
        this.h.a(null);
    }

    private void a(boolean z, Interpolator interpolator) {
        int i;
        int i2;
        if (z) {
            i = 1;
            i2 = 0;
        } else {
            i = 0;
            i2 = 1;
        }
        if (a(11)) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.j, "animatedHeightFraction", new float[]{(float) i2, (float) i});
            ofFloat.setDuration(200);
            ofFloat.setInterpolator(interpolator);
            ofFloat.start();
            return;
        }
        this.j.a((float) i);
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        if (this.i.getItemViewType(i) == 0) {
            if (this.d != null) {
                a aVar = this.d;
                this.i.a(i);
                if (aVar.m()) {
                    return;
                }
            }
            a(this.i.a(i), false);
            if (this.b == null) {
            }
        } else if (this.i.getItemViewType(i) != 1) {
            this.i.getItemViewType(i);
        } else if (this.c == null) {
        }
    }

    public void a(hwn hwn) {
        a(hwn, true);
    }

    public void onClick(View view) {
        boolean z = true;
        if (view == this.l) {
            if (this.n == null) {
            }
        } else if (view == this.m) {
            int i;
            if (this.h.a() == 1) {
                i = 0;
            } else {
                i = 1;
            }
            this.h.c(i);
            ExpanderView expanderView = this.m;
            if (this.h.a() != 1) {
                z = false;
            }
            expanderView.a(z);
            a(this.h);
        }
    }

    public static boolean a(int i) {
        return VERSION.SDK_INT >= i;
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        if (this.r) {
            c(i2);
            i2 = 0;
        }
        super.setPadding(i, i2, i3, i4);
    }

    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        if (this.r) {
            c(i2);
            i2 = 0;
        }
        super.setPaddingRelative(i, i2, i3, i4);
    }

    private void c(int i) {
        this.l.setPadding(this.l.getPaddingLeft(), i, this.l.getPaddingRight(), this.l.getPaddingBottom());
        this.a.a(i);
        this.h.a(i);
    }

    public void a(SelectedAccountNavigationView selectedAccountNavigationView) {
        Animation alphaAnimation;
        switch (this.h.a()) {
            case wi.w /*0*/:
                alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(200);
                this.g.setAnimation(alphaAnimation);
                a(false, new AccelerateInterpolator(0.8f));
                this.g.setVisibility(0);
                this.j.setVisibility(8);
            case wi.j /*1*/:
                alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(200);
                alphaAnimation.setStartOffset(133);
                a(true, new DecelerateInterpolator(0.8f));
                this.g.setVisibility(8);
                this.j.setVisibility(0);
            default:
        }
    }
}
