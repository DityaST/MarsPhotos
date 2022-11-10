
package com.example.android.marsphotos.network

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET

/** menngatur tampilan pada internal setting **/
private const val BASE_URL = "https://android-kotlin-fun-mars-server.appspot.com/"

/**
 * membuat objek moshi untuk digunakan pada objek retrofit
 */
private val moshi = Moshi.Builder()
    .add(KotlinJsonAdapterFactory())
    .build()

/**
 * menggunakan objek retrofit untuk membuat objek retrofit yang akan menjalankan
 * objek moshi
 */
private val retrofit = Retrofit.Builder()
    .addConverterFactory(MoshiConverterFactory.create(moshi))
    .baseUrl(BASE_URL)
    .build()


interface MarsApiService {
    /**
     * method GET akan menunjukan atau menampilkan beberapa photo dengan motode http
     */
    @GET("photos")
    suspend fun getPhotos(): List<MarsPhoto>
}

/**
 * objek marsApi akan mengakses lazy-initialized Retrofit service
 */
object MarsApi {
    val retrofitService: MarsApiService by lazy { retrofit.create(MarsApiService::class.java) }
}
