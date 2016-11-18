package p000;

import android.database.Cursor;
import android.os.AsyncTask;
import android.preference.Preference;
import android.preference.PreferenceGroup;
import com.google.android.apps.hangouts.phone.ApnSettingsActivity;

public final class eix extends AsyncTask<Void, Void, Cursor> {
    final /* synthetic */ String f11628a;
    final /* synthetic */ ApnSettingsActivity f11629b;

    public eix(ApnSettingsActivity apnSettingsActivity, String str) {
        this.f11629b = apnSettingsActivity;
        this.f11628a = str;
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m13996a();
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        m13997a((Cursor) obj);
    }

    private Cursor m13996a() {
        String[] strArr = new String[]{this.f11628a};
        return this.f11629b.f6563f.query("apn", ApnSettingsActivity.f6557a, "numeric =?", strArr, null, null, null, null);
    }

    private void m13997a(Cursor cursor) {
        Object obj = 1;
        if (cursor != null) {
            try {
                PreferenceGroup preferenceGroup = (PreferenceGroup) this.f11629b.findPreference("apn_list");
                preferenceGroup.removeAll();
                this.f11629b.f6562c = fzo.m16704a(this.f11629b.f6563f, this.f11628a);
                while (cursor.moveToNext()) {
                    CharSequence string = cursor.getString(1);
                    CharSequence string2 = cursor.getString(2);
                    String string3 = cursor.getString(0);
                    if (fzo.m16711b(cursor.getString(3), "mms")) {
                        Preference eiw = new eiw(this.f11629b);
                        eiw.setKey(string3);
                        eiw.setTitle(string);
                        eiw.setSummary(string2);
                        eiw.setPersistent(false);
                        eiw.setOnPreferenceChangeListener(this.f11629b);
                        eiw.setSelectable(true);
                        if ((this.f11629b.f6562c != null && this.f11629b.f6562c.equals(string3)) || (r1 != null && this.f11629b.f6562c == null)) {
                            eiw.m13995a();
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
