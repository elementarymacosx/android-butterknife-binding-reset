package htin.linnzaw.butterknifebindingreset.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

import htin.linnzaw.butterknifebindingreset.pojo.Users;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;
    private MutableLiveData<List<Users>> users;

    public HomeViewModel()
    {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText()
    {
        return mText;
    }

    public LiveData<List<Users>> getUsers()
    {
        if (users == null)
        {
            users = new MutableLiveData<>();
            loadUsers();
            return users;
        }
        return users;
    }

    private void loadUsers()
    {

    }
}