import android.content.Context;
import android.os.Bundle;

final class bwb implements fh<String> {
    final /* synthetic */ bvu a;
    private final StringBuilder b;
    private final Context c;

    public /* synthetic */ void onLoadFinished(ig igVar, Object obj) {
        a((String) obj);
    }

    bwb(bvu bvu, Context context, StringBuilder stringBuilder) {
        this.a = bvu;
        this.b = stringBuilder;
        this.c = context;
    }

    public ig<String> onCreateLoader(int i, Bundle bundle) {
        return new buw(this.c, this.a.b().g(), this.a.e.c);
    }

    private void a(String str) {
        this.a.h = str;
        gwb.a(this.c, this.b, this.a.e.b(), null, this.a.h);
    }

    public void onLoaderReset(ig<String> igVar) {
    }
}
