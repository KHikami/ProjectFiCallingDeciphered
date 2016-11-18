package p000;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.hangouts.views.ConversationListItemView;

public final class gnm implements OnClickListener {
    final /* synthetic */ ConversationListItemView f15737a;

    public gnm(ConversationListItemView conversationListItemView) {
        this.f15737a = conversationListItemView;
    }

    public void onClick(View view) {
        int i;
        int i2;
        boolean z = this.f15737a.i == 0;
        if (this.f15737a.m9313p()) {
            i = 1;
        } else {
            i = 2;
        }
        if (z) {
            i2 = 57;
        } else {
            i2 = 58;
        }
        if (this.f15737a.j != null && this.f15737a.f != null) {
            dbj dbj = this.f15737a.j;
            String str = this.f15737a.f;
            int i3 = this.f15737a.g;
            dbj.mo1145a(str, z, i, i2);
        }
    }
}
