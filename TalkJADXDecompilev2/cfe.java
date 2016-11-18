package defpackage;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ListView;
import com.google.android.apps.hangouts.views.MessageListItemView;

final class cfe implements OnScrollListener {
    final /* synthetic */ cdr a;

    cfe(cdr cdr) {
        this.a = cdr;
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        boolean z;
        cdr cdr = this.a;
        bko bko = this.a.av;
        if (!(!gwb.a(cdr.context, "babel_log_scroll_error_impressions", true) || cdr.at || cdr.au)) {
            z = i2 > 0 && i + i2 < i3;
            View childAt = absListView.getChildAt(absListView.getChildCount() - 1);
            int bottom = childAt != null ? childAt.getBottom() - absListView.getBottom() : 0;
            boolean z2 = bottom > 0;
            if (z || z2) {
                cdr.au = true;
                cdr.h.a(new cfg(cdr, bko, z, i3, i, i2, z2, bottom, childAt, absListView));
                if (gwb.a(cdr.context, "babel_attempt_scroll_error_autofix", true)) {
                    gwb.a(new cfh(cdr, absListView, bko), 250);
                }
            }
        }
        if (cdr.a) {
            String valueOf = String.valueOf(cdr);
            new StringBuilder(String.valueOf(valueOf).length() + 144).append(valueOf).append(" onScroll   mInitialLoadFinished: ").append(cdr.aQ).append("  mMessagesLimit: ").append(cdr.bz).append("  firstVisible: ").append(i).append("  mFirstLocalEventTimestamp: ").append(cdr.bd);
        }
        if (gwb.a(cdr.context, "babel_extra_log_scrolling", false)) {
            StackTraceElement[] stackTrace = new Exception().getStackTrace();
            if (!(stackTrace[1].getClassName().equals(AbsListView.class.getName()) && stackTrace[1].getMethodName().equals("invokeOnItemScrollListener") && stackTrace[2].getClassName().equals(AbsListView.class.getName()) && stackTrace[2].getMethodName().equals("trackMotionScroll")) && (!(stackTrace[1].getClassName().equals(AbsListView.class.getName()) && stackTrace[1].getMethodName().equals("invokeOnItemScrollListener") && stackTrace[2].getClassName().equals(ListView.class.getName()) && stackTrace[2].getMethodName().equals("layoutChildren")) && stackTrace[1].getClassName().equals(AbsListView.class.getName()) && stackTrace[1].getMethodName().equals("invokeOnItemScrollListener") && stackTrace[2].getClassName().equals(AbsListView.class.getName()))) {
                stackTrace[2].getMethodName().equals("setOnScrollListener");
            }
        }
        cdr.a(i, ((ListView) absListView).getHeaderViewsCount());
        View childAt2 = absListView.getChildAt(absListView.getChildCount() - 1);
        if (childAt2 != null) {
            int bottom2 = childAt2.getBottom();
            int height = absListView.getHeight();
            z = i + i2 == i3;
            if (!z || cdr.aY.d() || gwb.i(cdr.d()) || cdr.aO != null) {
                cdr.aY.c();
            } else {
                cdr.aY.a(bottom2 - height);
            }
            ((bns) cdr.bH).b(!z);
            if (gwb.a(cdr.context, "babel_extra_log_scrolling", false)) {
                glk.a("Babel_Scroll", "onScroll isAtBottom:" + z + " lastItemBottom:" + bottom2 + " listView bottom: " + ((ListView) cdr.bI).getBottom(), new Object[0]);
            }
            if (z && bottom2 == ((ListView) cdr.bI).getBottom() && cdr.aM) {
                cdr.aM = false;
                if (gwb.a(cdr.context, "babel_disable_events_on_auto_scroll", true)) {
                    glk.c("Babel_Scroll", "force update after autoScroll.", new Object[0]);
                    cdr.onScrollStateChanged(null, 0);
                }
            }
        }
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
        cdr cdr = this.a;
        cdr.at = true;
        if (gwb.a(cdr.context, "babel_extra_log_scrolling", false)) {
            glk.c("Babel_Scroll", "onScrollStateChanged scrollState:" + i + " autoScrolling:" + cdr.aM, new Object[0]);
        }
        if (!cdr.aM || !gwb.a(cdr.context, "babel_disable_events_on_auto_scroll", true)) {
            switch (i) {
                case 0:
                    cdr.aE.b();
                    ((bns) cdr.bH).c(false);
                    for (MessageListItemView v : cdr.bq) {
                        v.v();
                    }
                    return;
                case 1:
                    ((bns) cdr.bH).c(true);
                    gwb.x(cdr.getView());
                    cdr.aW.b();
                    return;
                case 2:
                    cdr.aE.a();
                    return;
                default:
                    return;
            }
        }
    }
}
