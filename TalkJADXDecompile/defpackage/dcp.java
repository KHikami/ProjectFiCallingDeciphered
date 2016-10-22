package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ListView;

/* renamed from: dcp */
public abstract class dcp<ListViewType extends AbsListView> extends dcj implements OnScrollListener {
    private int a;
    private int b;
    public ListViewType bI;
    private int c;
    private int d;

    public dcp() {
        this.c = -1;
        this.d = -1;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.a = bundle.getInt("scroll_pos");
            this.b = bundle.getInt("scroll_off");
            return;
        }
        this.a = 0;
        this.b = 0;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, int i) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle, i);
        this.bI = (AbsListView) onCreateView.findViewById(16908298);
        this.bI.setOnScrollListener(this);
        return onCreateView;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.bI.setOnScrollListener(null);
        this.bI = null;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (!getActivity().isFinishing() && this.bI != null) {
            am();
            bundle.putInt("scroll_pos", this.a);
            bundle.putInt("scroll_off", this.b);
        }
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        if (i3 > 0) {
            this.c = i + i2;
            this.d = i3;
        }
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
    }

    protected void am() {
        if (this.bI != null) {
            this.a = this.bI.getFirstVisiblePosition();
            View childAt = this.bI.getChildAt(0);
            if (childAt != null) {
                this.b = childAt.getTop();
            } else {
                this.b = 0;
            }
            if (gwb.a(gwb.H(), "babel_extra_log_scrolling", false)) {
                int i = this.a;
                glk.c("Babel_Scroll", "saveScrollPosition: " + i + " : " + this.b, new Object[0]);
            }
        }
    }

    public void an() {
        if (this.bI == null || !(this.bI instanceof ListView)) {
            return;
        }
        if (this.b != 0 || this.a != 0) {
            ((ListView) this.bI).setSelectionFromTop(this.a, this.b);
            if (gwb.a(gwb.H(), "babel_extra_log_scrolling", false)) {
                int i = this.a;
                glk.c("Babel_Scroll", "restoreScrollPosition: " + i + " : " + this.b, new Object[0]);
            }
            this.a = 0;
            this.b = 0;
        }
    }
}
