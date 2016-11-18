package p000;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.google.android.apps.hangouts.quickreply.impl.QuickReplyActivity;

public final class fcg implements OnClickListener {
    final /* synthetic */ EditText f12684a;
    final /* synthetic */ QuickReplyActivity f12685b;

    public fcg(QuickReplyActivity quickReplyActivity, EditText editText) {
        this.f12685b = quickReplyActivity;
        this.f12684a = editText;
    }

    public void onClick(View view) {
        Object trim = this.f12684a.getText().toString().trim();
        Intent a = gwb.m1537a(this.f12685b.f6724r, this.f12685b.f6725s, this.f12685b.f6728v);
        a.putExtra("opened_from_impression", this.f12685b.f6729w);
        if (!TextUtils.isEmpty(trim)) {
            a.setType("text/plain");
            a.putExtra("android.intent.extra.TEXT", trim);
        }
        this.f12685b.startActivity(a);
        this.f12685b.finish();
    }
}
