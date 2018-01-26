package com.example.kruger.petagram.restApi;


public final class ConstantesRestApi {

    public static final String VERSION = "/v1/";
    public static final String ROOT_URL = "https://api.instagram.com" + VERSION;
    public static final String ACCESS_TOKEN = "6974332266.6e31c05.f01af65cdea641538194327adfd0b952";
    public static final String KEY_ACCESS_TOKEN = "access_token=";

    //public static final String KEY_GET_RECENT_MEDIA_USER = "users/self/media/recent/?";
    //public static final String URL_GET_RECENT_MEDIA_USER = KEY_GET_RECENT_MEDIA_USER + KEY_ACCESS_TOKEN + ACCESS_TOKEN;
    //https://api.instagram.com/v1/users/self/media/recent/?access_token=ACCESS-TOKEN

    public static final String KEY_GET_USERS = "users/search";
    public static final String URL_GET_USERS = KEY_GET_USERS;
    //https://api.instagram.com/v1/users/search?q=jack&access_token=ACCESS-TOKEN

    public static final String KEY_GET_RECENT_MEDIA_BY_USER_ID = "users/{user-id}/media/recent/?";
    public static final String URL_GET_RECENT_MEDIA_BY_USER_ID = KEY_GET_RECENT_MEDIA_BY_USER_ID + KEY_ACCESS_TOKEN + ACCESS_TOKEN;
    //https://api.instagram.com/v1/users/{user-id}/media/recent/?access_token=ACCESS-TOKEN
}
