import android.view.View;
import android.view.View.OnClickListener;
import com.android.contacts.common.list.ViewPagerTabs;

/* compiled from: PG */
public final class aey implements OnClickListener {
    private /* synthetic */ int a;
    private /* synthetic */ ViewPagerTabs b;

    public aey(ViewPagerTabs viewPagerTabs, int i) {
        this.b = viewPagerTabs;
        this.a = i;
    }

    public final void onClick(View view) {
        this.b.a.b(this.b.e(this.a));
    }
}
