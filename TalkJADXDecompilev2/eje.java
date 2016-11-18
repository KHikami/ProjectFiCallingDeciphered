package defpackage;

import android.content.Context;
import android.text.Html;
import android.text.TextUtils;
import com.google.android.apps.hangouts.phone.BabelHomeActivity;

public final class eje extends erm {
    final /* synthetic */ BabelHomeActivity a;

    public eje(BabelHomeActivity babelHomeActivity, Context context, kbu kbu, int i, int i2) {
        this.a = babelHomeActivity;
        super(context, kbu, i, i2);
    }

    protected void c() {
    }

    public void a(etu etu) {
        String str;
        if (TextUtils.isEmpty(etu.a())) {
            str = null;
        } else {
            str = Html.fromHtml(etu.a()).toString();
        }
        this.a.c(str);
    }
}
