import android.database.Cursor;
import android.os.Bundle;
import com.google.android.apps.hangouts.content.EsProvider;

final class bwx implements fh<Cursor> {
    final /* synthetic */ bwu a;

    bwx(bwu bwu) {
        this.a = bwu;
    }

    public /* synthetic */ void onLoadFinished(ig igVar, Object obj) {
        a((Cursor) obj);
    }

    public ig<Cursor> onCreateLoader(int i, Bundle bundle) {
        return new ib(this.a.a, EsProvider.a(EsProvider.i, this.a.b), new String[]{"has_oldest_message"}, String.format("%s=?", new Object[]{"conversation_id"}), new String[]{this.a.d.a()}, null);
    }

    private void a(Cursor cursor) {
        boolean z = false;
        if (cursor != null && cursor.moveToFirst()) {
            bwu bwu = this.a;
            if (cursor.getInt(0) != 0) {
                z = true;
            }
            bwu.j = z;
            this.a.e.c(this.a.j);
        }
    }

    public void onLoaderReset(ig<Cursor> igVar) {
        this.a.j = false;
    }
}
