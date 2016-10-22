import android.app.Fragment;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.Switch;

/* compiled from: PG */
public class bke extends Fragment implements OnCheckedChangeListener {
    Switch a;
    private SharedPreferences b;
    private String c;
    private boolean d;

    public bke(String str, boolean z) {
        this.c = str;
        this.d = true;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.b = PreferenceManager.getDefaultSharedPreferences(getActivity());
        if (this.a == null) {
            throw new RuntimeException("mSwitch is null; ensure sub-classes call setSwitch.");
        }
        this.a.setChecked(this.b.getBoolean(this.c, this.d));
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.b.edit().putBoolean(this.c, z).apply();
    }
}
