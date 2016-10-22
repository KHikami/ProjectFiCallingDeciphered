package defpackage;

import com.google.android.apps.hangouts.views.MessageListItemView;

/* renamed from: gpn */
public final class gpn implements Runnable {
    final /* synthetic */ MessageListItemView a;

    public gpn(MessageListItemView messageListItemView) {
        this.a = messageListItemView;
    }

    public void run() {
        this.a.i();
    }
}
