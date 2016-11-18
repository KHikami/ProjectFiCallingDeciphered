package p000;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ListView;

public abstract class dcp<ListViewType extends AbsListView> extends dcj implements OnScrollListener {
    private int f5094a;
    private int f5095b;
    public ListViewType bI;
    private int f5096c = -1;
    private int f5097d = -1;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f5094a = bundle.getInt("scroll_pos");
            this.f5095b = bundle.getInt("scroll_off");
            return;
        }
        this.f5094a = 0;
        this.f5095b = 0;
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
            bundle.putInt("scroll_pos", this.f5094a);
            bundle.putInt("scroll_off", this.f5095b);
        }
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        if (i3 > 0) {
            this.f5096c = i + i2;
            this.f5097d = i3;
        }
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
    }

    protected void am() {
        if (this.bI != null) {
            this.f5094a = this.bI.getFirstVisiblePosition();
            View childAt = this.bI.getChildAt(0);
            if (childAt != null) {
                this.f5095b = childAt.getTop();
            } else {
                this.f5095b = 0;
            }
            if (gwb.m1906a(gwb.m1400H(), "babel_extra_log_scrolling", false)) {
                int i = this.f5094a;
                glk.m17979c("Babel_Scroll", "saveScrollPosition: " + i + " : " + this.f5095b, new Object[0]);
            }
        }
    }

    public void an() {
        if (this.bI == null || !(this.bI instanceof ListView)) {
            return;
        }
        if (this.f5095b != 0 || this.f5094a != 0) {
            ((ListView) this.bI).setSelectionFromTop(this.f5094a, this.f5095b);
            if (gwb.m1906a(gwb.m1400H(), "babel_extra_log_scrolling", false)) {
                int i = this.f5094a;
                glk.m17979c("Babel_Scroll", "restoreScrollPosition: " + i + " : " + this.f5095b, new Object[0]);
            }
            this.f5094a = 0;
            this.f5095b = 0;
        }
    }
}
