package p000;

import android.content.Context;
import android.os.Bundle;
import com.google.android.apps.hangouts.views.MessageListItemView;

public final class gpu implements fh<String> {
    final /* synthetic */ MessageListItemView f15882a;
    private final StringBuilder f15883b;
    private final Context f15884c;

    public /* synthetic */ void onLoadFinished(ig igVar, Object obj) {
        m18282a((String) obj);
    }

    public gpu(MessageListItemView messageListItemView, Context context, StringBuilder stringBuilder) {
        this.f15882a = messageListItemView;
        this.f15883b = stringBuilder;
        this.f15884c = context;
    }

    public ig<String> onCreateLoader(int i, Bundle bundle) {
        return new gpw(this.f15884c, this.f15882a.f7078i.m5638g(), this.f15882a.f7077h);
    }

    private void m18282a(String str) {
        this.f15882a.f7076g = str;
        ba.m4551a(this.f15884c, this.f15883b, this.f15882a.f7073d, null, this.f15882a.f7076g);
    }

    public void onLoaderReset(ig<String> igVar) {
    }
}
