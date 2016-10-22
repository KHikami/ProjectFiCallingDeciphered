import android.content.Context;
import android.content.Intent;
import android.support.v4.content.FileProvider;
import java.io.File;

/* compiled from: PG */
public class ary {
    final /* synthetic */ asp a;

    public void a(String str) {
        this.a.i.j();
        if (str == null) {
            this.a.i.g();
            return;
        }
        Object a = FileProvider.a(this.a.e, "com.google.android.dialer.files", new File(str));
        Context context = this.a.e;
        asp asp = this.a;
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.STREAM", a);
        intent.setFlags(1);
        intent.setType(asp.e.getContentResolver().getType(a));
        context.startActivity(Intent.createChooser(intent, this.a.e.getResources().getText(cob.bu)));
    }

    ary(asp asp) {
        this.a = asp;
    }
}
