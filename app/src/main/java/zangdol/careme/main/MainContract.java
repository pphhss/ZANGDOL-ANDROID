package zangdol.careme.main;

import android.app.Activity;

public class MainContract {
    public interface Presenter{
        void logout();
        void checkLogin();
        void getSpeciesCode();
    }
    public interface View{
        void changeLoginState(boolean isLogin);
        void moveLoginActivity();
    }
}
