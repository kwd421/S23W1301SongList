package kr.ac.kumoh.ce.s20160042.s23w1301songlist

import retrofit2.http.GET

interface SongApi {
    @GET("song")
    suspend fun  getSongs(): List<Song>
}