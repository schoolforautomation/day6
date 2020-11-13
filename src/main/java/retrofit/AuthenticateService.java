package retrofit;

import model.User;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface AuthenticateService {

    @GET("rest/auth.php")
    public Call<User> getUser(@Query(value = "email", encoded = true) String email);
}
