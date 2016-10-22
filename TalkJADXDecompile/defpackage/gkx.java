package defpackage;

import android.view.View;
import android.widget.TabHost.TabContentFactory;
import com.google.android.apps.hangouts.util.TabHostEx;

/* renamed from: gkx */
public final class gkx implements TabContentFactory {
    final /* synthetic */ TabHostEx a;

    public gkx(TabHostEx tabHostEx) {
        this.a = tabHostEx;
    }

    public View createTabContent(String str) {
        View view = new View(this.a.getContext());
        view.setMinimumWidth(0);
        view.setMinimumHeight(0);
        return view;
    }
}
