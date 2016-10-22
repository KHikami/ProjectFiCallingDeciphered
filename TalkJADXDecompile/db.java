import android.app.ActivityOptions;
import android.os.Bundle;

final class db {
    private final ActivityOptions a;

    db(ActivityOptions activityOptions) {
        this.a = activityOptions;
    }

    public Bundle a() {
        return this.a.toBundle();
    }
}
