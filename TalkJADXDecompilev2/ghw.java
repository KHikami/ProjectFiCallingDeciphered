package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public final class ghw extends dr {
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(gwb.vX, viewGroup, false);
        ListView listView = (ListView) inflate.findViewById(16908298);
        listView.setAdapter(new ArrayAdapter(getActivity(), 17367043, new String[]{getActivity().getString(gwb.wh), getActivity().getString(gwb.wg)}));
        listView.setOnItemClickListener(new ghx(this));
        return inflate;
    }
}
