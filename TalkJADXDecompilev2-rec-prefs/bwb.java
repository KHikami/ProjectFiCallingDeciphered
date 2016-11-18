package p000;

import android.content.Context;
import android.os.Bundle;

final class bwb implements fh<String> {
    final /* synthetic */ bvu f4618a;
    private final StringBuilder f4619b;
    private final Context f4620c;

    public /* synthetic */ void onLoadFinished(ig igVar, Object obj) {
        m6808a((String) obj);
    }

    bwb(bvu bvu, Context context, StringBuilder stringBuilder) {
        this.f4618a = bvu;
        this.f4619b = stringBuilder;
        this.f4620c = context;
    }

    public ig<String> onCreateLoader(int i, Bundle bundle) {
        return new buw(this.f4620c, this.f4618a.m6593b().m5638g(), this.f4618a.f4591e.f4390c);
    }

    private void m6808a(String str) {
        this.f4618a.f4594h = str;
        gwb.m1756a(this.f4620c, this.f4619b, this.f4618a.f4591e.m6587b(), null, this.f4618a.f4594h);
    }

    public void onLoaderReset(ig<String> igVar) {
    }
}
