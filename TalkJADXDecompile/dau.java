import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public final class dau extends jzl implements OnClickListener {
    CheckBox aj;
    CheckBox ak;
    dax al;

    public void onClick(DialogInterface dialogInterface, int i) {
    }

    public static dau a(int i, String str) {
        dau dau = new dau();
        Bundle bundle = new Bundle();
        bundle.putInt("account_id", i);
        bundle.putString("dialog_inviter_name", str);
        dau.setArguments(bundle);
        return dau;
    }

    public Dialog a(Bundle bundle) {
        Resources resources = getActivity().getResources();
        View inflate = View.inflate(getActivity(), gwb.gU, null);
        this.ak = (CheckBox) inflate.findViewById(ba.bR);
        this.aj = (CheckBox) inflate.findViewById(ba.bP);
        String string = getArguments().getString("dialog_inviter_name");
        bko e = fde.e(getArguments().getInt("account_id"));
        ((TextView) inflate.findViewById(ba.bQ)).setText(Html.fromHtml(resources.getString(bc.ef, new Object[]{string})));
        ((TextView) inflate.findViewById(ba.bO)).setText(Html.fromHtml(resources.getString(bc.eg, new Object[]{string})));
        TextView textView = (TextView) inflate.findViewById(ba.cH);
        gwb.a(textView, getActivity(), resources, "https://www.google.com/support/hangouts/?hl=%locale%", "blocking", bc.dl);
        this.aj.setOnCheckedChangeListener(new dav(this, textView));
        return new Builder(getActivity()).setView(inflate).setPositiveButton(resources.getString(bc.hR), new daw(this, e)).setNegativeButton(resources.getString(bc.O), null).create();
    }

    public void a(dax dax) {
        this.al = dax;
    }
}
