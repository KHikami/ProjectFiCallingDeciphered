package p000;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.google.android.apps.hangouts.quickreply.impl.QuickReplyActivity;

public final class fcf implements OnClickListener {
    final /* synthetic */ EditText f12682a;
    final /* synthetic */ QuickReplyActivity f12683b;

    public fcf(QuickReplyActivity quickReplyActivity, EditText editText) {
        this.f12683b = quickReplyActivity;
        this.f12682a = editText;
    }

    public void onClick(View view) {
        this.f12683b.m8970a(this.f12682a.getText().toString().trim());
        ((InputMethodManager) this.f12683b.getSystemService("input_method")).hideSoftInputFromWindow(this.f12683b.f6723q.getWindowToken(), 0);
        this.f12683b.finish();
        QuickReplyActivity quickReplyActivity = this.f12683b;
        if (quickReplyActivity.f6727u == 1) {
            quickReplyActivity.f6720n.mo550a(new fko(quickReplyActivity.f6724r, quickReplyActivity.f6725s, 3));
        }
    }
}
