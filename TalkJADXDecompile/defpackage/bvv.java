package defpackage;

import android.view.View;
import android.view.View.OnLongClickListener;
import com.google.android.apps.hangouts.conversation.messagelist.impl.LinearLayoutEx;

/* renamed from: bvv */
final class bvv implements OnLongClickListener {
    final /* synthetic */ View a;
    final /* synthetic */ bvu b;

    bvv(bvu bvu, View view) {
        this.b = bvu;
        this.a = view;
    }

    public boolean onLongClick(View view) {
        ((LinearLayoutEx) this.a).b(true);
        return false;
    }
}
