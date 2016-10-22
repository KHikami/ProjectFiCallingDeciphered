package defpackage;

import com.google.android.apps.hangouts.views.MessageListItemView;

/* renamed from: gpm */
public final class gpm implements Runnable {
    final /* synthetic */ MessageListItemView a;

    public gpm(MessageListItemView messageListItemView) {
        this.a = messageListItemView;
    }

    public void run() {
        this.a.j();
    }
}
