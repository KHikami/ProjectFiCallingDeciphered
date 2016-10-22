import android.content.Context;
import android.view.View;
import android.widget.TabHost.TabContentFactory;

final class es implements TabContentFactory {
    private final Context a;

    public es(Context context) {
        this.a = context;
    }

    public View createTabContent(String str) {
        View view = new View(this.a);
        view.setMinimumWidth(0);
        view.setMinimumHeight(0);
        return view;
    }
}
