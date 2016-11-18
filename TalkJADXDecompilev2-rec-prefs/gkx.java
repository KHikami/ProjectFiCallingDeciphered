package p000;

import android.view.View;
import android.widget.TabHost.TabContentFactory;
import com.google.android.apps.hangouts.util.TabHostEx;

public final class gkx implements TabContentFactory {
    final /* synthetic */ TabHostEx f15527a;

    public gkx(TabHostEx tabHostEx) {
        this.f15527a = tabHostEx;
    }

    public View createTabContent(String str) {
        View view = new View(this.f15527a.getContext());
        view.setMinimumWidth(0);
        view.setMinimumHeight(0);
        return view;
    }
}
