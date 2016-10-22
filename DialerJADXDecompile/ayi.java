import android.app.AlertDialog.Builder;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.EditText;

/* compiled from: PG */
public final class ayi implements OnItemClickListener {
    private /* synthetic */ ayc a;

    public ayi(ayc ayc) {
        this.a = ayc;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        bdf.a((Object) this, "RespondViaSmsItemClickListener.onItemClick(" + i + ")...");
        String str = (String) adapterView.getItemAtPosition(i);
        bdf.b((Object) this, new StringBuilder(String.valueOf(str).length() + 13).append("- message: '").append(str).append("'").toString());
        this.a.b();
        if (i == adapterView.getCount() - 1) {
            ayc ayc = this.a;
            Builder builder = new Builder(ayc.getActivity());
            View editText = new EditText(builder.getContext());
            builder.setCancelable(true).setView(editText).setPositiveButton(aq.cp, new ayg(ayc, editText)).setNegativeButton(aq.co, new ayf(ayc)).setOnCancelListener(new aye(ayc)).setTitle(aq.do);
            ayc.d = builder.create();
            editText.addTextChangedListener(new ayh(ayc));
            ayc.d.getWindow().setSoftInputMode(5);
            ayc.d.getWindow().addFlags(524288);
            ayc.d.show();
            ayc.d.getButton(-1).setEnabled(false);
            return;
        }
        ((ayj) this.a.e).a(str);
    }
}
