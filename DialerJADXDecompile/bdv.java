import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import android.provider.ContactsContract.Profile;
import android.widget.ImageView;

/* compiled from: PG */
final class bdv extends AsyncTask {
    private /* synthetic */ bdw a;
    private /* synthetic */ bdt b;

    bdv(bdt bdt, bdw bdw) {
        this.b = bdt;
        this.a = bdw;
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return a();
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        if (this.b.h != null) {
            abc abc;
            if (this.b.g == null) {
                this.b.g = aaz.a(this.b.c);
            }
            if (this.b.h != null) {
                abc = null;
            } else {
                abc = new abc(this.b.h.a, this.b.h.l, false);
            }
            ImageView c = this.a.c();
            if (c != null) {
                this.b.g.a(c, this.b.h.j, false, false, abc);
            }
        }
    }

    private Void a() {
        if (this.b.h == null) {
            this.b.h = new bbe();
            Cursor query = this.b.c.getContentResolver().query(Profile.CONTENT_URI, new String[]{"_id", "photo_uri", "lookup", "display_name", "display_name_alt"}, null, null, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        Uri uri;
                        this.b.h.l = query.getString(query.getColumnIndex("lookup"));
                        String string = query.getString(query.getColumnIndex("photo_uri"));
                        bbe bbe = this.b.h;
                        if (string == null) {
                            uri = null;
                        } else {
                            uri = Uri.parse(string);
                        }
                        bbe.j = uri;
                        this.b.h.a = query.getString(query.getColumnIndex("display_name"));
                        this.b.h.b = query.getString(query.getColumnIndex("display_name_alt"));
                    }
                    query.close();
                } catch (Throwable th) {
                    query.close();
                }
            }
        }
        return null;
    }
}
