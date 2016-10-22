import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class bwj extends jgc {
    final /* synthetic */ bwe a;
    private final ExecutorService b;
    private final Pattern c;

    public bwj(bwe bwe, Context context) {
        this.a = bwe;
        super(context, "Babel_MsgListLoad");
        this.b = Executors.newSingleThreadExecutor();
        this.c = Pattern.compile(String.valueOf(this.a.f().getPath()).concat("/(\\d*)-(\\d*)"));
    }

    protected Executor a() {
        return this.b;
    }

    public void q_() {
        a(true);
        this.b.shutdownNow();
    }

    protected jgz a(Context context) {
        new Object[1][0] = this.c;
        List arrayList = new ArrayList();
        while (true) {
            try {
                arrayList.add((Uri) this.a.d.take());
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            if (f()) {
                new Object[1][0] = this.c;
                return new jgz(true);
            }
            this.a.d.drainTo(arrayList, 449);
            a(context, arrayList);
            arrayList.clear();
        }
    }

    private void a(Context context, List<Uri> list) {
        List arrayList = new ArrayList();
        for (Uri path : list) {
            Matcher matcher = this.c.matcher(path.getPath());
            if (matcher.find()) {
                arrayList.add(matcher.group(1));
                arrayList.add(matcher.group(2));
            }
        }
        if (!arrayList.isEmpty()) {
            new Object[1][0] = arrayList;
            StringBuilder append = new StringBuilder("_id >=? AND ").append("_id <=?");
            for (int i = 2; i < arrayList.size(); i += 2) {
                append.append(" OR _id").append(" >=? AND _id").append(" <=?");
            }
            Cursor query = context.getContentResolver().query(this.a.e(), bny.a, append.toString(), (String[]) arrayList.toArray(new String[0]), bny.b);
            if (query != null) {
                try {
                    bub a = bub.a(query);
                    Set hashSet = new HashSet();
                    for (int i2 = 0; i2 < arrayList.size(); i2 += 2) {
                        long ad = gwb.ad((String) arrayList.get(i2));
                        long ad2 = gwb.ad((String) arrayList.get(i2 + 1));
                        for (long j = ad; j <= ad2; j++) {
                            hashSet.add(String.valueOf(j));
                        }
                    }
                    this.a.a(a, hashSet, null);
                    gwb.a(new bwk(this, list.size()));
                } finally {
                    query.close();
                }
            }
        }
    }
}
