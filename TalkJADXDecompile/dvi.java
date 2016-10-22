import android.content.res.Resources;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import java.util.Locale;

public final class dvi extends ery {
    public dvi() {
        super(gwb.rM, new int[]{bc.uL, bc.uM});
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        String language = Locale.getDefault().getLanguage();
        if (language == null || language.length() != 2) {
            str = "ko";
        } else {
            str = language;
        }
        TextView textView = (TextView) onCreateView.findViewById(bc.uK);
        Resources resources = onCreateView.getResources();
        int i = gwb.rO;
        Object[] objArr = new Object[3];
        objArr[0] = "https://www.google.co.kr/intl/ko/policies/terms/location/";
        objArr[1] = new StringBuilder(String.valueOf(str).length() + 44).append("https://www.google.com/intl/").append(str).append("/policies/terms/").toString();
        String str2 = "https://www.google.com/policies/privacy/?hl=";
        str = String.valueOf(str);
        objArr[2] = str.length() != 0 ? str2.concat(str) : new String(str2);
        textView.setText(Html.fromHtml(resources.getString(i, objArr)));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        ((Button) onCreateView.findViewById(bc.uL)).setText(gwb.rP);
        ((Button) onCreateView.findViewById(bc.uM)).setText(gwb.rN);
        return onCreateView;
    }

    protected String a() {
        return getString(gwb.rQ);
    }

    protected void a(int i) {
        if (i == bc.uM) {
            bkq.b(getContext(), true);
        } else {
            System.exit(0);
        }
        super.a(i);
    }
}
