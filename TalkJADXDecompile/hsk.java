import android.content.Context;
import android.os.Looper;

final class hsk extends guc<hvm, hsl> {
    hsk() {
    }

    public /* synthetic */ gug a(Context context, Looper looper, gwa gwa, Object obj, guk guk, gul gul) {
        obj = (hsl) obj;
        gwb.f(obj, (Object) "Must provide valid PeopleOptions!");
        return new hvm(context, looper, guk, gul, String.valueOf(obj.a), gwa);
    }
}
