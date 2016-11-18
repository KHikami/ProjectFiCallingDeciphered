package p000;

import android.view.View;
import android.view.View.OnLongClickListener;
import com.google.android.apps.hangouts.views.MessageListItemView;

public final class gpq implements OnLongClickListener {
    final /* synthetic */ MessageListItemView f15878a;

    public gpq(MessageListItemView messageListItemView) {
        this.f15878a = messageListItemView;
    }

    public boolean onLongClick(View view) {
        this.f15878a.f7079j = true;
        return false;
    }
}
