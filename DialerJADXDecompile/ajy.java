import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.telecom.TelecomManager;
import android.widget.CheckBox;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
public final class ajy extends DialogFragment {
    List a;
    boolean b;
    boolean c;
    TelecomManager d;
    public akd e;
    private int f;
    private boolean g;

    public static ajy a(List list, akd akd) {
        return a(buf.gj, false, list, akd);
    }

    public static ajy a(int i, boolean z, List list, akd akd) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            arrayList.addAll(list);
        }
        ajy ajy = new ajy();
        Bundle bundle = new Bundle();
        bundle.putInt("title_res_id", i);
        bundle.putBoolean("can_set_default", z);
        bundle.putParcelableArrayList("account_handles", arrayList);
        bundle.putParcelable("listener", akd);
        ajy.setArguments(bundle);
        ajy.e = akd;
        return ajy;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("is_default_checked", this.c);
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        this.f = getArguments().getInt("title_res_id");
        this.g = getArguments().getBoolean("can_set_default");
        this.a = getArguments().getParcelableArrayList("account_handles");
        this.e = (akd) getArguments().getParcelable("listener");
        if (bundle != null) {
            this.c = bundle.getBoolean("is_default_checked");
        }
        this.b = false;
        this.d = (TelecomManager) getActivity().getSystemService("telecom");
        OnClickListener ajz = new ajz(this);
        OnCheckedChangeListener aka = new aka(this);
        Builder builder = new Builder(getActivity());
        Dialog create = builder.setTitle(this.f).setAdapter(new akb(this, builder.getContext(), buf.dv, this.a), ajz).create();
        if (this.g) {
            LinearLayout linearLayout = (LinearLayout) getActivity().getLayoutInflater().inflate(buf.ds, null);
            CheckBox checkBox = (CheckBox) linearLayout.findViewById(cob.D);
            checkBox.setOnCheckedChangeListener(aka);
            checkBox.setChecked(this.c);
            create.getListView().addFooterView(linearLayout);
        }
        return create;
    }

    public final void onStop() {
        if (!(this.b || this.e == null)) {
            this.e.onReceiveResult(2, null);
        }
        super.onStop();
    }
}
