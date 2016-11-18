package p000;

import android.app.LoaderManager.LoaderCallbacks;
import android.content.CursorLoader;
import android.content.Loader;
import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.apps.hangouts.content.EsProvider;

final class crb implements LoaderCallbacks<Cursor> {
    final /* synthetic */ cqx f8931a;

    crb(cqx cqx) {
        this.f8931a = cqx;
    }

    public /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        m10806a(loader, (Cursor) obj);
    }

    public Loader<Cursor> onCreateLoader(int i, Bundle bundle) {
        String l = this.f8931a.f8905b.m10980l();
        if (i != 0 || l == null) {
            return null;
        }
        return new CursorLoader(this.f8931a.f8904a, EsProvider.m8251a(EsProvider.f6006i, ((jca) jyn.m25426a(this.f8931a.f8904a, jca.class)).mo2317a()), bkj.f3623a, "conversation_id=?", new String[]{l}, null);
    }

    private void m10806a(Loader<Cursor> loader, Cursor cursor) {
        if (loader.getId() == 0) {
            if (cursor != null && cursor.moveToFirst()) {
                String string = cursor.getString(3);
                if (TextUtils.isEmpty(string)) {
                    string = cursor.getString(4);
                }
                this.f8931a.f8908e = string;
            }
            this.f8931a.m10755c();
        }
    }

    public void onLoaderReset(Loader<Cursor> loader) {
    }
}
