package defpackage;

import android.os.AsyncTask;
import com.google.android.apps.hangouts.phone.ApnSettingsActivity;

/* renamed from: eiy */
public final class eiy extends AsyncTask<Void, Void, Void> {
    final /* synthetic */ String a;
    final /* synthetic */ ApnSettingsActivity b;

    public eiy(ApnSettingsActivity apnSettingsActivity, String str) {
        this.b = apnSettingsActivity;
        this.a = str;
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return a();
    }

    private Void a() {
        this.b.f.update("apn", ApnSettingsActivity.d, "current =?", ApnSettingsActivity.g);
        String[] strArr = new String[]{this.a};
        this.b.f.update("apn", ApnSettingsActivity.e, "_id =?", strArr);
        return null;
    }
}
