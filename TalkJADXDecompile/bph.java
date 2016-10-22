import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class bph {
    Map<Integer, Set<String>> a;

    bph() {
        this.a = new HashMap();
        RealTimeChatService.a(new bpi(this));
    }

    public boolean a(int i, String str) {
        Set set = (Set) this.a.get(Integer.valueOf(i));
        return set != null && set.contains(str);
    }
}
