import android.view.View;
import android.view.View.OnLongClickListener;
import com.google.android.apps.hangouts.views.MessageListItemView;

public final class gpq implements OnLongClickListener {
    final /* synthetic */ MessageListItemView a;

    public gpq(MessageListItemView messageListItemView) {
        this.a = messageListItemView;
    }

    public boolean onLongClick(View view) {
        this.a.j = true;
        return false;
    }
}
