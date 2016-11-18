package p000;

import android.content.Context;
import android.text.Html;
import android.text.TextUtils;
import com.google.android.apps.hangouts.phone.BabelHomeActivity;

public final class eje extends erm {
    final /* synthetic */ BabelHomeActivity f11639a;

    public eje(BabelHomeActivity babelHomeActivity, Context context, kbu kbu, int i, int i2) {
        this.f11639a = babelHomeActivity;
        super(context, kbu, i, i2);
    }

    protected void mo983c() {
    }

    public void mo982a(etu etu) {
        String str;
        if (TextUtils.isEmpty(etu.m14512a())) {
            str = null;
        } else {
            str = Html.fromHtml(etu.m14512a()).toString();
        }
        this.f11639a.m8859c(str);
    }
}
