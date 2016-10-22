import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;

/* compiled from: PG */
final class bkc extends ClickableSpan {
    private /* synthetic */ bka a;

    bkc(bka bka) {
        this.a = bka;
    }

    public final void onClick(View view) {
        bka bka = this.a;
        AlertDialog create = new Builder(bka.getActivity()).setMessage(Html.fromHtml(bka.getString(buf.lC, new Object[]{buf.i(bka.getActivity(), "dialer_data_attribution"), buf.i(bka.getActivity(), "dialer_local_search")}))).setCancelable(false).setPositiveButton(17039370, new bkd(bka)).create();
        create.show();
        ((TextView) create.findViewById(16908299)).setMovementMethod(LinkMovementMethod.getInstance());
    }
}
