import android.view.View;
import android.view.View.OnClickListener;

final class afc implements OnClickListener {
    final /* synthetic */ aez a;

    afc(aez aez) {
        this.a = aez;
    }

    public void onClick(View view) {
        int childCount = this.a.c.getChildCount();
        for (int i = 0; i < childCount; i++) {
            boolean z;
            View childAt = this.a.c.getChildAt(i);
            if (childAt == view) {
                z = true;
            } else {
                z = false;
            }
            childAt.setSelected(z);
        }
    }
}
