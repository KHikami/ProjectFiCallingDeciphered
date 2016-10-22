import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.hangouts.views.ConversationListItemView;

public final class gnm implements OnClickListener {
    final /* synthetic */ ConversationListItemView a;

    public gnm(ConversationListItemView conversationListItemView) {
        this.a = conversationListItemView;
    }

    public void onClick(View view) {
        int i;
        int i2;
        boolean z = this.a.i == 0;
        if (this.a.p()) {
            i = 1;
        } else {
            i = 2;
        }
        if (z) {
            i2 = 57;
        } else {
            i2 = 58;
        }
        if (this.a.j != null && this.a.f != null) {
            dbj dbj = this.a.j;
            String str = this.a.f;
            int i3 = this.a.g;
            dbj.a(str, z, i, i2);
        }
    }
}
