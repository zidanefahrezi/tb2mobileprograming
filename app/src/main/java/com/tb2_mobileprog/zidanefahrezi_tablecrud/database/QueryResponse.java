package com.tb2_mobileprog.zidanefahrezi_tablecrud.database;

public interface QueryResponse<T> {
    void onSuccess(T data);
    void onFailure(String message);
}