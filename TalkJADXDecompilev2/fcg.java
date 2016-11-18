package defpackage;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.google.android.apps.hangouts.quickreply.impl.QuickReplyActivity;

public final class fcg implements OnClickListener {
    final /* synthetic */ EditText a;
    final /* synthetic */ QuickReplyActivity b;

    public fcg(QuickReplyActivity quickReplyActivity, EditText editText) {
        this.b = quickReplyActivity;
        this.a = editText;
    }

    public void onClick(View view) {
        Object trim = this.a.getText().toString().trim();
        Intent a = gwb.a(this.b.r, this.b.s, this.b.v);
        a.putExtra("opened_from_impression", this.b.w);
        if (!TextUtils.isEmpty(trim)) {
            a.setType("text/plain");
            a.putExtra("android.intent.extra.TEXT", trim);
        }
        this.b.startActivity(a);
        this.b.finish();
    }
}
