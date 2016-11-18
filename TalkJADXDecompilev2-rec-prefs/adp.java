package p000;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.support.v7.view.menu.ListMenuItemView;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;

public final class adp extends acj {
    final int f344g;
    final int f345h;
    private adn f346i;
    private MenuItem f347j;

    public /* bridge */ /* synthetic */ boolean mo83a(MotionEvent motionEvent, int i) {
        return super.mo83a(motionEvent, i);
    }

    public /* bridge */ /* synthetic */ boolean hasFocus() {
        return super.hasFocus();
    }

    public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
        return super.hasWindowFocus();
    }

    public /* bridge */ /* synthetic */ boolean isFocused() {
        return super.isFocused();
    }

    public /* bridge */ /* synthetic */ boolean isInTouchMode() {
        return super.isInTouchMode();
    }

    public adp(Context context, boolean z) {
        super(context, z);
        Configuration configuration = context.getResources().getConfiguration();
        if (VERSION.SDK_INT < 17 || 1 != configuration.getLayoutDirection()) {
            this.f344g = 22;
            this.f345h = 21;
            return;
        }
        this.f344g = 21;
        this.f345h = 22;
    }

    public void m660a(adn adn) {
        this.f346i = adn;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.f344g) {
            if (listMenuItemView.isEnabled() && listMenuItemView.m3289a().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        } else if (listMenuItemView == null || i != this.f345h) {
            return super.onKeyDown(i, keyEvent);
        } else {
            setSelection(-1);
            ((xx) getAdapter()).a().a(false);
            return true;
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (this.f346i != null) {
            int headersCount;
            xx xxVar;
            MenuItem a;
            MenuItem menuItem;
            xy a2;
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                xxVar = (xx) headerViewListAdapter.getWrappedAdapter();
            } else {
                headersCount = 0;
                xxVar = (xx) adapter;
            }
            if (motionEvent.getAction() != 10) {
                int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
                if (pointToPosition != -1) {
                    headersCount = pointToPosition - headersCount;
                    if (headersCount >= 0 && headersCount < xxVar.getCount()) {
                        a = xxVar.a(headersCount);
                        menuItem = this.f347j;
                        if (menuItem != a) {
                            a2 = xxVar.a();
                            if (menuItem != null) {
                                this.f346i.mo81a(a2, menuItem);
                            }
                            this.f347j = a;
                            if (a != null) {
                                this.f346i.mo82b(a2, a);
                            }
                        }
                    }
                }
            }
            a = null;
            menuItem = this.f347j;
            if (menuItem != a) {
                a2 = xxVar.a();
                if (menuItem != null) {
                    this.f346i.mo81a(a2, menuItem);
                }
                this.f347j = a;
                if (a != null) {
                    this.f346i.mo82b(a2, a);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }
}