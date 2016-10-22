import android.content.Context;
import android.database.Cursor;
import android.os.AsyncTask;
import android.provider.ContactsContract.Contacts;

/* compiled from: PG */
public final class ava extends AsyncTask {
    private /* synthetic */ Context a;
    private /* synthetic */ avd b;

    public ava(Context context, avd avd) {
        this.a = context;
        this.b = avd;
    }

    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        return a();
    }

    public final /* synthetic */ void onPostExecute(Object obj) {
        Boolean bool = (Boolean) obj;
        if (this.b != null) {
            this.b.a(bool.booleanValue());
        }
    }

    private Boolean a() {
        if (this.a == null || !buf.i(this.a)) {
            return Boolean.valueOf(false);
        }
        boolean z;
        Cursor query = this.a.getContentResolver().query(Contacts.CONTENT_URI, ave.a, "send_to_voicemail=1", null, null);
        if (query != null) {
            try {
                z = query.getCount() > 0;
                query.close();
            } catch (Throwable th) {
                query.close();
            }
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
