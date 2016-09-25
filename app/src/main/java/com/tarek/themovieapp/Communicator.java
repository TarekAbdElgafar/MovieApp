package com.tarek.themovieapp;

/**
 * Created by TarEk on 9/23/2016.
 */
interface Communicator {
    public void response(MyMovie movie);

    void sendOnfirst(MyMovie movie);

    void hideFragment();

    void showFragment();

    void setTitleForActivity(int status);
}
