import android.content.Context;
import android.telecom.PhoneAccount;
import android.telecom.PhoneAccountHandle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

/* compiled from: PG */
final class akb extends ArrayAdapter {
    private int a;
    private /* synthetic */ ajy b;

    public akb(ajy ajy, Context context, int i, List list) {
        this.b = ajy;
        super(context, i, list);
        this.a = i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        akc akc;
        LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService("layout_inflater");
        if (view == null) {
            view = layoutInflater.inflate(this.a, null);
            akc = new akc(this);
            akc.a = (TextView) view.findViewById(cob.N);
            akc.b = (TextView) view.findViewById(cob.Q);
            akc.c = (ImageView) view.findViewById(cob.M);
            view.setTag(akc);
        } else {
            akc = (akc) view.getTag();
        }
        PhoneAccount phoneAccount = this.b.d.getPhoneAccount((PhoneAccountHandle) getItem(i));
        if (phoneAccount != null) {
            akc.a.setText(phoneAccount.getLabel());
            if (phoneAccount.getAddress() == null || TextUtils.isEmpty(phoneAccount.getAddress().getSchemeSpecificPart())) {
                akc.b.setVisibility(8);
            } else {
                akc.b.setVisibility(0);
                akc.b.setText(buf.a(phoneAccount.getAddress().getSchemeSpecificPart()));
            }
            akc.c.setImageDrawable(aby.a(phoneAccount, getContext()));
        }
        return view;
    }
}
