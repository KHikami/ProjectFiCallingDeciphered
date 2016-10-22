import android.app.LoaderManager.LoaderCallbacks;
import android.content.ContentUris;
import android.content.Loader;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.provider.ContactsContract.Contacts;
import android.text.TextUtils;
import android.util.LongSparseArray;

/* compiled from: PG */
final class are implements LoaderCallbacks {
    private /* synthetic */ arc a;

    are(arc arc) {
        this.a = arc;
    }

    public final /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        boolean z;
        Cursor cursor = (Cursor) obj;
        aqq aqq = this.a.f;
        if (!(aqq.n || cursor == null || cursor.isClosed())) {
            int position;
            cursor.moveToPosition(-1);
            while (cursor.moveToNext()) {
                if (cursor.getInt(aqq.t) == 0) {
                    position = cursor.getPosition();
                    break;
                }
            }
            position = cursor.getCount();
            aqq.c = position;
            if (aqq.m) {
                aqq.j.a();
            }
            aqq.b = cursor.getCount() - aqq.c;
            aqq.a.clear();
            cursor.moveToPosition(-1);
            LongSparseArray longSparseArray = new LongSparseArray(cursor.getCount());
            int i = 0;
            while (cursor.moveToNext()) {
                if (cursor.getInt(aqq.t) <= 0 && i >= 20) {
                    break;
                }
                long j = cursor.getLong(aqq.i);
                adg adg = (adg) longSparseArray.get(j);
                if (adg == null) {
                    String string = cursor.getString(aqq.e);
                    String string2 = cursor.getString(aqq.d);
                    int i2 = cursor.getInt(aqq.h);
                    String string3 = cursor.getString(aqq.f);
                    CharSequence string4 = cursor.getString(aqq.g);
                    z = cursor.getInt(aqq.t) > 0;
                    boolean z2 = cursor.getInt(aqq.s) > 0;
                    adg adg2 = new adg();
                    adg2.k = j;
                    if (TextUtils.isEmpty(string3)) {
                        string3 = aqq.k.getString(cob.cp);
                    }
                    adg2.b = string3;
                    if (TextUtils.isEmpty(string4)) {
                        string3 = aqq.k.getString(cob.cp);
                    } else {
                        string3 = string4;
                    }
                    adg2.c = string3;
                    adg2.d = aqq.l.b();
                    adg2.h = string != null ? Uri.parse(string) : null;
                    adg2.j = string2;
                    adg2.i = ContentUris.withAppendedId(Uri.withAppendedPath(Contacts.CONTENT_LOOKUP_URI, string2), j);
                    adg2.m = z;
                    adg2.n = z2;
                    adg2.f = (String) Phone.getTypeLabel(aqq.k, cursor.getInt(aqq.q), cursor.getString(aqq.r));
                    adg2.g = cursor.getString(aqq.p);
                    adg2.l = i2;
                    aqq.a.add(adg2);
                    longSparseArray.put(j, adg2);
                    i++;
                } else if (!adg.n) {
                    adg.f = null;
                    adg.g = null;
                }
            }
            aqq.m = false;
            aqq.a(aqq.a);
            aqq.notifyDataSetChanged();
            aqq.notifyDataSetChanged();
            aqq.j.a(new long[0]);
        }
        arc arc = this.a;
        if (this.a.f.getCount() == 0) {
            z = true;
        } else {
            z = false;
        }
        arc.a(z);
    }

    public final void onLoaderReset(Loader loader) {
    }

    public final /* synthetic */ Loader onCreateLoader(int i, Bundle bundle) {
        return abk.a(this.a.getActivity());
    }
}
