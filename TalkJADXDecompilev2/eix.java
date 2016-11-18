package defpackage;

import android.database.Cursor;
import android.os.AsyncTask;
import android.preference.Preference;
import android.preference.PreferenceGroup;
import com.google.android.apps.hangouts.phone.ApnSettingsActivity;

public final class eix extends AsyncTask<Void, Void, Cursor> {
    final /* synthetic */ String a;
    final /* synthetic */ ApnSettingsActivity b;

    public eix(ApnSettingsActivity apnSettingsActivity, String str) {
        this.b = apnSettingsActivity;
        this.a = str;
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return a();
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        a((Cursor) obj);
    }

    private Cursor a() {
        String[] strArr = new String[]{this.a};
        return this.b.f.query("apn", ApnSettingsActivity.a, "numeric =?", strArr, null, null, null, null);
    }

    private void a(Cursor cursor) {
        Object obj = 1;
        if (cursor != null) {
            try {
                PreferenceGroup preferenceGroup = (PreferenceGroup) this.b.findPreference("apn_list");
                preferenceGroup.removeAll();
                this.b.c = fzo.a(this.b.f, this.a);
                while (cursor.moveToNext()) {
                    CharSequence string = cursor.getString(1);
                    CharSequence string2 = cursor.getString(2);
                    String string3 = cursor.getString(0);
                    if (fzo.b(cursor.getString(3), "mms")) {
                        Preference eiw = new eiw(this.b);
                        eiw.setKey(string3);
                        eiw.setTitle(string);
                        eiw.setSummary(string2);
                        eiw.setPersistent(false);
                        eiw.setOnPreferenceChangeListener(this.b);
                        eiw.setSelectable(true);
                        if ((this.b.c != null && this.b.c.equals(string3)) || (r1 != null && this.b.c == null)) {
                            eiw.a();
                            obj = null;
                        }
                        preferenceGroup.addPreference(eiw);
                    }
                }
            } finally {
                cursor.close();
            }
        }
    }
}
