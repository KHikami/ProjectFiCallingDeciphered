import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;

public final class cqk extends ery {
    private View a;

    public cqk() {
        super(gwb.nK, new int[]{gwb.nJ});
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.a = super.onCreateView(layoutInflater, viewGroup, bundle);
        ((Button) this.a.findViewById(gwb.nJ)).setText(17039370);
        return this.a;
    }

    protected String a() {
        return getString(gwb.nL);
    }

    protected void a(int i) {
        int a = ((jca) this.binder.a(jca.class)).a();
        bkq.a(getContext(), fde.e(a), true);
        if (((CheckBox) this.a.findViewById(gwb.nI)).isChecked()) {
            ((ful) this.binder.a(ful.class)).a(a, true);
        }
        super.a(i);
    }
}
