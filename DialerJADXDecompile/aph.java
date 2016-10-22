import android.app.FragmentManager;
import android.content.Context;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.text.BidiFormatter;
import android.text.TextDirectionHeuristics;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.QuickContactBadge;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

/* compiled from: PG */
public class aph extends SimpleCursorAdapter {
    FragmentManager a;
    private Context b;
    private awt c;
    private BidiFormatter d;
    private aaz e;

    public aph(Context context, FragmentManager fragmentManager, awt awt, aaz aaz) {
        super(context, buf.hv, null, new String[0], new int[0], 0);
        this.d = BidiFormatter.getInstance();
        this.b = context;
        this.a = fragmentManager;
        this.c = awt;
        this.e = aaz;
    }

    public final void a(View view, String str, String str2) {
        aws aws;
        CharSequence a;
        String str3;
        String valueOf;
        int i;
        TextView textView = (TextView) view.findViewById(aq.H);
        TextView textView2 = (TextView) view.findViewById(aq.I);
        ImageView imageView = (QuickContactBadge) view.findViewById(aq.aZ);
        imageView.setOverlay(null);
        if (abw.a()) {
            imageView.setPrioritizedMimeType("vnd.android.cursor.item/phone_v2");
        }
        aws a2 = this.c.a(str, str2);
        if (a2 == null) {
            a2 = new aws();
            a2.h = str;
            aws = a2;
        } else {
            aws = a2;
        }
        if (TextUtils.isEmpty(aws.d)) {
            a = awy.a(this.b, aws.h);
        } else {
            a = Phone.getTypeLabel(this.b.getResources(), aws.f, aws.g);
        }
        if (!TextUtils.isEmpty(aws.i)) {
            str3 = aws.i;
        } else if (TextUtils.isEmpty(aws.h)) {
            str3 = "";
        } else {
            str3 = aws.h;
        }
        CharSequence unicodeWrap = this.d.unicodeWrap(str3, TextDirectionHeuristics.LTR);
        if (TextUtils.isEmpty(aws.d)) {
            textView.setText(unicodeWrap);
            if (TextUtils.isEmpty(a)) {
                textView2.setVisibility(8);
            } else {
                textView2.setText(a);
                textView2.setVisibility(0);
            }
        } else {
            str3 = aws.d;
            textView.setText(aws.d);
            valueOf = String.valueOf(a);
            textView2.setText(new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(unicodeWrap).length()).append(valueOf).append(" ").append(unicodeWrap).toString());
        }
        if (aws.b == null) {
            valueOf = null;
        } else {
            valueOf = buf.e(aws.b);
        }
        if (this.c.a(aws.p)) {
            i = 2;
        } else {
            i = 1;
        }
        abc abc = new abc(str3, valueOf, i, true);
        imageView.assignContactUri(aws.b);
        imageView.setContentDescription(this.b.getResources().getString(cob.bG, new Object[]{str3}));
        this.e.a(imageView, aws.l, false, true, abc);
    }
}
