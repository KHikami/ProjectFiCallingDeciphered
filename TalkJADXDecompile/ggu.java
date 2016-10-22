import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public final class ggu extends dr {
    ggc a;
    int[] b;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 0;
        this.a = ggc.a(getActivity());
        this.b = ggc.a();
        View inflate = layoutInflater.inflate(gwb.vT, viewGroup, false);
        ListView listView = (ListView) inflate.findViewById(16908298);
        listView.setAdapter(new ArrayAdapter(getActivity(), gwb.vV, a()));
        int b = this.a.b();
        while (i < this.b.length) {
            if (this.b[i] == b) {
                listView.setItemChecked(i, true);
                break;
            }
            i++;
        }
        listView.setOnItemClickListener(new ggv(this));
        Button button = (Button) inflate.findViewById(gwb.vS);
        button.setText(getActivity().getString(gwb.vY));
        button.setOnClickListener(new ggw(this));
        a(inflate);
        ((Button) inflate.findViewById(gwb.vR)).setOnClickListener(new ggx(this));
        return inflate;
    }

    private String[] a() {
        String[] strArr = new String[this.b.length];
        for (int i = 0; i < this.b.length; i++) {
            strArr[i] = fde.a(getActivity(), this.b[i]);
        }
        return strArr;
    }

    void a(View view) {
        ((Button) view.findViewById(gwb.vS)).setEnabled(b(view) != -1);
    }

    static int b(View view) {
        return ((ListView) view.findViewById(16908298)).getCheckedItemPosition();
    }
}
