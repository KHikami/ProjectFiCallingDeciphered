import android.content.Context;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.widget.Toast;
import com.android.contacts.common.list.ViewPagerTabs;

/* compiled from: PG */
public final class aez implements OnLongClickListener {
    private int a;
    private /* synthetic */ ViewPagerTabs b;

    public aez(ViewPagerTabs viewPagerTabs, int i) {
        this.b = viewPagerTabs;
        this.a = i;
    }

    public final boolean onLongClick(View view) {
        int[] iArr = new int[2];
        this.b.getLocationOnScreen(iArr);
        Context context = this.b.getContext();
        int width = this.b.getWidth();
        int height = this.b.getHeight();
        int i = context.getResources().getDisplayMetrics().widthPixels;
        Toast makeText = Toast.makeText(context, this.b.a.b.c(this.a), 0);
        makeText.setGravity(49, ((width / 2) + iArr[0]) - (i / 2), iArr[1] + height);
        makeText.show();
        return true;
    }
}
