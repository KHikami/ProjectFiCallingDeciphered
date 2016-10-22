package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: PG */
/* renamed from: xj */
class xj extends yf {
    boolean a;
    private boolean d;
    private boolean e;
    private ol f;

    public xj(Context context, boolean z) {
        super(context, null, buf.O);
        this.d = z;
        setCacheColorHint(0);
    }

    public boolean a(MotionEvent motionEvent, int i) {
        boolean z;
        boolean z2;
        View childAt;
        int a = jw.a(motionEvent);
        switch (a) {
            case rq.b /*1*/:
                z = false;
                break;
            case rq.c /*2*/:
                z = true;
                break;
            case rl.e /*3*/:
                z = false;
                z2 = false;
                break;
            default:
                z = false;
                z2 = true;
                break;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i);
        if (findPointerIndex < 0) {
            z = false;
            z2 = false;
        } else {
            int x = (int) motionEvent.getX(findPointerIndex);
            findPointerIndex = (int) motionEvent.getY(findPointerIndex);
            int pointToPosition = pointToPosition(x, findPointerIndex);
            if (pointToPosition == -1) {
                z2 = z;
                z = true;
            } else {
                View childAt2 = getChildAt(pointToPosition - getFirstVisiblePosition());
                float f = (float) x;
                float f2 = (float) findPointerIndex;
                this.e = true;
                if (VERSION.SDK_INT >= 21) {
                    drawableHotspotChanged(f, f2);
                }
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                if (this.c != -1) {
                    childAt = getChildAt(this.c - getFirstVisiblePosition());
                    if (!(childAt == null || childAt == childAt2 || !childAt.isPressed())) {
                        childAt.setPressed(false);
                    }
                }
                this.c = pointToPosition;
                float left = f - ((float) childAt2.getLeft());
                float top = f2 - ((float) childAt2.getTop());
                if (VERSION.SDK_INT >= 21) {
                    childAt2.drawableHotspotChanged(left, top);
                }
                if (!childAt2.isPressed()) {
                    childAt2.setPressed(true);
                }
                Drawable selector = getSelector();
                z = (selector == null || pointToPosition == -1) ? false : true;
                if (z) {
                    selector.setVisible(false, false);
                }
                a(pointToPosition, childAt2);
                if (z) {
                    Rect rect = this.b;
                    float exactCenterX = rect.exactCenterX();
                    float exactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    gr.a(selector, exactCenterX, exactCenterY);
                }
                Drawable selector2 = getSelector();
                if (!(selector2 == null || pointToPosition == -1)) {
                    gr.a(selector2, f, f2);
                }
                a(false);
                refreshDrawableState();
                if (a == 1) {
                    performItemClick(childAt2, pointToPosition, getItemIdAtPosition(pointToPosition));
                }
                z = false;
                z2 = true;
            }
        }
        if (!z2 || r0) {
            this.e = false;
            setPressed(false);
            drawableStateChanged();
            childAt = getChildAt(this.c - getFirstVisiblePosition());
            if (childAt != null) {
                childAt.setPressed(false);
            }
        }
        if (z2) {
            if (this.f == null) {
                this.f = new ol(this);
            }
            this.f.a(true);
            this.f.onTouch(this, motionEvent);
        } else if (this.f != null) {
            this.f.a(false);
        }
        return z2;
    }

    protected final boolean a() {
        return this.e || super.a();
    }

    public boolean isInTouchMode() {
        return (this.d && this.a) || super.isInTouchMode();
    }

    public boolean hasWindowFocus() {
        return this.d || super.hasWindowFocus();
    }

    public boolean isFocused() {
        return this.d || super.isFocused();
    }

    public boolean hasFocus() {
        return this.d || super.hasFocus();
    }
}
