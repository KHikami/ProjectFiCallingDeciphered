package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.apps.hangouts.views.MessageListItemView;

/* renamed from: gpu */
public final class gpu implements fh<String> {
    final /* synthetic */ MessageListItemView a;
    private final StringBuilder b;
    private final Context c;

    public /* synthetic */ void onLoadFinished(ig igVar, Object obj) {
        a((String) obj);
    }

    public gpu(MessageListItemView messageListItemView, Context context, StringBuilder stringBuilder) {
        this.a = messageListItemView;
        this.b = stringBuilder;
        this.c = context;
    }

    public ig<String> onCreateLoader(int i, Bundle bundle) {
        return new gpw(this.c, this.a.i.g(), this.a.h);
    }

    private void a(String str) {
        this.a.g = str;
        ba.a(this.c, this.b, this.a.d, null, this.a.g);
    }

    public void onLoaderReset(ig<String> igVar) {
    }
}
