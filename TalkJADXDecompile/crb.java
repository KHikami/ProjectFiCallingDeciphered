import android.app.LoaderManager.LoaderCallbacks;
import android.content.CursorLoader;
import android.content.Loader;
import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.apps.hangouts.content.EsProvider;

final class crb implements LoaderCallbacks<Cursor> {
    final /* synthetic */ cqx a;

    crb(cqx cqx) {
        this.a = cqx;
    }

    public /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        a(loader, (Cursor) obj);
    }

    public Loader<Cursor> onCreateLoader(int i, Bundle bundle) {
        String l = this.a.b.l();
        if (i != 0 || l == null) {
            return null;
        }
        return new CursorLoader(this.a.a, EsProvider.a(EsProvider.i, ((jca) jyn.a(this.a.a, jca.class)).a()), bkj.a, "conversation_id=?", new String[]{l}, null);
    }

    private void a(Loader<Cursor> loader, Cursor cursor) {
        if (loader.getId() == 0) {
            if (cursor != null && cursor.moveToFirst()) {
                String string = cursor.getString(3);
                if (TextUtils.isEmpty(string)) {
                    string = cursor.getString(4);
                }
                this.a.e = string;
            }
            this.a.c();
        }
    }

    public void onLoaderReset(Loader<Cursor> loader) {
    }
}
