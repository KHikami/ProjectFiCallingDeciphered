package p000;

import android.os.AsyncTask;
import com.google.android.apps.hangouts.phone.ApnSettingsActivity;

public final class eiy extends AsyncTask<Void, Void, Void> {
    final /* synthetic */ String f11630a;
    final /* synthetic */ ApnSettingsActivity f11631b;

    public eiy(ApnSettingsActivity apnSettingsActivity, String str) {
        this.f11631b = apnSettingsActivity;
        this.f11630a = str;
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m13998a();
    }

    private Void m13998a() {
        this.f11631b.f6563f.update("apn", ApnSettingsActivity.f6559d, "current =?", ApnSettingsActivity.f6561g);
        String[] strArr = new String[]{this.f11630a};
        this.f11631b.f6563f.update("apn", ApnSettingsActivity.f6560e, "_id =?", strArr);
        return null;
    }
}
