import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import java.util.Collection;

public final class gqb {
    private final String a;
    private final TextView b;

    public gqb(TextView textView) {
        gwb.aJ();
        this.b = (TextView) ba.a((Object) textView);
        this.a = textView.getText().toString();
    }

    public void a(Collection<gqd> collection) {
        if (!collection.isEmpty()) {
            if (gwb.aI()) {
                b(collection);
            } else {
                gwb.a(new gqc(this, collection));
            }
        }
    }

    void b(Collection<gqd> collection) {
        SpannableString spannableString = new SpannableString(this.b.getText());
        int i = 0;
        for (gqd gqd : collection) {
            int a;
            if (gqd.a(spannableString)) {
                gqd.b(spannableString);
                a = gqd.a() | i;
            } else {
                a = i;
            }
            i = a;
        }
        this.b.setText(spannableString);
        if (i != 0) {
            this.b.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }
}
