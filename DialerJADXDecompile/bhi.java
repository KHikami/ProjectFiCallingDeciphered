import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.text.TextUtils;

/* compiled from: PG */
public class bhi extends PreferenceFragment {
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        addPreferencesFromResource(buf.lX);
        Preference findPreference = findPreference(getResources().getString(buf.lW));
        CharSequence a = a();
        if (!TextUtils.isEmpty(a)) {
            findPreference.setSummary(a);
        }
    }

    private final String a() {
        Context context = getContext();
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (NameNotFoundException e) {
            return "";
        }
    }

    public Context getContext() {
        return getActivity();
    }
}
