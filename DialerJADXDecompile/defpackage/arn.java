package defpackage;

import android.app.LoaderManager.LoaderCallbacks;
import android.content.Context;
import android.content.Loader;
import android.os.Bundle;

/* compiled from: PG */
/* renamed from: arn */
public final class arn implements LoaderCallbacks {
    private final Context a;

    public arn(Context context) {
        this.a = context.getApplicationContext();
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        return new arm(this.a);
    }

    public final void onLoadFinished(Loader loader, Object obj) {
    }

    public final void onLoaderReset(Loader loader) {
    }
}
