import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.os.AsyncTask;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.provider.ContactsContract.Contacts;
import android.widget.Toast;

/* compiled from: PG */
public final class avb extends AsyncTask {
    private /* synthetic */ Context a;
    private /* synthetic */ aup b;
    private /* synthetic */ avf c;

    public avb(Context context, aup aup, avf avf) {
        this.a = context;
        this.b = aup;
        this.c = avf;
    }

    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        return a();
    }

    public final /* synthetic */ void onPostExecute(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            if (this.c != null) {
                this.c.a();
            }
        } else if (this.a != null) {
            Toast.makeText(this.a, this.a.getString(buf.iw), 0).show();
        }
    }

    private Boolean a() {
        if (this.a == null) {
            return Boolean.valueOf(false);
        }
        Cursor query = this.a.getContentResolver().query(Phone.CONTENT_URI, avg.a, "send_to_voicemail=1", null, null);
        if (query == null) {
            return Boolean.valueOf(false);
        }
        while (query.moveToNext()) {
            try {
                String string = query.getString(1);
                String string2 = query.getString(2);
                if (string != null) {
                    this.b.a(null, string, string2, null);
                }
            } finally {
                query.close();
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("send_to_voicemail", Integer.valueOf(0));
        this.a.getContentResolver().update(Contacts.CONTENT_URI, contentValues, "send_to_voicemail=1", null);
        return Boolean.valueOf(true);
    }
}
