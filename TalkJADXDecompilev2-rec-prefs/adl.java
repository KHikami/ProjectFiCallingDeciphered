package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;

public class adl extends ListView {
    private static final int[] f231g = new int[]{0};
    final Rect f232a = new Rect();
    int f233b = 0;
    int f234c = 0;
    int f235d = 0;
    int f236e = 0;
    public int f237f;
    private Field f238h;
    private adm f239i;

    public adl(Context context, AttributeSet attributeSet, int i) {
        super(context, null, i);
        try {
            this.f238h = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f238h.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    public void setSelector(Drawable drawable) {
        this.f239i = drawable != null ? new adm(drawable) : null;
        super.setSelector(this.f239i);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f233b = rect.left;
        this.f234c = rect.top;
        this.f235d = rect.right;
        this.f236e = rect.bottom;
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        m387b(true);
        m385b();
    }

    protected void dispatchDraw(Canvas canvas) {
        m383a(canvas);
        super.dispatchDraw(canvas);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0:
                this.f237f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    protected void m385b() {
        Drawable selector = getSelector();
        if (selector != null && m388c()) {
            selector.setState(getDrawableState());
        }
    }

    protected boolean m388c() {
        return mo40a() && isPressed();
    }

    protected boolean mo40a() {
        return false;
    }

    protected void m383a(Canvas canvas) {
        if (!this.f232a.isEmpty()) {
            Drawable selector = getSelector();
            if (selector != null) {
                selector.setBounds(this.f232a);
                selector.draw(canvas);
            }
        }
    }

    protected void m382a(int i, View view, float f, float f2) {
        m381a(i, view);
        Drawable selector = getSelector();
        if (selector != null && i != -1) {
            jb.m23743a(selector, f, f2);
        }
    }

    protected void m381a(int i, View view) {
        boolean z = true;
        Drawable selector = getSelector();
        boolean z2 = (selector == null || i == -1) ? false : true;
        if (z2) {
            selector.setVisible(false, false);
        }
        m386b(i, view);
        if (z2) {
            Rect rect = this.f232a;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            if (getVisibility() != 0) {
                z = false;
            }
            selector.setVisible(z, false);
            jb.m23743a(selector, exactCenterX, exactCenterY);
        }
    }

    protected void m386b(int i, View view) {
        Rect rect = this.f232a;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f233b;
        rect.top -= this.f234c;
        rect.right += this.f235d;
        rect.bottom += this.f236e;
        try {
            boolean z = this.f238h.getBoolean(this);
            if (view.isEnabled() != z) {
                this.f238h.set(this, Boolean.valueOf(!z));
                if (i != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public int m380a(int i, int i2, int i3) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        listPaddingBottom += listPaddingTop;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i4 = 0;
        View view = null;
        for (int i5 = 0; i5 < count; i5++) {
            View view2;
            listPaddingTop = adapter.getItemViewType(i5);
            if (listPaddingTop != i4) {
                i4 = listPaddingTop;
                view2 = null;
            } else {
                view2 = view;
            }
            view = adapter.getView(i5, view2, this);
            LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            if (layoutParams.height > 0) {
                listPaddingTop = MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824);
            } else {
                listPaddingTop = MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i, listPaddingTop);
            view.forceLayout();
            if (i5 > 0) {
                listPaddingTop = listPaddingBottom + dividerHeight;
            } else {
                listPaddingTop = listPaddingBottom;
            }
            listPaddingBottom = view.getMeasuredHeight() + listPaddingTop;
            if (listPaddingBottom >= i2) {
                return i2;
            }
        }
        return listPaddingBottom;
    }

    protected void m387b(boolean z) {
        if (this.f239i != null) {
            this.f239i.m650a(z);
        }
    }
}
