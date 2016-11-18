package p000;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public final class ggu extends dr {
    ggc f15255a;
    int[] f15256b;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 0;
        this.f15255a = ggc.m17608a(getActivity());
        this.f15256b = ggc.m17610a();
        View inflate = layoutInflater.inflate(gwb.vT, viewGroup, false);
        ListView listView = (ListView) inflate.findViewById(16908298);
        listView.setAdapter(new ArrayAdapter(getActivity(), gwb.vV, m17680a()));
        int b = this.f15255a.m17618b();
        while (i < this.f15256b.length) {
            if (this.f15256b[i] == b) {
                listView.setItemChecked(i, true);
                break;
            }
            i++;
        }
        listView.setOnItemClickListener(new ggv(this));
        Button button = (Button) inflate.findViewById(gwb.vS);
        button.setText(getActivity().getString(gwb.vY));
        button.setOnClickListener(new ggw(this));
        m17682a(inflate);
        ((Button) inflate.findViewById(gwb.vR)).setOnClickListener(new ggx(this));
        return inflate;
    }

    private String[] m17680a() {
        String[] strArr = new String[this.f15256b.length];
        for (int i = 0; i < this.f15256b.length; i++) {
            strArr[i] = fde.m14995a(getActivity(), this.f15256b[i]);
        }
        return strArr;
    }

    void m17682a(View view) {
        ((Button) view.findViewById(gwb.vS)).setEnabled(ggu.m17681b(view) != -1);
    }

    static int m17681b(View view) {
        return ((ListView) view.findViewById(16908298)).getCheckedItemPosition();
    }
}
