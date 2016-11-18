package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.google.android.apps.hangouts.quickreply.impl.QuickReplyActivity;

public final class fcf implements OnClickListener {
    final /* synthetic */ EditText a;
    final /* synthetic */ QuickReplyActivity b;

    public fcf(QuickReplyActivity quickReplyActivity, EditText editText) {
        this.b = quickReplyActivity;
        this.a = editText;
    }

    public void onClick(View view) {
        this.b.a(this.a.getText().toString().trim());
        ((InputMethodManager) this.b.getSystemService("input_method")).hideSoftInputFromWindow(this.b.q.getWindowToken(), 0);
        this.b.finish();
        QuickReplyActivity quickReplyActivity = this.b;
        if (quickReplyActivity.u == 1) {
            quickReplyActivity.n.a(new fko(quickReplyActivity.r, quickReplyActivity.s, 3));
        }
    }
}
