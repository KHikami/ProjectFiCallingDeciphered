import android.content.Context;
import android.text.Html;

public final class fwk implements fwh {
    public jwi a(Context context) {
        jwi jwi = new jwi(context);
        String uri = gwb.K("merge_deprecation").toString();
        jwi.b(Html.fromHtml(context.getResources().getString(gwb.uI, new Object[]{uri})));
        jwi.a(gwb.z(uri));
        return jwi;
    }
}
