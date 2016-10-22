package defpackage;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.MotionEvent;
import android.view.View;
import nh;
import pn;
import su;

/* renamed from: acj */
class acj extends adl {
    private boolean g;
    private boolean h;
    private boolean i;
    private pn j;
    private su k;

    public acj(Context context, boolean z) {
        super(context, null, gwb.Q);
        this.h = z;
        setCacheColorHint(0);
    }

    public boolean a(MotionEvent motionEvent, int i) {
        boolean z;
        boolean z2;
        View childAt;
        int a = nh.a(motionEvent);
        switch (a) {
            case wi.j /*1*/:
                z = false;
                break;
            case wi.l /*2*/:
                z = true;
                break;
            case wi.z /*3*/:
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
                this.i = true;
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
                a(pointToPosition, childAt, f, f2);
                b(false);
                refreshDrawableState();
                if (a == 1) {
                    performItemClick(childAt, pointToPosition, getItemIdAtPosition(pointToPosition));
                }
                z = false;
                z2 = true;
            }
        }
        if (!z2 || r0) {
            this.i = false;
            setPressed(false);
            drawableStateChanged();
            childAt = getChildAt(this.f - getFirstVisiblePosition());
            if (childAt != null) {
                childAt.setPressed(false);
            }
            if (this.j != null) {
                this.j.b();
                this.j = null;
            }
        }
        if (z2) {
            if (this.k == null) {
                this.k = new su(this);
            }
            this.k.a(true);
            this.k.onTouch(this, motionEvent);
        } else if (this.k != null) {
            this.k.a(false);
        }
        return z2;
    }

    void a(boolean z) {
        this.g = z;
    }

    protected boolean a() {
        return this.i || super.a();
    }

    public boolean isInTouchMode() {
        return (this.h && this.g) || super.isInTouchMode();
    }

    public boolean hasWindowFocus() {
        return this.h || super.hasWindowFocus();
    }

    public boolean isFocused() {
        return this.h || super.isFocused();
    }

    public boolean hasFocus() {
        return this.h || super.hasFocus();
    }
}
