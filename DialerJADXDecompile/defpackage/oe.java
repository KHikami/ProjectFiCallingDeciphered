package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: oe */
public abstract class oe extends in {
    private static final String DEFAULT_CLASS_NAME = "android.view.View";
    public static final int HOST_ID = -1;
    public static final int INVALID_ID = Integer.MIN_VALUE;
    private static final Rect INVALID_PARENT_BOUNDS;
    private static final oi NODE_ADAPTER;
    private static final oj SPARSE_VALUES_ADAPTER;
    private int mAccessibilityFocusedVirtualViewId;
    private final View mHost;
    private int mHoveredVirtualViewId;
    private int mKeyboardFocusedVirtualViewId;
    private final AccessibilityManager mManager;
    private oh mNodeProvider;
    private final int[] mTempGlobalRect;
    private final Rect mTempParentRect;
    private final Rect mTempScreenRect;
    private final Rect mTempVisibleRect;

    public abstract int getVirtualViewAt(float f, float f2);

    public abstract void getVisibleVirtualViews(List list);

    public abstract boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle);

    public abstract void onPopulateNodeForVirtualView(int i, mr mrVar);

    static {
        INVALID_PARENT_BOUNDS = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, INVALID_ID, INVALID_ID);
        NODE_ADAPTER = new of();
        SPARSE_VALUES_ADAPTER = new og();
    }

    public oe(View view) {
        this.mTempScreenRect = new Rect();
        this.mTempParentRect = new Rect();
        this.mTempVisibleRect = new Rect();
        this.mTempGlobalRect = new int[2];
        this.mAccessibilityFocusedVirtualViewId = INVALID_ID;
        this.mKeyboardFocusedVirtualViewId = INVALID_ID;
        this.mHoveredVirtualViewId = INVALID_ID;
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.mHost = view;
        this.mManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (kn.d(view) == 0) {
            kn.c(view, 1);
        }
    }

    public nb getAccessibilityNodeProvider(View view) {
        if (this.mNodeProvider == null) {
            this.mNodeProvider = new oh(this);
        }
        return this.mNodeProvider;
    }

    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (!this.mManager.isEnabled() || !mo.a(this.mManager)) {
            return false;
        }
        switch (motionEvent.getAction()) {
            case rl.h /*7*/:
            case rl.l /*9*/:
                int virtualViewAt = getVirtualViewAt(motionEvent.getX(), motionEvent.getY());
                updateHoveredVirtualView(virtualViewAt);
                if (virtualViewAt == INVALID_ID) {
                    return false;
                }
                return true;
            case rl.m /*10*/:
                if (this.mAccessibilityFocusedVirtualViewId == INVALID_ID) {
                    return false;
                }
                updateHoveredVirtualView(INVALID_ID);
                return true;
            default:
                return false;
        }
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z = false;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        switch (keyCode) {
            case rk.m /*19*/:
            case rk.h /*20*/:
            case rk.g /*21*/:
            case rk.bE /*22*/:
                if (!jc.a(keyEvent)) {
                    return false;
                }
                int keyToDirection = oe.keyToDirection(keyCode);
                int repeatCount = keyEvent.getRepeatCount() + 1;
                keyCode = 0;
                while (keyCode < repeatCount && moveFocus(keyToDirection, null)) {
                    keyCode++;
                    z = true;
                }
                return z;
            case rk.bD /*23*/:
            case 66:
                if (!jc.a(keyEvent) || keyEvent.getRepeatCount() != 0) {
                    return false;
                }
                clickKeyboardFocusedVirtualView();
                return true;
            case 61:
                if (jc.a(keyEvent)) {
                    return moveFocus(2, null);
                }
                if (jc.a(keyEvent, 1)) {
                    return moveFocus(1, null);
                }
                return false;
            default:
                return false;
        }
    }

    public final void onFocusChanged(boolean z, int i, Rect rect) {
        if (this.mKeyboardFocusedVirtualViewId != INVALID_ID) {
            clearKeyboardFocusForVirtualView(this.mKeyboardFocusedVirtualViewId);
        }
        if (z) {
            moveFocus(i, rect);
        }
    }

    public final int getAccessibilityFocusedVirtualViewId() {
        return this.mAccessibilityFocusedVirtualViewId;
    }

    public final int getKeyboardFocusedVirtualViewId() {
        return this.mKeyboardFocusedVirtualViewId;
    }

    private static int keyToDirection(int i) {
        switch (i) {
            case rk.m /*19*/:
                return 33;
            case rk.g /*21*/:
                return 17;
            case rk.bE /*22*/:
                return 66;
            default:
                return 130;
        }
    }

    private void getBoundsInParent(int i, Rect rect) {
        obtainAccessibilityNodeInfo(i).a(rect);
    }

    private boolean moveFocus(int i, Rect rect) {
        int i2;
        boolean z = true;
        Object allNodes = getAllNodes();
        int i3 = this.mKeyboardFocusedVirtualViewId;
        if (i3 == INVALID_ID) {
            Object obj = null;
        } else {
            mr mrVar = (mr) allNodes.a(i3);
        }
        switch (i) {
            case rq.b /*1*/:
            case rq.c /*2*/:
                if (kn.f(this.mHost) != 1) {
                    z = false;
                }
                Object obj2 = (mr) buf.a(allNodes, SPARSE_VALUES_ADAPTER, NODE_ADAPTER, obj, i, z, false);
                break;
            case rk.bZ /*17*/:
            case 33:
            case 66:
            case 130:
                Rect rect2 = new Rect();
                if (this.mKeyboardFocusedVirtualViewId != INVALID_ID) {
                    getBoundsInParent(this.mKeyboardFocusedVirtualViewId, rect2);
                } else if (rect != null) {
                    rect2.set(rect);
                } else {
                    oe.guessPreviouslyFocusedRect(this.mHost, i, rect2);
                }
                mr mrVar2 = (mr) buf.a(allNodes, SPARSE_VALUES_ADAPTER, NODE_ADAPTER, obj, rect2, i);
                break;
            default:
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        if (obj2 == null) {
            i2 = INVALID_ID;
        } else {
            i2 = allNodes.b(allNodes.a(obj2));
        }
        return requestKeyboardFocusForVirtualView(i2);
    }

    private ik getAllNodes() {
        List arrayList = new ArrayList();
        getVisibleVirtualViews(arrayList);
        ik ikVar = new ik();
        for (int i = 0; i < arrayList.size(); i++) {
            ikVar.a(i, createNodeForChild(i));
        }
        return ikVar;
    }

    private static Rect guessPreviouslyFocusedRect(View view, int i, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        switch (i) {
            case rk.bZ /*17*/:
                rect.set(width, 0, width, height);
                break;
            case 33:
                rect.set(0, height, width, height);
                break;
            case 66:
                rect.set(HOST_ID, 0, HOST_ID, height);
                break;
            case 130:
                rect.set(0, HOST_ID, width, HOST_ID);
                break;
            default:
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return rect;
    }

    private boolean clickKeyboardFocusedVirtualView() {
        return this.mKeyboardFocusedVirtualViewId != INVALID_ID && onPerformActionForVirtualView(this.mKeyboardFocusedVirtualViewId, 16, null);
    }

    public final boolean sendEventForVirtualView(int i, int i2) {
        if (i == INVALID_ID || !this.mManager.isEnabled()) {
            return false;
        }
        ViewParent parent = this.mHost.getParent();
        if (parent == null) {
            return false;
        }
        return lr.a(parent, this.mHost, createEvent(i, i2));
    }

    public final void invalidateRoot() {
        invalidateVirtualView(HOST_ID, 1);
    }

    public final void invalidateVirtualView(int i) {
        invalidateVirtualView(i, 0);
    }

    public final void invalidateVirtualView(int i, int i2) {
        if (i != INVALID_ID && this.mManager.isEnabled()) {
            ViewParent parent = this.mHost.getParent();
            if (parent != null) {
                AccessibilityEvent createEvent = createEvent(i, 2048);
                ml.a(createEvent, i2);
                lr.a(parent, this.mHost, createEvent);
            }
        }
    }

    @Deprecated
    public int getFocusedVirtualView() {
        return getAccessibilityFocusedVirtualViewId();
    }

    protected void onVirtualViewKeyboardFocusChanged(int i, boolean z) {
    }

    private void updateHoveredVirtualView(int i) {
        if (this.mHoveredVirtualViewId != i) {
            int i2 = this.mHoveredVirtualViewId;
            this.mHoveredVirtualViewId = i;
            sendEventForVirtualView(i, 128);
            sendEventForVirtualView(i2, 256);
        }
    }

    private AccessibilityEvent createEvent(int i, int i2) {
        switch (i) {
            case HOST_ID /*-1*/:
                return createEventForHost(i2);
            default:
                return createEventForChild(i, i2);
        }
    }

    private AccessibilityEvent createEventForHost(int i) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i);
        kn.a.a(this.mHost, obtain);
        return obtain;
    }

    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        onPopulateEventForHost(accessibilityEvent);
    }

    private AccessibilityEvent createEventForChild(int i, int i2) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        nj a = ml.a(obtain);
        mr obtainAccessibilityNodeInfo = obtainAccessibilityNodeInfo(i);
        nj.a.a(a.b).add(obtainAccessibilityNodeInfo.h());
        nj.a.b(a.b, obtainAccessibilityNodeInfo.i());
        a.a(obtainAccessibilityNodeInfo.f());
        nj.a.c(a.b, obtainAccessibilityNodeInfo.e());
        nj.a.b(a.b, obtainAccessibilityNodeInfo.d());
        nj.a.a(a.b, obtainAccessibilityNodeInfo.b());
        onPopulateEventForVirtualView(i, obtain);
        if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        nj.a.a(a.b, obtainAccessibilityNodeInfo.g());
        nj.a.a(a.b, this.mHost, i);
        obtain.setPackageName(this.mHost.getContext().getPackageName());
        return obtain;
    }

    private mr obtainAccessibilityNodeInfo(int i) {
        if (i == HOST_ID) {
            return createNodeForHost();
        }
        return createNodeForChild(i);
    }

    private mr createNodeForHost() {
        mr a = mr.a(mr.a.a(this.mHost));
        kn.a.a(this.mHost, a);
        ArrayList arrayList = new ArrayList();
        getVisibleVirtualViews(arrayList);
        if (mr.a.c(a.b) <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                mr.a.b(a.b, this.mHost, ((Integer) arrayList.get(i)).intValue());
            }
            return a;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    public void onInitializeAccessibilityNodeInfo(View view, mr mrVar) {
        super.onInitializeAccessibilityNodeInfo(view, mrVar);
        onPopulateNodeForHost(mrVar);
    }

    private boolean performAction(int i, int i2, Bundle bundle) {
        switch (i) {
            case HOST_ID /*-1*/:
                return performActionForHost(i2, bundle);
            default:
                return performActionForChild(i, i2, bundle);
        }
    }

    private boolean performActionForHost(int i, Bundle bundle) {
        return kn.a.a(this.mHost, i, bundle);
    }

    private boolean performActionForChild(int i, int i2, Bundle bundle) {
        switch (i2) {
            case rq.b /*1*/:
                return requestKeyboardFocusForVirtualView(i);
            case rq.c /*2*/:
                return clearKeyboardFocusForVirtualView(i);
            case 64:
                return requestAccessibilityFocus(i);
            case 128:
                return clearAccessibilityFocus(i);
            default:
                return onPerformActionForVirtualView(i, i2, bundle);
        }
    }

    private boolean intersectVisibleToUser(Rect rect) {
        if (rect == null || rect.isEmpty()) {
            return false;
        }
        if (this.mHost.getWindowVisibility() != 0) {
            return false;
        }
        ViewParent parent = this.mHost.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (kn.e(view) <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        if (parent == null) {
            return false;
        }
        if (this.mHost.getLocalVisibleRect(this.mTempVisibleRect)) {
            return rect.intersect(this.mTempVisibleRect);
        }
        return false;
    }

    private boolean requestAccessibilityFocus(int i) {
        if (!this.mManager.isEnabled() || !mo.a(this.mManager) || this.mAccessibilityFocusedVirtualViewId == i) {
            return false;
        }
        if (this.mAccessibilityFocusedVirtualViewId != INVALID_ID) {
            clearAccessibilityFocus(this.mAccessibilityFocusedVirtualViewId);
        }
        this.mAccessibilityFocusedVirtualViewId = i;
        this.mHost.invalidate();
        sendEventForVirtualView(i, 32768);
        return true;
    }

    private boolean clearAccessibilityFocus(int i) {
        if (this.mAccessibilityFocusedVirtualViewId != i) {
            return false;
        }
        this.mAccessibilityFocusedVirtualViewId = INVALID_ID;
        this.mHost.invalidate();
        sendEventForVirtualView(i, 65536);
        return true;
    }

    public final boolean requestKeyboardFocusForVirtualView(int i) {
        if ((!this.mHost.isFocused() && !this.mHost.requestFocus()) || this.mKeyboardFocusedVirtualViewId == i) {
            return false;
        }
        if (this.mKeyboardFocusedVirtualViewId != INVALID_ID) {
            clearKeyboardFocusForVirtualView(this.mKeyboardFocusedVirtualViewId);
        }
        this.mKeyboardFocusedVirtualViewId = i;
        onVirtualViewKeyboardFocusChanged(i, true);
        sendEventForVirtualView(i, 8);
        return true;
    }

    public final boolean clearKeyboardFocusForVirtualView(int i) {
        if (this.mKeyboardFocusedVirtualViewId != i) {
            return false;
        }
        this.mKeyboardFocusedVirtualViewId = INVALID_ID;
        onVirtualViewKeyboardFocusChanged(i, false);
        sendEventForVirtualView(i, 8);
        return true;
    }

    public void onPopulateEventForVirtualView(int i, AccessibilityEvent accessibilityEvent) {
    }

    protected void onPopulateEventForHost(AccessibilityEvent accessibilityEvent) {
    }

    public void onPopulateNodeForHost(mr mrVar) {
    }

    private mr createNodeForChild(int i) {
        mr a = mr.a(mr.a.a());
        mr.a.b(a.b, true);
        mr.a.c(a.b, true);
        a.a(DEFAULT_CLASS_NAME);
        a.b(INVALID_PARENT_BOUNDS);
        a.d(INVALID_PARENT_BOUNDS);
        onPopulateNodeForVirtualView(i, a);
        if (a.h() == null && a.i() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        a.a(this.mTempParentRect);
        if (this.mTempParentRect.equals(INVALID_PARENT_BOUNDS)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int a2 = a.a();
        if ((a2 & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        } else if ((a2 & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        } else {
            boolean z;
            mr.a.c(a.b, this.mHost.getContext().getPackageName());
            mr.a.a(a.b, this.mHost, i);
            mr.a.a(a.b, this.mHost);
            if (this.mAccessibilityFocusedVirtualViewId == i) {
                a.a(true);
                a.a(128);
            } else {
                a.a(false);
                a.a(64);
            }
            if (this.mKeyboardFocusedVirtualViewId == i) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                a.a(2);
            } else if (a.c()) {
                a.a(1);
            }
            mr.a.d(a.b, z);
            if (intersectVisibleToUser(this.mTempParentRect)) {
                mr.a.f(a.b, true);
                a.b(this.mTempParentRect);
            }
            a.c(this.mTempScreenRect);
            if (this.mTempScreenRect.equals(INVALID_PARENT_BOUNDS)) {
                this.mHost.getLocationOnScreen(this.mTempGlobalRect);
                a.a(this.mTempScreenRect);
                this.mTempScreenRect.offset(this.mTempGlobalRect[0] - this.mHost.getScrollX(), this.mTempGlobalRect[1] - this.mHost.getScrollY());
                a.d(this.mTempScreenRect);
            }
            return a;
        }
    }
}
