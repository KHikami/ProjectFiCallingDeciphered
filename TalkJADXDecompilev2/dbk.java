package defpackage;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public final class dbk extends dq {
    String aj;
    private String[] ak;

    public Dialog a(Bundle bundle) {
        Bundle arguments = getArguments();
        this.ak = (String[]) arguments.getSerializable("dump_files");
        this.aj = arguments.getString("action");
        View inflate = getActivity().getLayoutInflater().inflate(gwb.gl, null);
        ((ListView) inflate.findViewById(ba.aO)).setAdapter(new dbl(this, getActivity(), this.ak));
        Builder builder = new Builder(getActivity());
        Resources resources = getResources();
        if ("load".equals(this.aj)) {
            builder.setTitle(resources.getString(bc.fL));
        } else if ("email".equals(this.aj)) {
            builder.setTitle(resources.getString(bc.cs));
        }
        builder.setView(inflate);
        return builder.create();
    }
}
