package p000;

import android.view.View;
import android.view.View.OnClickListener;

final class afc implements OnClickListener {
    final /* synthetic */ aez f510a;

    afc(aez aez) {
        this.f510a = aez;
    }

    public void onClick(View view) {
        int childCount = this.f510a.f499c.getChildCount();
        for (int i = 0; i < childCount; i++) {
            boolean z;
            View childAt = this.f510a.f499c.getChildAt(i);
            if (childAt == view) {
                z = true;
            } else {
                z = false;
            }
            childAt.setSelected(z);
        }
    }
}
