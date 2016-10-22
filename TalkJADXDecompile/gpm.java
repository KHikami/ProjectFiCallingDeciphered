import com.google.android.apps.hangouts.views.MessageListItemView;

public final class gpm implements Runnable {
    final /* synthetic */ MessageListItemView a;

    public gpm(MessageListItemView messageListItemView) {
        this.a = messageListItemView;
    }

    public void run() {
        this.a.j();
    }
}
