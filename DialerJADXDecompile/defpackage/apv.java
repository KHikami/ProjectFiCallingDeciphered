package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract.Contacts;
import android.view.View;
import com.android.dialer.app.list.AllContactsFragment;

/* compiled from: PG */
/* renamed from: apv */
public final class apv extends aeb {
    public apv(AllContactsFragment allContactsFragment, Context context) {
        super(context);
    }

    protected final void a(View view, int i, Cursor cursor, int i2) {
        Object build;
        super.a(view, i, cursor, i2);
        Uri lookupUri = Contacts.getLookupUri(cursor.getLong(0), cursor.getString(6));
        long j = ((aef) b(i)).f;
        if (lookupUri == null || j == 0) {
            Uri uri = lookupUri;
        } else {
            build = lookupUri.buildUpon().appendQueryParameter("directory", String.valueOf(j)).build();
        }
        view.setTag(build);
    }
}
