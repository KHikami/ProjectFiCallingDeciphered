import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.phenotype.Configurations;
import com.google.android.gms.phenotype.DogfoodsToken;
import com.google.android.gms.phenotype.ExperimentTokens;
import com.google.android.gms.phenotype.Flag;

public interface cni extends IInterface {
    void a(Status status);

    void a(Status status, Configurations configurations);

    void a(Status status, DogfoodsToken dogfoodsToken);

    void a(Status status, ExperimentTokens experimentTokens);

    void a(Status status, Flag flag);

    void b(Status status);

    void b(Status status, Configurations configurations);

    void c(Status status);

    void d(Status status);

    void e(Status status);
}
