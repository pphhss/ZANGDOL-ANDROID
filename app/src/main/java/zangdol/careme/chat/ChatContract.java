package zangdol.careme.chat;

import android.app.Activity;

public class ChatContract {

    public interface View{
        Activity getActivity();
        void setAdapter(MessageListAdapter adapter);
    }
    public interface Presenter{
        void getData();
        void connect();
        void disconnect();
        void sendMessage(String message);
    }
}