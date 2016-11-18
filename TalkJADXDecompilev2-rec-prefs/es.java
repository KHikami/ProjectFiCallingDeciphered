package p000;

import android.content.Context;
import android.view.View;
import android.widget.TabHost.TabContentFactory;

final class es implements TabContentFactory {
    private final Context f12147a;

    public es(Context context) {
        this.f12147a = context;
    }

    public View createTabContent(String str) {
        View view = new View(this.f12147a);
        view.setMinimumWidth(0);
        view.setMinimumHeight(0);
        return view;
    }
}
