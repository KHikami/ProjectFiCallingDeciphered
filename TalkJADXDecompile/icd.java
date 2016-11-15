import android.database.ContentObserver;
import android.os.Handler;

final class icd extends ContentObserver {
    final /* synthetic */ icc a;

    icd(icc icc, Handler handler) {
        this.a = icc;
        super(handler);
    }

    //This method is called when a content change occurs.
    public void onChange(boolean z) {
        synchronized (icb.class) {
            icb.e.clear();//clear original hashmap/cache in icb
            icb.f = new Object();//reset icb's f object
            if (icb.g.length > 0) {//if the saved string array was non empty
                icb.b(this.a.a, icb.g);//icb.b(ContentResolver, String)
                //reset e to have every value that was stored in g
                //mapped to the matching part of new Content
            }
        }
    }
}
