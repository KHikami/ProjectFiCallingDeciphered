import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;

final class ghl implements OnPreferenceClickListener {
    final /* synthetic */ ghj a;

    ghl(ghj ghj) {
        this.a = ghj;
    }

    public boolean onPreferenceClick(Preference preference) {
        ((ghq) jyn.a(this.a.getActivity(), ghq.class)).b(this.a.getActivity(), this.a);
        return true;
    }
}
