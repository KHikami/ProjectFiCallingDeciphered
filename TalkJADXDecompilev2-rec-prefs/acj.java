package p000;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.MotionEvent;
import android.view.View;

class acj extends adl {
    private boolean f240g;
    private boolean f241h;
    private boolean f242i;
    private pn f243j;
    private su f244k;

    public acj(Context context, boolean z) {
        super(context, null, gwb.f871Q);
        this.f241h = z;
        setCacheColorHint(0);
    }

    public boolean mo83a(MotionEvent motionEvent, int i) {
        boolean z;
        boolean z2;
        View childAt;
        int a = nh.a(motionEvent);
        switch (a) {
            case 1:
                z = false;
                break;
            case 2:
                z = true;
                break;
            case 3:
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
                childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                float f = (float) x;
                float f2 = (float) findPointerIndex;
                this.f242i = true;
                if (VERSION.SDK_INT >= 21) {
                    drawableHotspotChanged(f, f2);
                }
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                if (this.f != -1) {
                    View childAt2 = getChildAt(this.f - getFirstVisiblePosition());
                    if (!(childAt2 == null || childAt2 == childAt || !childAt2.isPressed())) {
                        childAt2.setPressed(false);
                    }
                }
                this.f = pointToPosition;
                float left = f - ((float) childAt.getLeft());
                float top = f2 - ((float) childAt.getTop());
                if (VERSION.SDK_INT >= 21) {
                    childAt.drawableHotspotChanged(left, top);
                }
                if (!childAt.isPressed()) {
                    childAt.setPressed(true);
                }
                m382a(pointToPosition, childAt, f, f2);
                m387b(false);
                refreshDrawableState();
                if (a == 1) {
                    performItemClick(childAt, pointToPosition, getItemIdAtPosition(pointToPosition));
                }
                z = false;
                z2 = true;
            }
        }
        if (!z2 || r0) {
            this.f242i = false;
            setPressed(false);
            drawableStateChanged();
            childAt = getChildAt(this.f - getFirstVisiblePosition());
            if (childAt != null) {
                childAt.setPressed(false);
            }
            if (this.f243j != null) {
                this.f243j.b();
                this.f243j = null;
            }
        }
        if (z2) {
            if (this.f244k == null) {
                this.f244k = new su(this);
            }
            this.f244k.a(true);
            this.f244k.onTouch(this, motionEvent);
        } else if (this.f244k != null) {
            this.f244k.a(false);
        }
        return z2;
    }

    void m389a(boolean z) {
        this.f240g = z;
    }

    protected boolean mo40a() {
        return this.f242i || super.mo40a();
    }

    public boolean isInTouchMode() {
        return (this.f241h && this.f240g) || super.isInTouchMode();
    }

    public boolean hasWindowFocus() {
        return this.f241h || super.hasWindowFocus();
    }

    public boolean isFocused() {
        return this.f241h || super.isFocused();
    }

    public boolean hasFocus() {
        return this.f241h || super.hasFocus();
    }
}
