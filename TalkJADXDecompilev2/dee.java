package defpackage;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

public final class dee extends dq {
    public Dialog a(Bundle bundle) {
        Builder builder = new Builder(getActivity());
        View inflate = getActivity().getLayoutInflater().inflate(gwb.hw, null);
        ListView listView = (ListView) inflate.findViewById(ba.bu);
        Resources resources = getActivity().getResources();
        String a = fyx.a(fyx.b());
        List arrayList = new ArrayList();
        arrayList.add(resources.getString(bc.aB));
        arrayList.add(resources.getString(bc.aI, new Object[]{a}));
        arrayList.add(resources.getString(bc.y, new Object[]{a}));
        listView.setAdapter(new def(this, getActivity(), arrayList));
        builder.setTitle(bc.kJ).setView(inflate);
        return builder.create();
    }

    public void onCancel(DialogInterface dialogInterface) {
        ((ded) getTargetFragment()).getActivity().finish();
    }
}
