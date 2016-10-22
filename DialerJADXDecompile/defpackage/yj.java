package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.support.v7.view.menu.ListMenuItemView;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;

/* compiled from: PG */
/* renamed from: yj */
public final class yj extends xj {
    yh d;
    private int e;
    private int f;
    private MenuItem g;

    public final /* bridge */ /* synthetic */ boolean a(MotionEvent motionEvent, int i) {
        return super.a(motionEvent, i);
    }

    public final /* bridge */ /* synthetic */ boolean hasFocus() {
        return super.hasFocus();
    }

    public final /* bridge */ /* synthetic */ boolean hasWindowFocus() {
        return super.hasWindowFocus();
    }

    public final /* bridge */ /* synthetic */ boolean isFocused() {
        return super.isFocused();
    }

    public final /* bridge */ /* synthetic */ boolean isInTouchMode() {
        return super.isInTouchMode();
    }

    public yj(Context context, boolean z) {
        super(context, z);
        Configuration configuration = context.getResources().getConfiguration();
        if (VERSION.SDK_INT < 17 || 1 != configuration.getLayoutDirection()) {
            this.e = 22;
            this.f = 21;
            return;
        }
        this.e = 21;
        this.f = 22;
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.e) {
            if (listMenuItemView.isEnabled() && listMenuItemView.a.hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        } else if (listMenuItemView == null || i != this.f) {
            return super.onKeyDown(i, keyEvent);
        } else {
            setSelection(-1);
            ((st) getAdapter()).a.a(false);
            return true;
        }
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        if (this.d != null) {
            int headersCount;
            st stVar;
            MenuItem a;
            MenuItem menuItem;
            su suVar;
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                stVar = (st) headerViewListAdapter.getWrappedAdapter();
            } else {
                headersCount = 0;
                stVar = (st) adapter;
            }
            if (motionEvent.getAction() != 10) {
                int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
                if (pointToPosition != -1) {
                    headersCount = pointToPosition - headersCount;
                    if (headersCount >= 0 && headersCount < stVar.getCount()) {
                        a = stVar.a(headersCount);
                        menuItem = this.g;
                        if (menuItem != a) {
                            suVar = stVar.a;
                            if (menuItem != null) {
                                this.d.a(suVar, menuItem);
                            }
                            this.g = a;
                            if (a != null) {
                                this.d.b(suVar, a);
                            }
                        }
                    }
                }
            }
            a = null;
            menuItem = this.g;
            if (menuItem != a) {
                suVar = stVar.a;
                if (menuItem != null) {
                    this.d.a(suVar, menuItem);
                }
                this.g = a;
                if (a != null) {
                    this.d.b(suVar, a);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }
}
