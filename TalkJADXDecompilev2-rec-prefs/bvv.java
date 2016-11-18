package p000;

import android.view.View;
import android.view.View.OnLongClickListener;
import com.google.android.apps.hangouts.conversation.messagelist.impl.LinearLayoutEx;

final class bvv implements OnLongClickListener {
    final /* synthetic */ View f4611a;
    final /* synthetic */ bvu f4612b;

    bvv(bvu bvu, View view) {
        this.f4612b = bvu;
        this.f4611a = view;
    }

    public boolean onLongClick(View view) {
        ((LinearLayoutEx) this.f4611a).m8298b(true);
        return false;
    }
}
