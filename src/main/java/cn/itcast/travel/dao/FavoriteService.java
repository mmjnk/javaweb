package cn.itcast.travel.dao;

public interface FavoriteService {

    public boolean isFavorite(String rid, int uid);

    void add(String rid, int uid);
}
