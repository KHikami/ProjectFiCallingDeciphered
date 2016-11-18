package p000;

import android.database.Cursor;
import android.os.Bundle;
import com.google.android.apps.hangouts.content.EsProvider;

final class bwx implements fh<Cursor> {
    final /* synthetic */ bwu f4700a;

    bwx(bwu bwu) {
        this.f4700a = bwu;
    }

    public /* synthetic */ void onLoadFinished(ig igVar, Object obj) {
        m6847a((Cursor) obj);
    }

    public ig<Cursor> onCreateLoader(int i, Bundle bundle) {
        return new ib(this.f4700a.f4682a, EsProvider.m8251a(EsProvider.f6006i, this.f4700a.f4683b), new String[]{"has_oldest_message"}, String.format("%s=?", new Object[]{"conversation_id"}), new String[]{this.f4700a.f4685d.m17986a()}, null);
    }

    private void m6847a(Cursor cursor) {
        boolean z = false;
        if (cursor != null && cursor.moveToFirst()) {
            bwu bwu = this.f4700a;
            if (cursor.getInt(0) != 0) {
                z = true;
            }
            bwu.f4691j = z;
            this.f4700a.f4686e.m6690c(this.f4700a.f4691j);
        }
    }

    public void onLoaderReset(ig<Cursor> igVar) {
        this.f4700a.f4691j = false;
    }
}
